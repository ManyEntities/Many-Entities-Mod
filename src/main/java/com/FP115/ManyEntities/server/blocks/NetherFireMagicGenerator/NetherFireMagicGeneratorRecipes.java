package com.FP115.ManyEntities.server.blocks.NetherFireMagicGenerator;

import java.util.ArrayList;

import com.FP115.ManyEntities.ManyEntitiesBase;

import com.FP115.ManyEntities.server.items.MEItems;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;

public class NetherFireMagicGeneratorRecipes {
	public static class Recipe {
		public final ItemStack input, output1, output2, output3;
		public final int time;
		public Recipe(ItemStack input, ItemStack output1, ItemStack output2, ItemStack output3, int time) {
			this.input = input;
			this.output1 = output1;
			this.output2 = output2;
			this.output3 = output3;
			this.time = time;
		}
	}

	private static final ArrayList<Recipe> list = new ArrayList<Recipe>();

	static {
		
		addRecipe(new ItemStack(Items.lava_bucket), new ItemStack(MEItems.netherfireenergy), new ItemStack(MEItems.lavafireenergy), new ItemStack(MEItems.yellowfireenergy), 400);
	}

	public static boolean addRecipe(ItemStack input, ItemStack output1, ItemStack output2, ItemStack output3, int time) {
		return list.add(new Recipe(input, output1, output2, output3, time));
	}

	public static Recipe getRecipe(ItemStack input) {
		if (list == null || list.size() == 0) return null;
		if (input == null) return null;

		for (Recipe recipe : list) {
			if (isMatch(recipe.input, input)) return recipe;
		}
		return null;
	}

	public static boolean isMatch(ItemStack itemStack, ItemStack input) {
		return itemStack == null || input == null ? false :
			itemStack.getItem() == input.getItem() &&
			(itemStack.getItemDamage() == OreDictionary.WILDCARD_VALUE || input.getItemDamage() == itemStack.getItemDamage()) &&
			(itemStack.hasTagCompound() ? ItemStack.areItemStackTagsEqual(itemStack, input) : true) &&
			0 <= input.stackSize - itemStack.stackSize;
	}
}
