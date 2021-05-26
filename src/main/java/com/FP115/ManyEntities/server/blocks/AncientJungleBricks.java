package com.FP115.ManyEntities.server.blocks;

import com.FP115.ManyEntities.ManyEntitiesBase;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.main.Main;
import net.minecraft.creativetab.CreativeTabs;


public class AncientJungleBricks extends Block {

	public AncientJungleBricks() {
		super(Material.rock);
        this.setBlockName("ancientjunglebricks");
		
        this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
		
		this.setHardness(-1F);
		
		this.setResistance(9999F);
		
		this.setHarvestLevel("pickaxe", 3);
		
		this.setLightLevel(0F);
		
		this.setBlockTextureName("manyentities:ancientjunglebricks");
		
		
	}

}