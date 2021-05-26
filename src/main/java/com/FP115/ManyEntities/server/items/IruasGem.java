package com.FP115.ManyEntities.server.items;

import com.FP115.ManyEntities.ManyEntitiesBase;

import com.FP115.ManyEntities.server.blocks.MEBlocks;
import net.minecraft.block.Block;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class IruasGem extends Item {
	public IruasGem() {
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
		this.setTextureName("manyentities:iruasgem");
		this.setUnlocalizedName("iruasgem");
		this.setMaxStackSize(1);
	}
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer p, World world, int x, int y, int z, int i, float f, float f1, float f2) {
		Block block = world.getBlock(x, y, z);
		if(!world.isRemote){
			if(block == MEBlocks.magictable){
				    world.setBlock(x, y, z, MEBlocks.skeletontable);
				    world.spawnEntityInWorld(new EntityLightningBolt(world, x, y+1, z));
				    world.spawnEntityInWorld(new EntityLightningBolt(world, x+1, y, z));
				    world.spawnEntityInWorld(new EntityLightningBolt(world, x-1, y, z));
				    world.spawnEntityInWorld(new EntityLightningBolt(world, x, y, z+1));
				    world.spawnEntityInWorld(new EntityLightningBolt(world, x, y, z-1));
				    if(!p.capabilities.isCreativeMode) stack.stackSize--;
				}
				return true;
			} 
			
		
		return false;
    }
}
