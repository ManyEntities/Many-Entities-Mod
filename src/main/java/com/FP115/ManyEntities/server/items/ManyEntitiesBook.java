package com.FP115.ManyEntities.server.items;

import com.FP115.ManyEntities.ManyEntitiesBase;
import com.FP115.ManyEntities.Gui.ManyEntitiesBookGui;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class ManyEntitiesBook extends Item{
	public ManyEntitiesBook() {
		this.setUnlocalizedName("manyentitiesbook");
		this.setTextureName("manyentities:manyentitiesbook");
		
	}
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer p, World world, int x, int y, int z, int i, float f, float f1, float f2) {
		if(!world.isRemote){
			Minecraft.getMinecraft().displayGuiScreen(new ManyEntitiesBookGui(p, stack, false));
			return true;
			} 
			
		
		return false;
    }
}
