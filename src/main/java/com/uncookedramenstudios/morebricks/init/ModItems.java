package com.uncookedramenstudios.morebricks.init;

import java.util.ArrayList;
import java.util.List;

import com.uncookedramenstudios.morebricks.items.ItemBase;
import com.uncookedramenstudios.morebricks.items.tools.ToolParingKnife;

import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;

public class ModItems {

	public static final List<Item> ITEMS = new ArrayList<Item>();

	//Items
	public static final Item VANADIUM = new ItemBase("vanadium");
		
	//Materials
	public static final ToolMaterial MATERIAL_VANADIUM = EnumHelper.addToolMaterial("material_vanadium", 3, 250, 8.0F, 3.0F, 10);
	
	//Tools
	public static final ItemSword PARING_KNIFE = new ToolParingKnife("paring_knife", MATERIAL_VANADIUM);
}
