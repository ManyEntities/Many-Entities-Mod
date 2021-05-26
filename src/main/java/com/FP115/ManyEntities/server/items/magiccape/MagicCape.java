package com.FP115.ManyEntities.server.items.magiccape;

import com.FP115.ManyEntities.ClientProxy;
import com.FP115.ManyEntities.ManyEntitiesBase;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumAction;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class MagicCape extends ItemArmor {

	public MagicCape(int i, int j) {
		super(ArmorMaterial.CHAIN, i, j);
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
	}
	@Override
	@SideOnly(Side.CLIENT)
	public ModelBiped getArmorModel (EntityLivingBase entityLiving, ItemStack itemstack, int armorSlot){
		
		ModelBiped armorModel = ClientProxy.armorModels.get(this);
		
		if(armorModel != null){
    		armorModel.bipedHead.showModel = armorSlot == 0;
    		armorModel.bipedHeadwear.showModel = false;
    		armorModel.bipedBody.showModel = armorSlot == 1 || armorSlot == 2;
    		armorModel.bipedRightArm.showModel = armorSlot == 1;
    		armorModel.bipedLeftArm.showModel = armorSlot == 1;
    		armorModel.bipedRightLeg.showModel = armorSlot == 2 || armorSlot == 3;
    		armorModel.bipedLeftLeg.showModel = armorSlot == 2 || armorSlot == 3;
    		
    		armorModel.isSneak = entityLiving.isSneaking();
    		armorModel.isRiding = entityLiving.isRiding();
    		armorModel.isChild = entityLiving.isChild();
    		
    		armorModel.heldItemRight = 0;
    		armorModel.aimedBow = false;
    		
    		EntityPlayer player = (EntityPlayer)entityLiving;
    		
    		ItemStack held_item = player.getEquipmentInSlot(0);
    		
    		if (held_item != null){
    			armorModel.heldItemRight = 1;
    			
    			if (player.getItemInUseCount() > 0){
    				
    				EnumAction enumaction = held_item.getItemUseAction();
    				
    				if (enumaction == EnumAction.bow){
    					armorModel.aimedBow = true;
    				}else if (enumaction == EnumAction.block){
    					armorModel.heldItemRight = 3;
    				}
    				
    				
    			}
    			
    		}
    		
    		
		}
		
		
		return armorModel;
	}
	@Override
    public void registerIcons(IIconRegister par1IconRegister)
    {
    this.itemIcon = par1IconRegister.registerIcon("manyentities:magiccape");
    }
	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String type) {
	         return "manyentities:textures/model/armor/magiccape.png";
	}
	
    
}
