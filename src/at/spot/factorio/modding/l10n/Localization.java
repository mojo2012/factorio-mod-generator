package at.spot.factorio.modding.l10n;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class Localization {
	protected Locale				locale;
	protected Map<String, String>	values	= new HashMap<>();

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	public Map<String, String> getValues() {
		return values;
	}

	public void setValues(Map<String, String> values) {
		this.values = values;
	}

}
