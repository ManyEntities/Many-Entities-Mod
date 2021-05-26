package com.FP115.ManyEntities.server.items.FireMagic;

import com.FP115.ManyEntities.ManyEntitiesBase;

import net.minecraft.item.Item;

public class LavaFireEnergy extends Item implements IFireMagicItem{
	public LavaFireEnergy() {
		this.setUnlocalizedName("lavafireenergy");
		this.setTextureName("manyentities:lavafireenergy");
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
	}
}
