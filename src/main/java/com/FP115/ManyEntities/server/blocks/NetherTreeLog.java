package com.FP115.ManyEntities.server.blocks;

import java.util.List;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.BlockLog;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;

public class NetherTreeLog extends BlockLog{
    public static final String[] nethertreelog = new String[] {"manyentities:nethertreelog"};

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.field_150167_a = new IIcon[nethertreelog.length];
        this.field_150166_b = new IIcon[nethertreelog.length];

        for (int i = 0; i < this.field_150167_a.length; ++i)
        {
            this.field_150167_a[i] = p_149651_1_.registerIcon(nethertreelog[i]);
            this.field_150166_b[i] = p_149651_1_.registerIcon(nethertreelog[i] + "_top");
        }
    }
}
