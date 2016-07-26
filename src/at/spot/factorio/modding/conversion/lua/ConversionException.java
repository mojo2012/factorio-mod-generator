package at.spot.factorio.modding.conversion.lua;

public class ConversionException extends Exception {
	private static final long serialVersionUID = 6502008508809548908L;

	public ConversionException(String message) {
		super(message);
	}
	
	public ConversionException(String message, Throwable rootCause) {
		super(message, rootCause);
	}
}
