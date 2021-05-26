package com.FP115.ManyEntities.server.items;

import com.FP115.ManyEntities.ManyEntitiesBase;

import com.FP115.ManyEntities.server.blocks.MEBlocks;
import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class NetherPlantSeed extends Item{

	public NetherPlantSeed() {
		super();
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
		this.setTextureName("manyentities:netherplantseed");
		this.setUnlocalizedName("netherplantseed");
		this.setMaxStackSize(64);
	}
	@Override
	public boolean onItemUse(ItemStack stack, EntityPlayer p, World world, int x, int y, int z, int i, float f, float f1, float f2) {
		Block block = world.getBlock(x, y, z);
		Block air = world.getBlock(x, y+1, z);
		if(!world.isRemote){
			if(  air == Blocks.air && block == MEBlocks.sproutednetherrack){
				    world.setBlock(x, y+1, z, MEBlocks.netherplant);
				    if(!p.capabilities.isCreativeMode) stack.stackSize--;
				}
				return true;
			} 
			
		
		return false;
    }
}
