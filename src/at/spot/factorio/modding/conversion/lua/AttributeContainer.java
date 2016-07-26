package at.spot.factorio.modding.conversion.lua;

public class AttributeContainer {
	private String		name;
	private Object		value;
	private LuaElement	annotation;

	public AttributeContainer(String name, Object value, LuaElement annotation) {
		this.name = name;
		this.value = value;
		this.annotation = annotation;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Object getValue() {
		return value;
	}

	public void setValue(Object value) {
		this.value = value;
	}

	public LuaElement getAnnotation() {
		return annotation;
	}

	public void setAnnotation(LuaElement annotation) {
		this.annotation = annotation;
	}

}
