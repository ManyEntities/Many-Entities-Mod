package com.FP115.ManyEntities.inventory;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;

public class NoteSlot extends Slot{

	public NoteSlot(IInventory p_i1824_1_, int p_i1824_2_, int p_i1824_3_, int p_i1824_4_) {
		super(p_i1824_1_, p_i1824_2_, p_i1824_3_, p_i1824_4_);
	}
	@Override
	public boolean canTakeStack(EntityPlayer p_82869_1_)
    {
        return false;
    }

}
