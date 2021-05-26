package com.FP115.ManyEntities.server.gen.dimension.nether;

import net.minecraft.world.WorldType;
import net.minecraft.world.gen.layer.GenLayer;
import net.minecraft.world.gen.layer.GenLayerFuzzyZoom;
import net.minecraft.world.gen.layer.GenLayerVoronoiZoom;
import net.minecraft.world.gen.layer.GenLayerZoom;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.terraingen.WorldTypeEvent;

public class HellGenLayer extends GenLayer{

	public static GenLayer[] initializeAllBiomeGenerators(long seed, WorldType worldtype, int dim)
	{
		int biomesize = 3;
		if(dim == 1)
		{
			biomesize = 2;
		}

		//Hell and promised biome gen
		GenLayer obj = new GenLayerCreate(1L, false);
		obj = new GenLayerFuzzyZoom(2000L, (obj));
		for(int i = 1; i < 3; i++) { obj = new GenLayerFuzzyZoom(2000L + i, (obj)); }
		obj = GenLayerZoom.magnify(1000L, ((obj)), 0);
		obj = new GenLayerHellBiomes(200L, ((obj)));
		obj = GenLayerZoom.magnify(1000L, ((obj)), 2);
		for(int j = 0; j < biomesize; j++) { obj = new GenLayerZoom(1000L + j, (obj)); }
		GenLayerVoronoiZoom genlayervoronoizoom = new GenLayerVoronoiZoom(10L, ((obj)));
		(obj).initWorldGenSeed(seed);
		genlayervoronoizoom.initWorldGenSeed(seed);
		return (new GenLayer[] { obj, genlayervoronoizoom });
	}

	public HellGenLayer(long seed)
	{
	    super(seed);
	}

	public static byte getModdedBiomeSize(WorldType worldType, byte original)
	{
		WorldTypeEvent.BiomeSize event = new WorldTypeEvent.BiomeSize(worldType, original);
		MinecraftForge.TERRAIN_GEN_BUS.post(event);
		return event.newSize;
	}

	@Override
	public int[] getInts(int p_75904_1_, int p_75904_2_, int p_75904_3_, int p_75904_4_) {
		// TODO Auto-generated method stub
		return null;
	}

}
