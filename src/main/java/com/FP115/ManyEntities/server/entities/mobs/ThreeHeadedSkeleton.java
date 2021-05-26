package com.FP115.ManyEntities.server.Mobs;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IRangedAttackMob;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIArrowAttack;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.monster.EntitySkeleton;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.entity.projectile.EntitySnowball;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;


public class ThreeHeadedSkeleton extends EntitySkeleton implements EntityBoss, IRangedAttackMob{
	
	
	
	private int angerLevel;
	private int randomSoundDelay;
	private boolean Damage;
	
	
	private EntityAIArrowAttack aiArrowAttack = new EntityAIArrowAttack(this, 1.0D, 20, 20, 15.0F);

	int phase;
	public ThreeHeadedSkeleton(World par1World)
	  {
	  super(par1World);
	  this.isImmuneToFire = true;
	  this.setSize(this.width * 1.5F, this.height * 1.8F);
	  
	  phase = 1;
	  Damage = false;
	  this.tasks.addTask(4, new ThreeHeadedSkeleton.AIAttackPhase());
	  this.tasks.addTask(1, new  EntityAISwimming(this));
	  this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 98.0F));
	  this.tasks.addTask(3, new EntityAIWander(this, 1.0D));
	  this.tasks.addTask(5, new EntityAILookIdle(this));
	  

	  
	  this.targetTasks.addTask(9, new EntityAIHurtByTarget(this, true));
	  this.targetTasks.addTask(7, new EntityAINearestAttackableTarget(this, EntityPlayer.class, 0, true));
	  

    }
	
	public Entity findPlayerToAttack()
    {
        EntityPlayer entityplayer = this.worldObj.getClosestPlayerToEntity(this, 98.0D);
        if(entityplayer != null && this.canEntityBeSeen(entityplayer))
        {
        	return entityplayer;
        }else {
        	return null;
        }
    }

    
	 @Override
	 public void attackEntity(Entity entity, float f) {
		 if(phase == 1) {
	    	if(rand.nextInt(50) == 0)
	    		{
	        		attackEntityWithRangedAttack((EntityLivingBase)entity, f);
	    		}
			 if(rand.nextInt(500)==0) {
				 Damage = true;
				 this.worldObj.createExplosion((Entity)null, this.posX, this.posY, this.posZ,6.0F, false);
				 Damage = false;
			 }
		 }

		 if(phase == 2) {
	    		if(rand.nextInt(50) == 0)
	    		{
	        		attackEntityWithRangedAttack((EntityLivingBase)entity, f);
	    		}
	    		if(rand.nextInt(110) == 0)
	    		{
	    			this.SpawnMinions("SkeletonMinion", posX + rand.nextInt(2), posY + 3, posZ + rand.nextInt(2));
	    		}
				if(rand.nextInt(459)==0) {
					 Damage = true;
					 this.worldObj.createExplosion((Entity)null, this.posX, this.posY, this.posZ, 4.0F, false);
					 Damage = false;
				}
		 }
		if(phase == 3) {
    		if(rand.nextInt(50) == 0)
    		{
        		attackEntityWithRangedAttack((EntityLivingBase)entity, f);
    		}
    		if(rand.nextInt(110) == 0)
    		{
    			this.SpawnMinions("SkeletonMinion", posX + rand.nextInt(2), posY + 3, posZ + rand.nextInt(2));
    		}
			if(rand.nextInt(400)==0) {
				 Damage = true;
				 this.worldObj.createExplosion((Entity)null, this.posX, this.posY, this.posZ, 4.0F, false);
				 Damage = false;
			}

	   	}
		else if(phase == 4) {
    		if(rand.nextInt(35) == 0)
    		{
        		attackEntityWithRangedAttack((EntityLivingBase)entity, f);
    		}
    		if(rand.nextInt(150) == 0)
    		{
    			this.SpawnMinions("SkeletonMinion", posX + rand.nextInt(2), posY + 3, posZ + rand.nextInt(2));
            }
			 if(rand.nextInt(200)==0) {
				 Damage = true;
				 this.worldObj.createExplosion((Entity)null, this.posX, this.posY, this.posZ, 8.0F, false);
				 Damage = false;
			 }

	    }
	   	
	  	 
}
	 
		public void onLivingUpdate()
	    {
			this.isImmuneToFire = true;
			this.fallDistance=0;
	    	this.updateArmSwingProgress();

	    	if(phase == 1)
	    	{
	    		if(this.getHealth() < 250)
	    		
	    		{
	    			phase = 2;
	    		}
	    	}
	    	if(phase == 2)
	    	{
	    		if(this.getHealth() < 200)
	    		{
	    			phase = 3;
	    		}
	    	}
	    	if(phase == 3)
	    	{
	    		if(this.getHealth() < 100)
	    		{
	    			phase = 4;
	    		}
	    	}
	    	if(phase == 4)
	    	{
	    	}
	    	super.onLivingUpdate();
	    }
	
	public boolean isAIEnabled()
	{
	   return true;
	}
	
	

    
    @Override
    protected void applyEntityAttributes()
    {
      super.applyEntityAttributes();
      this.getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(300.0D);
      this.getEntityAttribute(SharedMonsterAttributes.followRange).setBaseValue(32.0D);
      this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(0.0D);
      this.getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(0.21000000417232513D);
      this.getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(18.0D);
      this.getEntityAttribute(SharedMonsterAttributes.knockbackResistance).setBaseValue(10000000.0D);
    }



	@Override
	public void attackEntityWithRangedAttack(EntityLivingBase par1EntityLivingBase, float par2) {
		EntitySnowball entitysnowball = new EntitySnowball(this.worldObj, this);
        EntityArrow entityarrow = new EntityArrow(this.worldObj, this, par2);
        EntityArrow entityarrow1 = new EntityArrow(this.worldObj, this, par2);
        EntityArrow entityarrow2 = new EntityArrow(this.worldObj, this, par2);
        double d0 = par1EntityLivingBase.posX - this.posX;
        double d1 = par1EntityLivingBase.posY + (double)par1EntityLivingBase.getEyeHeight() - 1.100000023841858D - entitysnowball.posY;
        double d2 = par1EntityLivingBase.posZ - this.posZ;
        float f1 = MathHelper.sqrt_double(d0 * d0 + d2 * d2) * 0.2F;
        entitysnowball.setThrowableHeading(d0, d1 + (double)f1, d2, 1.6F, 12.0F);
        entityarrow.setThrowableHeading(d0, d1 + (double)f1, d2, 1.6F, 12.0F);
        entityarrow1.setThrowableHeading(d0, d1 + (double)f1, d2, 1.6F, 11.0F);
        entityarrow2.setThrowableHeading(d0, d1 + (double)f1, d2, 1.6F, 13.0F);
        this.playSound("random.bow", 1.0F, 1.0F / (this.getRNG().nextFloat() * 0.4F + 0.8F));
        this.worldObj.spawnEntityInWorld(entityarrow);
        this.worldObj.spawnEntityInWorld(entityarrow1);
        this.worldObj.spawnEntityInWorld(entityarrow2);

        
		
	}
	@Override
    protected String getLivingSound()
    {
        return "mob.skeleton.say";
    }
    @Override


    protected String getHurtSound()
    {
        return "mob.skeleton.hurt";
    }
    @Override

    protected String getDeathSound()
    {
        return "mob.irongolem.death";
    }

    public void SpawnMinions(String entityToSpawn, double x, double y, double z) {
    	SkeletonMinion SkeletonMinion = new SkeletonMinion(worldObj);
    	
    	SkeletonMinion.setPosition(x, y, z);
    	if(entityToSpawn.equals("SkeletonMinion"))
    	{
    		worldObj.spawnEntityInWorld(SkeletonMinion);
    		
    		SkeletonMinion.setCurrentItemOrArmor(0, new ItemStack(Items.diamond_sword));
    		SkeletonMinion.setCurrentItemOrArmor(1, (ItemStack)null);
    		SkeletonMinion.setCurrentItemOrArmor(2, (ItemStack)null);
    		SkeletonMinion.setCurrentItemOrArmor(3, (ItemStack)null);
    		SkeletonMinion.setCurrentItemOrArmor(4, new ItemStack(Items.diamond_helmet));
    	}

    	
    }
    public int getPhase()
    {
    	return phase;
    }
    public class AIAttackPhase extends EntityAIBase {

    	public ThreeHeadedSkeleton Skeletboss = ThreeHeadedSkeleton.this;
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
	public boolean isEntityInvulnerable()
	{
		return Damage;
	}
 

	  

}
