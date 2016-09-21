package mod.upcraftlp.peachdudes.events;

import java.util.Random;

import mod.upcraftlp.peachdudes.Main;
import mod.upcraftlp.peachdudes.init.PeachBlocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.event.terraingen.DecorateBiomeEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class GenerationHandler {

	@SubscribeEvent
	public void onTreeGen(DecorateBiomeEvent.Decorate event) {
		if(event.getType() == DecorateBiomeEvent.Decorate.EventType.TREE) {
			BlockPos pos = event.getPos();
			Random random = new Random();
			pos = pos.offset(EnumFacing.getFront(random.nextInt(EnumFacing.values().length)), 2);
			event.getWorld().setBlockState(pos, PeachBlocks.BLOCK_PEACHDUDE.getDefaultState());
			Main.getLogger().println("spawned peachdude at " + pos.getX() + ", " + pos.getY() + ", " + pos.getZ());
		}
	}
}
