package com.FP115.ManyEntities.BiomeGenBase;

import java.util.Random;

import com.FP115.ManyEntities.BiomeGenBase.Plants.Tree12345;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.monster.EntityWitch;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.feature.WorldGenAbstractTree;
import net.minecraft.world.gen.feature.WorldGenTaiga2;
import net.minecraftforge.common.BiomeDictionary;

public class SkeletonBiome extends BiomeGenBase {
	private WorldGenAbstractTree pineTree = new WorldGenTaiga2(false);
    private WorldGenAbstractTree bubblegum = new Tree12345(false);

	public SkeletonBiome(int id) {
		super(id);

		this.setBiomeName("Skeleton Biome");
		this.topBlock = Blocks.grass;
		this.fillerBlock = Blocks.dirt;
		this.theBiomeDecorator.generateLakes = true;
		this.theBiomeDecorator.treesPerChunk = 1;
		this.rainfall = 10F;
        this.theBiomeDecorator.grassPerChunk = 2;
        this.theBiomeDecorator.mushroomsPerChunk = -1;
        //setDisableRain();
        setHeight(new BiomeGenBase.Height(1.5F, 0.5F));
        this.spawnableCreatureList.clear();
        this.spawnableCreatureList.add(new SpawnListEntry(EntityWitch.class, 10, 4, 4));

        this.spawnableMonsterList.add(new SpawnListEntry(EntityWitch.class, 10, 4, 4));
        BiomeDictionary.registerBiomeType(this, BiomeDictionary.Type.FOREST, BiomeDictionary.Type.MAGICAL);
        this.waterColorMultiplier = 0x708090;
		this.setHeight(new BiomeGenBase.Height(0.125F, 0.05F));
        
	}
	//public WorldGenerator getRandomWorldGenForTrees(Random par1Random) {
	//	return new Tree12345(boolean);
	//}
	@Override
	@SideOnly(Side.CLIENT)
	public int getBiomeGrassColor(int par1, int par2, int par3)
	{
		return 	0x708090;
	}

	@Override
	@SideOnly(Side.CLIENT)
	public int getBiomeFoliageColor(int par1, int par2, int par3)
	{
		return 0x30217A;
	}
	@Override
    @SideOnly(Side.CLIENT)
    public int getSkyColorByTemp(float wat)
    {
        return 0x545454;
    }
	//@Override
	//public void decorate(World world, Random rand, int chunkX, int chunkZ)
    //{
    // 
    //}

	
    public WorldGenAbstractTree func_150567_a(Random rand)
    {
        if(rand.nextBoolean())
            return pineTree;
        else
            return bubblegum;
    }


}
