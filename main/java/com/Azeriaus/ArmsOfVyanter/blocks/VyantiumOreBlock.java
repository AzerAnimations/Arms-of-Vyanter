package com.Azeriaus.ArmsOfVyanter.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class VyantiumOreBlock extends BlockOre{

	public VyantiumOreBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(5.0f);
		setResistance(15.0f);
		setHarvestLevel("pickaxe", 2);
		//setLightLevel(0.0f);
	}

	
}
