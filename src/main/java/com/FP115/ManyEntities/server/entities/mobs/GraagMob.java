package com.FP115.ManyEntities.server.Mobs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class GraagMob extends EntityMob
{
  public GraagMob(World par1World)
  {
  super(par1World);
  this.setSize(this.width * 1.5F, this.height * 1.5F);
  
  this.tasks.addTask(1, new  EntityAISwimming(this));
  this.tasks.addTask(2, new EntityAIAttackOnCollide(this, EntityPlayer.class, 1.0D, false));
  this.tasks.addTask(3, new EntityAIWander(this, 1.0D));
  this.tasks.addTask(4, new EntityAIWatchClosest(this, EntityPlayer.class, 8.0F));
  this.tasks.addTask(5, new EntityAILookIdle(this));
  

  this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, false));
  this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, false));
  }
  @Override
  protected void applyEntityAttributes()
  {
    super.applyEntityAttributes();
    this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(32.0D);
    this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(48.0D);
    this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(10.0D);
    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
    this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(4.0D);
    
    

  }
  
  public boolean isAIEnabled()
  {
     return true;
  }

  @Override
  protected void addRandomArmor()
  {
      this.setCurrentItemOrArmor(1, new ItemStack(Items.iron_helmet));
  }
  public IEntityLivingData func_110161_a(IEntityLivingData par1EntityLivingData) {
      this.setCurrentItemOrArmor(0, new ItemStack(Items.diamond_sword));
      this.setCurrentItemOrArmor(1, (ItemStack)null);
      this.setCurrentItemOrArmor(2, (ItemStack)null);
      this.setCurrentItemOrArmor(3, (ItemStack)null);
      this.setCurrentItemOrArmor(4, new ItemStack(Items.golden_helmet));
      return par1EntityLivingData;
   }
  public boolean interact(EntityPlayer entity)
  {
      ItemStack itemstack = entity.inventory.getCurrentItem();

      if (itemstack != null && itemstack.getItem() == Items.bucket && !entity.capabilities.isCreativeMode)
      {
          if (itemstack.stackSize-- == 1)
          {
        	  this.worldObj.createExplosion((Entity)null, this.posX, this.posY, this.posZ, 6.0F, true);
          }
          else if (!entity.inventory.addItemStackToInventory(new ItemStack(Items.milk_bucket)))
          {
        	  entity.dropPlayerItemWithRandomChoice(new ItemStack(Items.milk_bucket, 1, 0), false);
          }

          return true;
      }
      else
      {
          return super.interact(entity);
      }
  }

 
      
  
 
 }
  
  

