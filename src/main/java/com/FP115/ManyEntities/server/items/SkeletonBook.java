package com.FP115.ManyEntities.server.items;

import com.FP115.ManyEntities.ManyEntitiesBase;

import net.minecraft.item.Item;

public class SkeletonBook extends Item {



	public SkeletonBook() {
		this.setNoRepair();
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
		this.setMaxStackSize(1);
		this.setTextureName("manyentities:skeletonbook");
		this.setUnlocalizedName("SkeletonBook");

		
		
	}
	
	
}
