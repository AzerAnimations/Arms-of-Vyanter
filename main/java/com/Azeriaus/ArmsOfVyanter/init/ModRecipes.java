package com.Azeriaus.ArmsOfVyanter.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(Items.ENDER_PEARL, new ItemStack(ModItems.ENDER_DUST, 1), 3.5f);
		GameRegistry.addSmelting(ModBlocks.VYANTIUM_ORE_BLOCK, new ItemStack(ModItems.VYANTIUM_INGOT, 1), 3.5f);
		
	}
	
}
