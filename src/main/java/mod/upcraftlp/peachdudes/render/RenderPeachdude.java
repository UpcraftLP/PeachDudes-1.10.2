package mod.upcraftlp.peachdudes.render;

import mod.upcraftlp.peachdudes.Reference;
import mod.upcraftlp.peachdudes.entity.EntityPeachdude;
import mod.upcraftlp.peachdudes.render.model.ModelPeachDude;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLivingBase;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.client.registry.IRenderFactory;

public class RenderPeachdude extends RenderLivingBase<EntityPeachdude> {

	public static final Factory FACTORY = new Factory();
	private static final ResourceLocation ENTITY_TEXTURE = new ResourceLocation(Reference.MODID, "textures/entity/peachdude.png");
	
	public RenderPeachdude(RenderManager renderManagerIn) {
		super(renderManagerIn, new ModelPeachDude(), 0.2f);
	}
	
	@Override
	protected ResourceLocation getEntityTexture(EntityPeachdude entity) {
		return ENTITY_TEXTURE;
	}
	
	public static class Factory implements IRenderFactory<EntityPeachdude> {

        @Override
        public Render<? super EntityPeachdude> createRenderFor(RenderManager manager) {
            return new RenderPeachdude(manager);
        }

    }

}
