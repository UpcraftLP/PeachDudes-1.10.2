package mod.upcraftlp.peachdudes;

public class Reference {

	public static final String MCVERSIONS = "1.10.2";
	
	//increase when milestone is reached (currently: first RELEASE version);
	//never decrease
	private static final int MAJOR = 0;
	
	//increase when adding new features
	//set to 0 when MAJOR version increases
	private static final int MINOR = 1;
	
	//increase when fixing bugs;
	//set to 0 when MINOR version increases
	private static final int PATCH = 0;
	
	//increase every time code is changed and pushed to GitHub;
	//never decrease
	private static final int BUILD = 2;
	
	/** TEAM **/
	
	public static final String[] authors = {"UpcraftLP"};
	
	public static final String MOD_DESCRIPTION = "Peach Dudes Mod";
	public static final String CREDITS = "UpcraftLP";
	
	//DO NOT CHANGE!!!
	public static final String MODNAME = "Peach Dudes Mod";
	public static final String MOD_ID = "peachdudes";
	public static final String DEPENDENCIES = "required-after:tca-core@[0.1.0-b1]";
	public static final String URL = "https://minecraft.curseforge.com/projects/peachdudes-mod";
	public static final String UPDATE_URL = "https://minecraft.curseforge.com/projects/peachdudes-mod/files";
	public static final String INTERNAL_UPDATE_URL = "https://raw.githubusercontent.com/UpcraftLP/PeachDudes-1.10.2/master/Version.txt";
	public static final String CLIENT_PATH = "mod.upcraftlp.peachdudes.proxy.ClientProxy";
	public static final String SERVER_PATH = "mod.upcraftlp.peachdudes.proxy.ServerProxy";
	public static final String VERSION = MAJOR + "." + MINOR + "." + PATCH + "-b" + BUILD;
	public static final String ID_PREFIX = MOD_ID + ":";
}
