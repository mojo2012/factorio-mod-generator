package at.spot.factorio.modding.item;

public enum ItemType {
	Fluid("fluid"), Item("item");

	String name;

	ItemType(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
}
