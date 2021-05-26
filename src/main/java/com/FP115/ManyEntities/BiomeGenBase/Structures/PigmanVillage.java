package com.FP115.ManyEntities.BiomeGenBase.Structures;

import java.util.Random;

import com.FP115.ManyEntities.ManyEntitiesBase;

import com.FP115.ManyEntities.server.blocks.MEBlocks;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.world.World;
import net.minecraft.world.biome.BiomeGenBase;

public class PigmanVillage {
	
	public static boolean yes = true;
	public PigmanVillage(){
		this.yes=true;
	}
	
	    public void generateNether(World world, Random random, int i2, int k2){
                int i = i2 + random.nextInt(15);
                int k = k2 + random.nextInt(15);

                int j = 44;

                //if(world.getBiomeGenForCoords(i, k).biomeName.equals(BiomeGenBase.desert.biomeName)) {
                

                if(random.nextInt(10)<=0){
                         boolean place = true;
                         if(place){

                        	for(int x = 0; x<32; x++) {
                        	for(int z = 0; z<32; z++) {
                        		//world.setBlock(i+x, j, k+z, ManyEntitiesBase.sproutednetherrack);
                        		if(yes){
                        			
                        		Block block = world.getBlock(x+i, j, z+k);
                        		Block osn = world.getBlock(x+i, j-1, z+k);
                        		boolean blockstay= true;
                        		
                        		

                        		if(blockstay){
                        			if(block==Blocks.air){
                        				if(osn!=Blocks.air && osn != Blocks.water && osn != Blocks.flowing_water && osn != Blocks.flowing_lava && osn != Blocks.lava && osn != MEBlocks.sproutednetherrack){
                        					world.setBlock(x+i, j, z+k, MEBlocks.sproutednetherrack);
                        					blockstay=false;
                        				}
                        				if(osn==Blocks.air){
                        					for(int y=0; y>-20;y--) {
                        						Block altosn = world.getBlock(x+i, j-1+y, z+k);
                        						if(altosn!=Blocks.air && altosn != Blocks.water && altosn != Blocks.flowing_water && altosn != Blocks.flowing_lava && altosn != Blocks.lava && altosn != MEBlocks.sproutednetherrack){
                        							world.setBlock(x+i, j+y, z+k, MEBlocks.sproutednetherrack);
                        							blockstay=false;
                        						}
                        					}
                        				}
                        			}
                        			else{
                        				blockstay=false;
                        			}
                        		
                        		}
                        			    	//PigmanHouse.generate(world, x+i, j, k+z);
 
                        	}
                        		
                        		
                        	
                      
                        ////////////////////	
                        	}
                        	}
                       	 boolean housestay1= true;
                       	 for(int y=0; y>-12; y--){
                       	 if(housestay1) {
                       		 Block tel = world.getBlock(i, j, k);
                       		 Block osn = world.getBlock(i, j-1, k);
                       		 if(osn!=Blocks.air) {
                       			 NetherStructures.generateCommonHouse(world, i, j, k);
                       			 housestay1=false;
                       		 }
                				 if(osn==Blocks.air){
               						Block altosn = world.getBlock(i, j-1+y, k);
               						if(altosn!=Blocks.air && altosn != Blocks.water && altosn != Blocks.flowing_water && altosn != Blocks.flowing_lava && altosn != Blocks.lava && tel!=Blocks.lava && tel!=Blocks.flowing_lava){                         
               							NetherStructures.generateCommonHouse(world, i, j+y, k);
               							housestay1=false;
               						
               					}
               				}
                       	 }
                       	 }
              }                 
                        	}
                        	}	      
}