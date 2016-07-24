package at.spot.factorio.modding.definition;

import com.google.gson.annotations.SerializedName;

/**
 * Will be rendered to the info.json mod definition.
 */
public class Info {
	protected String	name;
	protected String	version;
	protected String	title;
	protected String	author;
	protected String	contact;
	protected String	homepage;
	protected String	description;

	@SerializedName("factorio_version")
	protected String factorioVersion;
}
