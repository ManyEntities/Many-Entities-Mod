package com.FP115.ManyEntities.server.events;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;

public class bossBarTickHandler {
	@SubscribeEvent
	public void onTick(final TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.START) {
			onTickStart();
		}
		else {
			onTickEnd();
		}
	}

	private void onTickEnd() {
	}

	private void onTickStart() {
	}
}
