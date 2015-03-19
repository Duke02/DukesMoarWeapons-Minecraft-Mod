package duke025011.minecraft.dukesmoarweapons.weapons;

import net.minecraft.item.Item;

public class Scythe extends ItemWeapon {

	public Scythe(Item.ToolMaterial material) {
		super(material, 5.5F);
		setUnlocalizedName(("scythe"+material.name()).toLowerCase());
		name = ("scythe"+material.name()).toLowerCase();
	}
}
