package duke025011.minecraft.dukesmoarweapons.weapons;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;


//How about we continue this once we're done with a lot of melee weapons? Ya? Ya...
public class ItemRangedWeapon extends Item {

	public ItemRangedWeapon(Item.ToolMaterial material) {
		this.maxStackSize = 1;
		this.setMaxDamage(material.getMaxUses());
		this.setCreativeTab(CreativeTabs.tabCombat);
	}
}
