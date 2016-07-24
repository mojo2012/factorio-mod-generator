package at.spot.factorio.modding.definition;

import at.spot.factorio.modding.conversion.lua.LuaElement;
import at.spot.factorio.modding.item.Item;
import at.spot.factorio.modding.item.ItemType;

public class StackItem {
	protected ItemType	type;
	
	@LuaElement(property = "name")
	protected Item		item;
	protected int		amount;
}
