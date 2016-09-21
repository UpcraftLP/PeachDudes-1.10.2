package mod.upcraftlp.peachdudes.proxy;

import github.tca.core.API.ModRegistry;
import mod.upcraftlp.peachdudes.crafting.ShapedCrafting;
import mod.upcraftlp.peachdudes.events.GenerationHandler;
import mod.upcraftlp.peachdudes.init.PeachBlocks;
import mod.upcraftlp.peachdudes.init.PeachEntities;
import mod.upcraftlp.peachdudes.init.PeachItems;
import mod.upcraftlp.peachdudes.init.PeachSounds;
import mod.upcraftlp.peachdudes.world.WorldGenPeachDudes;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
		PeachSounds.init();
		PeachBlocks.init();
		PeachItems.init();
		ModRegistry.registerItems(PeachItems.items);
		ShapedCrafting.init();
		PeachEntities.init();
		ModRegistry.registerChunkGenerator(new WorldGenPeachDudes(), 0);
		MinecraftForge.EVENT_BUS.register(new GenerationHandler());
	}
	
	public void init(FMLInitializationEvent event) {

	}
	
	public void postInit(FMLPostInitializationEvent event) {
		
	}
	
	public WorldClient getClientWorld() {
		return null;
	}
	
}
