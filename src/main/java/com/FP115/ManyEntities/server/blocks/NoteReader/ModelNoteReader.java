package com.FP115.ManyEntities.server.blocks.NoteReader;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelNoteReader extends ModelBase{
	private final ModelRenderer bb_main;
	private final ModelRenderer lup1_r1;
	private final ModelRenderer noglup2_r1;
	private final ModelRenderer noglup_r1;
	private final ModelRenderer list_r1;
	private final ModelRenderer stol_r1;

	public ModelNoteReader() {
		textureWidth = 128;
		textureHeight = 128;

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 0, -8.0F, -2.0F, -8.0F, 16, 2, 16, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 65, 0, -2.0F, -17.0F, -2.0F, 4, 16, 4, 0.0F));
		bb_main.cubeList.add(new ModelBox(bb_main, 0, 30, -2.0F, -19.0F, -2.0F, 4, 2, 2, 0.0F));

		lup1_r1 = new ModelRenderer(this);
		lup1_r1.setRotationPoint(-1.0F, -18.0F, 5.0F);
		bb_main.addChild(lup1_r1);
		setRotationAngle(lup1_r1, 0.6109F, 0.0F, 0.0F);
		lup1_r1.cubeList.add(new ModelBox(lup1_r1, 14, 37, -1.5F, -2.8F, -0.3F, 4, 4, 1, 0.0F));

		noglup2_r1 = new ModelRenderer(this);
		noglup2_r1.setRotationPoint(-6.0F, -21.0F, 5.0F);
		bb_main.addChild(noglup2_r1);
		setRotationAngle(noglup2_r1, 0.6109F, 0.0F, 0.0F);
		noglup2_r1.cubeList.add(new ModelBox(noglup2_r1, 14, 31, -1.0F, 1.2F, -2.0F, 5, 1, 1, 0.0F));

		noglup_r1 = new ModelRenderer(this);
		noglup_r1.setRotationPoint(-6.0F, -17.0F, 3.0F);
		bb_main.addChild(noglup_r1);
		setRotationAngle(noglup_r1, 0.6109F, 0.0F, 0.0F);
		noglup_r1.cubeList.add(new ModelBox(noglup_r1, 0, 36, -0.9F, -1.0F, -2.0F, 1, 1, 4, 0.0F));

		list_r1 = new ModelRenderer(this);
		list_r1.setRotationPoint(2.0F, -17.0F, 2.0F);
		bb_main.addChild(list_r1);
		setRotationAngle(list_r1, 0.6109F, 0.0F, 0.0F);
		list_r1.cubeList.add(new ModelBox(list_r1, 34, 22, -8.0F, -4.0F, 0.1F, 12, 7, 0, 0.0F));

		stol_r1 = new ModelRenderer(this);
		stol_r1.setRotationPoint(0.0F, -14.0F, 3.0F);
		bb_main.addChild(stol_r1);
		setRotationAngle(stol_r1, 0.6109F, 0.0F, 0.0F);
		stol_r1.cubeList.add(new ModelBox(stol_r1, 0, 18, -7.0F, -8.0F, -1.0F, 14, 9, 2, 0.0F));
	}
	public void render() {
		bb_main.render(0.0625F);
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bb_main.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
