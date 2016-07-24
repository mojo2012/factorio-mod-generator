package at.spot.factorio.modding.tile;

import java.util.List;

import at.spot.factorio.modding.conversion.lua.LuaElement;
import at.spot.factorio.modding.item.Item;

public class MinableProperties {
	protected  boolean minable;
	protected  double hardness;

	@LuaElement(name = "miningtime")
	protected  double miningTime;
	
	@LuaElement(name = "miningparticle", property = "name")
	protected  Item miningParticle;
	
	protected  List<Product> products; 
}
