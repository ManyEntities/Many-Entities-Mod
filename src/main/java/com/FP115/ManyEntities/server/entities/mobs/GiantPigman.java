package com.FP115.ManyEntities.server.Mobs;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.world.World;

public class GiantPigman extends EntityMob{
	public GiantPigman(World par2World)
	  {
	  super(par2World);
	  this.setSize(1F, 1F);
	  }
	  @Override
	  protected void applyEntityAttributes()
	  {
	    super.applyEntityAttributes();
	    this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(150.0D);
	    this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(72.0D);
	    this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(10.0D);
	    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
	    this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(9.0D);
	    

	  }
	 

}
