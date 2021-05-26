package com.FP115.ManyEntities.server.blocks;

import java.util.Random;

import com.FP115.ManyEntities.ManyEntitiesBase;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.IGrowable;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.init.Blocks;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class SproutedNetherrack extends Block{
    @SideOnly(Side.CLIENT)
    private IIcon field_150200_a;
    @SideOnly(Side.CLIENT)
    private IIcon field_150199_b;

	public SproutedNetherrack() {
		super(Material.rock);
		this.setStepSound(soundTypePiston);
		this.setHardness(0.4F);
		this.setBlockName("sproutednetherrack");
		this.setTickRandomly(true);
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
		
	}
    public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
    {
        if (!p_149674_1_.isRemote)
        {
            if (p_149674_1_.getBlockLightValue(p_149674_2_, p_149674_3_ + 1, p_149674_4_) < 4 && p_149674_1_.getBlockLightOpacity(p_149674_2_, p_149674_3_ + 1, p_149674_4_) > 2)
            {
                p_149674_1_.setBlock(p_149674_2_, p_149674_3_, p_149674_4_, MEBlocks.fadednetherrack);
            }
        }
    }
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_1_ == 1 ? this.field_150200_a : (p_149691_1_ == 0 ? Blocks.netherrack.getBlockTextureFromSide(p_149691_1_) : this.blockIcon);
    }
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(IBlockAccess p_149673_1_, int p_149673_2_, int p_149673_3_, int p_149673_4_, int p_149673_5_)
    {
        if (p_149673_5_ == 1)
        {
            return this.field_150200_a;
        }
        else if(p_149673_5_ == 0)
        {
            return Blocks.netherrack.getBlockTextureFromSide(p_149673_5_);
        }
        else {
        	return this.field_150199_b;
        }
    }
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon("manyentities:sproutednetherrack_side");
        this.field_150200_a = p_149651_1_.registerIcon("manyentities:sproutednetherrack_top");
        this.field_150199_b = p_149651_1_.registerIcon("manyentities:sproutednetherrack_side");
    }


     
    @SideOnly(Side.CLIENT)
    public void randomDisplayTick(World world, int x, int y, int z, Random p_149734_5_)
    {
        super.randomDisplayTick(world, x, y, z, p_149734_5_);


       /* if (p_149734_5_.nextInt(10) == 0)
        {
            p_149734_1_.spawnParticle("townaura", (double)((float)p_149734_2_ + p_149734_5_.nextFloat()), (double)((float)p_149734_3_ + 1.1F), (double)((float)p_149734_4_ + p_149734_5_.nextFloat()), 0.0D, 0.0D, 0.0D);
        }*/
    }


	



}
