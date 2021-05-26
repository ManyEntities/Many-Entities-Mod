package com.FP115.ManyEntities.server.blocks;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.InventoryPlayer;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class GuiSkeletonTable extends GuiContainer
{
    private static final ResourceLocation furnaceGuiTextures = new ResourceLocation("manyentities:textures/gui/skeletontable.png");
    private TileEntitySkeletonTable tileFurnace;
    private static final String __OBFID = "CL_00000758";

    public GuiSkeletonTable(InventoryPlayer p_i1091_1_, TileEntitySkeletonTable p_i1091_2_)
    {
        super(new ContainerSkeletonTable(p_i1091_1_, p_i1091_2_));
        this.tileFurnace = p_i1091_2_;
    }

    /**
     * Draw the foreground layer for the GuiContainer (everything in front of the items)
     */
    protected void drawGuiContainerForegroundLayer(int p_146979_1_, int p_146979_2_)
    {
    	String s = I18n.format("container.skeletontable", new Object[0]);
        this.fontRendererObj.drawString(s, this.xSize / 2 - this.fontRendererObj.getStringWidth(s) / 2, 6, 4210752);
        this.fontRendererObj.drawString(I18n.format("container.inventory", new Object[0]), 8, this.ySize - 96 + 2, 4210752);
    }

    protected void drawGuiContainerBackgroundLayer(float p_146976_1_, int p_146976_2_, int p_146976_3_)
    {
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        this.mc.getTextureManager().bindTexture(furnaceGuiTextures);
        int k = (this.width - this.xSize) / 2;
        int l = (this.height - this.ySize) / 2;
        this.drawTexturedModalRect(k, l, 0, 0, this.xSize, this.ySize);

        if (this.tileFurnace.isBurning())
        {
            int i1 = this.tileFurnace.getBurnTimeRemainingScaled(12);
            //this.drawTexturedModalRect(k + 56, l + 36 + 12 - i1, 176, 12 - i1, 14, i1 + 1);
            i1 = this.tileFurnace.getCookProgressScaled(98);
            this.drawTexturedModalRect(k + 39, l + 54, 0, 166, i1 + 1, 18);//(int)((float)(tileFurnace.furnaceCookTime / (float)tileFurnace.currentItemBurnTime)* 98F)
        }
    }
}