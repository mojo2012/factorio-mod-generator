package at.spot.factorio.modding.item;

import java.util.List;

import at.spot.factorio.modding.conversion.lua.LuaElement;
import at.spot.factorio.modding.entity.Entity;
import at.spot.factorio.modding.recipe.Group;

public class Item {
	protected ItemType	type;
	protected String	name;
	protected String	order;

	@LuaElement(name = "stack_size")
	protected int stackSize;

	@LuaElement(name = "fuel_value")
	protected double fuelValue;

	protected Group group;

	@LuaElement(name = "subgroup")
	protected Group subGroup;

	@LuaElement(name = "place_result", property = "name")
	protected Entity placeResult;

	protected double speed;

	@LuaElement(name = "magazine_size")
	protected double magazineSize;

	@LuaElement(name = "default_request_amount")
	protected int defaultRequestAmount;

	protected List<Resistance>	resistances;
	protected boolean			stackable;

	@LuaElement(name = "module_effects")
	protected List<ModuleEffect> moduleEffects;

	@LuaElement(name = "ammo_type")
	protected TargetType targetType;

	/**
	 * Accessors
	 */

	public ItemType getType() {
		return type;
	}

	public void setType(ItemType type) {
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public int getStackSize() {
		return stackSize;
	}

	public void setStackSize(int intstackSize) {
		this.stackSize = intstackSize;
	}

	public double getFuelValue() {
		return fuelValue;
	}

	public void setFuelValue(double fuelValue) {
		this.fuelValue = fuelValue;
	}

	public Group getGroup() {
		return group;
	}

	public void setGroup(Group group) {
		this.group = group;
	}

	public Group getSubGroup() {
		return subGroup;
	}

	public void setSubGroup(Group subGroup) {
		this.subGroup = subGroup;
	}

	public Entity getPlaceResult() {
		return placeResult;
	}

	public void setPlaceResult(Entity placeResult) {
		this.placeResult = placeResult;
	}

	public double getSpeed() {
		return speed;
	}

	public void setSpeed(double speed) {
		this.speed = speed;
	}

	public double getMagazineSize() {
		return magazineSize;
	}

	public void setMagazineSize(double magazineSize) {
		this.magazineSize = magazineSize;
	}

	public int getDefaultRequestAmount() {
		return defaultRequestAmount;
	}

	public void setDefaultRequestAmount(int defaultRequestAmount) {
		this.defaultRequestAmount = defaultRequestAmount;
	}

	public List<Resistance> getResistances() {
		return resistances;
	}

	public void setResistances(List<Resistance> resistances) {
		this.resistances = resistances;
	}

	public boolean isStackable() {
		return stackable;
	}

	public void setStackable(boolean stackable) {
		this.stackable = stackable;
	}

	public List<ModuleEffect> getModuleEffects() {
		return moduleEffects;
	}

	public void setModuleEffects(List<ModuleEffect> moduleEffects) {
		this.moduleEffects = moduleEffects;
	}

	public TargetType getTargetType() {
		return targetType;
	}

	public void setTargetType(TargetType targetType) {
		this.targetType = targetType;
	}

}
