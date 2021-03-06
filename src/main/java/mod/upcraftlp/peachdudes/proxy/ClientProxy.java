package mod.upcraftlp.peachdudes.proxy;

import java.util.Arrays;

import core.upcraftlp.craftdev.API.common.ModRegistry;
import mod.upcraftlp.peachdudes.Reference;
import mod.upcraftlp.peachdudes.init.PeachBlocks;
import mod.upcraftlp.peachdudes.init.PeachEntities;
import mod.upcraftlp.peachdudes.init.PeachItems;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.fml.common.ModMetadata;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		ModRegistry.registerItemRenders(PeachItems.itemMap);
		ModRegistry.registerBlockRenders(PeachBlocks.blockMap);
		PeachEntities.registerRenders();
		
		/**mcmod.info**/
		ModMetadata data = event.getModMetadata();
		data.autogenerated = false;
		data.name = TextFormatting.AQUA + Reference.MODNAME;
		data.modId = Reference.MODID;
		data.authorList = Arrays.asList(Reference.authors);
		data.credits = Reference.CREDITS;
		data.description = Reference.MOD_DESCRIPTION;
	}
	
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
}
