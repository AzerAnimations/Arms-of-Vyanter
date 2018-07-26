package com.Azeriaus.ArmsOfVyanter.init;

import java.util.ArrayList;
import java.util.List;

import com.Azeriaus.ArmsOfVyanter.blocks.BlockBase;
import com.Azeriaus.ArmsOfVyanter.blocks.EnderGemBlock;
import com.Azeriaus.ArmsOfVyanter.blocks.RagnotikOreBlock;
import com.Azeriaus.ArmsOfVyanter.blocks.VyantiumOreBlock;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block ENDER_GEM_BLOCK = new EnderGemBlock("ender_gem_block", Material.IRON);
	public static final Block RAGNOTIK_ORE_BLOCK = new RagnotikOreBlock("ragnotik_ore_block", Material.ROCK, ModItems.RAGNOTIK_CHUNK);
	public static final Block VYANTIUM_ORE_BLOCK = new VyantiumOreBlock("vyantium_ore_block", Material.ROCK);
}
