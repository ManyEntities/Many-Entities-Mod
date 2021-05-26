package com.FP115.ManyEntities.server.Mobs;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class SkeletonMinion extends EntitySkeleton{

	public SkeletonMinion(World world) {
		super(world);
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 100, false));
	}
	  @Override
	  protected void applyEntityAttributes()
	  {
	    super.applyEntityAttributes();
	    this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(30.0D);
	    this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(48.0D);
	    this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.0D);
	    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
	    this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.0D);
	    

	  }
	public boolean isAIEnabled()
	{
	   return true;
	}
	@Override
    public void setCurrentItemOrArmor(int p_70062_1_, ItemStack p_70062_2_)
    {
        super.setCurrentItemOrArmor(p_70062_1_, p_70062_2_);

        if (!this.worldObj.isRemote && p_70062_1_ == 0)
        {
            this.setCombatTask();
        }
    }
	  @Override
	  protected void addRandomArmor()
	  {
	      this.setCurrentItemOrArmor(0, new ItemStack(Items.diamond_sword));
	      this.setCurrentItemOrArmor(1, (ItemStack)null);
	      this.setCurrentItemOrArmor(2, (ItemStack)null);
	      this.setCurrentItemOrArmor(3, (ItemStack)null);
	      this.setCurrentItemOrArmor(4, new ItemStack(Items.diamond_helmet));
	  }
	

}
