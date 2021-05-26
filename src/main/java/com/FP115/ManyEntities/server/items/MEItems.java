package com.FP115.ManyEntities.server.items;


import com.FP115.ManyEntities.items.notes.FirstNote.FirstNote;
import com.FP115.ManyEntities.server.items.FireMagic.FireStaff;
import com.FP115.ManyEntities.server.items.FireMagic.LavaFireEnergy;
import com.FP115.ManyEntities.server.items.FireMagic.NetherFireEnergy;
import com.FP115.ManyEntities.server.items.FireMagic.YellowFireEnergy;
import com.FP115.ManyEntities.server.items.magiccape.MagicCape;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class MEItems {

    public static Item ancientpickaxe;
    public static Item stonehandle;
    public static Item lrianium_ingot;
    public static Item ancienthelmet;
    public static Item ancientplate;
    public static Item ancientpants;
    public static Item ancientboots;
    public static Item skeletonbook;
    public static Item iryasgem;
    public static Item firstnote;
    public static Item enchantedskeletonbook;
    public static Item darkessense;
    public static Item magicscepter;
    public static Item itemenergyball;
    public static Item magiccape;
    public static Item mebook;
    public static Item netherplantseed;
    public static Item netherberry;
    public static Item reviverpowder;
    public static Item itemreviverpowder;
    public static Item itemnedoor;
    public static Item lrianiumnugget, firestaff, knife, ash, yellowfireenergy, lavafireenergy, netherfireenergy;

    public static void MEItemsReg(){
        ///////////items///////////////
        skeletonbook = new SkeletonBook();
        GameRegistry.registerItem(skeletonbook, "skeletonbook");

        lrianium_ingot = new LrianiumIngot().setUnlocalizedName("lrianium_ingot");
        GameRegistry.registerItem(lrianium_ingot, "lrianium_ingot");

        iryasgem = new IruasGem();
        GameRegistry.registerItem(iryasgem, "iryasgem");

        enchantedskeletonbook = new EnchantedSkeletoBook();
        GameRegistry.registerItem(enchantedskeletonbook, "enchantedskeletonbook");

        darkessense = new DarkEssense();
        GameRegistry.registerItem(darkessense, "darkessense");

        ancientpickaxe = new AncientPickaxe().setUnlocalizedName("ancientpickaxe");
        GameRegistry.registerItem(ancientpickaxe, "ancientpickaxe");

        stonehandle = new StoneHandle().setUnlocalizedName("stonehandle");
        GameRegistry.registerItem(stonehandle, "stonehandle");

        ancienthelmet = new AncientArmor(0, 0).setUnlocalizedName("ancienthelmet").setTextureName("manyentities:ancienthelmet");
        ancientplate = new AncientArmor(0, 1).setUnlocalizedName("ancientplate").setTextureName("manyentities:ancientplate");
        ancientpants = new AncientArmor(0, 2).setUnlocalizedName("ancientpants").setTextureName("manyentities:ancientpants");
        ancientboots = new AncientArmor(0, 3).setUnlocalizedName("ancientboots").setTextureName("manyentities:ancientboots");
        GameRegistry.registerItem(ancienthelmet,"ancienthelmet");
        GameRegistry.registerItem(ancientplate,"ancientplate");
        GameRegistry.registerItem(ancientpants,"ancientpants");
        GameRegistry.registerItem(ancientboots,"ancientboots");

        firstnote = new FirstNote();
        GameRegistry.registerItem(firstnote, "firstnote");

        magicscepter = new MagicScepter();
        GameRegistry.registerItem(magicscepter, "magicscepter");

        itemenergyball = new ItemEnergyBall();
        GameRegistry.registerItem(itemenergyball, "itemenergyball");

        magiccape = new MagicCape(0, 0).setUnlocalizedName("magiccape");
        GameRegistry.registerItem(magiccape, "magiccape");

        mebook = new ManyEntitiesBook();
        //GameRegistry.registerItem(mebook, "manyentitiesbook");

        netherplantseed = new NetherPlantSeed();
        GameRegistry.registerItem(netherplantseed, "netherplantseed");

        netherberry = new NetherBerry();
        GameRegistry.registerItem(netherberry, "netherberry");

        reviverpowder = new ReviverPowder();
        GameRegistry.registerItem(reviverpowder, "reviverpowder");

        itemreviverpowder = new ItemReviverPowder();
        GameRegistry.registerItem(itemreviverpowder, "itemreviverpowder");

        itemnedoor = new ItemNetherDoor(Material.wood).setUnlocalizedName("netherdoor");
        GameRegistry.registerItem(itemnedoor, "itemmnetherdoor");

        firestaff = new FireStaff();
        GameRegistry.registerItem(firestaff, "firestaff");

        knife = new Knife();
        GameRegistry.registerItem(knife, "manyentities.knife");

        ash = new Ash();
        GameRegistry.registerItem(ash, "manyentities.ash");

        yellowfireenergy = new YellowFireEnergy();
        GameRegistry.registerItem(yellowfireenergy, "yellowfireenergy");

        lavafireenergy = new LavaFireEnergy();
        GameRegistry.registerItem(lavafireenergy, "lavafireenergy");

        netherfireenergy = new NetherFireEnergy();
        GameRegistry.registerItem(netherfireenergy, "netherfireenergy");
    }
}
