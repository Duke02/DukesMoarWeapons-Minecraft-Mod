package duke025011.minecraft.dukesmoarweapons.weapons;

import java.util.Set;

import com.google.common.collect.Multimap;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ItemWeapon extends Item {

	protected float attackDamage;
	protected Item.ToolMaterial material;
	protected String name;
	
	public ItemWeapon(Item.ToolMaterial material, float damage) {
		this.material = material;
		this.maxStackSize = 1;
		this.setMaxDamage(material.getMaxUses());
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.attackDamage = damage + material.getDamageVsEntity();
	}
	
	public String getName() {
		return this.name;
	}
	
	public float getDamageVsEntity() {
		return this.material.getDamageVsEntity();
	}
	
	public float getStrVsBlock(ItemStack stack, Block block) {
		Material material = block.getMaterial();
		return material != Material.plants && material != Material.vine && material != Material.coral && material != Material.leaves && material != Material.gourd ? 1.0F : 1.5F;
	}
	
	public boolean hitEntity(ItemStack stack, EntityLivingBase target, EntityLivingBase attacker) {
		stack.damageItem(1, attacker);
		return true;
	}
	
	public boolean onBlockDestroyed(ItemStack stack, World worldIn, Block blockIn, BlockPos pos, EntityLivingBase playerIn) {
		if((double)blockIn.getBlockHardness(worldIn, pos) != 0.0D) {
			stack.damageItem(1, playerIn);
		}
		
		return true;
	}
	
	@SideOnly(Side.CLIENT)
	public boolean isFull3D() {
		return true;
	}
	
	public Item.ToolMaterial getToolMaterial() {
		return this.material;
	}
	
	public int getItemEnchantibility() {
		return this.material.getEnchantability();
	}
	
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair) {
		ItemStack mat = this.material.getRepairItemStack();
		if (mat != null && net.minecraftforge.oredict.OreDictionary.itemMatches(mat, repair, false)) return true;
		return super.getIsRepairable(toRepair, repair);
	}
	
	public Multimap getItemAttributeModifiers() {
		Multimap multimap = super.getItemAttributeModifiers();
		multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(itemModifierUUID, "Tool modifier", (double)this.getDamageVsEntity(), 0));
		return multimap;
	}
	
	private String weaponClass;
	public Set<String> getWeaponClasses(ItemStack stack) {
		return weaponClass != null ? com.google.common.collect.ImmutableSet.of(weaponClass) : super.getToolClasses(stack);
	}
}
