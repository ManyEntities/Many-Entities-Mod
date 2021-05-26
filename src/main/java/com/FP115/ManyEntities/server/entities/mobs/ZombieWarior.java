package com.FP115.ManyEntities.server.Mobs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.entity.monster.EntityZombie;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class ZombieWarior extends EntityZombie{
	private boolean firstUpdate = true;

	public ZombieWarior(World world) {
		super(world);
		this.isImmuneToFire = true;
		this.tasks.addTask(3, new ZombieWarior.AIAttackPhase());
		this.targetTasks.addTask(1, new EntityAIHurtByTarget(this, true));
		this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 100, false));
	}
	  @Override
	  protected void applyEntityAttributes()
	  {
	    super.applyEntityAttributes();
	    this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(50.0D);
	    this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(48.0D);
	    this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.0D);
	    this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.25D);
	    this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(5.0D);
	    

	  }
		public boolean isAIEnabled()
		{
		   return true;
		}
	public void spawnSpider(World world){
		EntitySpider entitys = new EntitySpider(worldObj);//EntitySpider
		entitys.setPosition(posX, posY, posZ);
		world.spawnEntityInWorld(entitys);
	    if (entitys != null) {
	    	entitys.setPosition(posX, posY, posZ);
	        setCanPickUpLoot(false);
	        worldObj.spawnEntityInWorld(entitys);
	        mountEntity(entitys);
	        }
	}
	@Override
	public void onLivingUpdate() {
		
		EntitySpider entity = new EntitySpider(worldObj);//EntitySpider
	     if (firstUpdate && !worldObj.isRemote) {
	    	 spawnSpider(worldObj);
	      }
	    firstUpdate = false;
	    super.onLivingUpdate();
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
	
	 private void setCombatTask() {
		
	}
	//public void attackEntityWithRangedAttack(EntityLivingBase par1EntityLivingBase, float par2,Entity entity) {
		//	float f1 = MathHelper.sqrt_float(par2) * 0.5F;
		//	double d0 = entity.posX - this.posX;
        //    double d1 = entity.getBoundingBox().minY + (double)(entity.height / 2.0F) - (this.posY + (double)(this.height / 2.0F));
       //     double d2 = entity.posZ - this.posZ;
		//	EntityLargeFireball entitysmallfireball = new EntityLargeFireball(this.worldObj, this, d0 + this.rand.nextGaussian() * (double)f1, d1, d2 + this.rand.nextGaussian() * (double)f1);
          //  entitysmallfireball.posY = this.posY + (double)(this.height / 2.0F) + 0.5D;
          //  this.worldObj.spawnEntityInWorld(entitysmallfireball);

	        
			
		//}
	 @Override
	 public void attackEntity(Entity entity, float f) {
		 double d0 = entity.posX - this.posX;
		 double d1 = entity.boundingBox.minY + (double)(entity.height / 2.0F) - (this.posY + (double)(this.height / 2.0F));
         double d2 = entity.posZ - this.posZ;
         if(rand.nextInt(24) == 0)
         {
             float f1 = MathHelper.sqrt_float(f) * 0.5F;
             this.worldObj.playAuxSFXAtEntity((EntityPlayer)null, 1009, (int)this.posX, (int)this.posY, (int)this.posZ, 0);

             for (int i = 0; i < 1; ++i)
             {
            	 EntityLargeFireball entitysmallfireball = new EntityLargeFireball(this.worldObj, this, d0 + this.rand.nextGaussian() * (double)f1, d1, d2 + this.rand.nextGaussian() * (double)f1);
            	 double d8 = 4.0D;
                 Vec3 vec3 = this.getLook(1.0F);
                 entitysmallfireball.posX = this.posX;// + vec3.xCoord * d8;
                 entitysmallfireball.posY = this.posY + (double)(this.height / 2.0F) + 0.5D;
                 entitysmallfireball.posZ = this.posZ;// + vec3.zCoord * d8;
                 //LargeEnergyBall entitysmallfireball = new LargeEnergyBall(this.worldObj, this, d0 + this.rand.nextGaussian() * (double)f1, d1, d2 + this.rand.nextGaussian() * (double)f1);
                 //entitysmallfireball.posY = this.posY + (double)(this.height / 2.0F) + 0.5D;
                 this.worldObj.spawnEntityInWorld(entitysmallfireball);
             }
         }
	 }
	 public class AIAttackPhase extends EntityAIBase {

	    	public ZombieWarior Skeletboss = ZombieWarior.this;
	    	public int attackTime;
	    	public AIAttackPhase() {}
	    	
			@Override
			public boolean shouldExecute() {
	            EntityLivingBase entitylivingbase = this.Skeletboss.getAttackTarget();
	            return entitylivingbase != null && entitylivingbase.isEntityAlive();
			}
	        public void updateTask()
	        {
	        	--attackTime;
	            EntityLivingBase entitylivingbase = this.Skeletboss.getAttackTarget();
	            double d0 = this.Skeletboss.getDistanceSqToEntity(entitylivingbase);

	            if (d0 < 4.0D)
	            {
	                if (this.attackTime <= 0)
	                {
	                    this.attackTime = 20;
	                    this.Skeletboss.attackEntityAsMob(entitylivingbase);
	                }
	                
	                this.Skeletboss.getMoveHelper().setMoveTo(entitylivingbase.posX, entitylivingbase.posY, entitylivingbase.posZ, 1.0D);
	            }
	            else if (d0 < 256.0D)
	            {
	            	Skeletboss.attackEntity(entitylivingbase, (float)d0);
	                this.Skeletboss.getLookHelper().setLookPositionWithEntity(entitylivingbase, 10.0F, 10.0F);
	            }
	            else
	            {
	                this.Skeletboss.getNavigator().clearPathEntity();
	                this.Skeletboss.getMoveHelper().setMoveTo(entitylivingbase.posX, entitylivingbase.posY, entitylivingbase.posZ, 0.5D);
	            }
	        }
	    }
	 @Override
	 public double getYOffset()
	    {
	        return super.getYOffset() - 0.5D;
	    }
}
