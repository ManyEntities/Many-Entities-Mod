package com.FP115.ManyEntities.server.blocks.skeletontable;

import org.lwjgl.opengl.GL11;

import com.FP115.ManyEntities.server.blocks.TileEntitySkeletonTable;

import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class RenderTileEntitySkeletonTable extends TileEntitySpecialRenderer {
	public static final SkeletonTableModel model = new SkeletonTableModel();
	public static final ResourceLocation texture = new ResourceLocation("manyentities:textures/blocks/skeletontable.png");



	void render(TileEntitySkeletonTable tile, double x, double y, double z, float f) {
		GL11.glPushMatrix();
		GL11.glTranslated(x, y, z);
		GL11.glTranslatef(0.5F, 1.5F, 0.5F);
		GL11.glRotatef(180F, 0.0F, 0.0F, 1.0F);
		bindTexture(texture);
		model.render();
		GL11.glPopMatrix();
		

	    
	}
    @Override
    public void renderTileEntityAt(TileEntity te, double x, double y, double z, float tick) {
    	render((TileEntitySkeletonTable)te, x, y, z, tick);
        
    }


}
