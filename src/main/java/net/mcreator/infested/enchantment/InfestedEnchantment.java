
package net.mcreator.infested.enchantment;

import net.minecraftforge.common.crafting.CompoundIngredient;

import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

public class InfestedEnchantment extends Enchantment {
	public InfestedEnchantment(EquipmentSlot... slots) {
		super(Enchantment.Rarity.UNCOMMON, EnchantmentCategory.ARMOR_CHEST, slots);
	}

	@Override
	public int getMaxLevel() {
		return 2;
	}

	@Override
	public boolean canApplyAtEnchantingTable(ItemStack itemstack) {
		return CompoundIngredient.of(Ingredient.of(ItemTags.create(new ResourceLocation("forge:shields"))), Ingredient.of(ItemTags.create(new ResourceLocation("minecraft:shields"))),
				Ingredient.of(ItemTags.create(new ResourceLocation("neoforge:shields"))), Ingredient.of(ItemTags.create(new ResourceLocation("forge:chest_armor"))), Ingredient.of(ItemTags.create(new ResourceLocation("neoforge:chest_armor"))),
				Ingredient.of(ItemTags.create(new ResourceLocation("minecraft:chestplate")))).test(itemstack);
	}
}
