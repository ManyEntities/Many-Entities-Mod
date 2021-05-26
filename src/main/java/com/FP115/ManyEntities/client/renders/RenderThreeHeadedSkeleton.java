package com.FP115.ManyEntities.client.renders;

import com.FP115.ManyEntities.server.Mobs.ThreeHeadedSkeleton;
import com.FP115.ManyEntities.server.entities.BossStatus;
import com.FP115.ManyEntities.client.models.ModelThreeHeadedSkeleton;

import org.lwjgl.opengl.GL11;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderThreeHeadedSkeleton extends RenderLiving {
	
	private static final ResourceLocation textureLocation = new ResourceLocation("manyentities:textures/entity/threeheadedskeleton.png");
	
	public RenderThreeHeadedSkeleton(ModelThreeHeadedSkeleton par1, float par2)
	{
	  super(par1, par2);
	}
	protected void preRenderCallback(EntityLivingBase entity, float f){
        GL11.glScalef(1.5F, 1.5F, 1.5F); //��������� �������. ����������� ������  1 1 1.
    }
	public void renderThreeHeadedSkeleton(final ThreeHeadedSkeleton var1, final double var2, final double var4, final double var6, final float var8, final float var9) {
		BossStatus.setBossStatus(var1, true, 1);
		super.doRender(var1, var2, var4, var6, var8, var9);
	}
	@Override
	protected ResourceLocation getEntityTexture(Entity p_110775_1_) {
		return textureLocation;
	}
	@Override
	public void doRender(EntityLiving entity, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRender(entity, par2, par4, par6, par8, par9);
        BossStatus.setBossStatus((ThreeHeadedSkeleton)entity, true, 1);
    }
	@Override
	public void doRender(Entity entity, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRender(entity, par2, par4, par6, par8, par9);
        
    }

}
