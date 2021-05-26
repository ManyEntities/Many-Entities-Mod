package com.FP115.ManyEntities.server;

import com.FP115.ManyEntities.server.blocks.FireMagicGenerator.TileEntityFireMagicGenerator;
import com.FP115.ManyEntities.server.blocks.NetherFireMagicGenerator.TileEntityNetherFireMagicGenerator;
import com.FP115.ManyEntities.server.blocks.NoteReader.NoteReaderTileEntity;
import com.FP115.ManyEntities.server.blocks.ObsidianFireMagicGenerator.TileEntityObsidianFireMagicGenerator;
import com.FP115.ManyEntities.server.blocks.MEBlocks;
import com.FP115.ManyEntities.server.items.MEItems;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class Crafts {
    public static void CraftsReg() {
        ///////////crafts///////////////
        //GameRegistry.addShapelessRecipe(new ItemStack(ManyEntitiesBase.borsch, 1), new Object[] {Items.beet, new ItemStack(ManyEntitiesBase.knife, 1, 32767)});
        GameRegistry.addRecipe(new ItemStack(MEBlocks.ancientjunglebricks, 2),

                new Object[]{

                        "###", "XYX", "###",

                        ('X'), Blocks.obsidian,
                        ('#'), Items.diamond,
                        ('Y'), Blocks.bedrock

                }

        );
        GameRegistry.addRecipe(new ItemStack(MEItems.skeletonbook, 1),

                new Object[]{

                        "XXX", "XYX", "#Z#",

                        ('X'), Items.bone,
                        ('#'), Items.rotten_flesh,
                        ('Y'), Items.skull,
                        ('Z'), Items.book

                }

        );
        GameRegistry.addShapelessRecipe(new ItemStack(MEBlocks.netherplanks, 4), new Object[] {MEBlocks.nethertreelog});
        GameRegistry.addShapedRecipe(new ItemStack(MEItems.itemnedoor), new Object[]{
                "xx ","xx ","xx ",
                ('x'), MEBlocks.netherplanks
        });
        GameRegistry.addShapedRecipe(new ItemStack(MEBlocks.netherstairs, 4), new Object[]{
                "x  ","xx ","xxx",
                ('x'), MEBlocks.netherplanks
        });
        GameRegistry.addRecipe(new ItemStack(MEBlocks.lrianium_block, 1),

                new Object[]{

                        "###", "###", "###",
                        ('#'), MEItems.lrianium_ingot

                }

        );
        GameRegistry.addRecipe(new ItemStack(MEBlocks.lrianiumstone, 8),

                new Object[]{

                        "###", "#Y#", "###",
                        ('Y'), MEItems.lrianium_ingot,
                        ('#'), Blocks.stone

                }

        );
        GameRegistry.addRecipe(new ItemStack(Items.skull, 1),

                new Object[]{

                        "###", "###", "###",
                        ('#'), Items.bone

                }

        );
        GameRegistry.addRecipe(new ItemStack(MEItems.iryasgem, 1),

                new Object[]{

                        "#X#", "XYX", "#X#",

                        ('X'), MEItems.lrianium_ingot,
                        ('#'), Items.diamond,
                        ('Y'), Items.emerald

                }

        );
        GameRegistry.addRecipe(new ItemStack(MEItems.firestaff, 1),

                new Object[]{

                        "  #", " Y ", "Y  ",

                        ('Y'), MEItems.stonehandle,
                        ('#'), Items.flint_and_steel

                }

        );
        GameRegistry.addShapelessRecipe(new ItemStack(MEItems.stonehandle, 2), new Object[] {Blocks.stone, Items.stick, Items.stick});
        GameRegistry.addSmelting(MEBlocks.lrianium_ore, new ItemStack(MEItems.lrianium_ingot, 1), 5.0F);
        ///////////Tile Entities/////////
        GameRegistry.registerTileEntity(NoteReaderTileEntity.class, "1notereadertileentity");
        GameRegistry.registerTileEntity(TileEntityFireMagicGenerator.class, "TileEntityFireMagicGenerator");
        GameRegistry.registerTileEntity(TileEntityObsidianFireMagicGenerator.class, "TileEntityObsidianFireMagicGenerator");
        GameRegistry.registerTileEntity(TileEntityNetherFireMagicGenerator.class, "netherfiremagicgeneratortileentity");
    }
}
