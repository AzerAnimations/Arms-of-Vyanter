package com.Azeriaus.ArmsOfVyanter.items;

import com.Azeriaus.ArmsOfVyanter.Main;
import com.Azeriaus.ArmsOfVyanter.init.ModItems;
import com.Azeriaus.ArmsOfVyanter.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name) {
		
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.vyanterTab);
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(this, 0, "inventory");
		
	}

}
