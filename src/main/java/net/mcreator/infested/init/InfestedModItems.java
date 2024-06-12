
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.infested.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.ForgeSpawnEggItem;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.BlockItem;

import net.mcreator.infested.item.SpiderEggItem;
import net.mcreator.infested.item.SpiderArmorTrimItem;
import net.mcreator.infested.item.SpiderArmorItem;
import net.mcreator.infested.item.SilverfishEggsItem;
import net.mcreator.infested.item.RawGrubItem;
import net.mcreator.infested.item.FriedGrubItem;
import net.mcreator.infested.item.ChitinItem;
import net.mcreator.infested.item.ChitinArmorTrimItem;
import net.mcreator.infested.item.ChitinArmorArmorItem;
import net.mcreator.infested.item.BugStewItem;
import net.mcreator.infested.InfestedMod;

public class InfestedModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, InfestedMod.MODID);
	public static final RegistryObject<Item> SPIDER_EGG = REGISTRY.register("spider_egg", () -> new SpiderEggItem());
	public static final RegistryObject<Item> SPIDER_ARMOR_HELMET = REGISTRY.register("spider_armor_helmet", () -> new SpiderArmorItem.Helmet());
	public static final RegistryObject<Item> SPIDER_ARMOR_CHESTPLATE = REGISTRY.register("spider_armor_chestplate", () -> new SpiderArmorItem.Chestplate());
	public static final RegistryObject<Item> SPIDER_ARMOR_LEGGINGS = REGISTRY.register("spider_armor_leggings", () -> new SpiderArmorItem.Leggings());
	public static final RegistryObject<Item> SPIDER_ARMOR_BOOTS = REGISTRY.register("spider_armor_boots", () -> new SpiderArmorItem.Boots());
	public static final RegistryObject<Item> SPIDER_ARMOR_TRIM = REGISTRY.register("spider_armor_trim", () -> new SpiderArmorTrimItem());
	public static final RegistryObject<Item> COBWEB_TRAP = block(InfestedModBlocks.COBWEB_TRAP);
	public static final RegistryObject<Item> CHITIN = REGISTRY.register("chitin", () -> new ChitinItem());
	public static final RegistryObject<Item> CHITIN_ARMOR_HELMET = REGISTRY.register("chitin_armor_helmet", () -> new ChitinArmorArmorItem.Helmet());
	public static final RegistryObject<Item> CHITIN_ARMOR_CHESTPLATE = REGISTRY.register("chitin_armor_chestplate", () -> new ChitinArmorArmorItem.Chestplate());
	public static final RegistryObject<Item> CHITIN_ARMOR_LEGGINGS = REGISTRY.register("chitin_armor_leggings", () -> new ChitinArmorArmorItem.Leggings());
	public static final RegistryObject<Item> CHITIN_ARMOR_BOOTS = REGISTRY.register("chitin_armor_boots", () -> new ChitinArmorArmorItem.Boots());
	public static final RegistryObject<Item> CHITIN_ARMOR_TRIM = REGISTRY.register("chitin_armor_trim", () -> new ChitinArmorTrimItem());
	public static final RegistryObject<Item> SPINNERET = block(InfestedModBlocks.SPINNERET);
	public static final RegistryObject<Item> SILVERFISH_TRAP = block(InfestedModBlocks.SILVERFISH_TRAP);
	public static final RegistryObject<Item> SILVERFISH_EGGS = REGISTRY.register("silverfish_eggs", () -> new SilverfishEggsItem());
	public static final RegistryObject<Item> CHITIN_BLOCK = block(InfestedModBlocks.CHITIN_BLOCK);
	public static final RegistryObject<Item> CHITIN_SLAB = block(InfestedModBlocks.CHITIN_SLAB);
	public static final RegistryObject<Item> CHITIN_STAIRS = block(InfestedModBlocks.CHITIN_STAIRS);
	public static final RegistryObject<Item> CHITIN_WALL = block(InfestedModBlocks.CHITIN_WALL);
	public static final RegistryObject<Item> CHITIN_BRICKS = block(InfestedModBlocks.CHITIN_BRICKS);
	public static final RegistryObject<Item> CHITIN_BRICK_SLAB = block(InfestedModBlocks.CHITIN_BRICK_SLAB);
	public static final RegistryObject<Item> CHITIN_BRICK_STAIRS = block(InfestedModBlocks.CHITIN_BRICK_STAIRS);
	public static final RegistryObject<Item> CHITIN_BRICK_WALL = block(InfestedModBlocks.CHITIN_BRICK_WALL);
	public static final RegistryObject<Item> CHISELED_CHITIN_BRICKS = block(InfestedModBlocks.CHISELED_CHITIN_BRICKS);
	public static final RegistryObject<Item> RAW_GRUB = REGISTRY.register("raw_grub", () -> new RawGrubItem());
	public static final RegistryObject<Item> FRIED_GRUB = REGISTRY.register("fried_grub", () -> new FriedGrubItem());
	public static final RegistryObject<Item> BUG_STEW = REGISTRY.register("bug_stew", () -> new BugStewItem());
	public static final RegistryObject<Item> GRUB_SPAWN_EGG = REGISTRY.register("grub_spawn_egg", () -> new ForgeSpawnEggItem(InfestedModEntities.GRUB, -3361401, -7720655, new Item.Properties()));
	public static final RegistryObject<Item> BEETLE_SPAWN_EGG = REGISTRY.register("beetle_spawn_egg", () -> new ForgeSpawnEggItem(InfestedModEntities.BEETLE, -7271926, -14415607, new Item.Properties()));
	public static final RegistryObject<Item> MANTIS_SPAWN_EGG = REGISTRY.register("mantis_spawn_egg", () -> new ForgeSpawnEggItem(InfestedModEntities.MANTIS, -10965967, -7089603, new Item.Properties()));
	public static final RegistryObject<Item> ORCHID_MANTIS_SPAWN_EGG = REGISTRY.register("orchid_mantis_spawn_egg", () -> new ForgeSpawnEggItem(InfestedModEntities.ORCHID_MANTIS, -1270065, -13844, new Item.Properties()));

	// Start of user code block custom items
	// End of user code block custom items
	private static RegistryObject<Item> block(RegistryObject<Block> block) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties()));
	}
}
