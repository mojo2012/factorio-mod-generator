package at.spot.factorio.modding.item;

import at.spot.factorio.modding.conversion.lua.LuaElement;
import at.spot.factorio.modding.recipe.RecipeCategory;

public class AmmoType {

	@LuaElement(name = "target_type")
	protected TargetType		targetType;
	
	@LuaElement(name = "clamp_position")
	protected boolean			clampPosition;
	
	protected RecipeCategory	category;
	
	@LuaElement(name = "energy_consumption")
	protected double			energyConsumption;
}
