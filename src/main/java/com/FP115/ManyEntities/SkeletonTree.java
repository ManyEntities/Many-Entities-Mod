package com.FP115.ManyEntities;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.World;
import net.minecraft.item.ItemStack;
import net.minecraft.init.Blocks;

import java.util.Random;

import com.FP115.ManyEntities.BiomeGenBase.BiomeRegistry;

import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import net.minecraft.block.Block;

public class SkeletonTree {
	public Object instance;

	public SkeletonTree() {
	}



	public void generateSurface(World world, Random random, int i2, int k2) {

		int i = i2 + random.nextInt(15);
		int k = k2 + random.nextInt(15);

		int j = world.getHeightValue(i, k) - 1;
		if (world.getBiomeGenForCoords(i, k).biomeName.equals(BiomeRegistry.skeletonbiome.biomeName)) {

			if ((random.nextInt(1000000) + 1) <= 100000) {
				boolean place = true;

				for (int y = 0; y < 7; y++)
					for (int z = 0; z < 3; z++)
						for (int x = 0; x < 6; x++)
							if (world.getBlock(i + x, j + y + 1, k + z) != Blocks.air)
								place = false;

				if (place) {
					
					world.setBlock(i + 5, j + 1, k + 1, Block.getBlockById(17), 0, 2);
					world.setBlock(i + 1, j + 2, k + 0, Block.getBlockById(18), 4, 2);
					world.setBlock(i + 2, j + 2, k + 0, Block.getBlockById(18), 4, 2);
					world.setBlock(i + 3, j + 2, k + 0, Block.getBlockById(18), 4, 2);
					world.setBlock(i + 4, j + 2, k + 0, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 0, j + 2, k + 1, Block.getBlockById(18), 4, 2);
					world.setBlock(i + 5, j + 2, k + 1, Block.getBlockById(17), 0, 2);
					world.setBlock(i + 1, j + 2, k + 2, Block.getBlockById(18), 4, 2);
					world.setBlock(i + 2, j + 2, k + 2, Block.getBlockById(18), 4, 2);
					world.setBlock(i + 3, j + 2, k + 2, Block.getBlockById(18), 4, 2);
					world.setBlock(i + 4, j + 2, k + 2, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 1, j + 3, k + 0, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 2, j + 3, k + 0, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 3, j + 3, k + 0, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 4, j + 3, k + 0, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 0, j + 3, k + 1, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 1, j + 3, k + 1, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 5, j + 3, k + 1, Block.getBlockById(17), 0, 2);
					world.setBlock(i + 1, j + 3, k + 2, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 2, j + 3, k + 2, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 3, j + 3, k + 2, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 4, j + 3, k + 2, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 1, j + 4, k + 0, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 2, j + 4, k + 0, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 3, j + 4, k + 0, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 4, j + 4, k + 0, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 5, j + 4, k + 0, Block.getBlockById(18), 4, 2);
					world.setBlock(i + 0, j + 4, k + 1, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 1, j + 4, k + 1, Block.getBlockById(17), 0, 2);
					world.setBlock(i + 2, j + 4, k + 1, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 3, j + 4, k + 1, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 4, j + 4, k + 1, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 5, j + 4, k + 1, Block.getBlockById(17), 0, 2);
					world.setBlock(i + 1, j + 4, k + 2, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 2, j + 4, k + 2, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 3, j + 4, k + 2, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 4, j + 4, k + 2, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 5, j + 4, k + 2, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 2, j + 5, k + 0, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 3, j + 5, k + 0, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 4, j + 5, k + 0, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 1, j + 5, k + 1, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 2, j + 5, k + 1, Block.getBlockById(17), 4, 2);
					world.setBlock(i + 3, j + 5, k + 1, Block.getBlockById(17), 4, 2);
					world.setBlock(i + 4, j + 5, k + 1, Block.getBlockById(17), 4, 2);
					world.setBlock(i + 5, j + 5, k + 1, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 2, j + 5, k + 2, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 3, j + 5, k + 2, Block.getBlockById(18), 4, 2);
					world.setBlock(i + 4, j + 5, k + 2, Block.getBlockById(18), 4, 2);
					world.setBlock(i + 2, j + 6, k + 1, Block.getBlockById(18), 4, 2);
					world.setBlock(i + 3, j + 6, k + 1, Block.getBlockById(18), 12, 2);
					world.setBlock(i + 4, j + 6, k + 1, Block.getBlockById(18), 12, 2);

				}
			}
		}
	}

	public void generateNether(World world, Random random, int chunkX, int chunkZ) {
	}


	public void serverLoad(FMLServerStartingEvent event) {
		
	}


	public void preInit(FMLPreInitializationEvent event) {
		
	}


}
