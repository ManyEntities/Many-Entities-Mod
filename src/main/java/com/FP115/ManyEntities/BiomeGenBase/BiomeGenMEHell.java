package com.FP115.ManyEntities.BiomeGenBase;

import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenHell;

public class BiomeGenMEHell extends BiomeGenHell{

	public BiomeGenMEHell(int p_i1981_1_) {
		super(p_i1981_1_);
		this.topBlock = Blocks.netherrack;
		this.fillerBlock = Blocks.netherrack;
		this.setBiomeName("Hell");
	}

}
