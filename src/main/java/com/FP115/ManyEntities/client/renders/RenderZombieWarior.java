package com.FP115.ManyEntities.client.renders;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderZombieWarior extends RenderLiving{
	private static final ResourceLocation textureLocation = new ResourceLocation("textures/entity/zombie/zombie.png");

	public RenderZombieWarior(ModelZombie model, float f) {
		super(model, f);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return textureLocation;
	}

}
