package com.FP115.ManyEntities.BiomeGenBase.OreGenerator;

import java.util.Random;

import com.FP115.ManyEntities.ManyEntitiesBase;

import com.FP115.ManyEntities.server.blocks.MEBlocks;
import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenMinable;

public class LrianiumOreGenerator implements IWorldGenerator{
	@Override
    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {
        
        switch(world.provider.dimensionId){
        case -1:
            generateNether(world, random, chunkX*16,chunkZ*16);
        case 0 :
            generateSurface(world, random, chunkX*16,chunkZ*16);
        case 1:
            generateEnd(world, random, chunkX*16,chunkZ*16);
        }
    }
    
    private void generateNether(World world, Random random, int x, int y) {
        
    }
    
    private void generateSurface(World world, Random random, int x, int y) {
        this.addOreSpawn(MEBlocks.lrianium_ore, world, random, x, y, 16, 16, 1, 1+random.nextInt(3), 5, 6, 10);

    }
    
    private void generateEnd(World world, Random random, int x, int y) {
        
    }

    public void addOreSpawn(Block block, World world, Random random, int blockXPos, int blockZPos, int maxX, int maxZ, int minVeinSize, int maxVeinSize, int chancesToSpawn, int minY, int maxY) {
        for(int i = 0; i < chancesToSpawn; i++) {
            int posX = blockXPos + random.nextInt(maxX);
            int posY = minY + random.nextInt(maxY - minY);
            int posZ = blockZPos + random.nextInt(maxZ);
            (new WorldGenMinable(block, maxVeinSize)).generate(world, random, posX, posY, posZ);
        }
    }
}
