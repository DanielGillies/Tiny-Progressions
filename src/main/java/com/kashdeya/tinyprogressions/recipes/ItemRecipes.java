package com.kashdeya.tinyprogressions.recipes;

import com.kashdeya.tinyprogressions.handlers.ArmorHandler;
import com.kashdeya.tinyprogressions.handlers.ConfigHandler;
import com.kashdeya.tinyprogressions.inits.TechBlocks;
import com.kashdeya.tinyprogressions.inits.TechItems;
import com.kashdeya.tinyprogressions.properties.EnumDustColor;
import com.kashdeya.tinyprogressions.util.RecipeRegistry;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class ItemRecipes {
	
		public static void init() {
			System.out.println("load item init");
			// Nether
			if (ConfigHandler.nether_rod){
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.nether_rod, 4), new Object[] {
						"i",
						"i",
							Character.valueOf('i'), TechBlocks.soul_sandstone
				});
			}
			// bsc
			if (ConfigHandler.bsc_rod) {
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.bsc_rod, 4), new Object[] {
						"i",
						"i",
							Character.valueOf('i'), TechBlocks.compressed_sugar_cane
				});
			}
			
			// Glowstone Dust
			if (ConfigHandler.ColorGlowstone)
			{
				System.out.println("load item init");
				for(int i = 0; i < EnumDustColor.values().length; i++)
				{
					RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.colored_dust, 8, i), new Object[] {
						"ddd",
						"dgd",
						"ddd",
							Character.valueOf('g'), Items.GLOWSTONE_DUST,
							Character.valueOf('d'), EnumDustColor.values()[i].getCraftingOredict()
					});
					
					System.out.println("= TP LOGGING =");
					System.out.println("" + EnumDustColor.values()[i].getCraftingOredict());
					System.out.println("==============");
				}
			}
			
			// Watering Cans
			if (ConfigHandler.WateringCan) {
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.watering_can), new Object[] {
						"id ",
						"iwi",
						" i ",
							Character.valueOf('i'), "ingotIron",
							Character.valueOf('d'), "dyeWhite",
							Character.valueOf('w'), Items.WATER_BUCKET
				});
			}
			if (ConfigHandler.WateringCanUpgrade && ConfigHandler.WateringCan) {
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.watering_can_upgrade), new Object[] {
						"on ",
						"owo",
						" o ",
							Character.valueOf('o'), "ingotReinforcedObsidian",
							Character.valueOf('n'), Items.NETHER_STAR,
							Character.valueOf('w'), TechItems.watering_can
				});
			}
			
			// Medkit
			if (ConfigHandler.MedKit) {
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.med_kit), new Object[] {
						"prp",
						"rgr",
						"lrl",
							Character.valueOf('p'), "paper",
							Character.valueOf('r'), "dyeRed",
							Character.valueOf('l'), "leather",
							Character.valueOf('g'), Items.SPECKLED_MELON
				});
			}
			
			// Ender Dust
			if (ConfigHandler.ender_ore) {
				RecipeRegistry.addShapedRecipe(new ItemStack(Items.ENDER_PEARL), new Object[] {
						"ee",
						"ee",
							Character.valueOf('e'), "dustEnder"
				});
			}
			
			// Medkit
			if (ConfigHandler.repair_tablet) {
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.repair_tablet), new Object[] {
						"plp",
						"rgr",
						"prp",
							Character.valueOf('p'), TechBlocks.hardened_stone,
							Character.valueOf('r'), Blocks.BROWN_GLAZED_TERRACOTTA,
							Character.valueOf('l'), Items.NETHER_STAR,
							Character.valueOf('g'), TechItems.redstone_ingot
				});
			}
			
			if (ArmorHandler.lava_armor) {
				RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.lava_crystal,  8), new Object[] {
						"sss",
						"sbs",
						"sss",
							Character.valueOf('s'), TechItems.reinforced_obsidian_ingot,
							Character.valueOf('b'), Items.LAVA_BUCKET
				});
				RecipeRegistry.addShapedRecipe(new ItemStack(Items.LAVA_BUCKET), new Object[] {
						"sss",
						"sbs",
						"sss",
							Character.valueOf('b'), Items.BUCKET,
							Character.valueOf('s'), TechItems.lava_crystal
				});
			}
			
			// Tiny Coal & Charcoal
			if (ConfigHandler.lava_block_recipe) {
				RecipeRegistry.addShapelessRecipe(new ItemStack(TechItems.tiny_charcoal, 8), new Object[] {
						new ItemStack(Items.COAL, 1, 1)
				});
				RecipeRegistry.addShapedRecipe(new ItemStack(Items.COAL, 1, 1), new Object[] {
						"sss",
						"s s",
						"sss",
							Character.valueOf('s'), TechItems.tiny_charcoal
				});
				RecipeRegistry.addShapelessRecipe(new ItemStack(TechItems.tiny_coal, 8), new Object[] {
						Items.COAL
				});
				RecipeRegistry.addShapedRecipe(new ItemStack(Items.COAL), new Object[] {
						"sss",
						"s s",
						"sss",
							Character.valueOf('s'), TechItems.tiny_coal
				});
			}
			
			// Chainmail part
			if (ArmorHandler.chain_armor){
				RecipeRegistry.addShapelessRecipe(new ItemStack(TechItems.chainmail_part, 2), new Object[] {
						Items.IRON_INGOT, TechItems.stone_hammer
				});
			}
			
			// Can not be turned off.
			RecipeRegistry.addShapedRecipe(new ItemStack(TechItems.stone_hammer), new Object[] {
					"ccc",
					"isi",
					" s ",
						Character.valueOf('i'), Items.STRING,
						Character.valueOf('s'), Items.STICK,
						Character.valueOf('c'), "stone"
			});
			
		}

}
