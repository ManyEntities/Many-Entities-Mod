package com.FP115.ManyEntities.server.blocks.NoteReader;

import com.FP115.ManyEntities.ManyEntitiesBase;
import com.FP115.ManyEntities.items.notes.FirstNote.NoteReaderGui1;

import com.FP115.ManyEntities.server.items.MEItems;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.Minecraft;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class NoteReader extends Block implements ITileEntityProvider{

	public NoteReader() {
		super(Material.wood);
		this.setBlockName("notereader");
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
		this.setBlockTextureName("planks_oak");
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new NoteReaderTileEntity();
	}
	public int getRenderType() {
		return -1;
	}

	public boolean isOpaqueCube() {
		return false;
	}

	public boolean renderAsNormalBlock() {
		return false;
	}
	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		ItemStack itemstack = player.inventory.getCurrentItem();
		//if(!world.isRemote && world.getTileEntity(x, y, z) instanceof NoteReaderTileEntity)
		if(itemstack != null && itemstack.getItem() == MEItems.firstnote && !world.isRemote && world.getTileEntity(x, y, z) instanceof NoteReaderTileEntity) {
			//player.openGui(ManyEntitiesBase.instance, 2, world, x, y, z);
			Minecraft.getMinecraft().displayGuiScreen(new NoteReaderGui1(player, itemstack));
			return true;
		}
		if(!world.isRemote && world.getTileEntity(x, y, z) instanceof NoteReaderTileEntity) {
			player.openGui(ManyEntitiesBase.instance, 1, world, x, y, z);
		    return true;
		}
		return true;
	}
		

	

}
