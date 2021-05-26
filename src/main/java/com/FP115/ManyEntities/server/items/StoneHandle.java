package com.FP115.ManyEntities.server.items;

import com.FP115.ManyEntities.ManyEntitiesBase;
import com.FP115.ManyEntities.BiomeGenBase.Structures.NetherStructures;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class StoneHandle extends Item {
	public StoneHandle() {
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
		 this.setTextureName("manyentities:stonehandle");
		 this.setFull3D();	
	}
}
