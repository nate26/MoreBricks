package com.uncookedramenstudios.morebricks.init;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModRecipes {

	public static void init() {
		GameRegistry.addSmelting(ModBlocks.VANADIUM_ORE, new ItemStack(ModItems.VANADIUM, 1), 1.5f);
	}
}
