package com.FP115.ManyEntities.server.blocks;

import com.FP115.ManyEntities.ManyEntitiesBase;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockWood;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.util.IIcon;

public class NetherPlanks extends Block{
	public NetherPlanks() {
		super(Material.wood);
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
		this.setBlockTextureName("manyentities:netherplanks");
		this.setBlockName("netherplanks");
	}
    public int damageDropped(int p_149692_1_)
    {
        return p_149692_1_;
    }

}
