package com.FP115.ManyEntities.server.blocks;

import java.util.Random;

import com.FP115.ManyEntities.ManyEntitiesBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class LrianiumBlock extends Block {

	public LrianiumBlock() {
		super(Material.iron);
		this.setHarvestLevel("pickaxe", 3);
		this.setHardness(20F);
		this.setResistance(5000F);
		this.setBlockName("lrianium_block");
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
		this.setBlockTextureName("manyentities:lrianium_block");
	}
	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3)
	{
	  return Item.getItemFromBlock( MEBlocks.lrianium_block);
	}

}
