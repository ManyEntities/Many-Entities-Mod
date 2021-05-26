package com.FP115.ManyEntities.items.magiccape;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelMagicCape extends ModelBiped{
	private final ModelRenderer shlem;
	private final ModelRenderer kam1;
	private final ModelRenderer kam2;
	private final ModelRenderer kam3;
	private final ModelRenderer kam5;

	public ModelMagicCape() {
		textureWidth = 128;
		textureHeight = 64;
		
		

		shlem = new ModelRenderer(this);
		shlem.setRotationPoint(0.0F, 0.0F, 0.0F);
		shlem.cubeList.add(new ModelBox(shlem, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F));//+24

		kam1 = new ModelRenderer(this);
		kam1.setRotationPoint(-6.0F, -27.0F, 1.0F);
		shlem.addChild(kam1);
		setRotationAngle(kam1, 0.2182F, -0.2618F, -0.2618F);
		kam1.cubeList.add(new ModelBox(kam1, 34, 0, -8.077F, 13.6944F, -6.5916F, 2, 8, 2, 0.0F));

		kam2 = new ModelRenderer(this);
		kam2.setRotationPoint(-5.0F, -28.0F, 5.0F);
		shlem.addChild(kam2);
		setRotationAngle(kam2, -0.2182F, -0.2618F, -0.2618F);
		kam2.cubeList.add(new ModelBox(kam2, 34, 0, -8.577F, 17.8265F, 4.4105F, 2, 5, 2, 0.0F));

		kam3 = new ModelRenderer(this);
		kam3.setRotationPoint(5.0F, -28.0F, 1.0F);
		shlem.addChild(kam3);
		setRotationAngle(kam3, 0.48F, -2.138F, -0.2618F);
		kam3.cubeList.add(new ModelBox(kam3, 34, 0, 3.4754F, 17.1571F, -10.5154F, 2, 5, 2, 0.0F));

		kam5 = new ModelRenderer(this);
		kam5.setRotationPoint(5.0F, -28.0F, -1.0F);
		shlem.addChild(kam5);
		setRotationAngle(kam5, 0.48F, -1.1781F, -0.2182F);
		kam5.cubeList.add(new ModelBox(kam5, 34, 0, -3.8149F, 13.7558F, -9.5624F, 2, 8, 2, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		shlem.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
	  {
	    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity); 
	    
	    this.shlem.rotateAngleY =(f3 / (180F / (float)Math.PI));
	    this.shlem.rotateAngleX =(f4 / (180F / (float)Math.PI));
	    
	   
	    
	    //if (isSneak) 
	      //  setRotationPointY(1.0F);
	    //else 
	        //setRotationPointY(0.0F);
	  }
	
}
