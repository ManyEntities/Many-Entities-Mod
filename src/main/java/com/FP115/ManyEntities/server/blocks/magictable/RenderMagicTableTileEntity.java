package com.FP115.ManyEntities.server.blocks.magictable;

import org.lwjgl.opengl.GL11;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderMagicTableTileEntity extends TileEntitySpecialRenderer{
	public static final ModelMagicTable model = new ModelMagicTable();
	public static final ResourceLocation texture = new ResourceLocation("manyentities:textures/blocks/magictable.png");

	@Override
	public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float f) {
		render((MagicTableTileEntity)tile, x, y, z, f);
	}

	private void render(MagicTableTileEntity tile, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		GL11.glTranslated(x, y, z);
		GL11.glTranslatef(0.5F, 1.5F, 0.5F);
		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		bindTexture(texture);
		model.render();
		GL11.glPopMatrix();
		

	    
	}

}
