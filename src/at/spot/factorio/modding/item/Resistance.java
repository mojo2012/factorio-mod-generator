package at.spot.factorio.modding.item;

import javax.validation.constraints.NotNull;

public class Resistance {
	@NotNull
	protected double	decrease;
	
	@NotNull
	protected double	percent;
}
