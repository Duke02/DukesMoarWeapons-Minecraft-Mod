package duke025011.minecraft.dukesmoarweapons.weapons;

import net.minecraft.item.Item;

public class Spear extends ItemWeapon {
	
	public Spear(Item.ToolMaterial material) {
		super(material, 4.5F);
		setUnlocalizedName(("spear"+material.name()).toLowerCase());
		name = ("spear"+material.name()).toLowerCase();
	}
}
