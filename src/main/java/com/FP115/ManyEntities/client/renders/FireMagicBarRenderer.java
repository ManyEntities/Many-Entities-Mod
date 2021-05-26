package com.FP115.ManyEntities.client.renders;

import org.lwjgl.opengl.GL11;

import com.FP115.ManyEntities.server.items.FireMagic.IFireMagicItem;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.TickEvent.RenderTickEvent;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiIngame;
import net.minecraft.client.gui.ScaledResolution;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderGameOverlayEvent;

public class FireMagicBarRenderer {
    Minecraft mc = Minecraft.getMinecraft();
	
	public static float value;
	public static boolean regen;
	
	@SubscribeEvent
	public void onRender(RenderGameOverlayEvent.Post event){
		if (event.type == RenderGameOverlayEvent.ElementType.ALL)
		if (!mc.gameSettings.hideGUI) {
			GL11.glPushMatrix();
			GL11.glEnable(GL11.GL_BLEND);
			GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);

			GuiIngame gig = mc.ingameGUI;
			ScaledResolution scaledresolution = new ScaledResolution(mc,mc.displayWidth, mc.displayHeight);
			this.mc.getTextureManager().bindTexture(new ResourceLocation("manyentities:textures/gui/arcanaBar.png"));
			int i = scaledresolution.getScaledWidth();
			int k = scaledresolution.getScaledHeight();
			int y = k - 22;
			int x = i/18-10;
			ItemStack stack = mc.thePlayer.getHeldItem();
			if(stack != null && isFireMagicItem(stack.getItem())) {
				gig.drawTexturedModalRect(x, y, 0, 0, 100, 18);
			    gig.drawTexturedModalRect(x, y, 0, 18, (int)(12.5 * (value / 25)), 18);
			}

			GL11.glDisable(GL11.GL_BLEND);
			GL11.glPopMatrix();
		}
	}
	private boolean isFireMagicItem(Item item){
		return item instanceof IFireMagicItem;
	} 

}
