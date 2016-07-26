package at.spot.factorio.modding.item;

import javax.validation.constraints.NotNull;

import at.spot.factorio.modding.conversion.lua.LuaElement;
import at.spot.factorio.modding.recipe.RecipeCategory;

public class AmmoType {

	@NotNull
	@LuaElement(name = "target_type")
	protected TargetType		targetType;
	
	@NotNull
	@LuaElement(name = "clamp_position")
	protected boolean			clampPosition;
	
	protected RecipeCategory	category;

	@NotNull
	@LuaElement(name = "energy_consumption")
	protected double			energyConsumption;
}
