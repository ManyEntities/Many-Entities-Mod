package com.FP115.ManyEntities.client.renders;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelSkeleton;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderSkeleton;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderSkeletonMinion extends RenderBiped{
private static final ResourceLocation textureLocation = new ResourceLocation("textures/entity/skeleton/skeleton.png");
	
    public RenderSkeletonMinion(ModelSkeleton modelSkeleton, float f)
    {
    	super(new ModelSkeleton(), 0.5F);
    
    }
	protected void preRenderCallback(EntityLivingBase entity, float f){
        GL11.glScalef(1F, 1F, 1F); //Изменение размера. Стандартный размер  1 1 1.
    }

	
	@Override
	protected ResourceLocation getEntityTexture(Entity par1) {
		return textureLocation;
	}

}
