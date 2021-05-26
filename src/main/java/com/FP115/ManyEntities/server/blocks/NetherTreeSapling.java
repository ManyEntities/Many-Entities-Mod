package com.FP115.ManyEntities.server.blocks;

import java.util.List;
import java.util.Random;

import com.FP115.ManyEntities.ManyEntitiesBase;

import net.minecraft.block.BlockBush;
import net.minecraft.block.IGrowable;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;
import net.minecraft.world.World;

public class NetherTreeSapling extends BlockBush implements IGrowable{

    public NetherTreeSapling()
    {
        float f = 0.4F;
        this.setBlockBounds(0.5F - f, 0.0F, 0.5F - f, 0.5F + f, f * 2.0F, 0.5F + f);
        this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
        this.setBlockTextureName("manyentities:nethertreesapling");
    }
    @Override
    public boolean canBlockStay(World p_149718_1_, int p_149718_2_, int p_149718_3_, int p_149718_4_)
    {
        return  p_149718_1_.getBlock(p_149718_2_, p_149718_3_ - 1, p_149718_4_)==Blocks.netherrack||p_149718_1_.getBlock(p_149718_2_, p_149718_3_ - 1, p_149718_4_)==MEBlocks.sproutednetherrack||p_149718_1_.getBlock(p_149718_2_, p_149718_3_ - 1, p_149718_4_)==MEBlocks.fadednetherrack;
    }

    /**
     * Ticks the block if it's been scheduled
     */
    public void updateTick(World p_149674_1_, int p_149674_2_, int p_149674_3_, int p_149674_4_, Random p_149674_5_)
    {
        if (!p_149674_1_.isRemote)
        {
            super.updateTick(p_149674_1_, p_149674_2_, p_149674_3_, p_149674_4_, p_149674_5_);

            if (p_149674_1_.getBlockLightValue(p_149674_2_, p_149674_3_ + 1, p_149674_4_) >= 2 && p_149674_5_.nextInt(8) == 0)
            {
                this.func_149879_c(p_149674_1_, p_149674_2_, p_149674_3_, p_149674_4_, p_149674_5_);
            }
        }
    }

    public void func_149879_c(World p_149879_1_, int p_149879_2_, int p_149879_3_, int p_149879_4_, Random p_149879_5_)
    {
        int l = p_149879_1_.getBlockMetadata(p_149879_2_, p_149879_3_, p_149879_4_);

        if ((l & 8) == 0)
        {
            p_149879_1_.setBlockMetadataWithNotify(p_149879_2_, p_149879_3_, p_149879_4_, l | 8, 4);
        }
        else
        {
            this.generateTree(p_149879_1_, p_149879_2_, p_149879_3_, p_149879_4_, p_149879_5_);
        }
    }

    public void generateTree(World world, int x1, int y1, int z1, Random p_149878_5_)
    {
        boolean place = true;
        //for(int y=0;y<3; y++)for(int x=0;x<3; x++)for(int z=0;z<3; z++)
        //if(world.getBlock(x1-1+x, y1+y, z1-1+z)!= Blocks.air){place=false;};
        if(place){
        	world.setBlock(x1, y1, z1, MEBlocks.nethertreelog);
        	world.setBlock(x1, y1+1, z1, MEBlocks.nethertreelog);
        	world.setBlock(x1, y1+2, z1, MEBlocks.nethertreelog);
        	world.setBlock(x1, y1+3, z1, MEBlocks.nethertreelog);
        	
        	//world.setBlock(x1-1, y1+2, z1-1, MEBlocks.netherleaves);
        	world.setBlock(x1-1, y1+2, z1, MEBlocks.netherleaves);
        	world.setBlock(x1, y1+2, z1-1, MEBlocks.netherleaves);
        	//world.setBlock(x1+1, y1+2, z1-1, MEBlocks.netherleaves);
        	//world.setBlock(x1-1, y1+2, z1+1, MEBlocks.netherleaves);
        	world.setBlock(x1+1, y1+2, z1, MEBlocks.netherleaves);
        	world.setBlock(x1, y1+2, z1+1, MEBlocks.netherleaves);
        	//world.setBlock(x1+1, y1+2, z1+1, MEBlocks.netherleaves);
        	
        	world.setBlock(x1-1, y1+3, z1-1, MEBlocks.netherleaves);
        	world.setBlock(x1-1, y1+3, z1, MEBlocks.netherleaves);
        	world.setBlock(x1, y1+3, z1-1, MEBlocks.netherleaves);
        	world.setBlock(x1+1, y1+3, z1-1, MEBlocks.netherleaves);
        	world.setBlock(x1-1, y1+3, z1+1, MEBlocks.netherleaves);
        	world.setBlock(x1+1, y1+3, z1, MEBlocks.netherleaves);
        	world.setBlock(x1, y1+3, z1+1, MEBlocks.netherleaves);
        	world.setBlock(x1+1, y1+3, z1+1, MEBlocks.netherleaves);
        	
        	//world.setBlock(x1-1, y1+4, z1-1, ManyEntitiesBase.netherleaves);
        	world.setBlock(x1-1, y1+4, z1, MEBlocks.netherleaves);
        	world.setBlock(x1, y1+4, z1-1, MEBlocks.netherleaves);
        	//world.setBlock(x1+1, y1+4, z1-1, MEBlocks.netherleaves);
        	//world.setBlock(x1-1, y1+4, z1+1, MEBlocks.netherleaves);
        	world.setBlock(x1+1, y1+4, z1, MEBlocks.netherleaves);
        	world.setBlock(x1, y1+4, z1+1, MEBlocks.netherleaves);
        	//world.setBlock(x1+1, y1+4, z1+1, ManyEntitiesBase.netherleaves);
        	world.setBlock(x1, y1+4, z1, MEBlocks.netherleaves);
        }
    }

    public boolean func_149880_a(World p_149880_1_, int p_149880_2_, int p_149880_3_, int p_149880_4_, int p_149880_5_)
    {
        return p_149880_1_.getBlock(p_149880_2_, p_149880_3_, p_149880_4_) == this && (p_149880_1_.getBlockMetadata(p_149880_2_, p_149880_3_, p_149880_4_) & 7) == p_149880_5_;
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int p_149692_1_)
    {
        return MathHelper.clamp_int(p_149692_1_ & 7, 0, 5);
    }

    public boolean func_149851_a(World p_149851_1_, int p_149851_2_, int p_149851_3_, int p_149851_4_, boolean p_149851_5_)
    {
        return true;
    }

    public boolean func_149852_a(World p_149852_1_, Random p_149852_2_, int p_149852_3_, int p_149852_4_, int p_149852_5_)
    {
        return (double)p_149852_1_.rand.nextFloat() < 0.45D;
    }

    public void func_149853_b(World p_149853_1_, Random p_149853_2_, int p_149853_3_, int p_149853_4_, int p_149853_5_)
    {
        this.func_149879_c(p_149853_1_, p_149853_3_, p_149853_4_, p_149853_5_, p_149853_2_);
    }
}
