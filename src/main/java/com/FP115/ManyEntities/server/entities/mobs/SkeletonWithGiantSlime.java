package com.FP115.ManyEntities.server.Mobs;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntityMob;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class SkeletonWithGiantSlime extends EntityMob{
	private boolean firstUpdate = true;
	public float squishAmount;
    public float squishFactor;
    public float prevSquishFactor;
    /** ticks until this slime jumps again */
    private int slimeJumpDelay;

	public SkeletonWithGiantSlime(World world) {
		super(world);
        this.slimeJumpDelay = this.rand.nextInt(20) + 10;
	}
	@Override
	  protected void applyEntityAttributes()
	  {
	    super.applyEntityAttributes();
	    this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(150.0D);
	    this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(64.0D);
	    this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.1D);
	    this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(18.0D);
	    

	  }
	@Override
	public void onLivingUpdate() {
		
		EntitySpider entity = new EntitySpider(worldObj);//EntitySpider
	     if (firstUpdate && !worldObj.isRemote) {
	      }
	    firstUpdate = false;
	    super.onLivingUpdate();
	     }
	protected void updateEntityActionState()
    {
        this.despawnEntity();
        EntityPlayer entityplayer = this.worldObj.getClosestVulnerablePlayerToEntity(this, 16.0D);

        if (entityplayer != null)
        {
            this.faceEntity(entityplayer, 10.0F, 20.0F);
        }

        if (this.onGround && this.slimeJumpDelay-- <= 0)
        {
            this.slimeJumpDelay = this.getJumpDelay();

            if (entityplayer != null)
            {
                this.slimeJumpDelay /= 3;
            }

            this.isJumping = true;

            
            this.playSound(this.getJumpSound(), this.getSoundVolume(), ((this.rand.nextFloat() - this.rand.nextFloat()) * 0.2F + 1.0F) * 0.8F);
            

            this.moveStrafing = 1.0F - this.rand.nextFloat() * 2.0F;
            this.moveForward = (float)(22);
        }
        else
        {
            this.isJumping = false;

            if (this.onGround)
            {
                this.moveStrafing = this.moveForward = 0.0F;
            }
        }
    }
	protected int getJumpDelay()
    {
        return this.rand.nextInt(20) + 10;
    }
	protected String getJumpSound()
    {
        return "mob.slime.big";
    }

}
