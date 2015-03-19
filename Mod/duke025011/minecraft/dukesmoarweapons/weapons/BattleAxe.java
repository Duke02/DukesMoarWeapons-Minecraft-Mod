package duke025011.minecraft.dukesmoarweapons.weapons;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BattleAxe extends ItemWeapon {
	
	public BattleAxe(Item.ToolMaterial material) {
		super(material, 6.0F);
		setUnlocalizedName(("BattleAxe"+material.name()).toLowerCase());
		name = ("BattleAxe"+material.name()).toLowerCase();
	}
}
