package com.Azeriaus.ArmsOfVyanter.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class RagnotikOreBlock extends BlockOre {

	public RagnotikOreBlock(String name, Material material, Item toDrop) {
		super(name, material, toDrop);
		setSoundType(SoundType.STONE);
		setHardness(3.0f);
		setResistance(45.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(15.0f);
		
	}

	
	
}
