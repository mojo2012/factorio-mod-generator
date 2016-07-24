package at.spot.factorio.modding.definition;

public enum ObjectType {
	Recipe("recipe"), RecipeCategory("recipe-category"), Item("item"), Entity("entity"), Tile("tile");

	String internalName;

	ObjectType(String internalName) {
		this.internalName = internalName;
	}

	public String toString() {
		return this.internalName;
	}
}
