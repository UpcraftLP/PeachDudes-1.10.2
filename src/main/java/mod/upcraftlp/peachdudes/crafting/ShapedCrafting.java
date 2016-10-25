package mod.upcraftlp.peachdudes.crafting;

import mod.upcraftlp.peachdudes.init.PeachItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.CraftingManager;

public class ShapedCrafting {

	public static void init() {
		CraftingManager.getInstance().addRecipe(new ItemStack(PeachItems.PEACH_SUNDAE), " P ", "PSP", " M ", 'P', PeachItems.ITEM_PEACHDUDE, 'S', Items.SUGAR, 'M', Items.MILK_BUCKET);
	}
}
