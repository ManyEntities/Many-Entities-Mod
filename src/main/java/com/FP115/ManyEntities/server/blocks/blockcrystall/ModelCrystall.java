package com.FP115.ManyEntities.server.blocks.blockcrystall;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;




public class ModelCrystall extends ModelBase {
	private final ModelRenderer Osn_;
	private final ModelRenderer Crystalls;
	private final ModelRenderer Crystall_1;
	private final ModelRenderer Crystall_2;
	private final ModelRenderer Crystall_3;
	private final ModelRenderer Crystall_4;
	private final ModelRenderer Crystall_5;
	private final ModelRenderer Crystall_6;
	private final ModelRenderer Crystall_7;
	private final ModelRenderer Crystall_8;

	public ModelCrystall() {
		textureWidth = 64;
		textureHeight = 32;

		Osn_ = new ModelRenderer(this);
		Osn_.setRotationPoint(0.0F, 24.0F, 0.0F);
		Osn_.cubeList.add(new ModelBox(Osn_, 0, 12, -8.0F, -4.0F, -8.0F, 16, 4, 16, 0.0F));

		Crystalls = new ModelRenderer(this);
		Crystalls.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		Crystall_1 = new ModelRenderer(this);
		Crystall_1.setRotationPoint(-1.0F, 0.0F, -2.0F);
		Crystalls.addChild(Crystall_1);
		setRotation(Crystall_1, 0.0F, -0.3054F, 0.1309F);
		Crystall_1.cubeList.add(new ModelBox(Crystall_1, 48, 0, -0.0544F, -20.1305F, -0.2981F, 4, 19, 4, 0.0F));

		Crystall_2 = new ModelRenderer(this);
		Crystall_2.setRotationPoint(1.0F, 1.0F, 0.0F);
		Crystalls.addChild(Crystall_2);
		setRotation(Crystall_2, 0.0F, -0.3054F, -0.3491F);
		Crystall_2.cubeList.add(new ModelBox(Crystall_2, 48, 0, -2.0F, -21.0F, -2.0F, 4, 18, 4, 0.0F));

		Crystall_3 = new ModelRenderer(this);
		Crystall_3.setRotationPoint(1.0F, 1.0F, 0.0F);
		Crystalls.addChild(Crystall_3);
		setRotation(Crystall_3, -0.2182F, -3.0107F, -0.1745F);
		Crystall_3.cubeList.add(new ModelBox(Crystall_3, 48, 0, -2.1038F, -21.658F, -0.2826F, 4, 19, 4, 0.0F));

		Crystall_4 = new ModelRenderer(this);
		Crystall_4.setRotationPoint(-1.0F, 1.0F, 0.0F);
		Crystalls.addChild(Crystall_4);
		setRotation(Crystall_4, -0.3491F, -3.098F, 0.1309F);
		Crystall_4.cubeList.add(new ModelBox(Crystall_4, 0, 0, -6.2081F, -17.8577F, 1.1261F, 2, 15, 2, 0.0F));

		Crystall_5 = new ModelRenderer(this);
		Crystall_5.setRotationPoint(0.0F, 1.0F, -1.0F);
		Crystalls.addChild(Crystall_5);
		setRotation(Crystall_5, 0.0436F, 0.0F, -0.2618F);
		Crystall_5.cubeList.add(new ModelBox(Crystall_5, 0, 0, -4.9659F, -15.0405F, 5.0065F, 2, 12, 2, 0.0F));

		Crystall_6 = new ModelRenderer(this);
		Crystall_6.setRotationPoint(-1.0F, -1.0F, 2.0F);
		Crystalls.addChild(Crystall_6);
		setRotation(Crystall_6, -0.1745F, 0.48F, 0.1309F);
		Crystall_6.cubeList.add(new ModelBox(Crystall_6, 0, 0, 4.5993F, -17.0554F, 0.1988F, 2, 16, 2, 0.0F));

		Crystall_7 = new ModelRenderer(this);
		Crystall_7.setRotationPoint(-4.0F, -2.0F, 2.0F);
		Crystalls.addChild(Crystall_7);
		setRotation(Crystall_7, -0.3491F, 0.0873F, 0.1745F);
		Crystall_7.cubeList.add(new ModelBox(Crystall_7, 0, 0, 1.7626F, -17.5145F, 0.386F, 2, 17, 2, 0.0F));

		Crystall_8 = new ModelRenderer(this);
		Crystall_8.setRotationPoint(-6.0F, -1.0F, -4.0F);
		Crystalls.addChild(Crystall_8);
		setRotation(Crystall_8, 0.48F, -0.0436F, -0.3927F);
		Crystall_8.cubeList.add(new ModelBox(Crystall_8, 0, 0, 0.7285F, -11.809F, -1.5327F, 2, 12, 2, 0.0F));
	}
	public void render() {
		Osn_.render(0.0625F);
		Crystalls.render(0.0625F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		Osn_.render(f5);
		Crystalls.render(f5);
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