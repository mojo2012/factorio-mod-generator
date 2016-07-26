package at.spot.factorio.modding.item;

import java.util.List;

import javax.validation.constraints.NotNull;

import at.spot.factorio.modding.conversion.lua.LuaElement;
import at.spot.factorio.modding.conversion.lua.LuaObject;
import at.spot.factorio.modding.entity.Entity;
import at.spot.factorio.modding.recipe.Group;

@LuaObject
public class Item {
	@NotNull
	@LuaElement()
	protected ItemType type;

	@NotNull
	@LuaElement()
	protected String name;

	@NotNull
	@LuaElement()
	protected String order;

	@NotNull
	@LuaElement(name = "stack_size")
	protected Integer stackSize;

	@NotNull
	@LuaElement(name = "fuel_value")
	protected Double fuelValue;

	@LuaElement(name = "group")
	protected Group group;

	@LuaElement(name = "subgroup", property = "name")
	protected Group subGroup;

	@LuaElement(name = "place_result", property = "name")
	protected Entity placeResult;

	@LuaElement()
	protected Double speed;

	@LuaElement(name = "magazine_size")
	protected Double magazineSize;

	@LuaElement(name = "default_request_amount")
	protected Integer defaultRequestAmount;

	@LuaElement()
	protected List<Resistance> resistances;

	@LuaElement()
	protected Boolean stackable;

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
