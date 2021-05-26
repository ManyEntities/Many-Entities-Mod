package com.FP115.ManyEntities;

import java.util.HashMap;
import java.util.Map;

import com.FP115.ManyEntities.server.Mobs.Crystaloid;
import com.FP115.ManyEntities.server.Mobs.GiantPigman;
import com.FP115.ManyEntities.server.Mobs.GraagMob;
import com.FP115.ManyEntities.server.Mobs.SkeletonMinion;
import com.FP115.ManyEntities.server.Mobs.SkeletonWithGiantSlime;
import com.FP115.ManyEntities.server.Mobs.ThreeHeadedSkeleton;
import com.FP115.ManyEntities.server.Mobs.ZombieWarior;
import com.FP115.ManyEntities.server.Mobs.PigmanTrader.PigmanTrader;
import com.FP115.ManyEntities.server.blocks.TileEntitySkeletonTable;
import com.FP115.ManyEntities.server.blocks.Crystallizer.RenderItemCrystallizer;
import com.FP115.ManyEntities.server.blocks.Crystallizer.RenderTileEntityCrystallizer;
import com.FP115.ManyEntities.server.blocks.Crystallizer.TileEntityCrystallizer;
import com.FP115.ManyEntities.server.blocks.NoteReader.NoteReaderTileEntity;
import com.FP115.ManyEntities.server.blocks.NoteReader.RenderItemBlockNoteReader;
import com.FP115.ManyEntities.server.blocks.NoteReader.RenderTileEntityNoteReader;
import com.FP115.ManyEntities.server.blocks.blockcrystall.RenderItemBlockCrystall;
import com.FP115.ManyEntities.server.blocks.blockcrystall.RenderTileEntityCrystall;
import com.FP115.ManyEntities.server.blocks.blockcrystall.TileEntityCrystall;
import com.FP115.ManyEntities.server.blocks.magictable.MagicTableTileEntity;
import com.FP115.ManyEntities.server.blocks.magictable.RenderItemBlockMagicTable;
import com.FP115.ManyEntities.server.blocks.magictable.RenderMagicTableTileEntity;
import com.FP115.ManyEntities.boss.BossBarRender;
import com.FP115.ManyEntities.client.models.GiantPigmanModel;
import com.FP115.ManyEntities.client.models.GiantSlimeModel;
import com.FP115.ManyEntities.client.models.ModelCrystaloid;
import com.FP115.ManyEntities.client.models.ModelThreeHeadedSkeleton;
import com.FP115.ManyEntities.client.renders.FireMagicBarHelper;
import com.FP115.ManyEntities.client.renders.RenderCrystaloid;
import com.FP115.ManyEntities.client.renders.RenderEnergyBall;
import com.FP115.ManyEntities.client.renders.RenderEntityReviverPowder;
import com.FP115.ManyEntities.client.renders.RenderGiantPigman;
import com.FP115.ManyEntities.client.renders.RenderGraagMob;
import com.FP115.ManyEntities.client.renders.RenderPigmanTrader;
import com.FP115.ManyEntities.client.renders.RenderSkeletonMinion;
import com.FP115.ManyEntities.client.renders.RenderSkeletonWithGiantSlime;
import com.FP115.ManyEntities.client.renders.RenderThreeHeadedSkeleton;
import com.FP115.ManyEntities.client.renders.RenderZombieWarior;
import com.FP115.ManyEntities.server.entities.projectiles.EntityReviverPowder;
import com.FP115.ManyEntities.server.entities.projectiles.LargeEnergyBall;
import com.FP115.ManyEntities.items.magiccape.ModelMagicCape;
import com.FP115.ManyEntities.server.CommonProxy;
import com.FP115.ManyEntities.server.blocks.MEBlocks;
import com.FP115.ManyEntities.server.items.MEItems;
import com.FP115.ManyEntities.server.blocks.skeletontable.RenderItemBlockSkeletonTable;
import com.FP115.ManyEntities.server.blocks.skeletontable.RenderTileEntitySkeletonTable;


import cpw.mods.fml.client.registry.ClientRegistry;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.model.ModelSkeleton;
import net.minecraft.client.model.ModelZombie;
import net.minecraft.client.particle.EntityFX;
import net.minecraft.client.particle.EntitySmokeFX;
import net.minecraft.item.Item;
import net.minecraft.world.World;
import net.minecraftforge.client.MinecraftForgeClient;

