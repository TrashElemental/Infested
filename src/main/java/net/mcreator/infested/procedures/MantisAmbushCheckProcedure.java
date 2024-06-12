package net.mcreator.infested.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.infested.init.InfestedModMobEffects;

public class MantisAmbushCheckProcedure {
	public static void execute(Entity sourceentity) {
		if (sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt0 && _livEnt0.hasEffect(InfestedModMobEffects.AMBUSH.get())) == false && sourceentity.getPersistentData().getDouble("AmbushCooldown") == 0) {
			if (sourceentity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(InfestedModMobEffects.AMBUSH.get(), 300, 0, false, true));
			sourceentity.getPersistentData().putDouble("AmbushCooldown", 400);
		}
	}
}
