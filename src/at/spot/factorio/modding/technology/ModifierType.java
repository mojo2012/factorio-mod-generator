package at.spot.factorio.modding.technology;

public enum ModifierType {
	//@formatter:off
	InserterStackSizeBonus("inserter-stack-size-bonus"),
	LaboratorySpeed("laboratory-speed"),
	CharacterLogisticSlots("character-logistic-slots"),
	CharacterLogisticTrashSlots("character-logistic-trash-slots"),
	NumQuickBars("num-quick-bars"),
	MaximumFollowingRobotsCount("maximum-following-robots-count"),
	LogisticRobotSpeed("logistic-robot-speed"),
	LogisticRobotStorage("logistic-robot-storage"),
	GhostTimeToLive("ghost-time-to-live"),
	TurretAttack("turret-attack"),
	AmmoDamage("ammo-damage"),
	GiveItem("give-item"),
	GunSpeed("gun-speed"),
	InlockRecipe("unlock-recip");
	//@formatter:on

	String internalName;

	ModifierType(String internalName) {
		this.internalName = internalName;
	}

	public String toString() {
		return this.internalName;
	}
}
