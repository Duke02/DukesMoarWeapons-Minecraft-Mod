package duke025011.minecraft.dukesmoarweapons;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer.ItemRendererHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import duke025011.minecraft.dukesmoarweapons.materials.SharpenedMaterial;
import duke025011.minecraft.dukesmoarweapons.weapons.*;

@Mod(modid=Reference.MODID, name="Dukes Moar Weapons", version="0.0.1")
public class DukesMoarWeapons {
	
	//Instance of mod that Forge uses
	@Instance(value =Reference.MODID)
	public static DukesMoarWeapons instance;
	
	//Says where the client and server 'proxy' code is loaded is loaded.
	@SidedProxy(clientSide="Duke025011.minecraft.DukesMoarWeapons.client.ClientProxy", serverSide="Duke025011.minecraft.DukesMoarWeapons.CommonProxy")
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		
		
		battleaxeiron = new BattleAxe(Item.ToolMaterial.IRON);
		battleaxeemerald = new BattleAxe(Item.ToolMaterial.EMERALD);
		battleaxestone = new BattleAxe(Item.ToolMaterial.STONE);
		battleaxegold = new BattleAxe(Item.ToolMaterial.GOLD);
		battleaxewood = new BattleAxe(Item.ToolMaterial.WOOD);
		//The second parameter is on unique registry indentifier (not the displayed name)
		//Please don't use battleAxe.getUnlocalizedName(), or you will make Lex(?) sad
		GameRegistry.registerItem(battleaxeiron, "battleaxeiron");
		GameRegistry.registerItem(battleaxeemerald, "battleaxeemerald");
		GameRegistry.registerItem(battleaxestone, "battleaxestone");
		GameRegistry.registerItem(battleaxegold, "battleaxegold");
		GameRegistry.registerItem(battleaxewood, "battleaxewood");
		
		warhammerwood = new Warhammer(Item.ToolMaterial.WOOD);
		warhammerstone = new Warhammer(Item.ToolMaterial.STONE);
		warhammeriron = new Warhammer(Item.ToolMaterial.IRON);
		warhammergold = new Warhammer(Item.ToolMaterial.GOLD);
		warhammeremerald = new Warhammer(Item.ToolMaterial.EMERALD);
		
		GameRegistry.registerItem(warhammerwood, "warhammerwood");
		GameRegistry.registerItem(warhammerstone, "warhammerstone");
		GameRegistry.registerItem(warhammeriron, "warhammeriron");
		GameRegistry.registerItem(warhammergold, "warhammergold");
		GameRegistry.registerItem(warhammeremerald, "warhammeremerald");
		
		
		
		longswordwood = new LongSword(Item.ToolMaterial.WOOD);
		longswordstone = new LongSword(Item.ToolMaterial.STONE);
		longswordiron = new LongSword(Item.ToolMaterial.IRON);
		longswordgold = new LongSword(Item.ToolMaterial.GOLD);
		longswordemerald = new LongSword(Item.ToolMaterial.EMERALD);
		
		GameRegistry.registerItem(longswordwood, "longswordwood");
		GameRegistry.registerItem(longswordstone, "longswordstone");
		GameRegistry.registerItem(longswordiron, "longswordiron");
		GameRegistry.registerItem(longswordgold, "longswordgold");
		GameRegistry.registerItem(longswordemerald, "longswordemerald");
		
		
		
		staff = new Staff(Item.ToolMaterial.WOOD);
		bladedstaffstone = new Staff(Item.ToolMaterial.WOOD).MakeBladed(Item.ToolMaterial.STONE);
		bladedstaffiron = new Staff(Item.ToolMaterial.WOOD).MakeBladed(Item.ToolMaterial.IRON);
		bladedstaffgold = new Staff(Item.ToolMaterial.WOOD).MakeBladed(Item.ToolMaterial.GOLD);
		bladedstaffemerald = new Staff(Item.ToolMaterial.WOOD).MakeBladed(Item.ToolMaterial.EMERALD);
		
		GameRegistry.registerItem(staff, "staff");
		GameRegistry.registerItem(bladedstaffstone, "bladedstaffstone");
		GameRegistry.registerItem(bladedstaffiron, "bladedstaffiron");
		GameRegistry.registerItem(bladedstaffgold, "bladedstaffgold");
		GameRegistry.registerItem(bladedstaffemerald, "bladedstaffemerald");
		
		
		
		scythewood = new Scythe(Item.ToolMaterial.WOOD);
		scythestone = new Scythe(Item.ToolMaterial.STONE);
		scytheiron = new Scythe(Item.ToolMaterial.IRON);
		scythegold = new Scythe(Item.ToolMaterial.GOLD);
		scytheemerald = new Scythe(Item.ToolMaterial.EMERALD);
		
		GameRegistry.registerItem(scythewood, "scythewood");
		GameRegistry.registerItem(scythestone, "scythestone");
		GameRegistry.registerItem(scytheiron, "scytheiron");
		GameRegistry.registerItem(scythegold, "scythegold");
		GameRegistry.registerItem(scytheemerald, "scytheemerald");
		
		
		
