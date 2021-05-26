package com.FP115.ManyEntities.BiomeGenBase.Plants;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.BlockSapling;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenerator;
import net.minecraftforge.common.util.ForgeDirection;

public class Tree12345 extends WorldGenAbstractTree{


	public Tree12345(boolean notify)
    {
        super(notify);
    }
	

	public boolean generate(World world, Random par2Random, int i, int j2, int k) {
		int j = world.getHeightValue(i, k) - 1;

		boolean place = true;

		for (int y = 0; y < 7; y++)
			for (int z = 0; z < 3; z++)
				for (int x = 0; x < 6; x++)
					if (world.getBlock(i + x, j + y + 1, k + z) != Blocks.air)
						place = false;

		if (place) {
			world.setBlock(i + 5, j + 0, k + 1, Block.getBlockById(17), 0, 2);
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

		return true;
	}



	

}
