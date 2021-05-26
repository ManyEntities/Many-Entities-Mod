package com.FP115.ManyEntities.items.notes.FirstNote;

import org.lwjgl.opengl.GL11;

import com.FP115.ManyEntities.server.blocks.NoteReader.NoteReaderTileEntity;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class NoteReaderGui1 extends GuiScreen{
	private static final ResourceLocation NoteReaderGui = new ResourceLocation("manyentities:textures/gui/1notereader.png");
	private NoteReaderTileEntity te;
	int xSize = 192;
    int ySize = 192;
	public NoteReaderGui1(EntityPlayer p_i1091_1_, ItemStack itemstack) {
	}

	@Override
    public void drawScreen(final int x, final int y, final float ticks) {
        super.drawScreen(x, y, ticks);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.drawWorldBackground(11833178);
        this.mc.renderEngine.bindTexture(NoteReaderGui);
        byte b0 = 2;
        GL11.glPushMatrix();
        GL11.glEnable(3089);
        GL11.glDisable(3089);
        GL11.glPopMatrix();
        int k = (this.width - this.xSize) / 2;
        int l = 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);
        String s = "���� ����� �����  ���� ����� ����� ���� ����� ����� ���� ����� ����� ���� ����� ����� ���� ����� ����� ���� ����� �����";
        this.fontRendererObj.drawSplitString(s, k + 36, 21, 116, 0);
        ItemStack itemstack = new ItemStack(Items.diamond);
        itemRender.renderItemAndEffectIntoGUI(this.fontRendererObj, this.mc.getTextureManager(), itemstack, k + 36, l + 24);

    }


    

}
