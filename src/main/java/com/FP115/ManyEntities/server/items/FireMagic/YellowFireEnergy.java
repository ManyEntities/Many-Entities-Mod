package com.FP115.ManyEntities.server.items.FireMagic;

import com.FP115.ManyEntities.ManyEntitiesBase;

import net.minecraft.item.Item;

public class YellowFireEnergy extends Item implements IFireMagicItem{
	public YellowFireEnergy() {
		this.setUnlocalizedName("yellowfireenergy");
		this.setTextureName("manyentities:yellowfireenergy");
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
	}
}
