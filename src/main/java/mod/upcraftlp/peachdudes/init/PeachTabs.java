package mod.upcraftlp.peachdudes.init;

import core.upcraftlp.craftdev.API.templates.CreativeTab;
import net.minecraft.item.ItemStack;

public class PeachTabs {

	public static CreativeTab tabPeachDudes = new CreativeTab("tabPeachDudes", false);
	
	public static void setIcons() {
		tabPeachDudes.setIconStack(new ItemStack(PeachItems.PEACH_SUNDAE));
	}
}
