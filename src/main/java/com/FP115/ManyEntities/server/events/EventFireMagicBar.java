package com.FP115.ManyEntities.server.events;

import com.FP115.ManyEntities.client.renders.FireMagicBarHelper;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerChangedDimensionEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedInEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerLoggedOutEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.PlayerRespawnEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import cpw.mods.fml.common.gameevent.TickEvent.Phase;
import cpw.mods.fml.common.gameevent.TickEvent.PlayerTickEvent;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.event.entity.EntityEvent;
import net.minecraftforge.event.entity.player.PlayerEvent;

public class EventFireMagicBar {
	@SubscribeEvent
	public void addEntityConstructingManaEntity(EntityEvent.EntityConstructing event) {
		if (event.entity instanceof EntityPlayer)
			if (FireMagicBarHelper.getProperties((EntityPlayer)event.entity) == null)
				FireMagicBarHelper.addProperties((EntityPlayer)event.entity);
	}
	@SubscribeEvent
	public void onTick(TickEvent.PlayerTickEvent event){
		if(event.phase == Phase.START){
			onTickStart(event.player);
		} else {
			onTickEnd(event.player);
		}
	}

	private void onTickEnd(EntityPlayer player) {
		FireMagicBarHelper.getProperties(player).updateAllBars();
	}

	private void onTickStart(EntityPlayer player) { }

	@SubscribeEvent
	public void onPlayerLoggedIn(PlayerLoggedInEvent event){ 
		FireMagicBarHelper.getProperties(event.player).setBarValue(0);
	}

	@SubscribeEvent
	public void onPlayerLoggedOut(PlayerLoggedOutEvent event){ 
		FireMagicBarHelper.getProperties(event.player).setBarValue(0);
	}

	@SubscribeEvent
	public void onPlayerRespawn(PlayerRespawnEvent evt){ 
		FireMagicBarHelper.getProperties(evt.player).setBarValue(0);
	}
	
	@SubscribeEvent
	public void onPlayerChangedDimension(PlayerChangedDimensionEvent event){
		FireMagicBarHelper.getProperties(event.player).setBarValue(0);
	}
}
