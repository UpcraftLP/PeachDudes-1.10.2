package mod.upcraftlp.peachdudes.blocks;

import java.util.ArrayList;
import java.util.List;

import core.upcraftlp.craftdev.API.templates.Block;
import mod.upcraftlp.peachdudes.entity.EntityPeachdude;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class BlockPeachDude extends Block {

	public BlockPeachDude() {
		super("block_peachdude", Material.LEAVES);
		this.setHardness(0.7f);
		this.setResistance(0.2f);
	}
	
	@Override
	public void dropBlockAsItemWithChance(World world, BlockPos pos, IBlockState state, float chance, int fortune) {
		if(!world.isRemote && world.getGameRules().getBoolean("doTileDrops") && chance > 0) {
			EntityPeachdude peach = new EntityPeachdude(world, pos);
			peach.spawn();
		}
	}
	
	@Override
	public boolean isFullBlock(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isFullCube(IBlockState state) {
		return false;
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		return false;
	}
	
	@Override	
	public boolean isReplaceable(IBlockAccess worldIn, BlockPos pos) {
		return true;
	}
	
	@Override
	public void beginLeavesDecay(IBlockState state, World world, BlockPos pos) {
		this.dropBlockAsItemWithChance(world, pos, state, 1, 0);
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() {
		return BlockRenderLayer.CUTOUT_MIPPED;
	}
	
	@Override
	public boolean isVisuallyOpaque() {
		return false;
	}
	
	@Override
	public boolean isBlockSolid(IBlockAccess worldIn, BlockPos pos, EnumFacing side) {
		return false;
	}
	
	@Override
	public boolean isNormalCube(IBlockState state, IBlockAccess world, BlockPos pos) {
		return false;
	}
	
	@Override
	public List<ItemStack> getDrops(IBlockAccess world, BlockPos pos, IBlockState state, int fortune) {
		return new ArrayList<ItemStack>();
	}

}
