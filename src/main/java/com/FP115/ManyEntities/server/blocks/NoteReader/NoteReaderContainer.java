package com.FP115.ManyEntities.server.blocks.NoteReader;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.Slot;

public class NoteReaderContainer extends Container{

	private NoteReaderTileEntity tileFurnace;



	public boolean canInteractWith(EntityPlayer p_75145_1_)
    {
        return this.tileFurnace.isUseableByPlayer(p_75145_1_);
    }
	public NoteReaderContainer(InventoryPlayer player, NoteReaderTileEntity p_i1812_2_)
    {
        this.tileFurnace = p_i1812_2_;
        int i;

        for (i = 0; i < 3; ++i)
        {
            for (int j = 0; j < 9; ++j)
            {
                this.addSlotToContainer(new Slot(player, j + i * 9 + 9, 8 + j * 18, 84 + i * 18));
            }
        }

        for (i = 0; i < 9; ++i)
        {
            this.addSlotToContainer(new Slot(player, i, 8 + i * 18, 142));
        }
      }

}
