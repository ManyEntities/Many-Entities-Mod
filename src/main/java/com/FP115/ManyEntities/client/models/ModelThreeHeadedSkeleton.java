package com.FP115.ManyEntities.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelSkeleton;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelThreeHeadedSkeleton extends ModelBase {
	public int heldItemRight;
	public int heldItemLeft;
	
	private final ModelRenderer waist;
	private final ModelRenderer body;
	private final ModelRenderer head;
	private final ModelRenderer head2;
	private final ModelRenderer head3;
	private final ModelRenderer rightArm;
	private final ModelRenderer rightItem;
	private final ModelRenderer leftArm;
	private final ModelRenderer leftItem;
	private final ModelRenderer rightLeg;
	private final ModelRenderer leftleg;

	public ModelThreeHeadedSkeleton() {
		textureWidth = 64;
		textureHeight = 32;

		waist = new ModelRenderer(this);
		waist.setRotationPoint(0.0F, 12.0F, 0.0F);
		

		body = new ModelRenderer(this);
		body.setRotationPoint(0.0F, -12.0F, 0.0F);
		waist.addChild(body);
		body.setTextureOffset(16, 16).addBox(-4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F);
		body.setTextureOffset(34, 0).addBox(-11.0F, -1.0F, -2.0F, 11, 1, 4, 0.0F);
		body.setTextureOffset(34, 6).addBox(0.0F, -1.0F, -2.0F, 11, 1, 4, 0.0F);
		body.setTextureOffset(52, 18).addBox(-1.0F, -2.0F, -2.0F, 2, 2, 4, 0.0F);

		head = new ModelRenderer(this);
		head.setRotationPoint(0.0F, -2.0F, 0.0F);
		head.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);

		head2 = new ModelRenderer(this);
		head2.setRotationPoint(-10.0F, -1.0F, 0.0F);
		head2.setTextureOffset(0, 0).addBox(-4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F);

		head3 = new ModelRenderer(this);
		head3.setRotationPoint(10.0F, -2.0F, 0.0F);
		head3.setTextureOffset(0, 0).addBox(-4.0F, -7.0F, -4.0F, 8, 8, 8, 0.0F);

		rightArm = new ModelRenderer(this);
		rightArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		rightArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -1.0F, 2, 12, 2, 0.0F);

		rightItem = new ModelRenderer(this);
		rightItem.setRotationPoint(-1.0F, 7.0F, 1.0F);
		rightArm.addChild(rightItem);
		

		leftArm = new ModelRenderer(this);
		leftArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		leftArm.setTextureOffset(40, 16).addBox(-1.0F, -2.0F, -1.0F, 2, 12, 2, 0.0F);

		leftItem = new ModelRenderer(this);
		leftItem.setRotationPoint(1.0F, 7.0F, 1.0F);
		leftArm.addChild(leftItem);
		

		rightLeg = new ModelRenderer(this);
		rightLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		rightLeg.setTextureOffset(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);

		leftleg = new ModelRenderer(this);
		leftleg.setRotationPoint(2.0F, 12.0F, 0.0F);
		leftleg.setTextureOffset(0, 16).addBox(-1.0F, 0.0F, -1.0F, 2, 12, 2, 0.0F);
	}

	  public void setRotationAngles(float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scaleFactor, Entity entity)
	  {
	    super.setRotationAngles(limbSwing,limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scaleFactor, entity);

	    this.head.rotateAngleY = netHeadYaw / (180F / (float)Math.PI);
	    this.head.rotateAngleX = headPitch / (180F / (float)Math.PI);
	    
	    
	    this.rightLeg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F + (float)Math.PI) * 1.4F * limbSwingAmount;
	    this.leftleg.rotateAngleX = MathHelper.cos(limbSwing * 0.6662F) * 1.4F * limbSwingAmount;
	    
        float f6 = MathHelper.sin(this.onGround * (float)Math.PI);
        float f7 = MathHelper.sin((1.0F - (1.0F - this.onGround) * (1.0F - this.onGround)) * (float)Math.PI);
        this.rightArm.rotateAngleZ = 0.0F;
        this.leftArm.rotateAngleZ = 0.0F;
        this.rightArm.rotateAngleY = -(0.1F - f6 * 0.6F);
        this.leftArm.rotateAngleY = 0.1F - f6 * 0.6F;
        this.rightArm.rotateAngleX = -((float)Math.PI / 2F);
        this.leftArm.rotateAngleX = -((float)Math.PI / 2F);
        this.rightArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
        this.leftArm.rotateAngleX -= f6 * 1.2F - f7 * 0.4F;
        this.rightArm.rotateAngleZ += MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.leftArm.rotateAngleZ -= MathHelper.cos(ageInTicks * 0.09F) * 0.05F + 0.05F;
        this.rightArm.rotateAngleX += MathHelper.sin(ageInTicks * 0.067F) * 0.05F;
        this.leftArm.rotateAngleX -= MathHelper.sin(ageInTicks * 0.067F) * 0.05F;

        if (this.heldItemRight != 0)
        {
            this.rightArm.rotateAngleX = this.rightArm.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)this.heldItemRight;
        }
        if (this.heldItemLeft != 0)
        {
            this.leftArm.rotateAngleX = this.leftArm.rotateAngleX * 0.5F - ((float)Math.PI / 10F) * (float)this.heldItemRight;
        }

	  }

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5){
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		

		waist.render(f5);
		head.render(f5);
		head2.render(f5);
		head3.render(f5);
		leftArm.render(f5);
		rightArm.render(f5);
		leftleg.render(f5);
		rightLeg.render(f5);


	}

	public void setRotation(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
	
}