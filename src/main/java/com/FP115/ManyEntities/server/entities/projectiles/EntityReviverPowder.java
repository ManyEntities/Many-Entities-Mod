package com.FP115.ManyEntities.server.entities.projectiles;

import com.FP115.ManyEntities.ManyEntitiesBase;

import com.FP115.ManyEntities.server.blocks.MEBlocks;
import net.minecraft.block.Block;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityThrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.world.World;

public class EntityReviverPowder extends EntityThrowable{

	public EntityReviverPowder(World p_i1776_1_) {
		super(p_i1776_1_);
	}
    public EntityReviverPowder(World p_i1786_1_, EntityLivingBase p_i1786_2_)
    {
        super(p_i1786_1_, p_i1786_2_);
    }

    public EntityReviverPowder(World p_i1787_1_, double p_i1787_2_, double p_i1787_4_, double p_i1787_6_)
    {
        super(p_i1787_1_, p_i1787_2_, p_i1787_4_, p_i1787_6_);
    }
    protected float getGravityVelocity()
    {
        return 0.07F;
    }

    protected float func_70182_d()
    {
        return 0.7F;
    }

    protected float func_70183_g()
    {
        return -20.0F;
    }
	@Override
	protected void onImpact(MovingObjectPosition mop) {
		int x = mop.blockX;
		int y = mop.blockY;
		int z = mop.blockZ;
		Block block = worldObj.getBlock(x, y, z);
        if (!this.worldObj.isRemote){
        	if(block == Blocks.netherrack||block == MEBlocks.fadednetherrack){
        		worldObj.setBlock(x, y, z, MEBlocks.sproutednetherrack);
        		this.setDead();
        	}
        	else{
        	    this.setDead();
        	}
        }
	}

}
