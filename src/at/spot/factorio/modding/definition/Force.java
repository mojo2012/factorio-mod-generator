package at.spot.factorio.modding.definition;

public class Force {
	protected String name;

	public static Force	NEUTRAL	= new Force("neutral");
	public static Force	PLAYER	= new Force("neutral");
	public static Force	ENEMY	= new Force("enemy");

	public Force(String name) {
		this.name = name;
	}
}
