package com.FP115.ManyEntities.server.blocks;

import java.util.Random;

import com.FP115.ManyEntities.ManyEntitiesBase;
import com.FP115.ManyEntities.server.blocks.abstractBlocks.AbstractLeaves;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;

public class NetherLeaves extends AbstractLeaves{
	IIcon icon;
	 public static final String[][] field_150132_N = new String[][] {{"manyentities:leaves_nethertree"},{"manyentities:leaves_nethertree_opaque"}} ;
	public static final String[] leaves = new String[] {"nethertree"};

	@Override
	public IIcon getIcon(int p_149691_1_, int p_149691_2_) {
		return (p_149691_2_ & 3) == 1 ? this.field_150129_M[this.field_150127_b][1] : this.field_150129_M[this.field_150127_b][0];
	}

	@Override
	public String[] func_150125_e() {
		return leaves;
	}
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        for (int i = 0; i < field_150132_N.length; ++i)
        {
            this.field_150129_M[i] = new IIcon[field_150132_N[i].length];

            for (int j = 0; j < field_150132_N[i].length; ++j)
            {
                this.field_150129_M[i][j] = p_149651_1_.registerIcon(field_150132_N[i][j]);
            }
        }
    }
	@Override
	public boolean isOpaqueCube() {
		return false;
	}
    @SideOnly(Side.CLIENT)
    public boolean shouldSideBeRendered(IBlockAccess p_149646_1_, int p_149646_2_, int p_149646_3_, int p_149646_4_, int p_149646_5_)
    {
    	return true;
    }
    public Item getItemDropped(int p_149650_1_, Random p_149650_2_, int p_149650_3_)
    {
        return Item.getItemFromBlock(MEBlocks.nethertreesapling);
    }

}
