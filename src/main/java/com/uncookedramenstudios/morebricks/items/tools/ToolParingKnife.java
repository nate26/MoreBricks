package com.uncookedramenstudios.morebricks.items.tools;

import com.uncookedramenstudios.morebricks.Main;
import com.uncookedramenstudios.morebricks.init.ModItems;
import com.uncookedramenstudios.morebricks.util.IHasModel;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSword;

public class ToolParingKnife extends ItemSword implements IHasModel {

	public ToolParingKnife(String name, ToolMaterial material) {
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(CreativeTabs.MATERIALS);
		
		ModItems.ITEMS.add(this);
	}
	
	@Override
	public void registerModels() {
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
