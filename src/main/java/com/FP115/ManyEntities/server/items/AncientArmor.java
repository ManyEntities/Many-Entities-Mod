package com.FP115.ManyEntities.server.items;

import com.FP115.ManyEntities.ManyEntitiesBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class AncientArmor extends ItemArmor{
	
	
	public AncientArmor(int id, int armorType) {
		super(ArmorMaterial.DIAMOND, id, armorType);
		  this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
		  this.setMaxStackSize(1);
		  this.setTextureName();
	
	}
	
	public void setTextureName ()
	{
	  if(armorType == 0||armorType == 1||armorType == 3){
	    this.texturePath += "ancientarmor_" + "1" + ".png";
	  }
	  else {
	    this.texturePath += "ancientarmor_" + "2" + ".png";
	  }
	}

	private String texturePath = "manyentities:textures/model/armor/";
	@Override
    public String getArmorTexture(ItemStack itemstack, Entity entity, int slot, String type)
    {
        return this.texturePath;
    }
	/*        @Override
        public void onArmorTick(World world, EntityPlayer player, ItemStack stack){
            if(stack.getItem() == FUZIKMod.armorBoneH){
                if(stack.getItem() == FUZIKMod.armorBoneP)
                    if(stack.getItem() == FUZIKMod.armorBoneB)
                        if(stack.getItem() == FUZIKMod.armorBoneL);
                    player.addPotionEffect(new PotionEffect(Potion.moveSpeed.getId(), 50, - 1));
            }
        }
	 */

}
