package com.FP115.ManyEntities.server.items.FireMagic;

import com.FP115.ManyEntities.ManyEntitiesBase;

import net.minecraft.item.Item;

public class NetherFireEnergy extends Item implements IFireMagicItem{
	public NetherFireEnergy() {
		this.setUnlocalizedName("netherfireenergy");
		this.setTextureName("manyentities:netherfireenergy");
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
	}
}
