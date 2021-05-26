package com.FP115.ManyEntities;

import com.FP115.ManyEntities.server.blocks.MEBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class TabManyEntities extends CreativeTabs {
	
	

	public TabManyEntities(String lable) {
		super(lable);
	}

	@Override
	public Item getTabIconItem()
	{
	  return Item.getItemFromBlock(MEBlocks.ancientjunglebricks);
	}

}
