package com.FP115.ManyEntities.Gui;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.FP115.ManyEntities.server.items.MEItems;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import com.FP115.ManyEntities.ManyEntitiesBase;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.GuiButton;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.GuiScreenBook;
import net.minecraft.client.renderer.RenderHelper;
import net.minecraft.client.resources.I18n;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.nbt.NBTTagString;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.play.client.C17PacketCustomPayload;
import net.minecraft.util.ChatAllowedCharacters;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class ManyEntitiesBookGui extends GuiScreen{
	 private static final Logger logger = LogManager.getLogger();
	    private static final ResourceLocation bookGuiTextures = new ResourceLocation("manyentities:textures/gui/book.png");
	    /** The player editing the book */
	    private final EntityPlayer editingPlayer;
	    private final ItemStack bookObj;
	    /** Whether the book is signed or can still be edited */
	    private final boolean bookIsUnsigned;
	    private boolean field_146481_r;
	    private boolean field_146480_s;
	    /** Update ticks since the gui was opened */
	    private int updateCount;
	    private int bookImageWidth = 256;
	    private int bookImageHeight = 164;
	    private int bookTotalPages = 1;
	    private int currPage;
	    private NBTTagList bookPages;
	    private String bookTitle = "";
	    private NextPageButton buttonNextPage;
	    private NextPageButton buttonPreviousPage;
	    private GuiButton buttonDone;
	    /** The GuiButton to sign this book. */
	    private GuiButton buttonSign;
	    private GuiButton buttonFinalize;
	    private GuiButton buttonCancel;
	    private static final String __OBFID = "CL_00000744";

	    public ManyEntitiesBookGui(EntityPlayer p_i1080_1_, ItemStack p_i1080_2_, boolean p_i1080_3_)
	    {
	        this.editingPlayer = p_i1080_1_;
	        this.bookObj = p_i1080_2_;
	        this.bookIsUnsigned = false;
	        this.bookTotalPages = 10;
	        
	        /*if (p_i1080_2_.hasTagCompound())
	        {
	            NBTTagCompound nbttagcompound = p_i1080_2_.getTagCompound();
	            this.bookPages = nbttagcompound.getTagList("pages", 8);
	            
	            if (this.bookPages != null)
	            {
	                this.bookPages = (NBTTagList)this.bookPages.copy();
	                this.bookTotalPages = this.bookPages.tagCount();

	                if (this.bookTotalPages < 1)
	                {
	                    this.bookTotalPages = 1;
	                }
	                
	            }
	        }

	        if (this.bookPages == null && p_i1080_3_)
	        {
	        	this.bookTotalPages = 10;
	            this.bookPages = new NBTTagList();
	            this.bookPages.appendTag(new NBTTagString(""));
	            this.bookTotalPages = 10;
	        }*/
	    }

	    private void drawPageAt(final int cornerX, final int cornerY, final int pageNum) {
	    	
	    }
	    
	    /**
	     * Called from the main game loop to update the screen.
	     */
	    public void updateScreen()
	    {
	        super.updateScreen();
	        ++this.updateCount;
	    }

	    /**
	     * Adds the buttons (and other controls) to the screen in question.
	     */
	    public void initGui()
	    {
	        this.buttonList.clear();
	        Keyboard.enableRepeatEvents(true);

	        int i = (this.width - this.bookImageWidth) / 2;
	        byte b0 = 2;
	        this.buttonList.add(this.buttonNextPage = new NextPageButton(1, i + 120, b0 + 154, true));
	        this.buttonList.add(this.buttonPreviousPage = new NextPageButton(2, i + 38, b0 + 154, false));
	        this.updateButtons();
	    }

	    /**
	     * Called when the screen is unloaded. Used to disable keyboard repeat events
	     */
	    public void onGuiClosed()
	    {
	        Keyboard.enableRepeatEvents(false);
	    }

	    private void updateButtons()
	    {
	        this.buttonNextPage.visible = !this.field_146480_s && (this.currPage < this.bookTotalPages - 1 || this.bookIsUnsigned);
	        this.buttonPreviousPage.visible = !this.field_146480_s && this.currPage > 0;
	        //this.buttonDone.visible = !this.bookIsUnsigned || !this.field_146480_s;

	        if (this.bookIsUnsigned)
	        {
	            //this.buttonSign.visible = !this.field_146480_s;
	            //this.buttonCancel.visible = this.field_146480_s;
	            //this.buttonFinalize.visible = this.field_146480_s;
	            //this.buttonFinalize.enabled = this.bookTitle.trim().length() > 0;
	        }
	    }

	    private void sendBookToServer(boolean p_146462_1_)
	    {
	        if (this.bookIsUnsigned && this.field_146481_r)
	        {
	            if (this.bookPages != null)
	            {
	                String s;

	                while (this.bookPages.tagCount() > 1)
	                {
	                    s = this.bookPages.getStringTagAt(this.bookPages.tagCount() - 1);

	                    if (s.length() != 0)
	                    {
	                        break;
	                    }

	                    this.bookPages.removeTag(this.bookPages.tagCount() - 1);
	                }

	                if (this.bookObj.hasTagCompound())
	                {
	                    NBTTagCompound nbttagcompound = this.bookObj.getTagCompound();
	                    nbttagcompound.setTag("pages", this.bookPages);
	                }
	                else
	                {
	                    this.bookObj.setTagInfo("pages", this.bookPages);
	                }

	                s = "MC|BEdit";

	                if (p_146462_1_)
	                {
	                    s = "MC|BSign";
	                    this.bookObj.func_150996_a(MEItems.mebook);
	                }

	                ByteBuf bytebuf = Unpooled.buffer();

	                try
	                {
	                    (new PacketBuffer(bytebuf)).writeItemStackToBuffer(this.bookObj);
	                    this.mc.getNetHandler().addToSendQueue(new C17PacketCustomPayload(s, bytebuf));
	                }
	                catch (Exception exception)
	                {
	                    logger.error("Couldn\'t send book info", exception);
	                }
	                finally
	                {
	                    bytebuf.release();
	                }
	            }
	        }
	    }

	    protected void actionPerformed(GuiButton p_146284_1_)
	    {
	        if (p_146284_1_.enabled)
	        {
	            if (p_146284_1_.id == 0)
	            {
	                this.mc.displayGuiScreen((GuiScreen)null);
	                this.sendBookToServer(false);
	            }
	            else if (p_146284_1_.id == 3 && this.bookIsUnsigned)
	            {
	                this.field_146480_s = true;
	            }
	            else if (p_146284_1_.id == 1)
	            {
	                if (this.currPage < this.bookTotalPages - 1)
	                {
	                    ++this.currPage;
	                }
	            }
	            else if (p_146284_1_.id == 2)
	            {
	                if (this.currPage > 0)
	                {
	                    --this.currPage;
	                }
	            }
	            else if (p_146284_1_.id == 5 && this.field_146480_s)
	            {
	                this.sendBookToServer(true);
	                this.mc.displayGuiScreen((GuiScreen)null);
	            }
	            else if (p_146284_1_.id == 4 && this.field_146480_s)
	            {
	                this.field_146480_s = false;
	            }

	            this.updateButtons();
	        }
	    }
	    private void func_146460_c(char p_146460_1_, int p_146460_2_)
	    {
	        switch (p_146460_2_)
	        {
	            case 14:
	                if (!this.bookTitle.isEmpty())
	                {
	                    this.bookTitle = this.bookTitle.substring(0, this.bookTitle.length() - 1);
	                    this.updateButtons();
	                }

	                return;
	            case 28:
	            case 156:
	                if (!this.bookTitle.isEmpty())
	                {
	                    this.sendBookToServer(true);
	                    this.mc.displayGuiScreen((GuiScreen)null);
	                }

	                return;
	            default:
	                if (this.bookTitle.length() < 16 && ChatAllowedCharacters.isAllowedCharacter(p_146460_1_))
	                {
	                    this.bookTitle = this.bookTitle + Character.toString(p_146460_1_);
	                    this.updateButtons();
	                    this.field_146481_r = true;
	                }
	        }
	    }

	    /**
	     * Draws the screen and all the components in it.
	     */
	    public void drawScreen(int p_73863_1_, int p_73863_2_, float p_73863_3_)
	    {
	        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	        this.mc.getTextureManager().bindTexture(bookGuiTextures);
	        int k = (this.width - this.bookImageWidth) / 2;
	        byte b0 = 2;
	        this.drawTexturedModalRect(k, b0, 0, 0, this.bookImageWidth, this.bookImageHeight);
	        String s;
	        String s1;
	        int l;

	        if (this.field_146480_s)
	        {
	            s = this.bookTitle;

	            if (this.bookIsUnsigned)
	            {
	                if (this.updateCount / 6 % 2 == 0)
	                {
	                    s = s + "" + EnumChatFormatting.BLACK + "_";
	                }
	                else
	                {
	                    s = s + "" + EnumChatFormatting.GRAY + "_";
	                }
	            }

	            s1 = I18n.format("book.editTitle", new Object[0]);
	            l = this.fontRendererObj.getStringWidth(s1);
	            this.fontRendererObj.drawString(s1, k + 36 + (116 - l) / 2, b0 + 16 + 16, 0);
	            int i1 = this.fontRendererObj.getStringWidth(s);
	            this.fontRendererObj.drawString(s, k + 36 + (116 - i1) / 2, b0 + 48, 0);
	            String s2 = I18n.format("book.byAuthor", new Object[] {this.editingPlayer.getCommandSenderName()});
	            int j1 = this.fontRendererObj.getStringWidth(s2);
	            this.fontRendererObj.drawString(EnumChatFormatting.DARK_GRAY + s2, k + 36 + (116 - j1) / 2, b0 + 48 + 10, 0);
	            String s3 = I18n.format("book.finalizeWarning", new Object[0]);
	            this.fontRendererObj.drawSplitString(s3, k + 36, b0 + 80, 116, 0);
	        }
	        else
	        {
	            s = I18n.format("book.pageIndicator", new Object[] {Integer.valueOf(this.currPage + 1), Integer.valueOf(this.bookTotalPages)});
	            s1 = "";

	            if (this.bookPages != null && this.currPage >= 0 && this.currPage < this.bookPages.tagCount())
	            {
	                s1 = this.bookPages.getStringTagAt(this.currPage);
	            }

	            if (this.bookIsUnsigned)
	            {
	                if (this.fontRendererObj.getBidiFlag())
	                {
	                    s1 = s1 + "_";
	                }
	                else if (this.updateCount / 6 % 2 == 0)
	                {
	                    s1 = s1 + "" + EnumChatFormatting.BLACK + "_";
	                }
	                else
	                {
	                    s1 = s1 + "" + EnumChatFormatting.GRAY + "_";
	                }
	            }

	            l = this.fontRendererObj.getStringWidth(s);
	            this.fontRendererObj.drawString(s, k - l + this.bookImageWidth - 44, b0 + 16, 0);
	            this.fontRendererObj.drawSplitString(s1, k + 36, b0 + 16 + 16, 116, 0);
	        }

	        super.drawScreen(p_73863_1_, p_73863_2_, p_73863_3_);
	    }

	    @SideOnly(Side.CLIENT)
	    static class NextPageButton extends GuiButton
	        {
	            private final boolean field_146151_o;
	            private static final String __OBFID = "CL_00000745";

	            public NextPageButton(int p_i1079_1_, int p_i1079_2_, int p_i1079_3_, boolean p_i1079_4_)
	            {
	                super(p_i1079_1_, p_i1079_2_, p_i1079_3_, 23, 13, "");
	                this.field_146151_o = p_i1079_4_;
	            }

	            /**
	             * Draws this button to the screen.
	             */
	            public void drawButton(Minecraft p_146112_1_, int p_146112_2_, int p_146112_3_)
	            {
	                if (this.visible)
	                {
	                    boolean flag = p_146112_2_ >= this.xPosition && p_146112_3_ >= this.yPosition && p_146112_2_ < this.xPosition + this.width && p_146112_3_ < this.yPosition + this.height;
	                    GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
	                    p_146112_1_.getTextureManager().bindTexture(bookGuiTextures);
	                    int k = 0;
	                    int l = 192;

	                    if (flag)
	                    {
	                        k += 23;
	                    }

	                    if (!this.field_146151_o)
	                    {
	                        l += 13;
	                    }

	                    this.drawTexturedModalRect(this.xPosition, this.yPosition, k, l, 23, 13);
	                }
	            }
	        }
	  
	  
}