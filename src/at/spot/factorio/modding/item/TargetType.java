package at.spot.factorio.modding.item;

public enum TargetType {
	Entity("entity"), Position("position"), Direction("direction");
	
	String name;

	TargetType(String name) {
		this.name = name;
	}
	
	public String toString() {
		return this.name;
	}
}
