package com.FP115.ManyEntities.client.renders;

import org.lwjgl.opengl.GL11;

import com.FP115.ManyEntities.client.models.ModelCrystaloid;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

public class RenderCrystaloid extends RenderLiving {
	
	private static final ResourceLocation textureLocation = new ResourceLocation("manyentities:textures/entity/crystaloid.png");
	
	public RenderCrystaloid(ModelCrystaloid par1, float par2)
	{
	  super(par1, par2);
	}
	
	protected void preRenderCallback(EntityLivingBase entity, float f){
        //GL11.glScalef(3F, 3F, 3F); //Изменение размера. Стандартный размер  1 1 1.
    }


	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return textureLocation;
	}

}
