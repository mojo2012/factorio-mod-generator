package at.spot.factorio.modding.tile;

import at.spot.factorio.modding.conversion.lua.ConvertibleToLua;
import at.spot.factorio.modding.conversion.lua.LuaConverter;
import at.spot.factorio.modding.conversion.lua.LuaElement;

public class TileRestriction implements ConvertibleToLua {

	@LuaElement(name = "name")
	Tile first;

	@LuaElement(name = "name")
	Tile second;

	public Tile getFirst() {
		return first;
	}

	public void setFirst(Tile first) {
		this.first = first;
	}

	public Tile getSecond() {
		return second;
	}

	public void setSecond(Tile second) {
		this.second = second;
	}

	@Override
	public String toLuaTable() {
		return LuaConverter.convertToLuaObject(this);
	}
}
