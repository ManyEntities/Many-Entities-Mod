package com.FP115.ManyEntities.server.items;

import com.FP115.ManyEntities.ManyEntitiesBase;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class NetherBerry extends ItemFood{
	public NetherBerry(){
		super(1, 0.1F, false);
		setCreativeTab(ManyEntitiesBase.tabmanyentities);
		setTextureName("manyentities:netherberry");
		setUnlocalizedName("netherberry");
	}
    protected void onFoodEaten(ItemStack stack, World world, EntityPlayer player)
    {
        if (!world.isRemote)
        {
        	player.addPotionEffect(new PotionEffect(Potion.fireResistance.id, 100, 1));
        }
    }

}
