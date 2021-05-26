package com.FP115.ManyEntities.server;


import com.FP115.ManyEntities.ManyEntitiesBase;

import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.registry.EntityRegistry;
import net.minecraft.entity.EntityList;
import net.minecraft.entity.IMerchant;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class CommonProxy
{
	private static IMerchant theMerchant;
	private static EntityPlayer entityplayer;



	public void init()
    {

    }

	public void postInit(FMLPostInitializationEvent event) {
	}

	public void registerRenderers() {
		
	}

	public void preInit() {

		
	}

	public void preLoad() {
		
	}

	public void updateFireMagicBar(float amount){}
	/**Spawn particle**/
	public void spawnParticles(World world, String name, double x, double y, double z, double x1, double y1, double z1  ){}

	public static void registerUtilEntity(Class entityclass, String name) {
		int entityID = EntityRegistry.findGlobalUniqueEntityId();
		long seed = name.hashCode();
		EntityRegistry.registerGlobalEntityID(entityclass, name, entityID);
		EntityRegistry.registerModEntity(entityclass, name, entityID, ManyEntitiesBase.instance, 64, 1, true);
	}
	public static void registerEntity(Class entityClass, String name, int primaryColor, int secondaryColor)
	{
	  int entityID = EntityRegistry.findGlobalUniqueEntityId();
	  long seed = name.hashCode();
	   EntityRegistry.registerGlobalEntityID(entityClass, name, entityID);
	  EntityRegistry.registerModEntity(entityClass, name, entityID, ManyEntitiesBase.instance, 64, 1, true);
	  EntityList.entityEggs.put(Integer.valueOf(entityID), new EntityList.EntityEggInfo(entityID, primaryColor, secondaryColor));
	}

	




}
