package at.spot.factorio.modding.conversion.lua;

public interface ConvertibleToLua {
	/**
	 * Returns the object as Lua Script table.
	 */
	String toLuaTable();
}