		sharpenedwood = new SharpenedMaterial(Item.ToolMaterial.WOOD);
		sharpenedstone = new SharpenedMaterial(Item.ToolMaterial.STONE);
		sharpenediron = new SharpenedMaterial(Item.ToolMaterial.IRON);
		sharpenedgold = new SharpenedMaterial(Item.ToolMaterial.GOLD);
		sharpenedemerald = new SharpenedMaterial(Item.ToolMaterial.EMERALD);
		
		GameRegistry.registerItem(sharpenedwood, "sharpenedwood");
		GameRegistry.registerItem(sharpenedstone, "sharpenedstone");
		GameRegistry.registerItem(sharpenediron, "sharpenediron");
		GameRegistry.registerItem(sharpenedgold, "sharpenedgold");
		GameRegistry.registerItem(sharpenedemerald, "sharpenedemerald");
		
		
		
		spearwood = new Spear(Item.ToolMaterial.WOOD);
		spearstone = new Spear(Item.ToolMaterial.STONE);
		speariron = new Spear(Item.ToolMaterial.IRON);
		speargold = new Spear(Item.ToolMaterial.GOLD);
		spearemerald = new Spear(Item.ToolMaterial.EMERALD);
		
		GameRegistry.registerItem(spearwood, "spearwood");
		GameRegistry.registerItem(spearstone, "spearstone");
		GameRegistry.registerItem(speariron, "speariron");
		GameRegistry.registerItem(speargold, "speargold");
		GameRegistry.registerItem(spearemerald, "spearemerald");
		
		
		
		bladedwristwood = new BladedWrist(Item.ToolMaterial.WOOD);
		bladedwriststone = new BladedWrist(Item.ToolMaterial.STONE);
		bladedwristiron = new BladedWrist(Item.ToolMaterial.IRON);
		bladedwristgold = new BladedWrist(Item.ToolMaterial.GOLD);
		bladedwristemerald = new BladedWrist(Item.ToolMaterial.EMERALD);
		
