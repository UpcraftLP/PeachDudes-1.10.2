package mod.upcraftlp.peachdudes.items;

import java.util.Random;

import core.upcraftlp.craftdev.API.templates.ItemFood;
import mod.upcraftlp.peachdudes.entity.EntityPeachdude;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ItemPeachDude extends ItemFood {

	Random random = new Random();
	
	public ItemPeachDude() {
		super("peachdude", 4, 1.5f, false);
		this.setMaxStackSize(1);
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(ItemStack itemStack, World world, EntityPlayer player,
			EnumHand hand) {
		
		return super.onItemRightClick(itemStack, world, player, hand);
	}
	
	@Override
	public EnumActionResult onItemUseFirst(ItemStack stack, EntityPlayer player, World world, BlockPos pos, EnumFacing side, float hitX, float hitY, float hitZ, EnumHand hand) {
		if(!world.isRemote && random.nextInt(5) == 0) {
			Double pi = Math.PI / 180.0D;
			double xOffset = Math.sin(player.rotationYaw * pi) * 0.25D;
			double zOffset = Math.cos(player.rotationYaw * pi) * 0.25D;
			EntityPeachdude peachdude = new EntityPeachdude(world, player.posX + xOffset, player.posY, player.posZ + zOffset);
			peachdude.spawn();
			stack.stackSize--;
			if(stack.stackSize > 0) player.setHeldItem(hand, stack); else player.setHeldItem(hand, null);
			return EnumActionResult.SUCCESS;
		}
		return EnumActionResult.PASS;
	}

}
