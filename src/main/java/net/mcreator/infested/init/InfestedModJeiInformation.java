
package net.mcreator.infested.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.Component;

import mezz.jei.api.registration.IRecipeRegistration;
import mezz.jei.api.constants.VanillaTypes;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.IModPlugin;

import java.util.List;

@JeiPlugin
public class InfestedModJeiInformation implements IModPlugin {
	@Override
	public ResourceLocation getPluginUid() {
		return new ResourceLocation("infested:information");
	}

	@Override
	public void registerRecipes(IRecipeRegistration registration) {
		registration.addIngredientInfo(List.of(new ItemStack(InfestedModItems.SPIDER_EGG.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.infested.jei_spider_egg_info"));
		registration.addIngredientInfo(List.of(new ItemStack(InfestedModBlocks.COBWEB_TRAP.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.infested.jei_cobweb_trap_info"));
		registration.addIngredientInfo(List.of(new ItemStack(InfestedModItems.SPIDER_ARMOR_HELMET.get()), new ItemStack(InfestedModItems.SPIDER_ARMOR_CHESTPLATE.get()), new ItemStack(InfestedModItems.SPIDER_ARMOR_LEGGINGS.get()),
				new ItemStack(InfestedModItems.SPIDER_ARMOR_BOOTS.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.infested.jei_spider_armor_info"));
		registration.addIngredientInfo(List.of(new ItemStack(InfestedModItems.CHITIN_ARMOR_HELMET.get()), new ItemStack(InfestedModItems.CHITIN_ARMOR_CHESTPLATE.get()), new ItemStack(InfestedModItems.CHITIN_ARMOR_LEGGINGS.get()),
				new ItemStack(InfestedModItems.CHITIN_ARMOR_BOOTS.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.infested.jei_chitin_armor_info"));
		registration.addIngredientInfo(List.of(new ItemStack(InfestedModItems.SILVERFISH_EGGS.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.infested.jei_silverfish_eggs_info"));
		registration.addIngredientInfo(List.of(new ItemStack(InfestedModBlocks.SILVERFISH_TRAP.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.infested.jei_silverfish_trap_info"));
		registration.addIngredientInfo(List.of(new ItemStack(InfestedModBlocks.SPINNERET.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.infested.jei_spinneret_info"));
		registration.addIngredientInfo(List.of(new ItemStack(InfestedModItems.RAW_GRUB.get())), VanillaTypes.ITEM_STACK, Component.translatable("jei.infested.jei_raw_grub_info"));
	}
}
