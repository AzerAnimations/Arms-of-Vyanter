package com.Azeriaus.ArmsOfVyanter;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

import com.Azeriaus.ArmsOfVyanter.init.ModRecipes;
import com.Azeriaus.ArmsOfVyanter.proxy.CommonProxy;
import com.Azeriaus.ArmsOfVyanter.tabs.VyanterTab;
import com.Azeriaus.ArmsOfVyanter.util.Reference;
import com.Azeriaus.ArmsOfVyanter.worldgen.OreGen;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class Main {

	public static final CreativeTabs vyanterTab = new VyanterTab("vyanter_tab");
	
	@Instance
	public static Main instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.COMMON_PROXY_CLASS)
	public static CommonProxy proxy;
	
	@EventHandler
	public static void PreInit(FMLPreInitializationEvent event) {
		
	}
	
	@EventHandler
	public static void init(FMLInitializationEvent event) {
		ModRecipes.init();
		GameRegistry.registerWorldGenerator(new OreGen(), 0);
	}
	
	@EventHandler
	public static void Postinit(FMLPostInitializationEvent event) {
		
	}
}
