package at.spot.factorio.modding.technology;

import java.util.Locale.Category;

import at.spot.factorio.modding.conversion.lua.LuaElement;
import at.spot.factorio.modding.entity.Entity;
import at.spot.factorio.modding.item.Item;
import at.spot.factorio.modding.recipe.Recipe;

public class Modifier {
	protected ModifierType	type;
	
	//used for gun-speed, turret-attack
	protected double		modifier;

	@LuaElement(property = "name")
	protected Recipe recipe;

	@LuaElement(property = "ammo_category")
	protected Category ammoCategory;

	@LuaElement(property = "name")
	protected Item	item;
	protected int	count;

	@LuaElement(name = "turret_id", property = "name")
	protected Entity turret;
}
