package com.FP115.ManyEntities.server.blocks;

import com.FP115.ManyEntities.ManyEntitiesBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class LrianiumStone extends Block {

	public LrianiumStone() {
		super(Material.rock);
		this.setBlockName("lrianium_stone");
		this.setBlockTextureName("manyentities:lrianium_stone");
		this.setHarvestLevel("pickaxe", 1);
		this.setHardness(10);
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
	}

}
