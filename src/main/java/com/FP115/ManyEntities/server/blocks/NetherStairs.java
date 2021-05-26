package com.FP115.ManyEntities.server.blocks;

import com.FP115.ManyEntities.ManyEntitiesBase;

import net.minecraft.block.Block;
import net.minecraft.block.BlockStairs;

public class NetherStairs extends BlockStairs{

	public NetherStairs() {
		super(MEBlocks.netherplanks, 0);
		this.setBlockName("netherstairs");
		this.setCreativeTab(ManyEntitiesBase.tabmanyentities);
	}

}
