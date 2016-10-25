package mod.upcraftlp.peachdudes.init;

import java.util.HashMap;
import java.util.Map;

import mod.upcraftlp.peachdudes.items.ItemPeachDude;
import mod.upcraftlp.peachdudes.items.ItemPeachSundae;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class PeachItems {
	
	public static Map<Item, CreativeTabs> itemMap = new HashMap<Item, CreativeTabs>();
	
	public static Item ITEM_PEACHDUDE = new ItemPeachDude();
	public static Item PEACH_SUNDAE = new ItemPeachSundae();

	public static void init() {
		/**START**/
		itemMap.put(ITEM_PEACHDUDE, PeachTabs.tabPeachDudes);
		itemMap.put(PEACH_SUNDAE, PeachTabs.tabPeachDudes);
		/**END**/
	}
	
}
