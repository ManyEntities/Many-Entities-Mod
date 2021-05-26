package com.FP115.ManyEntities.server.blocks.NoteReader;

import org.lwjgl.opengl.GL11;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class NoteReaderGui extends GuiContainer{
	private static final ResourceLocation NoteReaderGui = new ResourceLocation("manyentities:textures/gui/notereader.png");
	private NoteReaderTileEntity te;

	public NoteReaderGui(InventoryPlayer p_i1091_1_, NoteReaderTileEntity p_i1091_2_) {
		super(new NoteReaderContainer(p_i1091_1_, p_i1091_2_));
	}
	protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_)
    {
        String s = "Note  Reader";
        String s1 = "You have not selected any note";
        
        this.fontRendererObj.drawString(I18n.format("container.notereader", new Object[0]), this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        this.fontRendererObj.drawString(I18n.format("text.desnotereader", new Object[0]), this.xSize / 4 - this.fontRendererObj.getStringWidth(s) / 2, this.ySize / 4, 	16712704);                   
        this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 96 + 2, 4210752);
    }

	@Override
	protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_) {
		GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(NoteReaderGui);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
		
	}

}
