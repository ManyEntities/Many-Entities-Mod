package com.FP115.ManyEntities.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class GiantSlimeModel extends ModelBase{
	private final ModelRenderer GiantSlime;
	private final ModelRenderer GubaPrav4_r3;
	private final ModelRenderer GubaLev4_r3;
	private final ModelRenderer SRot_r4;
	private final ModelRenderer GubaPrav4_r2;
	private final ModelRenderer GubaLev4_r2;
	private final ModelRenderer SRot_r3;
	private final ModelRenderer GubaPrav4_r1;
	private final ModelRenderer GubaLev4_r1;
	private final ModelRenderer SRot_r1;
	private final ModelRenderer SRot;
	private final ModelRenderer TeethN_r3;
	private final ModelRenderer SRot_r2_r2;
	private final ModelRenderer TeethN_r2;
	private final ModelRenderer SRot_r2_r1;
	private final ModelRenderer TeethN_r1;
	private final ModelRenderer SRot_r2;
	private final ModelRenderer TeethN;
	private final ModelRenderer NZoob3_r3;
	private final ModelRenderer NZoob1_r1_r2;
	private final ModelRenderer NZoob3_r2;
	private final ModelRenderer NZoob1_r1_r1;
	private final ModelRenderer NZoob3_r1;
	private final ModelRenderer NZoob1_r1;
	private final ModelRenderer NZoob3;
	private final ModelRenderer NZoob2;
	private final ModelRenderer NZoob2_r1_r2;
	private final ModelRenderer NZoob2_r1_r1;
	private final ModelRenderer NZoob2_r1;
	private final ModelRenderer GubaLev4;
	private final ModelRenderer GubaPrav4;
	private final ModelRenderer TithV;
	private final ModelRenderer ZoobsV_r3;
	private final ModelRenderer ZoobsV_r2;
	private final ModelRenderer ZoobsV_r1;
	private final ModelRenderer ZoobsV;
	private final ModelRenderer VZoob3_r4;
	private final ModelRenderer VZoob2_r4;
	private final ModelRenderer VZoob3_r3;
	private final ModelRenderer VZoob2_r3;
	private final ModelRenderer VZoob3_r1;
	private final ModelRenderer VZoob2_r1;
	private final ModelRenderer VZoob2;
	private final ModelRenderer VZoob2_r2_r2;
	private final ModelRenderer VZoob2_r2_r1;
	private final ModelRenderer VZoob2_r2;
	private final ModelRenderer VZoob3;
	private final ModelRenderer VZoob3_r2_r2;
	private final ModelRenderer VZoob3_r2_r1;
	private final ModelRenderer VZoob3_r2;

	public GiantSlimeModel() {
		textureWidth = 128;
		textureHeight = 128;

		GiantSlime = new ModelRenderer(this);
		GiantSlime.setRotationPoint(0.0F, -24.0F, 0.0F);
		setRotationAngle(GiantSlime, -3.1416F, 0.0F, 3.1416F);
		GiantSlime.cubeList.add(new ModelBox(GiantSlime, 0, 89, -16.0F, 43.0F, -16.0F, 32, 5, 34, 0.0F));
		GiantSlime.cubeList.add(new ModelBox(GiantSlime, 0, 77, -16.0F, 16.0F, -16.0F, 32, 27, 24, 0.0F));
		GiantSlime.cubeList.add(new ModelBox(GiantSlime, 0, 105, -16.0F, 16.0F, 8.0F, 32, 13, 11, 0.0F));
		GiantSlime.cubeList.add(new ModelBox(GiantSlime, 0, 104, -16.0F, 29.0F, 8.0F, 5, 14, 11, 0.0F));
		GiantSlime.cubeList.add(new ModelBox(GiantSlime, 0, 104, -16.0F, 28.0F, 19.0F, 5, 13, 1, 0.0F));
		GiantSlime.cubeList.add(new ModelBox(GiantSlime, 0, 102, 11.0F, 29.0F, 8.0F, 5, 14, 11, 0.0F));
		GiantSlime.cubeList.add(new ModelBox(GiantSlime, 116, 114, 11.0F, 28.0F, 19.0F, 5, 13, 1, 0.0F));
		GiantSlime.cubeList.add(new ModelBox(GiantSlime, 0, 114, -16.0F, 16.0F, 19.0F, 32, 12, 2, 0.0F));
		GiantSlime.cubeList.add(new ModelBox(GiantSlime, 57, 50, -11.0F, 26.0F, 11.0F, 22, 17, 7, 0.0F));
		GiantSlime.cubeList.add(new ModelBox(GiantSlime, 0, 67, -17.0003F, 16.9999F, -13.9997F, 1, 30, 31, 0.0F));
		GiantSlime.cubeList.add(new ModelBox(GiantSlime, 0, 67, 15.9997F, 17.0001F, -13.9997F, 1, 30, 31, 0.0F));
		GiantSlime.cubeList.add(new ModelBox(GiantSlime, 0, 97, -15.0003F, 17.0003F, -16.9997F, 30, 30, 1, 0.0F));

		GubaPrav4_r3 = new ModelRenderer(this);
		GubaPrav4_r3.setRotationPoint(12.0F, 40.0F, 21.0F);
		GiantSlime.addChild(GubaPrav4_r3);
		setRotationAngle(GubaPrav4_r3, 0.1745F, 0.0F, 0.0F);
		

		GubaLev4_r3 = new ModelRenderer(this);
		GubaLev4_r3.setRotationPoint(-11.0F, 36.0F, 21.0F);
		GiantSlime.addChild(GubaLev4_r3);
		setRotationAngle(GubaLev4_r3, 0.1745F, 0.0F, 0.0F);
		

		SRot_r4 = new ModelRenderer(this);
		SRot_r4.setRotationPoint(0.0F, 44.0F, 17.0F);
		GiantSlime.addChild(SRot_r4);
		setRotationAngle(SRot_r4, -0.5672F, 0.0F, 0.0F);
		

		GubaPrav4_r2 = new ModelRenderer(this);
		GubaPrav4_r2.setRotationPoint(12.0F, 40.0F, 21.0F);
		GiantSlime.addChild(GubaPrav4_r2);
		setRotationAngle(GubaPrav4_r2, 0.1745F, 0.0F, 0.0F);
		

		GubaLev4_r2 = new ModelRenderer(this);
		GubaLev4_r2.setRotationPoint(-11.0F, 36.0F, 21.0F);
		GiantSlime.addChild(GubaLev4_r2);
		setRotationAngle(GubaLev4_r2, 0.1745F, 0.0F, 0.0F);
		

		SRot_r3 = new ModelRenderer(this);
		SRot_r3.setRotationPoint(0.0F, 44.0F, 17.0F);
		GiantSlime.addChild(SRot_r3);
		setRotationAngle(SRot_r3, -0.5672F, 0.0F, 0.0F);
		

		GubaPrav4_r1 = new ModelRenderer(this);
		GubaPrav4_r1.setRotationPoint(12.0F, 40.0F, 21.0F);
		GiantSlime.addChild(GubaPrav4_r1);
		setRotationAngle(GubaPrav4_r1, 0.1745F, 0.0F, 0.0F);
		

		GubaLev4_r1 = new ModelRenderer(this);
		GubaLev4_r1.setRotationPoint(-11.0F, 36.0F, 21.0F);
		GiantSlime.addChild(GubaLev4_r1);
		setRotationAngle(GubaLev4_r1, 0.1745F, 0.0F, 0.0F);
		

		SRot_r1 = new ModelRenderer(this);
		SRot_r1.setRotationPoint(0.0F, 44.0F, 17.0F);
		GiantSlime.addChild(SRot_r1);
		setRotationAngle(SRot_r1, -0.5672F, 0.0F, 0.0F);
		

		SRot = new ModelRenderer(this);
		SRot.setRotationPoint(0.0F, 44.0F, 17.0F);
		GiantSlime.addChild(SRot);
		setRotationAngle(SRot, -0.5672F, 0.0F, 0.0F);
		

		TeethN_r3 = new ModelRenderer(this);
		TeethN_r3.setRotationPoint(1.0F, -4.0672F, 4.523F);
		SRot.addChild(TeethN_r3);
		setRotationAngle(TeethN_r3, 0.5672F, 0.0F, 0.0F);
		

		SRot_r2_r2 = new ModelRenderer(this);
		SRot_r2_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		SRot.addChild(SRot_r2_r2);
		setRotationAngle(SRot_r2_r2, -0.2182F, 0.0F, 0.0F);
		

		TeethN_r2 = new ModelRenderer(this);
		TeethN_r2.setRotationPoint(1.0F, -4.0672F, 4.523F);
		SRot.addChild(TeethN_r2);
		setRotationAngle(TeethN_r2, 0.5672F, 0.0F, 0.0F);
		

		SRot_r2_r1 = new ModelRenderer(this);
		SRot_r2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		SRot.addChild(SRot_r2_r1);
		setRotationAngle(SRot_r2_r1, -0.2182F, 0.0F, 0.0F);
		

		TeethN_r1 = new ModelRenderer(this);
		TeethN_r1.setRotationPoint(1.0F, -4.0672F, 4.523F);
		SRot.addChild(TeethN_r1);
		setRotationAngle(TeethN_r1, 0.5672F, 0.0F, 0.0F);
		

		SRot_r2 = new ModelRenderer(this);
		SRot_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		SRot.addChild(SRot_r2);
		setRotationAngle(SRot_r2, -0.2182F, 0.0F, 0.0F);
		SRot_r2.cubeList.add(new ModelBox(SRot_r2, 0, 116, -16.0F, -7.0F, -1.0F, 32, 7, 2, 0.0F));

		TeethN = new ModelRenderer(this);
		TeethN.setRotationPoint(1.0F, -4.0672F, 4.523F);
		SRot.addChild(TeethN);
		setRotationAngle(TeethN, 0.5672F, 0.0F, 0.0F);
		

		NZoob3_r3 = new ModelRenderer(this);
		NZoob3_r3.setRotationPoint(0.0F, 0.0F, 0.0F);
		TeethN.addChild(NZoob3_r3);
		setRotationAngle(NZoob3_r3, 0.0F, 0.0F, -0.1309F);
		

		NZoob1_r1_r2 = new ModelRenderer(this);
		NZoob1_r1_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		TeethN.addChild(NZoob1_r1_r2);
		setRotationAngle(NZoob1_r1_r2, -0.1309F, 0.0F, 0.0F);
		

		NZoob3_r2 = new ModelRenderer(this);
		NZoob3_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		TeethN.addChild(NZoob3_r2);
		setRotationAngle(NZoob3_r2, 0.0F, 0.0F, -0.1309F);
		

		NZoob1_r1_r1 = new ModelRenderer(this);
		NZoob1_r1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		TeethN.addChild(NZoob1_r1_r1);
		setRotationAngle(NZoob1_r1_r1, -0.1309F, 0.0F, 0.0F);
		

		NZoob3_r1 = new ModelRenderer(this);
		NZoob3_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		TeethN.addChild(NZoob3_r1);
		setRotationAngle(NZoob3_r1, 0.0F, 0.0F, -0.1309F);
		

		NZoob1_r1 = new ModelRenderer(this);
		NZoob1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		TeethN.addChild(NZoob1_r1);
		setRotationAngle(NZoob1_r1, -0.1309F, 0.0F, 0.0F);
		NZoob1_r1.cubeList.add(new ModelBox(NZoob1_r1, 3, 2, 2.0F, -9.3736F, -2.1492F, 5, 6, 1, 0.0F));

		NZoob3 = new ModelRenderer(this);
		NZoob3.setRotationPoint(0.0F, 0.0F, 0.0F);
		TeethN.addChild(NZoob3);
		setRotationAngle(NZoob3, 0.0F, 0.0F, -0.1309F);
		

		NZoob2 = new ModelRenderer(this);
		NZoob2.setRotationPoint(0.0F, 0.0F, 0.0F);
		TeethN.addChild(NZoob2);
		NZoob2.cubeList.add(new ModelBox(NZoob2, 4, 2, -1.0F, -10.0F, -2.0F, 4, 7, 1, 0.0F));

		NZoob2_r1_r2 = new ModelRenderer(this);
		NZoob2_r1_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		NZoob2.addChild(NZoob2_r1_r2);
		setRotationAngle(NZoob2_r1_r2, -0.0436F, 0.1745F, 0.0873F);
		

		NZoob2_r1_r1 = new ModelRenderer(this);
		NZoob2_r1_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		NZoob2.addChild(NZoob2_r1_r1);
		setRotationAngle(NZoob2_r1_r1, -0.0436F, 0.1745F, 0.0873F);
		

		NZoob2_r1 = new ModelRenderer(this);
		NZoob2_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		NZoob2.addChild(NZoob2_r1);
		setRotationAngle(NZoob2_r1, -0.0436F, 0.1745F, 0.0873F);
		NZoob2_r1.cubeList.add(new ModelBox(NZoob2_r1, 6, 3, 7.3264F, -10.043F, -1.0161F, 2, 6, 1, 0.0F));

		GubaLev4 = new ModelRenderer(this);
		GubaLev4.setRotationPoint(-11.0F, 36.0F, 21.0F);
		GiantSlime.addChild(GubaLev4);
		setRotationAngle(GubaLev4, 0.1745F, 0.0F, 0.0F);
		GubaLev4.cubeList.add(new ModelBox(GubaLev4, 110, 105, -5.0F, -15.0F, -3.0F, 5, 19, 4, 0.0F));

		GubaPrav4 = new ModelRenderer(this);
		GubaPrav4.setRotationPoint(12.0F, 40.0F, 21.0F);
		GiantSlime.addChild(GubaPrav4);
		setRotationAngle(GubaPrav4, 0.1745F, 0.0F, 0.0F);
		GubaPrav4.cubeList.add(new ModelBox(GubaPrav4, 110, 105, -1.0F, -19.0F, -2.0F, 5, 19, 4, 0.0F));

		TithV = new ModelRenderer(this);
		TithV.setRotationPoint(0.0F, 0.0F, 0.0F);
		GiantSlime.addChild(TithV);
		

		ZoobsV_r3 = new ModelRenderer(this);
		ZoobsV_r3.setRotationPoint(-5.0F, 28.0F, 17.0F);
		TithV.addChild(ZoobsV_r3);
		setRotationAngle(ZoobsV_r3, -0.3054F, 0.0F, 0.0F);
		

		ZoobsV_r2 = new ModelRenderer(this);
		ZoobsV_r2.setRotationPoint(-5.0F, 28.0F, 17.0F);
		TithV.addChild(ZoobsV_r2);
		setRotationAngle(ZoobsV_r2, -0.3054F, 0.0F, 0.0F);
		

		ZoobsV_r1 = new ModelRenderer(this);
		ZoobsV_r1.setRotationPoint(-5.0F, 28.0F, 17.0F);
		TithV.addChild(ZoobsV_r1);
		setRotationAngle(ZoobsV_r1, -0.3054F, 0.0F, 0.0F);
		

		ZoobsV = new ModelRenderer(this);
		ZoobsV.setRotationPoint(-5.0F, 28.0F, 17.0F);
		TithV.addChild(ZoobsV);
		setRotationAngle(ZoobsV, -0.3054F, 0.0F, 0.0F);
		ZoobsV.cubeList.add(new ModelBox(ZoobsV, 3, 1, -1.0F, -2.9537F, 0.6993F, 4, 8, 2, 0.0F));

		VZoob3_r4 = new ModelRenderer(this);
		VZoob3_r4.setRotationPoint(-4.0F, 0.0F, 0.0F);
		ZoobsV.addChild(VZoob3_r4);
		setRotationAngle(VZoob3_r4, 0.2182F, -0.1309F, 0.0436F);
		

		VZoob2_r4 = new ModelRenderer(this);
		VZoob2_r4.setRotationPoint(4.0F, 0.0F, 0.0F);
		ZoobsV.addChild(VZoob2_r4);
		setRotationAngle(VZoob2_r4, 0.0873F, 0.0F, -0.0873F);
		

		VZoob3_r3 = new ModelRenderer(this);
		VZoob3_r3.setRotationPoint(-4.0F, 0.0F, 0.0F);
		ZoobsV.addChild(VZoob3_r3);
		setRotationAngle(VZoob3_r3, 0.2182F, -0.1309F, 0.0436F);
		

		VZoob2_r3 = new ModelRenderer(this);
		VZoob2_r3.setRotationPoint(4.0F, 0.0F, 0.0F);
		ZoobsV.addChild(VZoob2_r3);
		setRotationAngle(VZoob2_r3, 0.0873F, 0.0F, -0.0873F);
		

		VZoob3_r1 = new ModelRenderer(this);
		VZoob3_r1.setRotationPoint(-4.0F, 0.0F, 0.0F);
		ZoobsV.addChild(VZoob3_r1);
		setRotationAngle(VZoob3_r1, 0.2182F, -0.1309F, 0.0436F);
		

		VZoob2_r1 = new ModelRenderer(this);
		VZoob2_r1.setRotationPoint(4.0F, 0.0F, 0.0F);
		ZoobsV.addChild(VZoob2_r1);
		setRotationAngle(VZoob2_r1, 0.0873F, 0.0F, -0.0873F);
		

		VZoob2 = new ModelRenderer(this);
		VZoob2.setRotationPoint(4.0F, 0.0F, 0.0F);
		ZoobsV.addChild(VZoob2);
		setRotationAngle(VZoob2, 0.0873F, 0.0F, -0.0873F);
		

		VZoob2_r2_r2 = new ModelRenderer(this);
		VZoob2_r2_r2.setRotationPoint(-3.0F, -1.0F, 2.0F);
		VZoob2.addChild(VZoob2_r2_r2);
		setRotationAngle(VZoob2_r2_r2, 0.0873F, 0.0F, 0.0F);
		

		VZoob2_r2_r1 = new ModelRenderer(this);
		VZoob2_r2_r1.setRotationPoint(-3.0F, -1.0F, 2.0F);
		VZoob2.addChild(VZoob2_r2_r1);
		setRotationAngle(VZoob2_r2_r1, 0.0873F, 0.0F, 0.0F);
		

		VZoob2_r2 = new ModelRenderer(this);
		VZoob2_r2.setRotationPoint(-3.0F, -1.0F, 2.0F);
		VZoob2.addChild(VZoob2_r2);
		setRotationAngle(VZoob2_r2, 0.0873F, 0.0F, 0.0F);
		VZoob2_r2.cubeList.add(new ModelBox(VZoob2_r2, 3, 0, 1.9962F, -1.8679F, -1.3158F, 4, 8, 2, 0.0F));

		VZoob3 = new ModelRenderer(this);
		VZoob3.setRotationPoint(-4.0F, 0.0F, 0.0F);
		ZoobsV.addChild(VZoob3);
		setRotationAngle(VZoob3, 0.2182F, -0.1309F, 0.0436F);
		

		VZoob3_r2_r2 = new ModelRenderer(this);
		VZoob3_r2_r2.setRotationPoint(4.9696F, -0.3054F, 1.9392F);
		VZoob3.addChild(VZoob3_r2_r2);
		setRotationAngle(VZoob3_r2_r2, 0.0873F, 0.0F, 0.0F);
		

		VZoob3_r2_r1 = new ModelRenderer(this);
		VZoob3_r2_r1.setRotationPoint(4.9696F, -0.3054F, 1.9392F);
		VZoob3.addChild(VZoob3_r2_r1);
		setRotationAngle(VZoob3_r2_r1, 0.0873F, 0.0F, 0.0F);
		

		VZoob3_r2 = new ModelRenderer(this);
		VZoob3_r2.setRotationPoint(4.9696F, -0.3054F, 1.9392F);
		VZoob3.addChild(VZoob3_r2);
		setRotationAngle(VZoob3_r2, 0.0873F, 0.0F, 0.0F);
		VZoob3_r2.cubeList.add(new ModelBox(VZoob3_r2, 3, 0, -5.8986F, -1.7245F, -1.2982F, 4, 9, 2, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GiantSlime.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}
