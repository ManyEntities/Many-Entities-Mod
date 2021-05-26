package com.FP115.ManyEntities.server.blocks.magictable;

import com.FP115.ManyEntities.ManyEntitiesBase;

import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;


public class MagicTable extends Block implements ITileEntityProvider{
	
	public MagicTable() {
		super(Material.rock);
		this.setBlockTextureName("cobblestone");
		this.setHardness(-1.0F);
		this.setResistance(99999.0F);
		this.setStepSound(soundTypePiston);
		this.setBlockName("magictable");
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
	}
	@Override
	public TileEntity createNewTileEntity(World world, int metadata) {
		return new MagicTableTileEntity();
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
