package duke025011.minecraft.dukesmoarweapons.weapons;

import net.minecraft.item.Item;
import duke025011.minecraft.dukesmoarweapons.weapons.ItemWeapon;

public class LongSword extends ItemWeapon {
	
	public LongSword(Item.ToolMaterial material) {
		super(material, 5.0F);
		setUnlocalizedName(("longsword"+material.name()).toLowerCase());
		name = ("LongSword"+material.name()).toLowerCase();
	}
}
