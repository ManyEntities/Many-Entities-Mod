package com.FP115.ManyEntities.server.items;

import com.FP115.ManyEntities.ManyEntitiesBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class AncientPickaxe extends ItemPickaxe {

	public AncientPickaxe() {
		  super(ManyEntitiesBase.AncientPick);
		  this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
		  this.setTextureName("manyentities:ancientpickaxe");
		  
		}
	}

