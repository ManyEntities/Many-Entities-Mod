package com.FP115.ManyEntities.server.blocks.skeletontable;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.Minecraft;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class RenderItemBlockSkeletonTable implements IItemRenderer  {
	static SkeletonTableModel model = new SkeletonTableModel();
    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
       return true;
    }

	@Override
	public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack is, ItemRendererHelper helper) {
		return true;
	}
	

	@Override
	public void renderItem(ItemRenderType type, ItemStack is, Object... data) {
		GL11.glPushMatrix();
		GL11.glTranslatef(0.5F, 1.5F, 0.5F);
		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		Minecraft.getMinecraft().renderEngine.bindTexture(RenderTileEntitySkeletonTable.texture);
		RenderTileEntitySkeletonTable.model.render();
		model.render();
		Minecraft.getMinecraft().getTextureManager().bindTexture(RenderTileEntitySkeletonTable.texture);
		GL11.glPopMatrix();
		
	}



}
