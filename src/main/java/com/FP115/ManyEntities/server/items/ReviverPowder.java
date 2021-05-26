package com.FP115.ManyEntities.server.items;

import com.FP115.ManyEntities.ManyEntitiesBase;
import com.FP115.ManyEntities.server.entities.projectiles.EntityReviverPowder;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ReviverPowder extends Item{
	public ReviverPowder() {
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
		 this.setTextureName("manyentities:reviverpowder");
		 this.setUnlocalizedName("reviverpowder");
		  this.setMaxDamage(30);
		 }
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player){
		if(!world.isRemote) {
	        world.spawnEntityInWorld(new EntityReviverPowder(world, player));
	        itemStack.damageItem(1, player);
		}
		return super.onItemRightClick(itemStack, world, player);
		
	}
}
