
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.infested.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;

import net.mcreator.infested.InfestedMod;

public class InfestedModTabs {
	public static final DeferredRegister<CreativeModeTab> REGISTRY = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, InfestedMod.MODID);
	public static final RegistryObject<CreativeModeTab> INFESTED_CREATIVE_TAB = REGISTRY.register("infested_creative_tab",
			() -> CreativeModeTab.builder().title(Component.translatable("item_group.infested.infested_creative_tab")).icon(() -> new ItemStack(InfestedModItems.CHITIN_ARMOR_TRIM.get())).displayItems((parameters, tabData) -> {
				tabData.accept(InfestedModItems.SPIDER_EGG.get());
				tabData.accept(InfestedModItems.SPIDER_ARMOR_TRIM.get());
				tabData.accept(InfestedModItems.SPIDER_ARMOR_HELMET.get());
				tabData.accept(InfestedModItems.SPIDER_ARMOR_CHESTPLATE.get());
				tabData.accept(InfestedModItems.SPIDER_ARMOR_LEGGINGS.get());
				tabData.accept(InfestedModItems.SPIDER_ARMOR_BOOTS.get());
				tabData.accept(InfestedModBlocks.COBWEB_TRAP.get().asItem());
				tabData.accept(InfestedModItems.SILVERFISH_EGGS.get());
				tabData.accept(InfestedModItems.CHITIN_ARMOR_TRIM.get());
				tabData.accept(InfestedModItems.CHITIN_ARMOR_HELMET.get());
				tabData.accept(InfestedModItems.CHITIN_ARMOR_CHESTPLATE.get());
				tabData.accept(InfestedModItems.CHITIN_ARMOR_LEGGINGS.get());
				tabData.accept(InfestedModItems.CHITIN_ARMOR_BOOTS.get());
				tabData.accept(InfestedModItems.CHITIN.get());
				tabData.accept(InfestedModItems.RAW_GRUB.get());
				tabData.accept(InfestedModItems.FRIED_GRUB.get());
				tabData.accept(InfestedModItems.BUG_STEW.get());
				tabData.accept(InfestedModBlocks.SPINNERET.get().asItem());
				tabData.accept(InfestedModBlocks.SILVERFISH_TRAP.get().asItem());
				tabData.accept(InfestedModBlocks.CHITIN_BLOCK.get().asItem());
				tabData.accept(InfestedModBlocks.CHITIN_SLAB.get().asItem());
				tabData.accept(InfestedModBlocks.CHITIN_STAIRS.get().asItem());
				tabData.accept(InfestedModBlocks.CHITIN_WALL.get().asItem());
				tabData.accept(InfestedModBlocks.CHITIN_BRICKS.get().asItem());
				tabData.accept(InfestedModBlocks.CHITIN_BRICK_SLAB.get().asItem());
				tabData.accept(InfestedModBlocks.CHITIN_BRICK_STAIRS.get().asItem());
				tabData.accept(InfestedModBlocks.CHITIN_BRICK_WALL.get().asItem());
				tabData.accept(InfestedModBlocks.CHISELED_CHITIN_BRICKS.get().asItem());
				tabData.accept(InfestedModItems.GRUB_SPAWN_EGG.get());
				tabData.accept(InfestedModItems.BEETLE_SPAWN_EGG.get());
				tabData.accept(InfestedModItems.MANTIS_SPAWN_EGG.get());
				tabData.accept(InfestedModItems.ORCHID_MANTIS_SPAWN_EGG.get());
			})

					.build());
}
