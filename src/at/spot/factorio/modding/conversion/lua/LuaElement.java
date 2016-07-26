package at.spot.factorio.modding.conversion.lua;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * By default the field's or method's name is used to add  
 *
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.FIELD })
public @interface LuaElement {
	public abstract String name() default "";
	public abstract String property() default "";
	public abstract boolean printIfEmpty() default false;
}
