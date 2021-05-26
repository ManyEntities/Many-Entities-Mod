package com.FP115.ManyEntities;

import com.FP115.ManyEntities.BiomeGenBase.BiomeRegistry;
import com.FP115.ManyEntities.server.gen.dimension.nether.WorldProviderMEHell;
import com.FP115.ManyEntities.BiomeGenBase.OreGenerator.LrianiumOreGenerator;
import com.FP115.ManyEntities.BiomeGenBase.OreGenerator.NetherTreeGenerator;
import com.FP115.ManyEntities.BiomeGenBase.Structures.PigmanVillage;
import com.FP115.ManyEntities.BiomeGenBase.Structures.SkeletonDungeon;
import com.FP115.ManyEntities.BiomeGenBase.Structures.zoloto;
import com.FP115.ManyEntities.server.events.EventFireMagicBar;
import com.FP115.ManyEntities.server.network.MessageFireMagicBar;
import com.FP115.ManyEntities.boss.BossBarRender;
import com.FP115.ManyEntities.client.renders.FireMagicBarRenderer;
import com.FP115.ManyEntities.server.config.ManyEntitiesConfig;
import com.FP115.ManyEntities.server.CommonProxy;
import com.FP115.ManyEntities.server.Crafts;
import com.FP115.ManyEntities.server.blocks.MEBlocks;
import com.FP115.ManyEntities.server.entities.MEEntities;
import com.FP115.ManyEntities.server.items.MEItems;
import cpw.mods.fml.common.*;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.common.DimensionManager;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.util.EnumHelper;

import java.util.Random;


@Mod (modid = ManyEntitiesBase.MODID, name="Many Entities", version = "1.0.0", dependencies = "after:BiomesOPlenty;")
public class ManyEntitiesBase implements IWorldGenerator {
    public static final String MODID = "manyentities";



    public static LrianiumOreGenerator lrianiumoregenerator = new LrianiumOreGenerator();
    public static NetherTreeGenerator nethertreegenerator = new NetherTreeGenerator();
    public static CreativeTabs tabmanyentities = new TabManyEntities("17");
    public static final ToolMaterial AncientPick = EnumHelper.addToolMaterial("AncientPick", 3, -1, 100.0F, 33F, 11);



    public static zoloto zoloto_0 = new zoloto();
    public static SkeletonDungeon skeletondungeon_ = new SkeletonDungeon();
    public static SkeletonTree SkeletonTree = new SkeletonTree();
    public static PigmanVillage PigmanVillage= new PigmanVillage();




    @SidedProxy(modId="manyentities",clientSide = "com.FP115.ManyEntities.ClientProxy", serverSide = "com.FP115.ManyEntities.CommonProxy")
    public static CommonProxy proxy;
    @Instance("manyentities")
    public static ManyEntitiesBase instance;

    public static  SimpleNetworkWrapper network/* = NetworkRegistry.INSTANCE.newSimpleChannel(ManyEntitiesBase.MODID)*/;




    public void generate(Random random, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator, IChunkProvider chunkProvider) {

        chunkX = chunkX * 16;
        chunkZ = chunkZ * 16;
        if(world.provider.dimensionId==0)zoloto_0.generateSurface(world, random, chunkX, chunkZ);
        if(world.provider.dimensionId==0)skeletondungeon_.generateSurface(world, random, chunkX, chunkZ);
        if(world.provider.dimensionId==0)SkeletonTree.generateSurface(world, random, chunkX, chunkZ);
        //if(world.provider.dimensionId==-1)PigmanVillage.generateNether(world, random, chunkX, chunkZ);

    }


    @EventHandler
    public void preLoad(FMLInitializationEvent event )
    {

        proxy.registerRenderers();
        proxy.preLoad();
        GameRegistry.registerWorldGenerator(lrianiumoregenerator, 0);
        GameRegistry.registerWorldGenerator( this, 1);
        GameRegistry.registerWorldGenerator(nethertreegenerator, 0);

        MEBlocks.MEBlocksReg();
        MEItems.MEItemsReg();
        Crafts.CraftsReg();
        MEEntities.EntitiesReg();





        ////////////Biomes/////////////


        BiomeRegistry.register();
        if(Loader.isModLoaded("BiomesOPlenty")){
//			BOPBiomeManager.netherBiomes.add(new BiomeEntry(BiomeRegistry.biomegensproutedhell, 15));
//			BOPBiomeManager.netherBiomes.add(new BiomeEntry(BiomeRegistry.fadedhell, 21));
        }
        else {
            DimensionManager.unregisterDimension(-1);
            DimensionManager.registerProviderType(77, WorldProviderMEHell.class, false);
            DimensionManager.registerDimension(-1, 77);
        }

        proxy.registerRenderers();
        proxy.preLoad();
    }
    @EventHandler
    public void serverLoad(FMLServerStartingEvent event){
        NetworkRegistry.INSTANCE.registerGuiHandler(ManyEntitiesBase.instance, new ManyGuiHandler());
    }
    @EventHandler
    public void preInit(FMLPreInitializationEvent event){


        network = NetworkRegistry.INSTANCE.newSimpleChannel(ManyEntitiesBase.MODID);
        NetworkRegistry.INSTANCE.registerGuiHandler(ManyEntitiesBase.instance, new ManyGuiHandler());

        //network.registerMessage(OpenGuiEntityMessage.Handler.class, OpenGuiEntityMessage.class, 0, Side.SERVER);
        //network.registerMessage(OpenGuiEntityMessage.Handler.class, OpenGuiEntityMessage.class, 0, Side.CLIENT);
        ManyEntitiesConfig.ManyEntitiesconfigurate(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new FireMagicBarRenderer());
        MinecraftForge.EVENT_BUS.register(new EventFireMagicBar());
        FMLCommonHandler.instance().bus().register(new EventFireMagicBar());
        MinecraftForge.EVENT_BUS.register(new FireMagicBarRenderer());
        network.registerMessage(MessageFireMagicBar.Handler.class, MessageFireMagicBar.class, 0, Side.CLIENT);

        proxy.preInit();


    }
    @EventHandler
    public void init(FMLInitializationEvent event){
        //////////Events//////////////////

        proxy.init();
    }

    public static void addSpecialEventBus(BossBarRender o) {
        FMLCommonHandler.instance().bus().register(o);
    }
    //public static boolean overworldBiome(BiomeGenBase b) {
    //    List<SpawnListEntry> monsterList = ObfuscationReflectionHelper.getPrivateValue(BiomeGenBase.class, b, "as", "field_76761_J");
    //    for(SpawnListEntry e : monsterList) {
    //        if(e.entityClass == EntityZombie.class) return true;
    //    }
    //   return false;
    //}


}
