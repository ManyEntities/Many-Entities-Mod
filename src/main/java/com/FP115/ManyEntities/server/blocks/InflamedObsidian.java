package com.FP115.ManyEntities.server.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class InflamedObsidian extends Block {

	public InflamedObsidian() {
		super(Material.rock);
		this.setHardness(50.0F);
		this.setResistance(2000.0F);
		this.setStepSound(soundTypePiston);
		this.setBlockName("inflamedobsidian");
		this.setBlockTextureName("manyentities:inflamedobsidian");
		this.setLightLevel(1);
	}
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		ItemStack itemstack = player.inventory.getCurrentItem();
		if (itemstack != null && itemstack.getItem()==Items.stick){
            if (itemstack.stackSize-- == 1)
            {
            	player.dropPlayerItemWithRandomChoice(new ItemStack(Blocks.torch, 1, 0), false);
            }
            else if (!player.inventory.addItemStackToInventory(new ItemStack(Blocks.torch)))
            {
                player.dropPlayerItemWithRandomChoice(new ItemStack(Blocks.torch, 1, 0), false);
            }
		}
		return false;
	}

}
