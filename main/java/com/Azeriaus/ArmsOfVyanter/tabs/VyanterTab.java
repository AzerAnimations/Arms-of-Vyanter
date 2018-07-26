package com.Azeriaus.ArmsOfVyanter.tabs;

import com.Azeriaus.ArmsOfVyanter.init.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class VyanterTab extends CreativeTabs {
	
	public VyanterTab(String label) {
		super("vyanter_tab");
		//this.setBackgroundImageName("item_search.png");
	}

	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.ENDER_GEM);
	}
	
}
