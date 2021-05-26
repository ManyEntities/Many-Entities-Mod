package com.FP115.ManyEntities.client.renders;

import com.FP115.ManyEntities.client.models.GiantSlimeModel;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

public class RenderSkeletonWithGiantSlime extends RenderLiving{
	private static final ResourceLocation textureLocation = new ResourceLocation("manyentities:textures/entity/giantslime.png");

	public RenderSkeletonWithGiantSlime(GiantSlimeModel p_i1262_1_, float p_i1262_2_) {
		super(p_i1262_1_, p_i1262_2_);
	}

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return textureLocation;
	}

}
