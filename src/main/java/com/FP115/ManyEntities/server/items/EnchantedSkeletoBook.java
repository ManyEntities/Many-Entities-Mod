package com.FP115.ManyEntities.server.items;

import com.FP115.ManyEntities.ManyEntitiesBase;
import com.FP115.ManyEntities.server.Mobs.ThreeHeadedSkeleton;

import com.FP115.ManyEntities.server.blocks.MEBlocks;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EnchantedSkeletoBook extends Item {
	public EnchantedSkeletoBook() {
		this.setNoRepair();
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
		this.setMaxStackSize(1);
		this.setTextureName("manyentities:enchantedskeletonbook");
		this.setUnlocalizedName("enchantedskeletonbook");

		
		
	}


	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer p, World world, int x, int y, int z, int i, float f, float f1, float f2) {
		ThreeHeadedSkeleton threeheadedskeleton = new ThreeHeadedSkeleton(world);
		Block block = world.getBlock(x, y, z);
		if(!world.isRemote){
			if(block == MEBlocks.skeletontable){
				threeheadedskeleton.setLocationAndAngles(x + 0.5F, y + 1, z + 0.5F, 0.0F, 0.0F);
				if(world.getCollidingBoundingBoxes(threeheadedskeleton, threeheadedskeleton.boundingBox).isEmpty()) { 
				    world.spawnEntityInWorld(threeheadedskeleton);
				    if(!p.capabilities.isCreativeMode) stack.stackSize--;
				}
				return true;
			} 
			
		}
		return false;
    }

}
