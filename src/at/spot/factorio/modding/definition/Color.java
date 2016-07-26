package at.spot.factorio.modding.definition;

import at.spot.factorio.modding.conversion.lua.LuaElement;

public class Color {
	@LuaElement(name = "r")
	protected byte red;

	@LuaElement(name = "g")
	protected byte green;

	@LuaElement(name = "b")
	protected byte blue;

	@LuaElement(name = "a")
	protected byte opacity;

	public byte getRed() {
		return red;
	}

	public void setRed(byte red) {
		this.red = red;
	}

	public byte getGreen() {
		return green;
	}

	public void setGreen(byte green) {
		this.green = green;
	}

	public byte getBlue() {
		return blue;
	}

	public void setBlue(byte blue) {
		this.blue = blue;
	}

	public byte getOpacity() {
		return opacity;
	}

	public void setOpacity(byte opacity) {
		this.opacity = opacity;
	}

}
