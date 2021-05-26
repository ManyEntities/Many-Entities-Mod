package com.FP115.ManyEntities.BiomeGenBase;

import java.util.Random;

import com.FP115.ManyEntities.ManyEntitiesBase;

import com.FP115.ManyEntities.server.blocks.MEBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenHell;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;

public class BiomeGenFadedHell extends BiomeGenHell{

	public BiomeGenFadedHell(int p_i1971_1_) {
		super(p_i1971_1_);
		this.setBiomeName("Faded Hell");
		this.topBlock = MEBlocks.fadednetherrack;
		this.fillerBlock = Blocks.netherrack;
	}

}
