package com.FP115.ManyEntities.server.config;

import cpw.mods.fml.common.Mod.EventHandler;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ManyEntitiesConfig {
	public static int skeletonbiomeID;
	@EventHandler
	public static void ManyEntitiesconfigurate(File targ)
    {
		Configuration conf = new Configuration(targ);
		try{
			conf.load();
			skeletonbiomeID = conf.get("Biome IDs", "Skeleton Biome", 77).getInt(77);
		}
        finally
        {
            conf.save();
        }  
    }

}
