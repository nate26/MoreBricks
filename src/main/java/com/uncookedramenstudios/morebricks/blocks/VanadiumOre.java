package com.uncookedramenstudios.morebricks.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class VanadiumOre extends BlockBase {

	public VanadiumOre(String name, Material material) {
		super(name, material);
		
		setSoundType(SoundType.STONE);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}

}
