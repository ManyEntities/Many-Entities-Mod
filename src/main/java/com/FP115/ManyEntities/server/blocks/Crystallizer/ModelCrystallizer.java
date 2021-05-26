package com.FP115.ManyEntities.server.blocks.Crystallizer;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelCrystallizer extends ModelBase{
	private final ModelRenderer osn;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;
	private final ModelRenderer cube_r11;
	private final ModelRenderer cube_r12;
	private final ModelRenderer cube_r13;
	private final ModelRenderer cube_r14;
	private final ModelRenderer cube_r15;

	public ModelCrystallizer() {
		textureWidth = 64;
		textureHeight = 64;

		osn = new ModelRenderer(this);
		osn.setRotationPoint(0.0F, 24.0F, 0.0F);
		osn.cubeList.add(new ModelBox(osn, 0, 24, -8.0F, -6.0F, -8.0F, 16, 6, 16, 0.0F));
		osn.cubeList.add(new ModelBox(osn, 0, 0, -8.0F, -16.0F, -8.0F, 16, 6, 16, 0.0F));
		osn.cubeList.add(new ModelBox(osn, 0, 50, -5.0F, -10.0F, -5.0F, 10, 4, 10, 0.0F));
		osn.cubeList.add(new ModelBox(osn, 0, 0, -8.0F, -10.0F, -8.0F, 2, 4, 2, 0.0F));
		osn.cubeList.add(new ModelBox(osn, 0, 0, 6.0F, -10.0F, -8.0F, 2, 4, 2, 0.0F));
		osn.cubeList.add(new ModelBox(osn, 0, 0, 6.0F, -10.0F, 6.0F, 2, 4, 2, 0.0F));
		osn.cubeList.add(new ModelBox(osn, 0, 0, -8.0F, -10.0F, 6.0F, 2, 4, 2, 0.0F));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(1.0F, -15.0F, -2.0F);
		osn.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.3927F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 56, 56, -2.0F, -6.0F, -1.0F, 2, 6, 2, 0.0F));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(5.0F, -15.0F, -3.0F);
		osn.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.3054F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 56, 58, -2.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.0F, -14.0F, 1.0F);
		osn.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.6545F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 56, 56, -1.0F, -7.0F, 0.0F, 1, 7, 1, 0.0F));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-3.0F, -16.0F, -5.0F);
		osn.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.3927F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 55, 58, -2.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(5.0F, -15.0F, 2.0F);
		osn.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.3054F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 52, 54, -2.0F, -7.0F, -1.0F, 3, 7, 3, 0.0F));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(0.0F, -15.0F, 4.0F);
		osn.addChild(cube_r6);
		setRotationAngle(cube_r6, -0.4363F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 55, 58, -2.0F, -4.0F, -1.0F, 2, 4, 2, 0.0F));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(5.0F, -7.0F, -2.0F);
		osn.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.5236F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 54, 0, -1.0F, -2.0F, 0.0F, 2, 2, 3, 0.0F));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(5.0F, -8.0F, 2.0F);
		osn.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0436F, -0.6545F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 58, 0, -1.0F, -1.0F, 0.0F, 1, 2, 1, 0.0F));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(3.0F, -8.0F, 2.0F);
		osn.addChild(cube_r9);
		setRotationAngle(cube_r9, -0.7854F, 0.0F, 0.0F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 58, 0, -1.0F, -3.0F, 0.0F, 1, 3, 2, 0.0F));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(-3.0F, -4.0F, -2.0F);
		osn.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.48F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 55, 3, -3.0F, -2.0F, 0.0F, 3, 1, 1, 0.0F));

		cube_r11 = new ModelRenderer(this);
		cube_r11.setRotationPoint(6.0F, -7.0F, -4.0F);
		osn.addChild(cube_r11);
		setRotationAngle(cube_r11, -0.3927F, 0.0F, 0.0F);
		cube_r11.cubeList.add(new ModelBox(cube_r11, 54, 0, -3.0F, -1.0F, -1.0F, 1, 2, 2, 0.0F));

		cube_r12 = new ModelRenderer(this);
		cube_r12.setRotationPoint(4.0F, -9.0F, -4.0F);
		osn.addChild(cube_r12);
		setRotationAngle(cube_r12, -0.3927F, 0.0F, 0.0F);
		cube_r12.cubeList.add(new ModelBox(cube_r12, 54, 0, -3.0F, -1.0F, -1.0F, 1, 2, 2, 0.0F));

		cube_r13 = new ModelRenderer(this);
		cube_r13.setRotationPoint(-1.0F, -7.0F, -5.0F);
		osn.addChild(cube_r13);
		setRotationAngle(cube_r13, -0.3927F, 0.0F, 0.0F);
		cube_r13.cubeList.add(new ModelBox(cube_r13, 54, 0, -3.0F, -2.0F, -1.0F, 3, 2, 2, 0.0F));

		cube_r14 = new ModelRenderer(this);
		cube_r14.setRotationPoint(-3.0F, -7.0F, 1.0F);
		osn.addChild(cube_r14);
		setRotationAngle(cube_r14, 0.0F, 0.0F, 0.48F);
		cube_r14.cubeList.add(new ModelBox(cube_r14, 54, 0, -3.0F, -2.0F, -1.0F, 3, 2, 2, 0.0F));

		cube_r15 = new ModelRenderer(this);
		cube_r15.setRotationPoint(0.0F, -7.0F, 3.0F);
		osn.addChild(cube_r15);
		setRotationAngle(cube_r15, -0.5236F, 0.0F, 0.0F);
		cube_r15.cubeList.add(new ModelBox(cube_r15, 56, 0, -2.0F, -2.0F, 0.0F, 2, 2, 2, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		osn.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}

	public void render() {
			osn.render(0.0625F);
	}
}
