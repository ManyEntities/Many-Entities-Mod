package com.FP115.ManyEntities.server.blocks;

import java.util.Random;

import com.FP115.ManyEntities.ManyEntitiesBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

public class LrianiumOre extends Block {
	@Override
	public Item getItemDropped(int par1, Random par2Random, int par3)
	{
	  return Item.getItemFromBlock( MEBlocks.lrianium_ore);
	}

	public LrianiumOre() {
		super(Material.rock);
		
		this.setBlockName("lrianium_ore");
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
		this.setBlockTextureName("manyentities:lrianium_ore");
		this.setHardness(40F);
		this.setResistance(5000F);
		this.setHarvestLevel("pickaxe", 3);
	}

}
