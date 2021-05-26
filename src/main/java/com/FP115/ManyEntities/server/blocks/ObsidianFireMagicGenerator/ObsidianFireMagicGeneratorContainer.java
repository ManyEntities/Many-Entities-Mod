package com.FP115.ManyEntities.server.blocks.ObsidianFireMagicGenerator;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.inventory.Container;
import net.minecraft.inventory.ICrafting;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class ObsidianFireMagicGeneratorContainer extends Container {
	final TileEntityObsidianFireMagicGenerator tile_entity;
	private int last_time, last_time_max;

	public ObsidianFireMagicGeneratorContainer(final InventoryPlayer inventory_player, final TileEntityObsidianFireMagicGenerator tile_entity) {
		tile_entity.openInventory();
		this.addSlotToContainer(new Slot(tile_entity, 3, 115, 25){
			@Override
			public boolean isItemValid(ItemStack itemStack) {
				return false;
			}
		});
		this.addSlotToContainer(new Slot(tile_entity, 2, 150, 41){
			@Override
			public boolean isItemValid(ItemStack itemStack) {
				return false;
			}
		});

		this.addSlotToContainer(new Slot(tile_entity, 0, 50, 41){
			@Override
			public boolean isItemValid(ItemStack itemStack) {
				if (ObsidianFireMagicGeneratorRecipes.getRecipe(itemStack) == null)
					return false;
				return true;
			}
		});
		this.addSlotToContainer(new Slot(tile_entity, 1, 115, 58){
			@Override
			public boolean isItemValid(ItemStack itemStack) {
				return false;
			}
		});

		int j;
		int k;

		for (j = 0; j < 3; ++j) {
			for (k = 0; k < 9; ++k) {
				this.addSlotToContainer(new Slot(inventory_player, k + j * 9 + 9, 8 + k * 18, 84 + j * 18));
			}
		}

		for (j = 0; j < 9; ++j) {
			this.addSlotToContainer(new Slot(inventory_player, j, 8 + j * 18, 142));
		}

		this.tile_entity = tile_entity;
	}

	@Override
	public ItemStack transferStackInSlot(EntityPlayer player, int slotID) {
		ItemStack itemstack = null;
		Slot slot = (Slot)this.inventorySlots.get(slotID);

		if (slot != null && slot.getHasStack()) {
			ItemStack itemstack1 = slot.getStack();
			itemstack = itemstack1.copy();

			if (slotID < tile_entity.getSizeInventory()) {
				if (!this.mergeItemStack(itemstack1, tile_entity.getSizeInventory() - 1, this.inventorySlots.size(), true))
					return null;
			} else {
				if (ObsidianFireMagicGeneratorRecipes.getRecipe(itemstack1) == null)
				     return null;
				if (!this.mergeItemStack(itemstack1, 2, tile_entity.getSizeInventory() - 1, false))
					return null;
			}

			if (itemstack1.stackSize == 0)
				slot.putStack(null);
			else
				slot.onSlotChanged();
		}

		return itemstack;
	}

	@Override
	public void onContainerClosed(EntityPlayer player) {
		super.onContainerClosed(player);
		tile_entity.closeInventory();
	}

	@Override
	public boolean canInteractWith(EntityPlayer player) {
		return tile_entity.isUseableByPlayer(player);
	}

	@Override
	public void addCraftingToCrafters(ICrafting ic) {
		super.addCraftingToCrafters(ic);
		ic.sendProgressBarUpdate(this, 0, this.tile_entity.time);
		ic.sendProgressBarUpdate(this, 1, this.tile_entity.time_max);
	}

	@Override
	public void detectAndSendChanges() {
		super.detectAndSendChanges();

		for (int i = 0; i < this.crafters.size(); ++i) {
			ICrafting icrafting = (ICrafting)this.crafters.get(i);

			if (this.last_time != this.tile_entity.time)
				icrafting.sendProgressBarUpdate(this, 0, this.tile_entity.time);

			if (this.last_time_max != this.tile_entity.time_max)
				icrafting.sendProgressBarUpdate(this, 1, this.tile_entity.time_max);

		}

		this.last_time = this.tile_entity.time;
		this.last_time_max = this.tile_entity.time_max;
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void updateProgressBar(int id, int value) {
		switch(id) {
		case 0:
			this.tile_entity.time = value;
			break;
		case 1:
			this.tile_entity.time_max = value;
			break;
		default:break;
		}
	}
}
