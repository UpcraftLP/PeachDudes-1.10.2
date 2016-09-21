package mod.upcraftlp.peachdudes;

import github.tca.core.API.ModLogger;
import mod.upcraftlp.peachdudes.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(name = Reference.MODNAME, version = Reference.VERSION, acceptedMinecraftVersions = Reference.MCVERSIONS, modid = Reference.MOD_ID, canBeDeactivated = false, dependencies = Reference.DEPENDENCIES)
public class Main {

	private static ModLogger logger = new ModLogger(Reference.MOD_ID);
	
	public static ModLogger getLogger() {
		return logger;
	}
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PATH, serverSide = Reference.SERVER_PATH)
	public static CommonProxy proxy;
		
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		proxy.preInit(event);
		logger.printFML("Pre-Initialization finished.");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		proxy.init(event);
		logger.printFML("Initialization finished.");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		proxy.postInit(event);
		logger.printFML("Post-Initialization finished.");
	}
	
	
}
