package com.Azeriaus.ArmsOfVyanter.blocks;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;

public class BlockOre extends BlockBase {

	Item toDrop;
	int minDropAmount = 1;
	int maxDropAmount = 0;
	
	public BlockOre(String name, Material material) {
		this(name, material, null, 1, 1);
	}
	
	public BlockOre(String name, Material material, Item toDrop) {
		this(name, material, toDrop, 1, 1);
	}
	
	public BlockOre(String name, Material material, Item toDrop, int dropAmount) {
		this(name, material, toDrop, dropAmount, dropAmount);
	}
	
	public BlockOre(String name, Material material, Item toDrop, int minDropAmount, int maxDropAmount) {
		super(name,material);
		this.toDrop = toDrop;
		this.minDropAmount = minDropAmount;
		this.maxDropAmount = maxDropAmount;
	}
	
	@Override
	
	public Item getItemDropped(IBlockState state, Random random, int i) {
	return toDrop==null?Item.getItemFromBlock(this):toDrop;
	}
	
	@Override
	public int quantityDroppedWithBonus(int fortune, Random random)
	{
	    if (fortune > 0 && Item.getItemFromBlock(this) != this.getItemDropped(this.getDefaultState(), random, fortune))
	    {
	        int i = random.nextInt(fortune + 2) - 1;
	        if (i < 0)
	        {
	            i = 0;
	        }
	        return this.quantityDropped(random) * (i + 1);
	    }
	    else
	    {
	       return this.quantityDropped(random);
	    }
	}

}
