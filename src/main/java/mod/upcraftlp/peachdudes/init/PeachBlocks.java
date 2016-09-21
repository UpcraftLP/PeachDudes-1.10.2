package mod.upcraftlp.peachdudes.init;

import mod.upcraftlp.peachdudes.blocks.BlockPeachDude;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class PeachBlocks {

	public static Block BLOCK_PEACHDUDE = new BlockPeachDude();
	
	public static void init() {
		register(BLOCK_PEACHDUDE);
	}
	
	public static void registerRenders() {
		registerRender(BLOCK_PEACHDUDE);
	}
	
	/**DO NOT MODIFY**/
	
	/**
	 * Registers a Block, also registers an ItemBlock
	 * @param block
	 */
	private static void register(Block block) {
		registerBlock(block);
		ItemBlock itemBlock = new ItemBlock(block);
		itemBlock.setRegistryName(block.getRegistryName());
		itemBlock.setUnlocalizedName(block.getUnlocalizedName().substring(5));
		GameRegistry.register(itemBlock);
	}
	
	/**
	 * Registers a Block without registering an ItemBlock
	 * @param block
	 */
	private static void registerBlock(Block block) {
		GameRegistry.register(block);
	}
	
	/**
	 * Only call this for blocks that have an existing ItemBlock!
	 * @param block
	 */
	public static void registerRender(Block block) {
		Item item = Item.getItemFromBlock(block);
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		block.setCreativeTab(PeachTabs.tabPeachDudes);
	}
}
