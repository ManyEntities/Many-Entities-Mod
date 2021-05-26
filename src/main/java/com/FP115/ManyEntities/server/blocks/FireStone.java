package com.FP115.ManyEntities.server.blocks;

import com.FP115.ManyEntities.ManyEntitiesBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class FireStone extends Block{
	public FireStone() {
		super(Material.rock);
		this.setBlockTextureName("manyentities:firestone");
		this.setBlockName("firestone");
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
		this.setResistance(500);
		this.setHardness(10);
		this.setHarvestLevel("pickaxe", 2);
	}
}
