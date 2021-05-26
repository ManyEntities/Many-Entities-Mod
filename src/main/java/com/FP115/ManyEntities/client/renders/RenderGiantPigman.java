package com.FP115.ManyEntities.client.renders;

import org.lwjgl.opengl.GL11;

import com.FP115.ManyEntities.client.models.GiantPigmanModel;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.Render;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderGiantPigman extends RenderLiving {
	

	private static final ResourceLocation textureLocation = new ResourceLocation("manyentities:textures/entity/ogr.png");
	private static final String __OBFID = "CL_0d000101";
	
	public RenderGiantPigman(GiantPigmanModel par3, float par4)
	{
	  super(par3, par4);
	  
	}
	protected void preRenderCallback(EntityLivingBase entity, float f){
        GL11.glScalef(4F, 4F, 4F); //Изменение размера. Стандартный размер  1 1 1.
    }
	
	

	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		
		return textureLocation;
	}




		
	

	
		
	

	

}
