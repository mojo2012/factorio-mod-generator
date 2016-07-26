package at.spot.factorio.modding.recipe;

import at.spot.factorio.modding.conversion.lua.LuaElement;

public class Group {
	@LuaElement
	protected String name;

	public Group(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
