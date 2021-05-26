package com.FP115.ManyEntities.server.blocks.blockcrystall;

import com.FP115.ManyEntities.ManyEntitiesBase;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCrystall extends Block implements ITileEntityProvider {

	public BlockCrystall() {
		super(Material.iron);
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
		this.setHardness(0.25F);
		this.setStepSound(soundTypeMetal);
		this.setBlockTextureName("iron_block");
		this.setBlockName("Crystalls");
		this.setBlockBounds(0.0F, 0.0F, 0.0F, 1.0F, 0.25F, 1.0F);
	}

	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new TileEntityCrystall();
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
