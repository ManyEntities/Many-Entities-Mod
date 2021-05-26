package com.FP115.ManyEntities.client.renders;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderGraagMob extends RenderBiped {
	
    private static final String __OBFID = "CL_0000101";
	private static final ResourceLocation textureLocation = new ResourceLocation("textures/entity/steve.png");
	
	public RenderGraagMob(ModelBiped par1, float par2)
	{
	  super(par1, par2);
	}
	protected void preRenderCallback(EntityLivingBase entity, float f){
        GL11.glScalef(1.5F, 1.5F, 1.5F); //Изменение размера. Стандартный размер  1 1 1.
    }

	
	@Override
	protected ResourceLocation getEntityTexture(Entity par1) {
		return textureLocation;
	}

}
