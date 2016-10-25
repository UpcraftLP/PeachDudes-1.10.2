package mod.upcraftlp.peachdudes.world;

import java.util.Arrays;
import java.util.Random;

import core.upcraftlp.craftdev.API.structures.TreeType;
import core.upcraftlp.craftdev.API.structures.trees.TreeVanillaOak;
import core.upcraftlp.craftdev.API.world.DecorationHelper;
import core.upcraftlp.craftdev.API.world.IWorldChunkGenerator;
import core.upcraftlp.craftdev.API.world.WorldHelper;
import mod.upcraftlp.peachdudes.init.PeachBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Biomes;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class WorldGenPeachDudes implements IWorldChunkGenerator {

	@Override
	public void generate(World world, Random random, int blockX, int blockZ) {
		if(random.nextInt(5) == 0 && world.getBiomeGenForCoords(new BlockPos(blockX, 0, blockZ)) == Biomes.FOREST) {
			DecorationHelper.generateTree(world, new BlockPos(blockX, WorldHelper.getGroundFromAbove(world, blockX, blockZ, Arrays.asList(new Block[] {Blocks.GRASS, Blocks.DIRT})), blockZ), new TreeVanillaOak(), TreeType.NORMAL);
			world.setBlockState(new BlockPos(blockX, WorldHelper.getGroundFromAbove(world, blockX, blockZ, Arrays.asList(new Block[] {Blocks.GRASS, Blocks.DIRT})), blockZ).offset(EnumFacing.NORTH, 2).offset(EnumFacing.WEST, 2).up(4), PeachBlocks.BLOCK_PEACHDUDE.getDefaultState());
		}
	}

	@Override
	public String getName() {
		return "peachtree";
	}

}
