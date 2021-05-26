package com.FP115.ManyEntities.server.gen.dimension.nether;

import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;

public class GenLayerCreate extends GenLayer{
	public GenLayerCreate(long par1, boolean o)
	{
		super(par1);
	}

	@Override
	public int[] getInts(int par1, int par2, int par3, int par4)
	{
		int[] var5 = IntCache.getIntCache(par3 * par4);

		for (int var6 = 0; var6 < par4; ++var6)
		{
			for (int var7 = 0; var7 < par3; ++var7)
			{
				this.initChunkSeed(par1 + var7, par2 + var6);
				var5[var7 + var6 * par3] = 1;
			}
		}

		return var5;
	}
}
