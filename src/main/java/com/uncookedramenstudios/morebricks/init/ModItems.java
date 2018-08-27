package com.uncookedramenstudios.morebricks.init;

import java.util.ArrayList;
import java.util.List;

import com.uncookedramenstudios.morebricks.items.ItemBase;
import com.uncookedramenstudios.morebricks.items.tools.ToolParingKnife;
import com.uncookedramenstudios.morebricks.items.tools.ToolAxe;
import com.uncookedramenstudios.morebricks.items.tools.ToolHoe;
import com.uncookedramenstudios.morebricks.items.tools.ToolPickaxe;
import com.uncookedramenstudios.morebricks.items.tools.ToolShovel;
import com.uncookedramenstudios.morebricks.items.tools.ToolSword;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();

	//Items
	public static final Item VANADIUM = new ItemBase("vanadium");
		
	//Materials
	public static final ToolMaterial MATERIAL_VANADIUM = EnumHelper.addToolMaterial("material_vanadium", 2, 500, 6.0F, 2.0F, 14);
	
	//Tools
	public static final ItemSword PARING_KNIFE = new ToolParingKnife("paring_knife", MATERIAL_VANADIUM);
	public static final ItemSword VANADIUM_SWORD = new ToolSword("vanadium_sword", MATERIAL_VANADIUM);
	public static final ItemSpade VANADIUM_SHOVEL = new ToolShovel("vanadium_shovel", MATERIAL_VANADIUM);
	public static final ItemPickaxe VANADIUM_PICKAXE = new ToolPickaxe("vanadium_pickaxe", MATERIAL_VANADIUM);
	public static final ItemAxe VANADIUM_AXE = new ToolAxe("vanadium_axe", MATERIAL_VANADIUM);
	public static final ItemHoe VANADIUM_HOE = new ToolHoe("vanadium_hoe", MATERIAL_VANADIUM);
}