		GameRegistry.registerItem(bladedwristwood, "bladedwristwood");
		GameRegistry.registerItem(bladedwriststone, "bladedwriststone");
		GameRegistry.registerItem(bladedwristiron, "bladedwristiron");
		GameRegistry.registerItem(bladedwristgold, "bladedwristgold");
		GameRegistry.registerItem(bladedwristemerald, "bladedwristemerald");
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event) {
		
		CraftingRecipes.loadRecipes();
		
		if(event.getSide() == Side.CLIENT)
		{
		    	RenderItem renderItem = Minecraft.getMinecraft().getRenderItem();
		    		
		    	renderItem.getItemModelMesher().register(battleaxeemerald, 0, new ModelResourceLocation(Reference.MODID + ":" + ((BattleAxe) battleaxeemerald).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(battleaxeiron, 0, new ModelResourceLocation(Reference.MODID + ":" + ((BattleAxe) battleaxeiron).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(battleaxestone, 0, new ModelResourceLocation(Reference.MODID + ":" + ((BattleAxe) battleaxestone).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(battleaxegold, 0, new ModelResourceLocation(Reference.MODID + ":" + ((BattleAxe) battleaxegold).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(battleaxewood, 0, new ModelResourceLocation(Reference.MODID + ":" + ((BattleAxe) battleaxewood).getName(), "inventory"));
		    	
		    	renderItem.getItemModelMesher().register(warhammerwood, 0, new ModelResourceLocation(Reference.MODID + ":" + ((Warhammer) warhammerwood).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(warhammerstone, 0, new ModelResourceLocation(Reference.MODID + ":" + ((Warhammer) warhammerstone).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(warhammeriron, 0, new ModelResourceLocation(Reference.MODID + ":" + ((Warhammer) warhammeriron).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(warhammergold, 0, new ModelResourceLocation(Reference.MODID + ":" + ((Warhammer) warhammergold).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(warhammeremerald, 0, new ModelResourceLocation(Reference.MODID + ":" + ((Warhammer) warhammeremerald).getName(), "inventory"));
		    	
		    	renderItem.getItemModelMesher().register(longswordwood, 0, new ModelResourceLocation(Reference.MODID + ":" + ((LongSword) longswordwood).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(longswordstone, 0, new ModelResourceLocation(Reference.MODID +":" + ((LongSword) longswordstone).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(longswordiron, 0, new ModelResourceLocation(Reference.MODID+":" + ((LongSword) longswordiron).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(longswordgold, 0, new ModelResourceLocation(Reference.MODID+":" + ((LongSword) longswordgold).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(longswordemerald, 0, new ModelResourceLocation(Reference.MODID+":" + ((LongSword) longswordemerald).getName(), "inventory"));
		    	
		    	renderItem.getItemModelMesher().register(staff, 0, new ModelResourceLocation(Reference.MODID+":" + ((Staff) staff).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(bladedstaffstone, 0, new ModelResourceLocation(Reference.MODID+":" + ((Staff) bladedstaffstone).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(bladedstaffiron, 0, new ModelResourceLocation(Reference.MODID+":" + ((Staff) bladedstaffiron).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(bladedstaffgold, 0, new ModelResourceLocation(Reference.MODID + ":" + ((Staff) bladedstaffgold).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(bladedstaffemerald, 0, new ModelResourceLocation(Reference.MODID + ":" + ((Staff) bladedstaffemerald).getName(), "inventory"));
		    	
		    	renderItem.getItemModelMesher().register(scythewood, 0, new ModelResourceLocation(Reference.MODID + ":" + ((Scythe) scythewood).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(scythestone, 0, new ModelResourceLocation(Reference.MODID + ":" + ((Scythe) scythestone).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(scytheiron, 0, new ModelResourceLocation(Reference.MODID + ":" + ((Scythe) scytheiron).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(scythegold, 0, new ModelResourceLocation(Reference.MODID + ":" + ((Scythe) scythegold).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(scytheemerald, 0, new ModelResourceLocation(Reference.MODID + ":" + ((Scythe) scytheemerald).getName(), "inventory"));
		    	
		    	renderItem.getItemModelMesher().register(sharpenedwood, 0, new ModelResourceLocation(Reference.MODID + ":" + ((SharpenedMaterial) sharpenedwood).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(sharpenedstone, 0, new ModelResourceLocation(Reference.MODID + ":" + ((SharpenedMaterial) sharpenedstone).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(sharpenediron, 0, new ModelResourceLocation(Reference.MODID + ":" + ((SharpenedMaterial) sharpenediron).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(sharpenedgold, 0, new ModelResourceLocation(Reference.MODID + ":" + ((SharpenedMaterial) sharpenedgold).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(sharpenedemerald, 0, new ModelResourceLocation(Reference.MODID + ":" + ((SharpenedMaterial) sharpenedemerald).getName(), "inventory"));
		    	
		    	renderItem.getItemModelMesher().register(spearwood, 0, new ModelResourceLocation(Reference.MODID + ":"+((Spear)spearwood).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(spearstone, 0, new ModelResourceLocation(Reference.MODID + ":"+((Spear)spearstone).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(speariron, 0, new ModelResourceLocation(Reference.MODID + ":"+((Spear)speariron).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(speargold, 0, new ModelResourceLocation(Reference.MODID + ":"+((Spear)speargold).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(spearemerald, 0, new ModelResourceLocation(Reference.MODID + ":"+((Spear)spearemerald).getName(), "inventory"));
		    	
		    	renderItem.getItemModelMesher().register(bladedwristwood, 0, new ModelResourceLocation(Reference.MODID + ":" + ((BladedWrist)bladedwristwood).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(bladedwriststone, 0, new ModelResourceLocation(Reference.MODID + ":" + ((BladedWrist)bladedwriststone).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(bladedwristiron, 0, new ModelResourceLocation(Reference.MODID + ":" + ((BladedWrist)bladedwristiron).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(bladedwristgold, 0, new ModelResourceLocation(Reference.MODID + ":" + ((BladedWrist)bladedwristgold).getName(), "inventory"));
		    	renderItem.getItemModelMesher().register(bladedwristemerald, 0, new ModelResourceLocation(Reference.MODID + ":" + ((BladedWrist)bladedwristemerald).getName(), "inventory"));
		}
		
		proxy.registerRenderers();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		//Sub Method
	}
	

	public static Item battleAxe;
	public static Item battleaxeiron;
	public static Item battleaxewood;
	public static Item battleaxestone;
	public static Item battleaxegold;
	public static Item battleaxeemerald;
	
	public static Item warhammer;
	public static Item warhammerwood;
	public static Item warhammerstone;
	public static Item warhammeriron;
	public static Item warhammergold;
	public static Item warhammeremerald;
	
	public static Item longsword;
	public static Item longswordwood;
	public static Item longswordstone;
	public static Item longswordiron;
	public static Item longswordgold;
	public static Item longswordemerald;
	
	public static Item staff;
	public static Item bladedstaffstone;
	public static Item bladedstaffiron;
	public static Item bladedstaffgold;
	public static Item bladedstaffemerald;
	
	public static Item scythewood;
	public static Item scythestone;
	public static Item scytheiron;
	public static Item scythegold;
	public static Item scytheemerald;
	
	public static Item sharpenedwood;
	public static Item sharpenedstone;
	public static Item sharpenediron;
	public static Item sharpenedgold;
	public static Item sharpenedemerald;
	
	public static Item spearwood;
	public static Item spearstone;
	public static Item speariron;
	public static Item speargold;
	public static Item spearemerald;
	
	public static Item bladedwristwood;
	public static Item bladedwriststone;
	public static Item bladedwristiron;
	public static Item bladedwristgold;
	public static Item bladedwristemerald;
	
	ItemStack ironStack = new ItemStack(Items.iron_ingot);
	ItemStack woodStack = new ItemStack(Blocks.planks);
	ItemStack stoneStack = new ItemStack(Blocks.stone);
	ItemStack cobbleStack = new ItemStack(Blocks.cobblestone);
	ItemStack goldStack = new ItemStack(Items.gold_ingot);
	ItemStack diamondStack = new ItemStack(Items.diamond);
	
	
	ItemStack stickStack = new ItemStack(Items.stick);
	
	
	
	
}
