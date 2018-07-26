package com.Azeriaus.ArmsOfVyanter.init;

import java.util.ArrayList;
import java.util.List;

import com.Azeriaus.ArmsOfVyanter.items.ItemBase;
import com.Azeriaus.ArmsOfVyanter.items.tools.ToolSword;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();
	
	//MATERIALS
	public static final ToolMaterial OBLIVION = EnumHelper.addToolMaterial("oblivion", 3, 1000, 12.0f, 1000.00f, 22);
	public static final ToolMaterial SHADOW = EnumHelper.addToolMaterial("shadow", 3, 256, 12.0f, 14.0f, 26);
	
	public static final ItemSword KNIGHT_SWORD = new ToolSword("knight_sword", OBLIVION);
	public static final ItemSword SHADOW_BLADE = new ToolSword("shadow_blade", SHADOW);
	public static final Item ENDER_GEM = new ItemBase("ender_gem");
	public static final Item ENDER_DUST = new ItemBase("ender_dust");
	public static final Item RAGNOTIK_CHUNK = new ItemBase("ragnotik_chunk");
	public static final Item VYANTIUM_INGOT = new ItemBase("vyantium_ingot");
	public static final Item VYANTIUM_PLATE = new ItemBase("vyantium_plate");
	public static final Item SIGIL_OF_PLANTS = new ItemBase("sigil_of_plants");
	
//	static final CreativeTabs TAB_VYANTER_MOD = new CreativeTabs("tab_vyanter_mod") {
//
//		@Override
//		public ItemStack getTabIconItem() {
//			return new ItemStack(ENDER_GEM);
//		}
//		
//		@Override
//		public boolean hasSearchBar() {
//			return true;
//		}
//		
//	}.setBackgroundImageName("item_search.png");
}
