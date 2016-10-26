package mod.upcraftlp.peachdudes.proxy;

import core.upcraftlp.craftdev.API.common.CommonHandler;
import core.upcraftlp.craftdev.API.common.ModRegistry;
import mod.upcraftlp.peachdudes.crafting.ShapedCrafting;
import mod.upcraftlp.peachdudes.events.GenerationHandler;
import mod.upcraftlp.peachdudes.init.PeachBlocks;
import mod.upcraftlp.peachdudes.init.PeachEntities;
import mod.upcraftlp.peachdudes.init.PeachItems;
import mod.upcraftlp.peachdudes.init.PeachSounds;
import mod.upcraftlp.peachdudes.init.PeachTabs;
import mod.upcraftlp.peachdudes.world.WorldGenPeachDudes;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {

	public void preInit(FMLPreInitializationEvent event) {
		PeachSounds.init();
		PeachBlocks.init();
		PeachItems.init();
		ModRegistry.registerItems(PeachItems.itemMap);
		ModRegistry.registerBlocks(PeachBlocks.blockMap);
		ShapedCrafting.init();
		PeachEntities.init();
		PeachTabs.setIcons();
		CommonHandler.registerChunkGenerator(new WorldGenPeachDudes(), 0);
		MinecraftForge.EVENT_BUS.register(new GenerationHandler());
	}
	
	public void init(FMLInitializationEvent event) {

	}
	
	public void postInit(FMLPostInitializationEvent event) {
		
	}
}
