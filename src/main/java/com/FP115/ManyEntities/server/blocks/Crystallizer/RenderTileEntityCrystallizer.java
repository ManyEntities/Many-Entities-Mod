package com.FP115.ManyEntities.server.blocks.Crystallizer;

import org.lwjgl.opengl.GL11;


import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderTileEntityCrystallizer extends TileEntitySpecialRenderer {
	public static final ModelCrystallizer model = new ModelCrystallizer();
	public static final ResourceLocation texture = new ResourceLocation("manyentities:textures/blocks/crystallizer.png");

	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float f) {
		render((TileEntityCrystallizer)tile, x, y, z, f);
	}

	private void render(TileEntityCrystallizer tile, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		GL11.glTranslated(x, y, z);
		GL11.glTranslatef(0.5F, 1.5F, 0.5F);
		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		bindTexture(texture);
		model.render();
		GL11.glPopMatrix();
		

	    
	}
}
