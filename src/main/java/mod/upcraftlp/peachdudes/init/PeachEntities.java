package mod.upcraftlp.peachdudes.init;

import github.tca.core.API.ModRegistry;
import mod.upcraftlp.peachdudes.entity.EntityPeachdude;
import mod.upcraftlp.peachdudes.render.RenderPeachdude;
import net.minecraftforge.fml.client.registry.RenderingRegistry;

public class PeachEntities {

	public static void init() {
		ModRegistry.registerEntity(EntityPeachdude.class, "peachdude", 64, 1, true);
	}
	
	public static void registerRenders() {
		RenderingRegistry.registerEntityRenderingHandler(EntityPeachdude.class, RenderPeachdude::new);
	}
	
}
