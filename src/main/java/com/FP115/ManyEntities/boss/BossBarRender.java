package com.FP115.ManyEntities.boss;

import com.FP115.ManyEntities.server.entities.BossStatus;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class BossBarRender {
	Minecraft mc;

	public BossBarRender() {
		mc = Minecraft.getMinecraft();
	}

	@SubscribeEvent
	public void onRender(final TickEvent.RenderTickEvent event) {
		onTickRender();
	}

	private void onTickRender() {
		final ResourceLocation r = null;
		if (BossStatus.statusBarTime > 0) {
			--BossStatus.statusBarTime;
			final FontRenderer fontrenderer = mc.fontRenderer;
			final ScaledResolution scaledresolution = new ScaledResolution(mc, mc.displayWidth, mc.displayHeight);
			final GuiIngame gig = mc.ingameGUI;
			final int i = scaledresolution.getScaledWidth();
			final short short1 = 182;
			final int j = i / 2 - short1 / 2;
			final int k = (int)(BossStatus.healthScale * (short1 + 1));
			final byte b0 = 5;
			if (BossStatus.selected == 1) {
				mc.getTextureManager().bindTexture(new ResourceLocation("manyentities:textures/gui/corallusbar.png"));
			}
			else{
				
			}

			gig.drawTexturedModalRect(j, (int)b0, 0, 0, short1 + 1, 20);
			gig.drawTexturedModalRect(j, (int)b0, 0, 20, short1 + 1, 40);
			if (k > 0) {
				gig.drawTexturedModalRect(j, (int)b0, 0, 0, k, 20);
			}
			GL11.glColor4f(1.0f, 1.0f, 1.0f, 1.0f);
		}
	}

	public ResourceLocation set(final String name) {
		return new ResourceLocation("nevermine:textures/gui/smashbar.png");
	}

}
