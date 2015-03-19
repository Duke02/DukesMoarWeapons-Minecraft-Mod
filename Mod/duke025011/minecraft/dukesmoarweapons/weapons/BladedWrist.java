package duke025011.minecraft.dukesmoarweapons.weapons;

public class BladedWrist extends ItemWeapon {

	public BladedWrist(ToolMaterial material) {
		super(material, 3.5F);
		//don't forget to make top blade longer!
		setUnlocalizedName(("bladedwrist"+material.name()).toLowerCase());
		name = ("bladedwrist"+material.name()).toLowerCase();
	}

}
