package com.FP115.ManyEntities.BiomeGenBase;

import com.FP115.ManyEntities.ManyEntitiesBase;

import com.FP115.ManyEntities.server.blocks.MEBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.biome.BiomeGenHell;
import net.minecraftforge.common.BiomeDictionary;

public class BiomeGenSproutedHell extends BiomeGenHell{

	public BiomeGenSproutedHell(int p_i1971_1_) {
		super(p_i1971_1_);
		this.setBiomeName("Sprouted Hell");
		this.topBlock = MEBlocks.sproutednetherrack;
		this.fillerBlock = Blocks.netherrack;
		//Blocks.netherrack;
	}

}
