package com.FP115.ManyEntities.client.renders;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelSkeleton;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderZombie;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderPigmanTrader extends RenderBiped{
	private static final ResourceLocation textureLocation = new ResourceLocation("textures/entity/zombie_pigman.png");

	public RenderPigmanTrader(ModelZombie model, float f) {
		super(new ModelZombie(), 0.5F);
	}
	protected void preRenderCallback(EntityLivingBase entity, float f){
        GL11.glScalef(1F, 1F, 1F); //Изменение размера. Стандартный размер  1 1 1.
    }

	
	@Override
	protected ResourceLocation getEntityTexture(Entity par1) {
		return textureLocation;
	}
}
