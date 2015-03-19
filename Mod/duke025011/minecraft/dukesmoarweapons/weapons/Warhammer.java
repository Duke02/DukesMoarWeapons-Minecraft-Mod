package duke025011.minecraft.dukesmoarweapons.weapons;

import net.minecraft.item.Item;

public class Warhammer extends ItemWeapon {
	
	public Warhammer(Item.ToolMaterial material) {
		super(material, 7.0F);
		setUnlocalizedName(("warhammer"+material.name()).toLowerCase());
		name = ("WarHammer"+material.name()).toLowerCase();
	}
}
