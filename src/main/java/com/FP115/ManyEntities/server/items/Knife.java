package com.FP115.ManyEntities.server.items;

import com.FP115.ManyEntities.ManyEntitiesBase;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class Knife extends Item{
	public Knife(){
		this.setUnlocalizedName("knife");
		this.setTextureName("manyentities:knife");
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
		this.setMaxStackSize(1);
		this.setNoRepair();
		this.setMaxDamage(7);
		this.setFull3D();
	}
	@Override
    public boolean hasContainerItem(ItemStack stack) {  
        return true;
    }
    public ItemStack getContainerItem(ItemStack stack) {
        ItemStack ret = stack.copy();
        ret.attemptDamageItem(1, this.itemRand);
        return ret;
    }
}
