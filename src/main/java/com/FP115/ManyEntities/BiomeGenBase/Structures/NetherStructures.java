package com.FP115.ManyEntities.BiomeGenBase.Structures;

import java.util.Random;

import com.FP115.ManyEntities.ManyEntitiesBase;

import com.FP115.ManyEntities.server.blocks.MEBlocks;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class NetherStructures {
	public static void generateCommonHouse(World world, int x, int y, int z){
		for(int xpos = 0; xpos<5; xpos++)
		for(int zpos = 0; zpos<5; zpos++)
		for(int ypos = 0; ypos<5; ypos++) {
			world.setBlock(x+xpos, y+ypos, z+zpos, Blocks.diamond_block);
		}
		for(int xpos = 0; xpos<5; xpos++)
		for(int zpos = 0; zpos<5; zpos++)
		for(int ypos = 0; ypos<5; ypos++){world.setBlock(x+xpos, y-1-ypos, z+zpos, Blocks.netherrack);}
	}
	public static void generateTraderHouse(World world, int x, int y, int z){
		for(int xpos = 0; xpos<5; xpos++)
		for(int zpos = 0; zpos<5; zpos++)
		for(int ypos = 0; ypos<5; ypos++) {
			world.setBlock(x+xpos, y+ypos, z+zpos, Blocks.diamond_block);
		}
		for(int xpos = 0; xpos<5; xpos++)
		for(int zpos = 0; zpos<5; zpos++)
		for(int ypos = 0; ypos<5; ypos++){world.setBlock(x+xpos, y-1-ypos, z+zpos, Blocks.netherrack);}
	}
	public static void generateNetherTree(World world, Random rand, int x, int y, int z){
		for(int xpos = 0; xpos<3; xpos++)
		for(int zpos = 0; zpos<3; zpos++)
		for(int ypos=0; ypos<3; ypos++){world.setBlock(x+xpos+1, ypos+2+y, z+zpos+1, MEBlocks.netherleaves);}
		world.setBlockToAir(x+1, y+2, z+1);
		world.setBlockToAir(x+1, y+4, z+1);
		world.setBlockToAir(x+3, y+2, z+1);
		world.setBlockToAir(x+3, y+4, z+1);
		world.setBlockToAir(x+1, y+2, z+3);
		world.setBlockToAir(x+1, y+4, z+3);
		world.setBlockToAir(x+3, y+2, z+3);
		world.setBlockToAir(x+3, y+4, z+3);
		
		world.setBlock(x+2, y, z+2, MEBlocks.nethertreelog);
		world.setBlock(x+2, y+1, z+2, MEBlocks.nethertreelog);
		world.setBlock(x+2, y+2, z+2, MEBlocks.nethertreelog);
		world.setBlock(x+2, y+3, z+2, MEBlocks.nethertreelog);
	}
}
