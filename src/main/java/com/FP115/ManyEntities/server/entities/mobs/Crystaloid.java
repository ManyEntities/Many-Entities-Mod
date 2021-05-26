package com.FP115.ManyEntities.server.Mobs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class Crystaloid extends EntityAnimal{
	
	
	public Crystaloid(World par2World)
	  {
	  super(par2World);
	  this.setSize(1.5F, 1.5F);
	  
      this.tasks.addTask(0, new EntityAISwimming(this));
      this.tasks.addTask(1, new EntityAIPanic(this, 2.1D));
      this.tasks.addTask(3, new EntityAITempt(this, 1.5D, Items.diamond, false));
      this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
      this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 2.3F));
      this.tasks.addTask(7, new EntityAILookIdle(this));
	  }
	@Override
	 protected void applyEntityAttributes()
	 {
	  super.applyEntityAttributes();
      this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(10.0D);
      this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.21D);
	 }
	
    public boolean isAIEnabled()
    {
        return true;
    }
    
    @Override
    public boolean getCanSpawnHere()
    {
    	//if(worldObj.provider.dimensionId==0) {
    	    return this.posY < 50.0D && super.getCanSpawnHere();
    	//}
    	//else if(worldObj.provider.dimensionId==-1){
    	//	return this.posY < 120.0D && super.getCanSpawnHere();
    	//}
    }
    protected boolean isValidLightLevel() {
        return true;
    }
    @Override
    public boolean interact(EntityPlayer entity)
    {
        ItemStack itemstack = entity.inventory.getCurrentItem();

        if (itemstack != null && itemstack.getItem() == Items.bucket && !entity.capabilities.isCreativeMode)
        {
            if (itemstack.stackSize-- == 1)
            {
          	  this.worldObj.createExplosion((Entity)null, this.posX, this.posY, this.posZ, 1.0F, false);
            }
            else if (!entity.inventory.addItemStackToInventory(new ItemStack(Items.milk_bucket)))
            {
          	  
            }

            return true;
        }
        else
        {
            return super.interact(entity);
        }
    }
	@Override
    public Crystaloid createChild(EntityAgeable p_90011_1_)
    {
        return new Crystaloid(this.worldObj);
    }
    

}
