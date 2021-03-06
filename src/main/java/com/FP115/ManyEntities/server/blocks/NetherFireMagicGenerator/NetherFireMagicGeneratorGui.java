package com.FP115.ManyEntities.server.blocks.NetherFireMagicGenerator;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

public class NetherFireMagicGeneratorGui extends GuiContainer {
	final InventoryPlayer inventory_player;
	final TileEntityNetherFireMagicGenerator tile_entity;

	private static final ResourceLocation texture = new ResourceLocation("manyentities:textures/gui/netherfiremagicgenerator.png");

	public NetherFireMagicGeneratorGui(final InventoryPlayer inventory_player, final TileEntityNetherFireMagicGenerator tile_entity) {
		super(new NetherFireMagicGeneratorContainer(inventory_player, tile_entity));
		this.inventory_player = inventory_player;
		this.tile_entity = tile_entity;
	}

	@Override
	protected void drawGuiContainerForegroundLayer(int mouseX, int mouseY) {
		this.fontRendererObj.drawString(this.tile_entity.hasCustomInventoryName() ? this.tile_entity.getInventoryName() : I18n.format(this.tile_entity.getInventoryName(), new Object[0]), 8, 6, 4210752);
		this.fontRendererObj.drawString(this.inventory_player.hasCustomInventoryName() ? this.inventory_player.getInventoryName() : I18n.format(this.inventory_player.getInventoryName(), new Object[0]), 8, this.ySize - 96 + 2, 4210752);
	}

	@Override
	public void drawGuiContainerBackgroundLayer(float parTick, int mouseX, int mouseY) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
		this.mc.getTextureManager().bindTexture(texture);
		this.drawTexturedModalRect(this.guiLeft, this.guiTop, 0, 0, this.xSize, this.ySize);
		if (tile_entity.time_max > 0) {
			this.drawTexturedModalRect(this.guiLeft + 49, this.guiTop + 17, 0, 166, 83 - (int)((float)(tile_entity.time / (float)tile_entity.time_max) * 84F), 64);
		}
		if(tile_entity.getStackInSlot(2) !=null){
			this.drawTexturedModalRect(this.guiLeft + 67, this.guiTop + 17, 83, 166, 47, 64);
		}
	}
}
