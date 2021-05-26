package com.FP115.ManyEntities.server.blocks.skeletontable;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class SkeletonTableModel extends ModelBase {
	private final ModelRenderer crystallosnov;
	private final ModelRenderer Crystall;
	private final ModelRenderer osnov;

	public SkeletonTableModel() {
		textureWidth = 128;
		textureHeight = 64;

		crystallosnov = new ModelRenderer(this);
		crystallosnov.setRotationPoint(0.0F, 2.0F, 0.0F);
		

		Crystall = new ModelRenderer(this);
		Crystall.setRotationPoint(0.0F, 0.0F, 0.0F);
		crystallosnov.addChild(Crystall);
		setRotation(Crystall, 0.6109F, 0.0F, 0.4363F);
		Crystall.cubeList.add(new ModelBox(Crystall, 112, 0, -3.8036F, -5.6816F, 0.6785F, 4, 4, 4, 0.0F));

		osnov = new ModelRenderer(this);
		osnov.setRotationPoint(0.0F, 24.0F, 0.0F);
		osnov.cubeList.add(new ModelBox(osnov, 0, 0, -8.0F, -16.0F, -8.0F, 16, 16, 16, 0.0F));
	}
	public void render() {
		crystallosnov.render(0.0625F);
		osnov.render(0.0625F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
	    super.render(entity, f, f1, f2, f3, f4, f5);
	    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
	    crystallosnov.render(0.0625F);
		osnov.render(0.0625F);
	}

	public void setRotation(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
		super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		
	}
}