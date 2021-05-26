package com.FP115.ManyEntities.server.blocks;

import com.FP115.ManyEntities.ManyEntitiesBase;

import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class SkeletonBars extends BlockPane{

	public SkeletonBars() {
		super("manyentities:skeletonbars", "manyentities:skeletonbars", Material.rock, true);
		this.setHardness(-1F);
		this.setResistance(9999F);
		this.setHarvestLevel("pickaxe", 3);
		this.setLightLevel(0F);
		this.setBlockName("skeletonbars");
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
	}



}
