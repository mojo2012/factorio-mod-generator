package at.spot.factorio.modding.definition;

import java.util.ArrayList;
import java.util.List;

import at.spot.factorio.modding.conversion.lua.ConversionException;
import at.spot.factorio.modding.conversion.lua.LuaConverter;
import at.spot.factorio.modding.entity.Entity;
import at.spot.factorio.modding.item.Item;
import at.spot.factorio.modding.l10n.Localization;
import at.spot.factorio.modding.recipe.Recipe;
import at.spot.factorio.modding.recipe.RecipeCategory;
import at.spot.factorio.modding.technology.Technology;

/**
 * This represents the whole mod. It's a container element for all the various
 * parts.
 */
public abstract class ModProject {
	LuaConverter luaConverter;

	protected Info					info;
	protected List<Item>			items;
	protected List<Entity>			entities;
	protected List<RecipeCategory>	recipeCategories;
	protected List<Recipe>			recipes;
	protected List<Technology>		technologies;
	protected List<Localization>	localization;

	public ModProject() {
		this.luaConverter = LuaConverter.getInstance();
		this.info = new Info();
		this.items = new ArrayList<>();
		this.entities = new ArrayList<>();
		this.recipeCategories = new ArrayList<>();
		this.recipes = new ArrayList<>();
		this.technologies = new ArrayList<>();
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

	public List<Recipe> getRecipes() {
		return recipes;
	}

	public void setRecipes(List<Recipe> recipes) {
		this.recipes = recipes;
	}

	public List<RecipeCategory> getRecipeCategories() {
		return recipeCategories;
	}

	public void setRecipeCategories(List<RecipeCategory> recipeCategories) {
		this.recipeCategories = recipeCategories;
	}

	public List<Technology> getTechnologies() {
		return technologies;
	}

	public void setTechnologies(List<Technology> technologies) {
		this.technologies = technologies;
	}

	public List<Entity> getEntities() {
		return entities;
	}

	public void setEntities(List<Entity> entities) {
		this.entities = entities;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public List<Localization> getLocalization() {
		return localization;
	}

	public void setLocalization(List<Localization> localization) {
		this.localization = localization;
	}

	/**
	 * Methods
	 */

	/**
	 * Implement this and add your tile definitions.
	 */
	public abstract void addTiles();

	/**
	 * Implement this and add your item definitions.
	 */
	public abstract void addItems();

	/**
	 * Implement this and add your entity definitions.
	 */
	public abstract void addEnties();

	/**
	 * Implement this and add your recipe definitions.
	 */
	public abstract void addRecipes();

	/**
	 * Implement this and add your technology definitions.
	 */
	public abstract void addTechnologies();

	/**
	 * Deployes the generated mod to the given folder.
	 */
	public void generateMod(String destinationPath) {
		// throw new RuntimeException("Not yet implemented");

		generateItems();

	}

	protected void generateItems() {
		for (Item i : getItems()) {
			String luaItem;

			try {
				luaItem = luaConverter.convertToLuaObject(i);

				System.out.println(luaItem);
			} catch (ConversionException e) {
				e.printStackTrace();
			}
		}
	}
}
