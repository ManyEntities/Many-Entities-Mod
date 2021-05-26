package com.FP115.ManyEntities.server.blocks.ObsidianFireMagicGenerator;

import com.FP115.ManyEntities.ManyEntitiesBase;

import com.FP115.ManyEntities.server.blocks.MEBlocks;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class ObsidianFireMagicGenerator extends Block implements ITileEntityProvider {
    @SideOnly(Side.CLIENT)
    private IIcon top;
    @SideOnly(Side.CLIENT)
    private IIcon side;
	public ObsidianFireMagicGenerator() {
		super(Material.rock);
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
		this.setBlockName("obsidianfiremagicgenerator");
		this.setBlockTextureName("manyentities:obsidianfiremagicgenerator");
		this.setLightLevel(4);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityObsidianFireMagicGenerator();
	}
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
		if (itemStack.hasDisplayName())
			((TileEntityObsidianFireMagicGenerator)world.getTileEntity(x, y, z)).setInventoryName(itemStack.getDisplayName());
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote && world.getTileEntity(x, y, z) instanceof TileEntityObsidianFireMagicGenerator)
			player.openGui(ManyEntitiesBase.instance, 5, world, x, y, z);
		return true;
	}
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int side, int meta)
    {
        return side == 1 ? this.top : (side == 0 ? MEBlocks.inflamedobsidian.getBlockTextureFromSide(side) : this.blockIcon);
    }
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(IBlockAccess p_149673_1_, int p_149673_2_, int p_149673_3_, int p_149673_4_, int p_149673_5_)
    {
        if (p_149673_5_ == 1)
        {
            return this.top;
        }
        else if(p_149673_5_ == 0)
        {
            return MEBlocks.inflamedobsidian.getBlockTextureFromSide(p_149673_5_);
        }
        else {
        	return this.side;
        }
    }
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister reg)
    {
        this.blockIcon = reg.registerIcon("manyentities:obsidianfiremagicgenerator_side");
        this.top = reg.registerIcon("manyentities:firemagicgenerator_top");
        this.side = reg.registerIcon("manyentities:obsidianfiremagicgenerator_side");
    }
}
