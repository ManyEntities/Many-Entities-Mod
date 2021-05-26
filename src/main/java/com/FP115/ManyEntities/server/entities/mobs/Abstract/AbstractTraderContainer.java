package com.FP115.ManyEntities.server.Mobs.Abstract;

import net.minecraft.entity.IMerchant;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.ContainerMerchant;
import net.minecraft.world.World;

public class AbstractTraderContainer extends ContainerMerchant{

	public AbstractTraderContainer(InventoryPlayer p_i1821_1_, IMerchant p_i1821_2_, World p_i1821_3_) {
		super(p_i1821_1_, p_i1821_2_, p_i1821_3_);
	}
    public boolean canInteractWith(EntityPlayer par1EntityPlayer) {
        return true;
    }
}
