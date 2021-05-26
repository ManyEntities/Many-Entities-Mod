package com.FP115.ManyEntities;


import com.FP115.ManyEntities.server.Mobs.Abstract.AbstractTraderContainer;
import com.FP115.ManyEntities.server.Mobs.PigmanTrader.PigmanTraderGui;
import com.FP115.ManyEntities.server.blocks.ContainerSkeletonTable;
import com.FP115.ManyEntities.server.blocks.GuiSkeletonTable;
import com.FP115.ManyEntities.server.blocks.TileEntitySkeletonTable;
import com.FP115.ManyEntities.server.blocks.FireMagicGenerator.FireMagicGeneratorContainer;
import com.FP115.ManyEntities.server.blocks.FireMagicGenerator.FireMagicGeneratorGui;
import com.FP115.ManyEntities.server.blocks.FireMagicGenerator.TileEntityFireMagicGenerator;
import com.FP115.ManyEntities.server.blocks.NetherFireMagicGenerator.NetherFireMagicGeneratorContainer;
import com.FP115.ManyEntities.server.blocks.NetherFireMagicGenerator.NetherFireMagicGeneratorGui;
import com.FP115.ManyEntities.server.blocks.NetherFireMagicGenerator.TileEntityNetherFireMagicGenerator;
import com.FP115.ManyEntities.server.blocks.NoteReader.NoteReaderContainer;
import com.FP115.ManyEntities.server.blocks.NoteReader.NoteReaderGui;
import com.FP115.ManyEntities.server.blocks.NoteReader.NoteReaderTileEntity;
import com.FP115.ManyEntities.server.blocks.ObsidianFireMagicGenerator.ObsidianFireMagicGeneratorContainer;
import com.FP115.ManyEntities.server.blocks.ObsidianFireMagicGenerator.ObsidianFireMagicGeneratorGui;
import com.FP115.ManyEntities.server.blocks.ObsidianFireMagicGenerator.TileEntityObsidianFireMagicGenerator;

import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.Entity;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class ManyGuiHandler implements IGuiHandler {
	public ManyGuiHandler (){
	}
	
	@Override
	public Object getServerGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		Entity entity = world.getEntityByID(ID);
		if(ID == 0){
			TileEntitySkeletonTable tileEntity = (TileEntitySkeletonTable) world.getTileEntity(x, y, z);
			return new ContainerSkeletonTable(player.inventory, tileEntity);
		}
		if(ID == 1) {
			NoteReaderTileEntity te = (NoteReaderTileEntity) world.getTileEntity(x,y, z);
			return new NoteReaderContainer(player.inventory, te);
		}
		if(ID == 2) {
			return new AbstractTraderContainer(player.inventory, (IMerchant)getEntityByID(x, world), world);
		}
		if(ID == 3){
			TileEntityFireMagicGenerator tileEntity = (TileEntityFireMagicGenerator) world.getTileEntity(x, y, z);
			return new FireMagicGeneratorContainer(player.inventory, tileEntity);
		}
		if(ID==4){
			TileEntityNetherFireMagicGenerator tileEntity = (TileEntityNetherFireMagicGenerator)world.getTileEntity(x, y, z);
			return new NetherFireMagicGeneratorContainer(player.inventory, tileEntity);
		}
		if(ID==5){
			TileEntityObsidianFireMagicGenerator tileEntity = (TileEntityObsidianFireMagicGenerator)world.getTileEntity(x, y, z);
			return new ObsidianFireMagicGeneratorContainer(player.inventory, tileEntity);
		}
		return null;
	}

	@Override
	public Object getClientGuiElement(int ID, EntityPlayer player, World world, int x, int y, int z) {
		Entity entity = world.getEntityByID(ID);
		if(ID == 0){
			TileEntitySkeletonTable tileEntity = (TileEntitySkeletonTable) world.getTileEntity(x, y, z);
			return new GuiSkeletonTable(player.inventory, tileEntity);
		}
		if(ID==1) {
			NoteReaderTileEntity te = (NoteReaderTileEntity) world.getTileEntity(x,y, z);
			return new NoteReaderGui(player.inventory, te);
		}
		if(ID == 2) {
			return new PigmanTraderGui(new AbstractTraderContainer(player.inventory, (IMerchant)getEntityByID(x, world), world), (IMerchant)getEntityByID(x, world));
		}
		if(ID == 3){
			TileEntityFireMagicGenerator tileEntity = (TileEntityFireMagicGenerator) world.getTileEntity(x, y, z);
			return new FireMagicGeneratorGui(player.inventory, tileEntity);
		}
		if(ID==4){
			TileEntityNetherFireMagicGenerator tileEntity = (TileEntityNetherFireMagicGenerator) world.getTileEntity(x, y, z);
			return new NetherFireMagicGeneratorGui(player.inventory, tileEntity);
		}
		if(ID==5){
			TileEntityObsidianFireMagicGenerator tileEntity = (TileEntityObsidianFireMagicGenerator)world.getTileEntity(x, y, z);
		    return new ObsidianFireMagicGeneratorGui(player.inventory, tileEntity);
		}
		return null;
	}
	private Entity getEntityByID(int entityID, World world) {
		for(int i = 0; i < world.loadedEntityList.size(); i++) {
			if(((Entity)world.loadedEntityList.get(i)).getEntityId() == entityID) {
				return ((Entity)world.loadedEntityList.get(i));
			}
		}
		return null;
	}

	
}
