package com.FP115.ManyEntities.server.entities;

import com.FP115.ManyEntities.ManyEntitiesBase;
import com.FP115.ManyEntities.server.Mobs.*;
import com.FP115.ManyEntities.server.Mobs.PigmanTrader.PigmanTrader;
import com.FP115.ManyEntities.server.entities.projectiles.EntityReviverPowder;
import com.FP115.ManyEntities.server.entities.projectiles.LargeEnergyBall;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;

public class MEEntities {
    public static void EntitiesReg() {
        ManyEntitiesBase.proxy.registerEntity(ZombieWarior.class, "ManySkeletonWarior", 0xA9A9A9, 0xCD5C5C);
        ManyEntitiesBase.proxy.registerEntity(SkeletonMinion.class, "SkeletonMinion", 0xA9A9A9, 0xCD5C5C);
        ManyEntitiesBase.proxy.registerUtilEntity(EntityReviverPowder.class, "entityreviverpowder");
        ManyEntitiesBase.proxy.registerEntity(PigmanTrader.class, "pigmantrader", 0xA9A9A9, 0xCD5C5C);
        ManyEntitiesBase.proxy.registerUtilEntity(LargeEnergyBall.class, "Energy Ball");
        ManyEntitiesBase.proxy.registerUtilEntity(ThreeHeadedSkeleton.class, "Three headed skeleton");
        ManyEntitiesBase.proxy.registerEntity(SkeletonWithGiantSlime.class, "SkeletonWithGiantSlime", 0xA9A9A9, 0xCD5C5C);
        ManyEntitiesBase.proxy.registerEntity(GiantPigman.class, "Giant pigman", 0xA9A9A9, 0xCD5C5C);
        ManyEntitiesBase.proxy.registerEntity(Crystaloid.class, "Crystaloid", 0xA9A9A9, 0xCD5C5C);//EnumCreatureType.creature	, BiomeGenBase.beach, BiomeGenBase.birchForestHills, BiomeGenBase.birchForest, BiomeGenBase.coldBeach, BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.deepOcean, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.iceMountains, BiomeGenBase.icePlains, BiomeGenBase.jungle, BiomeGenBase.jungleEdge, BiomeGenBase.
        //for (int i = 0; i < BiomeGenBase.getBiomeGenArray().length; i++) {
        //	BiomeGenBase biome = BiomeGenBase.getBiomeGenArray()[i];
        //
        //	if(biome !=null) {
        //		if(overworldBiome(biome)) {
        //	        EntityRegistry.addSpawn(Crystaloid.class, 100, 10, 15, EnumCreatureType.monster, biome);
        //		}

        //	}
        //}

        //EntityRegistry.addSpawn(Crystaloid.class, 89, 1, 5, EnumCreatureType.monster, BiomeGenBase.beach, BiomeGenBase.birchForestHills, BiomeGenBase.birchForest, BiomeGenBase.coldBeach, BiomeGenBase.coldTaiga, BiomeGenBase.coldTaigaHills, BiomeGenBase.deepOcean, BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.extremeHills, BiomeGenBase.extremeHillsEdge, BiomeGenBase.extremeHillsPlus, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.frozenOcean, BiomeGenBase.frozenRiver, BiomeGenBase.iceMountains, BiomeGenBase.icePlains, BiomeGenBase.jungle, BiomeGenBase.jungleEdge, BiomeGenBase.jungleHills, BiomeGenBase.megaTaiga, BiomeGenBase.megaTaigaHills, BiomeGenBase.mesa, BiomeGenBase.mesaPlateau, BiomeGenBase.mesaPlateau_F, BiomeGenBase.mushroomIsland, BiomeGenBase.mushroomIslandShore, BiomeGenBase.ocean, BiomeGenBase.plains, BiomeGenBase.river, BiomeGenBase.roofedForest, BiomeGenBase.savanna, BiomeGenBase.savannaPlateau, BiomeGenBase.stoneBeach, BiomeGenBase.swampland, BiomeGenBase.taiga, BiomeGenBase.taigaHills);//на сколько часто спавниться,минимальное количество за раз спавниться, максимальное количество за рз
        ManyEntitiesBase.proxy.registerEntity(GraagMob.class, "Graag", 0xA9A9A9, 0xCD5C5C);
        EntityRegistry.addSpawn(GraagMob.class, 75, 10, 11, EnumCreatureType.monster, BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.jungle, BiomeGenBase.icePlains);
    }
}
