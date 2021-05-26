package com.FP115.ManyEntities.server.gen.dimension.nether;

import java.util.ArrayList;
import java.util.List;

import com.FP115.ManyEntities.BiomeGenBase.BiomeRegistry;

import net.minecraft.util.WeightedRandom;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.IntCache;
import net.minecraftforge.common.BiomeManager.BiomeEntry;

public class GenLayerHellBiomes extends GenLayer {

	//protected BiomeGenBase[] allowedBiomes = {ManyEntitiesBase.biomegenmehell, ManyEntitiesBase.biomegensproutedhell,};//
	public List<BiomeEntry> netherBiomes = new ArrayList();
	
    public GenLayerHellBiomes(long par1, GenLayer b)
    {
        super(par1);
		parent = b;
		this.netherBiomes.add(new BiomeEntry(BiomeRegistry.biomegensproutedhell, 10));
		this.netherBiomes.add(new BiomeEntry(BiomeRegistry.biomegenmehell, 10));
		this.netherBiomes.add(new BiomeEntry(BiomeRegistry.fadedhell, 10));
    } 

    @Override
	public int[] getInts(int par1, int par2, int par3, int par4)
    {
        int[] var5 = this.parent.getInts(par1, par2, par3, par4);
        int[] var6 = IntCache.getIntCache(par3 * par4);

        for (int var7 = 0; var7 < par4; ++var7)
        {
            for (int var8 = 0; var8 < par3; ++var8)
            {
                this.initChunkSeed((long)(var8 + par1), (long)(var7 + par2));
                int var9 = var5[var8 + var7 * par3];
				
				var6[var8 + var7 * par3] = getWeightedBiomeFromList(netherBiomes);
            }
        }
        return var6;
    }
    
    private int getWeightedBiomeFromList(List<BiomeEntry> biomeList)
    {
    	return ((BiomeEntry)WeightedRandom.getItem(biomeList, (int)this.nextLong(WeightedRandom.getTotalWeight(biomeList) / 10) * 10)).biome.biomeID;
    }

}
