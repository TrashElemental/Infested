
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.infested.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.enchantment.Enchantment;

import net.mcreator.infested.enchantment.ParisitoidEnchantment;
import net.mcreator.infested.enchantment.InfestedEnchantment;
import net.mcreator.infested.enchantment.EnsnaringStrikeEnchantment;
import net.mcreator.infested.InfestedMod;

public class InfestedModEnchantments {
	public static final DeferredRegister<Enchantment> REGISTRY = DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, InfestedMod.MODID);
	public static final RegistryObject<Enchantment> INFESTED = REGISTRY.register("infested", () -> new InfestedEnchantment());
	public static final RegistryObject<Enchantment> PARASITOID = REGISTRY.register("parasitoid", () -> new ParisitoidEnchantment());
	public static final RegistryObject<Enchantment> ENSNARING_STRIKE = REGISTRY.register("ensnaring_strike", () -> new EnsnaringStrikeEnchantment());
}
