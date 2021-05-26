package com.FP115.ManyEntities.server.items;

import com.FP115.ManyEntities.ManyEntitiesBase;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityLargeFireball;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;

public class MagicScepter extends Item{
	public MagicScepter() {
		super();
		setCreativeTab(ManyEntitiesBase.tabmanyentities);
		setFull3D();
		setTextureName("manyentities:magicscepter");
		setUnlocalizedName("magicscepter");
	}
	@Override
	public void onUpdate(ItemStack p_77663_1_, World world, Entity p_77663_3_, int p_77663_4_, boolean p_77663_5_) {
		//*/
	}
	/*@Override
	public ItemStack onItemRightClick(ItemStack itemStack, World world, EntityPlayer player) {
		if(!world.isRemote){
		Vec3 vec3 = player.getLookVec();
		double d0 = vec3.xCoord;
	    double d1 = vec3.yCoord;
        double d2 = vec3.zCoord;
       // double d0 = player.targetedEntity.posX - this.posX;
        //double d1 = player.targetedEntity.boundingBox.minY + (double)(this.targetedEntity.height / 2.0F) - (this.posY + (double)(this.height / 2.0F));
       // double d2 = player.targetedEntity.posZ - this.posZ;
		if (!player.isSneaking()) {
			EntityLargeFireball entitysmallfireball = new EntityLargeFireball(world, (EntityLivingBase)player, player.posX, player.posY, player.posZ);
			entitysmallfireball.moveEntity(player.posX + vec3.xCoord * 5.0D, player.posY + vec3.yCoord * 5.0D, player.posZ+ vec3.zCoord * 5.0D);
       	    //double d8 = 4.0D;
       	    //entitysmallfireball.posX = player.posX;
       	    //entitysmallfireball.posY = player.posY + player.getEyeHeight();
            //entitysmallfireball.posZ = player.posZ;
       	    entitysmallfireball.motionX = vec3.xCoord;
       	    entitysmallfireball.motionZ = vec3.zCoord;
       	    entitysmallfireball.motionY = vec3.yCoord;
            player.worldObj.spawnEntityInWorld(entitysmallfireball);
		}
		}
		return super.onItemRightClick(itemStack, world, player);
	}///*/
}
