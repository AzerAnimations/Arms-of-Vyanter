package com.Azeriaus.ArmsOfVyanter.items.tools;

import com.Azeriaus.ArmsOfVyanter.Main;
import com.Azeriaus.ArmsOfVyanter.init.ModItems;
import com.Azeriaus.ArmsOfVyanter.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolSword extends ItemSword implements IHasModel {

	public ToolSword(String name, ToolMaterial material) {
		super(material);
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
