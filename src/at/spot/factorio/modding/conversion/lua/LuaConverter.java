package at.spot.factorio.modding.conversion.lua;

import java.io.StringWriter;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanToPropertyValueTransformer;
import org.apache.commons.lang3.ClassUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.velocity.Template;
import org.apache.velocity.VelocityContext;
import org.apache.velocity.app.VelocityEngine;
import org.apache.velocity.runtime.RuntimeConstants;
import org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader;

public class LuaConverter {
	private static final LuaConverter	INSTANCE			= new LuaConverter();
	private static final String			LUA_OBJECT_TEMPLATE	= "LuaObject.vm";

	public static LuaConverter getInstance() {
		return INSTANCE;
	}

	public String convertToLuaObject(Object object) throws ConversionException {
		return convertToLuaObject(object, 1);
	}
	
	protected String convertToLuaObject(Object object, int indentationLevel) throws ConversionException {
//		if (!isLuaObject(object)) {
//		throw new ConversionException("Given object is not convertible.");
//	}

	String luaObject = "";

	List<AttributeContainer> attributes = getFields(object, LuaElement.class);

	Map<String, String> luaObjectDefinition = new HashMap<>();

	for (AttributeContainer attr : attributes) {
		if (attr.getValue() == null & !attr.getAnnotation().printIfEmpty()) {
			continue;
		}
		
		String attrName = attr.getName();
		
		if (StringUtils.isNotEmpty(attr.getAnnotation().name())) {
			attrName = attr.getAnnotation().name();
		}
		
		Object value = attr.getValue();
		
		if (StringUtils.isNotEmpty(attr.getAnnotation().property())) {
			BeanToPropertyValueTransformer transformer = new BeanToPropertyValueTransformer(attr.getAnnotation().property());
			value = transformer.transform(value);
		}
		
		// if the field value is a primitive type, we simply output it to
		// the lua object string
		if (ClassUtils.isPrimitiveOrWrapper(value.getClass()) | value.getClass().isEnum()) {
			luaObjectDefinition.put(attrName, value.toString());
		} else if (value.getClass().equals(String.class)) {
			luaObjectDefinition.put(attrName, "\"" + value + "\"");
		} else {
			try {
				luaObjectDefinition.put(attr.getName(), convertToLuaObject(value, indentationLevel + 1));
			} catch (Exception e) {
				throw new ConversionException("Error during conversion of attribute " + attr.getName(), e);
			}
		}
	}
	
	luaObject = objectToString(luaObjectDefinition, indentationLevel);

	return luaObject;
	}

	protected String convertToLuaObject(ConvertibleToLua object) {
		return object.toLuaTable();
	}

	protected boolean isLuaObject(Object object) {
		return hasAnnotation(object, LuaObject.class);
	}

	protected boolean hasAnnotation(Object object, Class<? extends Annotation> annotation) {
		return (object.getClass().isAnnotationPresent(annotation));
	}

	protected List<AttributeContainer> getFields(Object object, Class<? extends Annotation> annotation) {
		List<AttributeContainer> fields = new ArrayList<>();
		Class<?> c = object.getClass();

		while (c != null) {
			for (Field field : c.getDeclaredFields()) {
				if (field.isAnnotationPresent(annotation) | object.getClass().isAnnotationPresent(LuaObject.class)) {
					field.setAccessible(true);
					
					AttributeContainer a;
					
					try {
						a = new AttributeContainer(field.getName(), field.get(object), field.getAnnotation(LuaElement.class));
					} catch (IllegalArgumentException | IllegalAccessException e) {
						continue;
					}
					
					fields.add(a);
				}
			}
			
			for (Method method: c.getMethods()) {
				if (method.isAnnotationPresent(annotation)) {
					method.setAccessible(true);
					
					AttributeContainer a;
					
					try {
						a = new AttributeContainer(method.getName(), method.invoke(object), method.getAnnotation(LuaElement.class));
					} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
						continue;
					}
					
					fields.add(a);
				}
			}

			c = c.getSuperclass();
		}

		return fields;
	}

	protected String objectToString(Map<String, String> attributes) {
		return objectToString(attributes, 1);
	}
	
	protected String objectToString(Map<String, String> attributes, int indentationLevel) {
		VelocityEngine ve = new VelocityEngine();
		
		ve.setProperty(RuntimeConstants.RESOURCE_LOADER, "classpath"); 
		ve.setProperty("classpath.resource.loader.class", ClasspathResourceLoader.class.getName());
		
		ve.init();

		Template t = ve.getTemplate(LUA_OBJECT_TEMPLATE);
		VelocityContext context = new VelocityContext();
		context.put("attributes", attributes);
		context.put("indent", StringUtils.repeat("\t", indentationLevel));
		
		StringWriter writer = new StringWriter();
		t.merge(context, writer);

		return writer.toString();
	}
}
