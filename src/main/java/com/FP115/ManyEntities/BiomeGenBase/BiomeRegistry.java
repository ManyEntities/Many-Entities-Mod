package com.FP115.ManyEntities.BiomeGenBase;

import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeManager;

public class BiomeRegistry {
	
	public static SkeletonBiome skeletonbiome = new SkeletonBiome(77);
	public static BiomeGenMEHell biomegenmehell=new BiomeGenMEHell(78);
	public static BiomeGenSproutedHell biomegensproutedhell= new BiomeGenSproutedHell(79);
	public static BiomeGenFadedHell fadedhell= new BiomeGenFadedHell(80);
	
	public static void register(){
        BiomeManager.addBiome(BiomeManager.BiomeType.COOL, new BiomeManager.BiomeEntry(skeletonbiome, 8));
        BiomeManager.addSpawnBiome(skeletonbiome);
       // BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biomegenmehell, 10));
        BiomeDictionary.registerBiomeType(biomegenmehell, BiomeDictionary.Type.NETHER);
        
        //BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(biomegensproutedhell, 10));
        BiomeDictionary.registerBiomeType(biomegensproutedhell, BiomeDictionary.Type.NETHER);
        
        //BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(fadedhell, 10));
        BiomeDictionary.registerBiomeType(fadedhell, BiomeDictionary.Type.NETHER);
		
	}
}
