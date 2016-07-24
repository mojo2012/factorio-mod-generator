package at.spot.factorio.modding.tile;

import at.spot.factorio.modding.conversion.lua.LuaElement;

public class Peak {

	protected double influence;

	@LuaElement(name = "max_influence")
	protected double maxInfluence;

	@LuaElement(name = "min_influence")
	protected double minInfluence;

	@LuaElement(name = "richness_influence")
	protected double richnessInfluence;

	@LuaElement(name = "noisePersistence")
	protected double noisePersistence;

	@LuaElement(name = "noise_layer")
	protected String noiseLayer;

	@LuaElement(name = "noise_octaves_difference")
	protected double noiseOctavesDifference;

	@LuaElement(name = "d_optimal")
	protected double dOptimal;

	@LuaElement(name = "d_range")
	protected double dRange;

	@LuaElement(name = "d_top_property_limit")
	protected double dTopPropertyLimit;

	@LuaElement(name = "d_max_range")
	protected double dMaxRange;
}
