package mod.upcraftlp.peachdudes.proxy;

import github.tca.core.API.ModRegistry;
import mod.upcraftlp.peachdudes.init.PeachBlocks;
import mod.upcraftlp.peachdudes.init.PeachEntities;
import mod.upcraftlp.peachdudes.init.PeachItems;
import net.minecraft.client.Minecraft;
import net.minecraft.client.multiplayer.WorldClient;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy {

	@Override
	public void preInit(FMLPreInitializationEvent event) {
		super.preInit(event);
		ModRegistry.registerItemRenders(PeachItems.items);
		PeachBlocks.registerRenders();
		PeachEntities.registerRenders();
	}
	
	@Override
	public void init(FMLInitializationEvent event) {
		super.init(event);
	}
	
	@Override
	public void postInit(FMLPostInitializationEvent event) {
		super.postInit(event);
	}
	
	@Override
	public WorldClient getClientWorld() {
		return Minecraft.getMinecraft().theWorld;
	}
}
