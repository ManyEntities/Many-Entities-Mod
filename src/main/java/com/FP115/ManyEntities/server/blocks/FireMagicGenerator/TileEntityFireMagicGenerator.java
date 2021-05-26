package com.FP115.ManyEntities.server.blocks.FireMagicGenerator;

import java.util.Random;

import com.FP115.ManyEntities.ManyEntitiesBase;

import com.FP115.ManyEntities.server.items.MEItems;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.ISidedInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.common.util.Constants.NBT;

public class TileEntityFireMagicGenerator extends TileEntity implements ISidedInventory {
	Random rand = new Random();
	private final ItemStack[] inventory = new ItemStack[3];
	private static final int[]
			topSlots = new int[] {0},
			sideSlots = new int[] {1, 2};
	private FireMagicGeneratorRecipes.Recipe recipe = null;
	private String custom_name;
	public int time = 0, time_max = 0;

	public TileEntityFireMagicGenerator() {}

	@Override
	public void updateEntity() {
		if (worldObj.isRemote) return;
		ItemStack input = getStackInSlot(0);
		ItemStack output = getStackInSlot(1);
		ItemStack trash = getStackInSlot(2);
		

		if (time == 0) {
			int trashitem = rand.nextInt(5);

			if (recipe != null && trash == null ) {

				if (output == null) {
					setInventorySlotContents(1, recipe.output.copy());
					if(trash==null && trashitem == 0){
						setInventorySlotContents(2, new ItemStack(MEItems.ash));
					}
					recipe = null;
					time_max = 0;

					
				} else if (output != null && output.isItemEqual(recipe.output) && ItemStack.areItemStackTagsEqual(output, recipe.output) && recipe.output.stackSize + output.stackSize <= 64) {
					
					output.stackSize += recipe.output.stackSize;
					setInventorySlotContents(1, output);
					if(trash==null && trashitem == 0){
						setInventorySlotContents(2, new ItemStack(MEItems.ash));
					}
					recipe = null;
					time_max = 0;

				}
			} else {
				recipe = FireMagicGeneratorRecipes.getRecipe(input);

				if (recipe != null) {//
					time_max = time = recipe.time;
					if (input != null && input.getItem().hasContainerItem(input)) {
						setInventorySlotContents(0, input.getItem().getContainerItem(input));
					} else {
						input.stackSize -= recipe.input.stackSize;
						
						if (input.stackSize <= 0)
							setInventorySlotContents(0, null);
						else
							setInventorySlotContents(0, input);
					}
				
			  }
			}

		} else {
			if(output == null) {
				if(trash==null){
					--time;
				}
			
			}
			if(recipe==null)recipe = FireMagicGeneratorRecipes.getRecipe(input);
			if(output != null && output.isItemEqual(recipe.output) && ItemStack.areItemStackTagsEqual(output, recipe.output) && recipe.output.stackSize + output.stackSize <= 64
					){
				if(trash==null){
					--time;
				}
				}
			
			
		}

	}

	@Override
	public void writeToNBT(NBTTagCompound nbt) {
		super.writeToNBT(nbt);
		NBTTagList list = new NBTTagList();
		for (int i = 0; i < getSizeInventory(); ++i) {
			if (getStackInSlot(i) == null) continue;
			NBTTagCompound slot_nbt = new NBTTagCompound();
			getStackInSlot(i).writeToNBT(slot_nbt);
			slot_nbt.setByte("Slot", (byte)i);
			list.appendTag(slot_nbt);
		}
		nbt.setTag("Inventory", list);
		if (hasCustomInventoryName()) nbt.setString("CustomName", getInventoryName());
	}

	@Override
	public void readFromNBT(NBTTagCompound nbt) {
		super.readFromNBT(nbt);
		if (nbt.hasKey("Inventory", NBT.TAG_LIST)) {
			NBTTagList list = nbt.getTagList("Inventory", NBT.TAG_COMPOUND);
			for (int i = 0; i < list.tagCount(); ++i) {
				NBTTagCompound slot_nbt = list.getCompoundTagAt(i);
				setInventorySlotContents((slot_nbt.getByte("Slot") & 255), ItemStack.loadItemStackFromNBT(slot_nbt));
			}
		}
		if (nbt.hasKey("CustomName", NBT.TAG_STRING)) setInventoryName(nbt.getString("CustomName"));
	}

	@Override
	public int getSizeInventory() {
		return inventory.length;
	}

	@Override
	public ItemStack getStackInSlot(int slotID) {
		return inventory[slotID];
	}

	@Override
	public ItemStack decrStackSize(int slotID, int stackSize) {
		if (inventory[slotID] != null) {
			ItemStack itemstack;

			if (inventory[slotID].stackSize <= stackSize) {
				itemstack = inventory[slotID];
				inventory[slotID] = null;
				return itemstack;
			} else {
				itemstack = inventory[slotID].splitStack(stackSize);

				if (inventory[slotID].stackSize == 0)
					inventory[slotID] = null;

				return itemstack;
			}
		} else return null;
	}

	@Override
	public ItemStack getStackInSlotOnClosing(int slotID) {
		if (inventory[slotID] != null) {
			ItemStack itemstack = inventory[slotID];
			inventory[slotID] = null;
			return itemstack;
		} else return null;
	}

	@Override
	public void setInventorySlotContents(int slotID, ItemStack itemStack) {
		inventory[slotID] = itemStack;
	}

	public void setInventoryName(String name) {
		custom_name = name;
	}

	@Override
	public String getInventoryName() {
		return hasCustomInventoryName() ? custom_name : "container.firemagicgenerator";
	}

	@Override
	public boolean hasCustomInventoryName() {
		return custom_name != null && custom_name.length() > 0;
	}

	@Override
	public int getInventoryStackLimit() {
		return 64;
	}

	@Override
	public boolean isUseableByPlayer(EntityPlayer player) {
		return this.worldObj.getTileEntity(this.xCoord, this.yCoord, this.zCoord) != this ? false : player.getDistanceSq((double)this.xCoord + 0.5D, (double)this.yCoord + 0.5D, (double)this.zCoord + 0.5D) <= 64.0D;
	}

	@Override
	public void openInventory() {}

	@Override
	public void closeInventory() {}

	@Override
	public boolean isItemValidForSlot(int slotID, ItemStack itemStack) {
		if (FireMagicGeneratorRecipes.getRecipe(itemStack) == null)
			return false;
		return true;
	}

	@Override
	public int[] getAccessibleSlotsFromSide(int side) {
		return side == 0 ? topSlots : sideSlots;
	}

	@Override
	public boolean canInsertItem(int slotID, ItemStack itemStack, int side) {
		return side != 0 && isItemValidForSlot(slotID, itemStack);
	}

	@Override
	public boolean canExtractItem(int slotID, ItemStack itemStack, int side) {
		return side == 0;
	}
}
