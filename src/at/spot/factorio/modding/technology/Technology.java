package at.spot.factorio.modding.technology;

import java.util.List;

import at.spot.factorio.modding.conversion.lua.LuaElement;
import at.spot.factorio.modding.definition.Force;

public class Technology {
	protected String			name;
	protected Force				force;
	protected boolean			enabled;
	protected boolean			upgrade;
	protected boolean			researched;
	protected List<Technology>	prerequisites;

	@LuaElement(name = "research_unit_ingredients")
	protected List<ResearchUnit>	researchUnitIngredients;
	
	protected List<Modifier>	effects;

	@LuaElement(name = "research_unit_count")
	protected int researchUnitCount;

	@LuaElement(name = "research_unit_energy")
	protected double	researchUnitEnergy;
	protected String	order;
	protected boolean	valid;

}
