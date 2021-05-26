package com.FP115.ManyEntities.BiomeGenBase.OreGenerator;

import java.util.Random;

import com.FP115.ManyEntities.BiomeGenBase.Plants.NetherTreeGen;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;

public class NetherTreeGenerator implements IWorldGenerator{
	public static NetherTreeGen nethertree = new NetherTreeGen();

	@Override
	public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {
		chunkX = chunkX * 16;
		chunkZ = chunkZ * 16;
		if(world.provider.dimensionId==-1)nethertree.generateNether(world, random, chunkX, chunkZ, 1);
		if(world.provider.dimensionId==-1)nethertree.generateNether(world, random, chunkX, chunkZ, 2);
		if(world.provider.dimensionId==-1)nethertree.generateNether(world, random, chunkX, chunkZ, 1);
		if(world.provider.dimensionId==-1)nethertree.generateNether(world, random, chunkX, chunkZ, 2);
		if(world.provider.dimensionId==-1)nethertree.generateNether(world, random, chunkX, chunkZ, 1);
		if(world.provider.dimensionId==-1)nethertree.generateNether(world, random, chunkX, chunkZ, 2);
		if(world.provider.dimensionId==-1)nethertree.generateNether(world, random, chunkX, chunkZ, 1);
		if(world.provider.dimensionId==-1)nethertree.generateNether(world, random, chunkX, chunkZ, 2);
		if(world.provider.dimensionId==-1)nethertree.generateNether(world, random, chunkX, chunkZ, 1);
		if(world.provider.dimensionId==-1)nethertree.generateNether(world, random, chunkX, chunkZ, 2);
		if(world.provider.dimensionId==-1)nethertree.generateNether(world, random, chunkX, chunkZ, 1);
		if(world.provider.dimensionId==-1)nethertree.generateNether(world, random, chunkX, chunkZ, 2);
		if(world.provider.dimensionId==-1)nethertree.generateNether(world, random, chunkX, chunkZ, 1);
		if(world.provider.dimensionId==-1)nethertree.generateNether(world, random, chunkX, chunkZ, 2);
		if(world.provider.dimensionId==-1)nethertree.generateNether(world, random, chunkX, chunkZ, 1);
		if(world.provider.dimensionId==-1)nethertree.generateNether(world, random, chunkX, chunkZ, 2);
		
	}

}
