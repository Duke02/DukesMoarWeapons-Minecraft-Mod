package duke025011.minecraft.dukesmoarweapons.materials;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class SharpenedMaterial extends Item {
	
	protected Item.ToolMaterial material;
	protected String name;

	public SharpenedMaterial(Item.ToolMaterial material) {
		name = "Sharpened" + material.name();
		name = name.toLowerCase();
		setUnlocalizedName(name);
		setCreativeTab(CreativeTabs.tabMaterials);
	}
	
	public String getName() {
		return this.name;
	}
}
