package com.FP115.ManyEntities.server.Mobs.PigmanTrader;

import com.FP115.ManyEntities.server.Mobs.Abstract.AbstractTrader;

import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.village.MerchantRecipe;
import net.minecraft.village.MerchantRecipeList;
import net.minecraft.world.World;

public class PigmanTrader extends AbstractTrader {

	public PigmanTrader(World world) {
		super(world);
		this.isImmuneToFire = true;
	}
	@Override
	public void addRecipies(MerchantRecipeList list) {
		list.add(new MerchantRecipe(new ItemStack(Items.bone, 1), null, new ItemStack(Items.arrow)));
        list.add(new MerchantRecipe(new ItemStack(Blocks.pumpkin, 1), new ItemStack(Items.ender_eye, 1), new ItemStack(Items.coal, 17)));
	}
	@Override
	public boolean canDespawn() {
		return false;
	}
	@Override
	public void extraInteract(EntityPlayer p) {}
	@Override
	public int guiID() {
		return 2;
	}
	@Override
    protected void dropRareDrop(int p_70600_1_)
    {
        this.dropItem(Items.gold_ingot, 1);
    }
    public EnumCreatureAttribute getCreatureAttribute()
    {
        return EnumCreatureAttribute.UNDEAD;
    }
}