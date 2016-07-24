package at.spot.factorio.modding.definition;

import java.util.List;
import java.util.Map;

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
public class ModProject {
	protected Info					info;
	protected List<Recipe>			recipes;
	protected List<RecipeCategory>	recipeCategories;
	protected List<Technology>		technologies;
	protected List<Entity>			entities;
	protected List<Item>			items;
	protected List<Localization>	localization;

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

}
