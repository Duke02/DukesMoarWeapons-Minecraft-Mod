package duke025011.minecraft.dukesmoarweapons.weapons;

import net.minecraft.item.Item;

public class Staff extends ItemWeapon {
	
	public Staff(Item.ToolMaterial material) {
		super(material, 4.5F);
		setUnlocalizedName(("staff").toLowerCase());
		name = ("staff").toLowerCase();
	}
	
	public Staff MakeBladed(Item.ToolMaterial material) {
		this.material = material;
		this.attackDamage = 5.0F + material.getDamageVsEntity();
		setUnlocalizedName(("bladedstaff" + material.name()).toLowerCase());
		name = ("bladedstaff"+material.name()).toLowerCase();
		return this;
	}
}
