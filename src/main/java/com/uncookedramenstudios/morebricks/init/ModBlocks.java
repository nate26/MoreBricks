package com.uncookedramenstudios.morebricks.init;

import java.util.ArrayList;
import java.util.List;

import com.uncookedramenstudios.morebricks.blocks.VanadiumBlock;
import com.uncookedramenstudios.morebricks.blocks.VanadiumOre;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class ModBlocks {

	public static final List<Block> BLOCKS = new ArrayList<Block>();
	
	public static final Block VANADIUM_BLOCK = new VanadiumBlock("vanadium_block", Material.IRON);
	public static final Block VANADIUM_ORE = new VanadiumOre("vanadium_ore", Material.IRON);
}
