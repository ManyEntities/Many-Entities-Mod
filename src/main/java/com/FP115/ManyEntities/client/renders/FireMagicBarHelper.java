package com.FP115.ManyEntities.client.renders;

import com.FP115.ManyEntities.ManyEntitiesBase;
import com.FP115.ManyEntities.server.network.MessageFireMagicBar;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraftforge.common.IExtendedEntityProperties;

public class FireMagicBarHelper implements IExtendedEntityProperties {
	private final EntityPlayer player;
	public static final String NAME = "FireMagicBar";
    private float barValue;
    public int regenDelay;
	
	public FireMagicBarHelper(EntityPlayer player) {
		this.player = player;
	}

	@Override
	public void saveNBTData(NBTTagCompound n) {
		NBTTagCompound tag = player.getEntityData().getCompoundTag(player.PERSISTED_NBT_TAG);
		tag.setFloat("FireMagicBarValue", barValue);
		tag.setInteger("FireMagicBarRegenDelay", regenDelay);
        player.getEntityData().setTag(player.PERSISTED_NBT_TAG, tag);
	}

	@Override
	public void loadNBTData(NBTTagCompound n) {
		NBTTagCompound tag = (NBTTagCompound) player.getEntityData().getCompoundTag(player.PERSISTED_NBT_TAG);
		if(!tag.hasKey("FireMagicBarValue"))return;
		barValue = tag.getFloat("FireMagicBarValue");
		regenDelay = tag.getInteger("FireMagicBarRegenDelay");
        player.getEntityData().setTag(player.PERSISTED_NBT_TAG, tag);
	}
	public static void addProperties(EntityPlayer player) {
		player.registerExtendedProperties(NAME, new FireMagicBarHelper(player));
	}
	
	public static FireMagicBarHelper getProperties(EntityPlayer player) {
		return (FireMagicBarHelper)player.getExtendedProperties(NAME);
	}

	public void updateAllBars() {
		if(barValue != 200F && player.dimension==-1){
			regen(0.1F);
		} else {
			regen(0);
		}
		if(barValue >= 200F){
			barValue = 200F;
		}
		if(player instanceof EntityPlayerMP) ManyEntitiesBase.network.sendTo(new MessageFireMagicBar(barValue, regenDelay == 0), (EntityPlayerMP)player);
	}                

	public boolean useBar(float amount, int regendelay) {
		if(barValue < amount) {
			regenDelay = regendelay;
			return false;
		}
		barValue -= amount;
		regenDelay = regendelay;
		if(player instanceof EntityPlayerMP) ManyEntitiesBase.network.sendTo(new MessageFireMagicBar(barValue, regenDelay == 0), (EntityPlayerMP)player);
		return true;
	}

	public void regen(float amount) {
		if(regenDelay == 0) {
			barValue += amount;
		} else {
			regenDelay--;
		}
		if(player instanceof EntityPlayerMP) ManyEntitiesBase.network.sendTo(new MessageFireMagicBar(barValue, regenDelay == 0), (EntityPlayerMP)player);
	}
	
	public void forceRegen(float amount) {
		barValue += amount;
		if(player instanceof EntityPlayerMP) ManyEntitiesBase.network.sendTo(new MessageFireMagicBar(barValue, regenDelay == 0), (EntityPlayerMP)player);
	}

	public float getBarValue() {
		return barValue;
	}

	public void setBarValue(float i) {
		barValue = i;
		if(player instanceof EntityPlayerMP) ManyEntitiesBase.network.sendTo(new MessageFireMagicBar(barValue, regenDelay == 0), (EntityPlayerMP)player);
	}
	
	public void removeValue(float i) {
		regenDelay = 50;
		barValue -= i;
		if(player instanceof EntityPlayerMP) ManyEntitiesBase.network.sendTo(new MessageFireMagicBar(barValue, regenDelay == 0), (EntityPlayerMP)player);
	}

    @Override
	public void init(Entity entity, World world) {}

}
