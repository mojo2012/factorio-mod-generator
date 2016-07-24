package at.spot.factorio.modding.tile;

import java.util.ArrayList;
import java.util.List;

import at.spot.factorio.modding.conversion.lua.LuaElement;

public class AutoplaceSpecification {
	protected double sharpness;

	@LuaElement(name = "max_probability")
	protected double maxProbability;

	@LuaElement(name = "placement_density")
	protected int placementDensity;

	@LuaElement(name = "richness_base")
	protected double richnessBase;

	@LuaElement(name = "richness_multiplier")
	protected double richnessMultiplier;

	protected String order;

	List<Peak> peaks = new ArrayList<>();

	protected String control;

	@LuaElement(name = "tile_restriction")
	protected TileRestriction tileRestriction;

	@LuaElement(name = "size_control_multiplier")
	protected double	sizeControlMultiplier;
	protected String	force;

	@LuaElement(name = "random_probability_penalty")
	protected double randomProbabilityPenalty;

}