public class ClientProxy extends CommonProxy
	{
	public static ModelBiped modelHelmet;
	public static final SimpleNetworkWrapper network = NetworkRegistry.INSTANCE.newSimpleChannel(ManyEntitiesBase.MODID);
	public void preInit() {
		super.preInit();
	}
	public static final Map<Item, ModelBiped> armorModels = new HashMap<Item, ModelBiped>();
	public void registerRenderers()
	{
		 ///////////////////Armor Render////////////////////////
		 ModelMagicCape modelmagiccape = new ModelMagicCape();
		 armorModels.put(MEItems.magiccape, modelmagiccape);
		 ///////////////////Entity Renderers///////////////////
		 ManyEntitiesBase.addSpecialEventBus(new BossBarRender());
		 RenderingRegistry.registerEntityRenderingHandler(GraagMob.class, new RenderGraagMob(new ModelBiped(), 0.75F));
		 RenderingRegistry.registerEntityRenderingHandler(GiantPigman.class, new RenderGiantPigman(new GiantPigmanModel(), 0.75F));
		 RenderingRegistry.registerEntityRenderingHandler(Crystaloid.class, new RenderCrystaloid(new ModelCrystaloid(), 0.75F));
		 RenderingRegistry.registerEntityRenderingHandler(ThreeHeadedSkeleton.class, new RenderThreeHeadedSkeleton(new ModelThreeHeadedSkeleton(), 0.75F));
		 RenderingRegistry.registerEntityRenderingHandler(SkeletonMinion.class, new RenderSkeletonMinion(new ModelSkeleton(), 0.75F));
		 RenderingRegistry.registerEntityRenderingHandler(ZombieWarior.class, new RenderZombieWarior(new ModelZombie(), 0.75F));
		 RenderingRegistry.registerEntityRenderingHandler(SkeletonWithGiantSlime.class, new RenderSkeletonWithGiantSlime(new GiantSlimeModel(), 0.75F));
		 RenderingRegistry.registerEntityRenderingHandler(LargeEnergyBall.class, new RenderEnergyBall(2));
		 RenderingRegistry.registerEntityRenderingHandler(PigmanTrader.class, new RenderPigmanTrader(new ModelZombie(), 0.5f));
		 RenderingRegistry.registerEntityRenderingHandler(EntityReviverPowder.class, new RenderEntityReviverPowder(0.5F));
		 ///////////////////////Registry//////////////////////////
		 ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCrystall.class, new RenderTileEntityCrystall());
		 MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(MEBlocks.blockcrystall), new RenderItemBlockCrystall());
			
		 ClientRegistry.bindTileEntitySpecialRenderer(TileEntitySkeletonTable.class, new RenderTileEntitySkeletonTable());
		 MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(MEBlocks.skeletontable), new RenderItemBlockSkeletonTable());
			
		 ClientRegistry.bindTileEntitySpecialRenderer(MagicTableTileEntity.class, new RenderMagicTableTileEntity());
		 MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(MEBlocks.magictable), new RenderItemBlockMagicTable());
		 
		 ClientRegistry.bindTileEntitySpecialRenderer(NoteReaderTileEntity.class, new RenderTileEntityNoteReader());
		 MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(MEBlocks.notereader), new RenderItemBlockNoteReader());
		 
		 ClientRegistry.bindTileEntitySpecialRenderer(TileEntityCrystallizer.class, new RenderTileEntityCrystallizer());
		 MinecraftForgeClient.registerItemRenderer(Item.getItemFromBlock(MEBlocks.crystallizer), new RenderItemCrystallizer());
	}

	public void init() {
		super.init();
	}
	
	@Override
    public void updateFireMagicBar(float amount) {
    	FireMagicBarHelper.getProperties(Minecraft.getMinecraft().thePlayer).setBarValue(amount);
    }
	/**Spawn particle**/
	@Override
	public void spawnParticles(World world, String name, double x, double y, double z, double x1, double y1, double z1  ){
		if(name=="faded"){
			EntityFX faded = new EntitySmokeFX(world, x, y, z, 0.0D, 0.0D, 0.0D);
			faded.setRBGColorF(0x137,0x90,0x0);// 0x248, 0x162, 0x0
			Minecraft.getMinecraft().effectRenderer.addEffect(faded);;
		}
	}
    /*0 = EntitySmokeFX, EntityAuraFX, EntitySuspendFX, EntityReddustFX, EntitySnowShovelFX and also EntityExplodeFX
      0 to 7 = EntityPortalFX and also EntityCloudFX
      19 to 22 = EntityRainFX and also EntityFishWake
      32 = EntityBubbleFX
      48 = EntityFlameFX    ///////////////////////////
      49 = EntityLavaFX
      64 = EntityNoteFX
      65 = EntityCrit2FX
      80 = EntityHeartFX
      81 = EntityAngryVillagerFX
      82 = EntityHappyVillagerFX
      144 = EntitySpellParticleFX.InstantFactory and also EntitySpellParticleFX.WitchFactory
      112, 113 = EntityDropParticleFX
      128 to 135 = EntitySpellParticleFX
      160 to 167 = EntityFireworksFX
      225 to 250 = EntityEnchantingTableParticleFX
    */
}
