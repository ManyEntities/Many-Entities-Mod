package com.FP115.ManyEntities.BiomeGenBase.Plants;

import java.util.Random;

import com.FP115.ManyEntities.ManyEntitiesBase;
import com.FP115.ManyEntities.BiomeGenBase.Structures.NetherStructures;

import com.FP115.ManyEntities.server.blocks.MEBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;

public class NetherTreeGen {
	public NetherTreeGen(){}

	public void generateNether(World world, Random random, int i2, int k2, int type) {
		if(type==1) {
        int i = i2 + random.nextInt(15);
        int k = k2 + random.nextInt(15);
        if(world.getBiomeGenForCoords(i, k).biomeName.equals("Faded Hell")){
       // if((random.nextInt(10000000)+1)<=9000000){
        	boolean place = true;
        	
        	for(int y=5; y < 117; y++){
        	if(place) {
        	if(world.getBlock(i, y, k)==Blocks.air && world.getBlock(i, y+1, k)==Blocks.air && world.getBlock(i, y+2, k)==Blocks.air && world.getBlock(i, y+3, k)==Blocks.air && world.getBlock(i, y+4, k)==Blocks.air
        			&& world.getBlock(i+2, y-1, k+2)== MEBlocks.fadednetherrack){
        		NetherStructures.generateNetherTree(world, random, i, y, k);
        		place = false;
        }
      }
	//}
  }
  }
 }
		if(type==2){
	        int i = i2 + random.nextInt(15);
	        int k = k2 + random.nextInt(15);
	        if(world.getBiomeGenForCoords(i, k).biomeName.equals("Faded Hell")){
	  //      if((random.nextInt(10000000)+1)<=9000000){
	        	boolean place = true;
	        	
	        	for(int y=117; y > 5; y--){
	        	if(place) {
	        	if(world.getBlock(i, y, k)==Blocks.air && world.getBlock(i, y+1, k)==Blocks.air && world.getBlock(i, y+2, k)==Blocks.air && world.getBlock(i, y+3, k)==Blocks.air && world.getBlock(i, y+4, k)==Blocks.air
	        			&& world.getBlock(i+2, y-1, k+2)==MEBlocks.fadednetherrack){
	        		NetherStructures.generateNetherTree(world, random, i, y, k);
	        		place = false;
	        }
	      }
	//	}
	  }
		}
		}
	}
}