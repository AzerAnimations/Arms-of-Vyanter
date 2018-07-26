package com.Azeriaus.ArmsOfVyanter.blocks;

import com.Azeriaus.ArmsOfVyanter.Main;
import com.Azeriaus.ArmsOfVyanter.init.ModBlocks;
import com.Azeriaus.ArmsOfVyanter.init.ModItems;
import com.Azeriaus.ArmsOfVyanter.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel{

	public BlockBase(String name, Material material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.vyanterTab);
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels() {
		
		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
		
	}
	
}
