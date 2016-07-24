package at.spot.factorio.modding.tile;

import at.spot.factorio.modding.conversion.lua.LuaElement;
import at.spot.factorio.modding.definition.StackItem;

public class Product extends StackItem {
	@LuaElement(name = "amount_min")
	protected int amountMin;

	@LuaElement(name = "amount_max")
	protected int		amountMax;
	protected double	probability;

	public int getAmountMin() {
		return amountMin;
	}

	public void setAmountMin(int amountMin) {
		this.amountMin = amountMin;
	}

	public int getAmountMax() {
		return amountMax;
	}

	public void setAmountMax(int amountMax) {
		this.amountMax = amountMax;
	}

	public double getProbability() {
		return probability;
	}

	public void setProbability(double probability) {
		this.probability = probability;
	}
}
