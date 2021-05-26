package com.FP115.ManyEntities.BiomeGenBase.Structures;



import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class zoloto{

public zoloto(){}

public void load(){
}


	public void generateSurface(World world, Random random, int i2, int k2){

int i = i2 + random.nextInt(15);
int k = k2 + random.nextInt(15);

int j = world.getHeightValue(i,k)-1;

if(world.getBiomeGenForCoords(i, k).biomeName.equals(BiomeGenBase.desert.biomeName)) {

if((random.nextInt(1000000)+1)<=10){
boolean place = true;

for (int y = 0; y<5; y++)
for (int z = 0; z<3; z++)
for (int x = 0; x<3; x++)
if(world.getBlock(i+x,j+y+1,k+z)!=Blocks.air)
place = false;

if(place){
//	Block block = world.getBlock(i, j, k);
world.setBlock(i+0, j+0, k+0, Block.getBlockById(24), 0, 2);
world.setBlock(i+1, j+0, k+0, Block.getBlockById(0), 0, 2);
world.setBlock(i+2, j+0, k+0, Block.getBlockById(24), 0, 2);
world.setBlock(i+0, j+0, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+1, j+0, k+1, Block.getBlockById(24), 0, 2);
world.setBlock(i+2, j+0, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+0, k+2, Block.getBlockById(24), 0, 2);
world.setBlock(i+1, j+0, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+2, j+0, k+2, Block.getBlockById(24), 0, 2);
world.setBlock(i+0, j+1, k+0, Block.getBlockById(0), 0, 2);
world.setBlock(i+1, j+1, k+0, Block.getBlockById(0), 0, 2);
world.setBlock(i+2, j+1, k+0, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+1, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+1, j+1, k+1, Block.getBlockById(24), 0, 2);
world.setBlock(i+2, j+1, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+1, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+1, j+1, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+2, j+1, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+2, k+0, Block.getBlockById(24), 0, 2);
world.setBlock(i+1, j+2, k+0, Block.getBlockById(0), 0, 2);
world.setBlock(i+2, j+2, k+0, Block.getBlockById(24), 0, 2);
world.setBlock(i+0, j+2, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+1, j+2, k+1, Block.getBlockById(24), 0, 2);
world.setBlock(i+2, j+2, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+2, k+2, Block.getBlockById(24), 0, 2);
world.setBlock(i+1, j+2, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+2, j+2, k+2, Block.getBlockById(24), 0, 2);
world.setBlock(i+0, j+3, k+0, Block.getBlockById(0), 0, 2);
world.setBlock(i+1, j+3, k+0, Block.getBlockById(0), 0, 2);
world.setBlock(i+2, j+3, k+0, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+3, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+1, j+3, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+2, j+3, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+3, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+1, j+3, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+2, j+3, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+4, k+0, Block.getBlockById(0), 0, 2);
world.setBlock(i+1, j+4, k+0, Block.getBlockById(0), 0, 2);
world.setBlock(i+2, j+4, k+0, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+4, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+1, j+4, k+1, Block.getBlockById(57), 0, 2);
world.setBlock(i+2, j+4, k+1, Block.getBlockById(0), 0, 2);
world.setBlock(i+0, j+4, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+1, j+4, k+2, Block.getBlockById(0), 0, 2);
world.setBlock(i+2, j+4, k+2, Block.getBlockById(0), 0, 2);
}
}
}
}


public void generateNether(World world, Random random, int chunkX, int chunkZ){}


}
