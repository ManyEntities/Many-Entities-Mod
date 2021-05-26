package com.FP115.ManyEntities.server.blocks.Crystallizer;

import com.FP115.ManyEntities.ManyEntitiesBase;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class Crystallizer extends Block implements ITileEntityProvider{

	public Crystallizer() {
		super(Material.rock);
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
		this.setBlockName("crystallizer");
		
	}
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
		if (itemStack.hasDisplayName())
			((TileEntityCrystallizer)world.getTileEntity(x, y, z)).setInventoryName(itemStack.getDisplayName());
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote && world.getTileEntity(x, y, z) instanceof TileEntityCrystallizer)
			player.openGui(ManyEntitiesBase.instance, 6, world, x, y, z);
		return true;
	}
	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityCrystallizer();
	}
	public int getRenderType() {
		return -1;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}
}
