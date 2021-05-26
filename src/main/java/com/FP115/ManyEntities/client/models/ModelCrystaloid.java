package com.FP115.ManyEntities.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;


public class ModelCrystaloid extends ModelBase {
	private final ModelRenderer all;
	private final ModelRenderer base;
	private final ModelRenderer crystal_1;
	private final ModelRenderer crystal_2;
	private final ModelRenderer crystal_2_r1;
	private final ModelRenderer crystal_3;
	private final ModelRenderer crystal_3_r1;
	private final ModelRenderer crystal_4;
	private final ModelRenderer crystal_5;
	private final ModelRenderer crystal_6;
	private final ModelRenderer crystal_6_r1;
	private final ModelRenderer crystal_7;
	private final ModelRenderer crystal_8;
	private final ModelRenderer crystal_8_r1;
	private final ModelRenderer legLeft;
	private final ModelRenderer legRight;

	public ModelCrystaloid() {
		textureWidth = 64;
		textureHeight = 64;

		all = new ModelRenderer(this);
		all.setRotationPoint(4.0F, 21.0F, -4.0F);
		setRotationAngle(all, 0.0F, -1.5708F, 0.0F);
		

		base = new ModelRenderer(this);
		base.setRotationPoint(4.0F, 3.0F, 4.0F);
		all.addChild(base);
		base.cubeList.add(new ModelBox(base, 0, 0, -8.0F, -22.0F, -8.0F, 16, 16, 16, 0.0F));

		crystal_1 = new ModelRenderer(this);
		crystal_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		base.addChild(crystal_1);
		setRotationAngle(crystal_1, -0.1745F, 0.0F, 0.0F);
		crystal_1.cubeList.add(new ModelBox(crystal_1, 0, 56, -2.0F, -27.0F, 0.0F, 3, 6, 3, 0.0F));

		crystal_2 = new ModelRenderer(this);
		crystal_2.setRotationPoint(1.0F, 0.0F, -1.0F);
		base.addChild(crystal_2);
		

		crystal_2_r1 = new ModelRenderer(this);
		crystal_2_r1.setRotationPoint(-1.0F, 0.0F, 1.0F);
		crystal_2.addChild(crystal_2_r1);
		setRotationAngle(crystal_2_r1, -0.0436F, 0.3491F, -0.0873F);
		crystal_2_r1.cubeList.add(new ModelBox(crystal_2_r1, 33, 52, 0.0F, -29.0F, -1.0F, 3, 9, 3, 0.0F));

		crystal_3 = new ModelRenderer(this);
		crystal_3.setRotationPoint(2.0F, 0.0F, -1.0F);
		base.addChild(crystal_3);
		setRotationAngle(crystal_3, 0.0F, 0.0F, -0.1745F);
		

		crystal_3_r1 = new ModelRenderer(this);
		crystal_3_r1.setRotationPoint(-2.0F, 0.0F, 1.0F);
		crystal_3.addChild(crystal_3_r1);
		setRotationAngle(crystal_3_r1, 0.0F, 0.0F, -0.0436F);
		crystal_3_r1.cubeList.add(new ModelBox(crystal_3_r1, 0, 45, -3.0F, -30.0F, -3.0F, 4, 10, 4, 0.0F));

		crystal_4 = new ModelRenderer(this);
		crystal_4.setRotationPoint(2.0F, 0.0F, -1.0F);
		base.addChild(crystal_4);
		setRotationAngle(crystal_4, 0.0F, 0.0F, 0.2618F);
		crystal_4.cubeList.add(new ModelBox(crystal_4, 13, 53, -4.0F, -27.0F, -2.9F, 4, 7, 4, 0.0F));

		crystal_5 = new ModelRenderer(this);
		crystal_5.setRotationPoint(-1.0F, 0.0F, 4.0F);
		base.addChild(crystal_5);
		setRotationAngle(crystal_5, -0.1309F, 0.1745F, 0.0F);
		crystal_5.cubeList.add(new ModelBox(crystal_5, 15, 34, -5.9544F, -28.932F, -4.4164F, 3, 9, 3, 0.0F));

		crystal_6 = new ModelRenderer(this);
		crystal_6.setRotationPoint(2.0F, 0.0F, -1.0F);
		base.addChild(crystal_6);
		setRotationAngle(crystal_6, -0.0436F, 0.4363F, 0.0F);
		

		crystal_6_r1 = new ModelRenderer(this);
		crystal_6_r1.setRotationPoint(-2.0F, 0.0F, 1.0F);
		crystal_6.addChild(crystal_6_r1);
		setRotationAngle(crystal_6_r1, 0.0436F, 0.0F, 0.0F);
		crystal_6_r1.cubeList.add(new ModelBox(crystal_6_r1, 28, 36, 1.7515F, -29.9394F, -6.2887F, 3, 10, 3, 0.0F));

		crystal_7 = new ModelRenderer(this);
		crystal_7.setRotationPoint(-1.0F, 0.0F, 0.0F);
		base.addChild(crystal_7);
		setRotationAngle(crystal_7, 0.0873F, 0.0F, 0.0F);
		crystal_7.cubeList.add(new ModelBox(crystal_7, 47, 50, -4.0F, -31.0F, -4.9F, 3, 11, 3, 0.0F));

		crystal_8 = new ModelRenderer(this);
		crystal_8.setRotationPoint(3.0F, 0.0F, 3.0F);
		base.addChild(crystal_8);
		setRotationAngle(crystal_8, -0.1309F, 0.0F, 0.0873F);
		

		crystal_8_r1 = new ModelRenderer(this);
		crystal_8_r1.setRotationPoint(-3.0F, 0.0F, -3.0F);
		crystal_8.addChild(crystal_8_r1);
		setRotationAngle(crystal_8_r1, -0.0436F, 0.0F, 0.0F);
		crystal_8_r1.cubeList.add(new ModelBox(crystal_8_r1, 52, 43, 1.0F, -29.0F, 0.1F, 3, 9, 3, 0.0F));

		legLeft = new ModelRenderer(this);
		legLeft.setRotationPoint(4.0F, -3.0F, 10.0F);
		all.addChild(legLeft);
		legLeft.cubeList.add(new ModelBox(legLeft, 16, 22, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F));

		legRight = new ModelRenderer(this);
		legRight.setRotationPoint(4.0F, -3.0F, -2.0F);
		all.addChild(legRight);
		legRight.cubeList.add(new ModelBox(legRight, 48, 22, -2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F));
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	//@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5){
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		all.render(f5);
	}
	  
	  public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity)
	  {
	    super.setRotationAngles(limbSwing,limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);
	    //base.render(scaleFactor);

	    
	    this.legRight.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
	    this.legLeft.rotateAngleZ = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	    
	  }
	
}