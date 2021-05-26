package com.FP115.ManyEntities.server.blocks.NetherFireMagicGenerator;

import com.FP115.ManyEntities.ManyEntitiesBase;

import com.FP115.ManyEntities.server.blocks.MEBlocks;
import com.FP115.ManyEntities.server.items.MEItems;
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

public class NetherFireMagicGenerator extends Block implements ITileEntityProvider{
	@SideOnly(Side.CLIENT)
    private IIcon top;
    @SideOnly(Side.CLIENT)
    private IIcon down;
	public NetherFireMagicGenerator() {
		super(Material.rock);
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
		this.setBlockName("netherfiremagicgenerator");
		this.setBlockTextureName("manyentities:netherfiremagicgenerator");
		this.setLightLevel(4);
	}

	@Override
	public TileEntity createNewTileEntity(World p_149915_1_, int p_149915_2_) {
		return new TileEntityNetherFireMagicGenerator();
	}
	@Override
	public void onBlockPlacedBy(World world, int x, int y, int z, EntityLivingBase entity, ItemStack itemStack) {
		if (itemStack.hasDisplayName())
			((TileEntityNetherFireMagicGenerator)world.getTileEntity(x, y, z)).setInventoryName(itemStack.getDisplayName());
	}

	@Override
	public boolean onBlockActivated(World world, int x, int y, int z, EntityPlayer player, int side, float hitX, float hitY, float hitZ) {
		if (!world.isRemote && world.getTileEntity(x, y, z) instanceof TileEntityNetherFireMagicGenerator)
			player.openGui(ManyEntitiesBase.instance, 4, world, x, y, z);
		return true;
	}
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        return p_149691_1_ == 1 ? this.top : (p_149691_1_ == 0 ? MEBlocks.firestone.getBlockTextureFromSide(p_149691_1_) : this.blockIcon);
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
            return MEBlocks.firestone.getBlockTextureFromSide(p_149673_5_);
        }
        else {
        	return this.down;
        }
    }
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.blockIcon = p_149651_1_.registerIcon("manyentities:netherfiremagicgenerator_side");
        this.top = p_149651_1_.registerIcon("manyentities:firemagicgenerator_top");
        this.down = p_149651_1_.registerIcon("manyentities:netherfiremagicgenerator_side");
    }
}
