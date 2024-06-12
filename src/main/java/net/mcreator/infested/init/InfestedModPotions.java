
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.infested.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.infested.InfestedMod;

public class InfestedModPotions {
	public static final DeferredRegister<Potion> REGISTRY = DeferredRegister.create(ForgeRegistries.POTIONS, InfestedMod.MODID);
	public static final RegistryObject<Potion> RESISTANCE_POTION = REGISTRY.register("resistance_potion", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 900, 0, false, true)));
	public static final RegistryObject<Potion> RESISTANCE_POTION_LONG = REGISTRY.register("resistance_potion_long", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 1800, 0, false, true)));
	public static final RegistryObject<Potion> RESISTANCE_POTION_STRONG = REGISTRY.register("resistance_potion_strong", () -> new Potion(new MobEffectInstance(MobEffects.DAMAGE_RESISTANCE, 440, 1, false, true)));
}
