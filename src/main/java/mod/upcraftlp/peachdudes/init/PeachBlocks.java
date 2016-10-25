package mod.upcraftlp.peachdudes.init;

import java.util.HashMap;
import java.util.Map;

import mod.upcraftlp.peachdudes.blocks.BlockPeachDude;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;

public class PeachBlocks {

	public static Map<Block, CreativeTabs> blockMap = new HashMap<Block, CreativeTabs>();
	
	public static Block BLOCK_PEACHDUDE = new BlockPeachDude();
	
	public static void init() {
		blockMap.put(BLOCK_PEACHDUDE, null);
	}
	
}
