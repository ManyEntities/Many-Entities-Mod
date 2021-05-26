package com.FP115.ManyEntities.server.blocks;

import com.FP115.ManyEntities.ManyEntitiesBase;
import com.FP115.ManyEntities.server.blocks.Crystallizer.Crystallizer;
import com.FP115.ManyEntities.server.blocks.FireMagicGenerator.FireMagicGenerator;
import com.FP115.ManyEntities.server.blocks.NetherFireMagicGenerator.NetherFireMagicGenerator;
import com.FP115.ManyEntities.server.blocks.NoteReader.NoteReader;
import com.FP115.ManyEntities.server.blocks.ObsidianFireMagicGenerator.ObsidianFireMagicGenerator;
import com.FP115.ManyEntities.server.blocks.blockcrystall.BlockCrystall;
import com.FP115.ManyEntities.server.blocks.blockcrystall.TileEntityCrystall;
import com.FP115.ManyEntities.server.blocks.magictable.MagicTable;
import com.FP115.ManyEntities.server.blocks.magictable.MagicTableTileEntity;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;

public class MEBlocks {

    public static Block ancientjunglebricks;
    public static Block lrianium_ore;
    public static Block blockcrystall;
    public static Block skeletonbrick;
    public static Block skeletontable;
    public static BlockPane skeletonbars;
    public static Block magictable;
    public static Block notereader;
    public static Block netherplant;
    public static Block sproutednetherrack;
    public static Block netherleaves;
    public static Block nethertreelog;
    public static Block nethertreesapling;
    public static Block netherplanks;
    public static Block netherdoor;
    public static Block lrianium_block;
    public static Block netherstairs, lrianiumstone, fadednetherrack, jumptrap, firemagicgenerator, firestone, netherfiremagicgenerator, obsidianfiremagicgenerator
            , inflamedobsidian, crystallizer;

    public static void MEBlocksReg(){
        ///////////blocks//////////////
        ancientjunglebricks = new AncientJungleBricks();
        GameRegistry.registerBlock(ancientjunglebricks, "ancientjunglebricks");

        lrianium_ore = new LrianiumOre();
        GameRegistry.registerBlock(lrianium_ore, "lrianium_ore");

        blockcrystall = new BlockCrystall();
        GameRegistry.registerBlock(blockcrystall, "blockcrystall");
        GameRegistry.registerTileEntity(TileEntityCrystall.class, "TileEntityCrystall");

        skeletonbrick = new SkeletonBrick();
        GameRegistry.registerBlock(skeletonbrick, "skeletonbrick");

        skeletontable = new SkeletonTable();
        GameRegistry.registerBlock(skeletontable, "skeletontable");
        GameRegistry.registerTileEntity(TileEntitySkeletonTable.class, "TileEntitySkeletonTable");

        skeletonbars = new SkeletonBars();
        GameRegistry.registerBlock(skeletonbars, "skeletonbars");

        magictable = new MagicTable();
        GameRegistry.registerBlock(magictable, "magictable");
        GameRegistry.registerTileEntity(MagicTableTileEntity.class, "MagicTableTileEntity");

        notereader = new NoteReader();
        GameRegistry.registerBlock(notereader, "notereader");

        netherplant = new BlockNetherPlant();
        GameRegistry.registerBlock(netherplant, "netherplant");

        sproutednetherrack = new SproutedNetherrack();
        GameRegistry.registerBlock(sproutednetherrack, "sproutednetherrack");

        fadednetherrack = new FadedNetherrack();
        GameRegistry.registerBlock(fadednetherrack, "fadednetherrack");

        netherleaves = new NetherLeaves().setBlockName("nethertreeleaves").setCreativeTab(ManyEntitiesBase.tabmanyentities);
        GameRegistry.registerBlock(netherleaves, "netherleaves");

        nethertreelog = new NetherTreeLog().setBlockName("nethertreelog").setCreativeTab(ManyEntitiesBase.tabmanyentities);
        GameRegistry.registerBlock(nethertreelog, "nethertreelog");

        nethertreesapling = new NetherTreeSapling().setBlockName("nethertreesapling");
        GameRegistry.registerBlock(nethertreesapling, "nethertreesapling");

        netherplanks = new NetherPlanks();
        GameRegistry.registerBlock(netherplanks, "netherplanks");

        netherdoor = new NetherDoor(Material.wood);
        GameRegistry.registerBlock(netherdoor, "netherdoor");

        lrianium_block = new LrianiumBlock();
        GameRegistry.registerBlock(lrianium_block, "lrianium_block");

        netherstairs = new NetherStairs();
        GameRegistry.registerBlock(netherstairs, "netherstairs");

        lrianiumstone = new LrianiumStone();
        GameRegistry.registerBlock(lrianiumstone, "lrianiumstone");

        jumptrap = new JumpTrap();
        GameRegistry.registerBlock(jumptrap, "jumptrap");

        firemagicgenerator = new FireMagicGenerator();
        GameRegistry.registerBlock(firemagicgenerator, "firemagicgenerator");

        firestone = new FireStone();
        GameRegistry.registerBlock(firestone, "firestone");

        netherfiremagicgenerator = new NetherFireMagicGenerator();
        GameRegistry.registerBlock(netherfiremagicgenerator, "netherfiremagicgenerator");

        obsidianfiremagicgenerator = new ObsidianFireMagicGenerator();
        GameRegistry.registerBlock(obsidianfiremagicgenerator, "obsidianfiremagicgenerator");

        inflamedobsidian = new InflamedObsidian();
        GameRegistry.registerBlock(inflamedobsidian, "inflamedobsidian");

        crystallizer = new Crystallizer();
        GameRegistry.registerBlock(crystallizer, "manyentities.crystallizer");
    }
}
