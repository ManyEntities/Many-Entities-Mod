package com.FP115.ManyEntities.server.blocks;

import com.FP115.ManyEntities.ManyEntitiesBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SkeletonBrick extends Block {
	public SkeletonBrick() {
		super(Material.rock);
		
		this.setBlockName("skeletonbrick");
		
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
		
		this.setHardness(-1F);
		
		this.setResistance(9999F);
		
		this.setHarvestLevel("pickaxe", 3);
		
		this.setLightLevel(0F);
		
		this.setBlockTextureName("manyentities:skeletonbrick");
	}

}
