package com.Azeriaus.ArmsOfVyanter.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class EnderGemBlock extends BlockBase{

	public EnderGemBlock(String name, Material material) {
		super(name, material);
		setSoundType(SoundType.STONE);
		setHardness(30.0f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 2);
		setLightLevel(7.0f);
		
	}

}
