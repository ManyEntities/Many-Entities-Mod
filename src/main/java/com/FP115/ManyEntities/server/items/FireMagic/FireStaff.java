package com.FP115.ManyEntities.server.items.FireMagic;

import com.FP115.ManyEntities.ManyEntitiesBase;
import com.FP115.ManyEntities.client.renders.FireMagicBarHelper;
import com.FP115.ManyEntities.server.entities.projectiles.EntityReviverPowder;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class FireStaff extends Item implements IFireMagicItem{
	
	public FireStaff(){
		super();
		this.setMaxStackSize(1);	
		this.setUnlocalizedName("firestaff");
		this.setTextureName("manyentities:firestaff");
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
	}
    
	@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player){
		if(!world.isRemote) {
			if(player.capabilities.isCreativeMode){
				world.spawnEntityInWorld(new EntityReviverPowder(world, player));
			}
			else {
				if(FireMagicBarHelper.getProperties(player).useBar(20, 0)){
			        world.spawnEntityInWorld(new EntityReviverPowder(world, player));
		        }
			}
	    }
		return super.onItemRightClick(itemStack, world, player);
	}

}
