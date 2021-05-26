package com.FP115.ManyEntities.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class GiantPigmanModel extends ModelBase
{
    ModelRenderer Base;
    ModelRenderer Head;
    ModelRenderer leg1;
    ModelRenderer leg2;
    ModelRenderer Arm1;
    ModelRenderer Hend1;
    ModelRenderer Arm2;
    ModelRenderer Hend2;
  
  public GiantPigmanModel()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      Base = new ModelRenderer(this, 0, 0);
      Base.addBox(-3F, 0F, -8F, 6, 4, 8);
      Base.setRotationPoint(0F, 18F, 5F);
      Base.setTextureSize(64, 32);
      Base.mirror = true;
      setRotation(Base, -0.5585054F, 0F, 0F);
      Head = new ModelRenderer(this, 28, 0);
      Head.addBox(-2F, -2F, -4F, 4, 4, 4);
      Head.setRotationPoint(0F, 16.5F, -2F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      leg1 = new ModelRenderer(this, 0, 12);
      leg1.addBox(0F, -1F, -1F, 2, 5, 2);
      leg1.setRotationPoint(0.9F, 20F, 3F);
      leg1.setTextureSize(64, 32);
      leg1.mirror = true;
      setRotation(leg1, 0F, 0F, 0F);
      leg2 = new ModelRenderer(this, 0, 0);
      leg2.addBox(-2F, -1F, -1F, 2, 5, 2);
      leg2.setRotationPoint(-0.9F, 20F, 3F);
      leg2.setTextureSize(64, 32);
      leg2.mirror = true;
      setRotation(leg2, 0F, 0F, 0F);
      Arm1 = new ModelRenderer(this, 14, 12);
      Arm1.addBox(0F, -1F, -1F, 2, 5, 2);
      Arm1.setRotationPoint(2.9F, 16F, -1F);
      Arm1.setTextureSize(64, 32);
      Arm1.mirror = true;
      setRotation(Arm1, -0.4363323F, 0F, 0F);
      Hend1 = new ModelRenderer(this, 0, 19);
      Hend1.addBox(0F, -3F, -8F, 2, 2, 5);
      Hend1.setRotationPoint(2.9F, 16F, -0.6F);
      Hend1.setTextureSize(64, 32);
      Hend1.mirror = true;
      setRotation(Hend1, 1.570796F, 0F, 0F);
      Arm2 = new ModelRenderer(this, 0, 26);
      Arm2.addBox(-2F, -1F, -1F, 2, 5, 2);
      Arm2.setRotationPoint(-2.9F, 16F, -1F);
      Arm2.setTextureSize(64, 32);
      Arm2.mirror = true;
      setRotation(Arm2, -0.6981317F, 0F, 0F);
      Hend2 = new ModelRenderer(this, 0, 36);
      Hend2.addBox(-2F, 2F, -3.2F, 2, 6, 2);
      Hend2.setRotationPoint(-3F, 16F, -1F);
      Hend2.setTextureSize(64, 32);
      Hend2.mirror = true;
      setRotation(Hend2, 0F, 0F, 0F);
  }
  

  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;

  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Base.render(f5);
    Head.render(f5);
    leg1.render(f5);
    leg2.render(f5);
    Arm1.render(f5);
    Hend1.render(f5);
    Arm2.render(f5);
    Hend2.render(f5);
  }
  
  public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity)
  {
    super.setRotationAngles(limbSwing,limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
    Base.render(scaleFactor);
    Head.render(scaleFactor);
    leg1.render(scaleFactor);
    leg2.render(scaleFactor);
    Arm1.render(scaleFactor);
    Hend1.render(scaleFactor);
    Arm2.render(scaleFactor);
    Hend2.render(scaleFactor);
    
    this.leg1.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
    this.leg2.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
    
    this.Head.rotateAngleY = netHeadYaw / (180F / (float)Math.PI);
    this.Head.rotateAngleX = headPitch / (180F / (float)Math.PI);
    
  }

}
