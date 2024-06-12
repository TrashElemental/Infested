
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.infested.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.effect.MobEffect;

import net.mcreator.infested.potion.ParasiticInfectionMobEffect;
import net.mcreator.infested.potion.AmbushMobEffect;
import net.mcreator.infested.InfestedMod;

public class InfestedModMobEffects {
	public static final DeferredRegister<MobEffect> REGISTRY = DeferredRegister.create(ForgeRegistries.MOB_EFFECTS, InfestedMod.MODID);
	public static final RegistryObject<MobEffect> AMBUSH = REGISTRY.register("ambush", () -> new AmbushMobEffect());
	public static final RegistryObject<MobEffect> PARASITIC_INFECTION = REGISTRY.register("parasitic_infection", () -> new ParasiticInfectionMobEffect());
}
