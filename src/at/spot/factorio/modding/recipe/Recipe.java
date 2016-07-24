package at.spot.factorio.modding.recipe;

import java.util.List;

import at.spot.factorio.modding.conversion.lua.LuaElement;
import at.spot.factorio.modding.definition.Force;
import at.spot.factorio.modding.definition.Icon;
import at.spot.factorio.modding.definition.ObjectType;

public class Recipe {
	protected final ObjectType type = ObjectType.Recipe;

	protected String			name;
	protected Icon				icon;
	protected boolean			enabled;
	protected boolean			hidden;
	protected List<Ingredient>	ingredients;
	protected List<Result>		results;
	protected String			order;

	@LuaElement(property = "name")
	protected Force force;

	@LuaElement(property = "name")
	protected RecipeCategory category;

	protected Group group;

	@LuaElement(name = "subgroup", property = "name")
	protected Group subGroup;

	@LuaElement(name = "energy_required")
	protected double energyRequired;
}
