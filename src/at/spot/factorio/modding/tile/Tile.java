package at.spot.factorio.modding.tile;

import java.util.ArrayList;
import java.util.List;

import at.spot.factorio.modding.conversion.lua.LuaElement;
import at.spot.factorio.modding.definition.Color;
import at.spot.factorio.modding.item.Item;

public class Tile {
	protected String	name;
	protected String	order;

	@LuaElement(name = "collision_mask")
	protected List<String> collisionMask = new ArrayList<>();

	protected int		layer;
	@LuaElement(name = "walking_speed_modifier")
	protected double	walkingSpeedModifier;

	@LuaElement(name = "vehicle_friction_modifier")
	protected double vehicleFrictionModifier;

	@LuaElement(name = "map_color")
	protected Color mapColor;

	@LuaElement(name = "decorative_removal_probability")
	protected double decorativeRemovalProbability;

	@LuaElement(name = "allowed_neighbors")
	protected List<Tile> allowedNeighbors = new ArrayList<>();

	@LuaElement(name = "items_to_place_this")
	protected List<Item> itemsToPlaceThis = new ArrayList<>();

	@LuaElement(name = "can_be_part_of_blueprint")
	protected boolean canBbePartOfBlueprint;

	@LuaElement(name = "emissions_per_tick")
	protected double emissionsPerTick;

	@LuaElement(name = "autoplace_specification")
	protected AutoplaceSpecification autoplaceSpecification;

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

	public List<String> getCollisionMask() {
		return collisionMask;
	}

	public void setCollisionMask(List<String> collisionMask) {
		this.collisionMask = collisionMask;
	}

	public int getLayer() {
		return layer;
	}

	public void setLayer(int layer) {
		this.layer = layer;
	}

	public double getWalkingSpeedModifier() {
		return walkingSpeedModifier;
	}

	public void setWalkingSpeedModifier(double walkingSpeedModifier) {
		this.walkingSpeedModifier = walkingSpeedModifier;
	}

	public double getVehicleFrictionModifier() {
		return vehicleFrictionModifier;
	}

	public void setVehicleFrictionModifier(double vehicleFrictionModifier) {
		this.vehicleFrictionModifier = vehicleFrictionModifier;
	}

	public Color getMapColor() {
		return mapColor;
	}

	public void setMapColor(Color mapColor) {
		this.mapColor = mapColor;
	}

	public double getDecorativeRemovalProbability() {
		return decorativeRemovalProbability;
	}

	public void setDecorativeRemovalProbability(double decorativeRemovalProbability) {
		this.decorativeRemovalProbability = decorativeRemovalProbability;
	}

	public List<Tile> getAllowedNeighbors() {
		return allowedNeighbors;
	}

	public void setAllowedNeighbors(List<Tile> allowedNeighbors) {
		this.allowedNeighbors = allowedNeighbors;
	}

	public List<Item> getItemsToPlaceThis() {
		return itemsToPlaceThis;
	}

	public void setItemsToPlaceThis(List<Item> itemsToPlaceThis) {
		this.itemsToPlaceThis = itemsToPlaceThis;
	}

	public boolean isCanBbePartOfBlueprint() {
		return canBbePartOfBlueprint;
	}

	public void setCanBbePartOfBlueprint(boolean canBbePartOfBlueprint) {
		this.canBbePartOfBlueprint = canBbePartOfBlueprint;
	}

	public double getEmissionsPerTick() {
		return emissionsPerTick;
	}

	public void setEmissionsPerTick(double emissionsPerTick) {
		this.emissionsPerTick = emissionsPerTick;
	}

	public AutoplaceSpecification getAutoplaceSpecification() {
		return autoplaceSpecification;
	}

	public void setAutoplaceSpecification(AutoplaceSpecification autoplaceSpecification) {
		this.autoplaceSpecification = autoplaceSpecification;
	}

}
