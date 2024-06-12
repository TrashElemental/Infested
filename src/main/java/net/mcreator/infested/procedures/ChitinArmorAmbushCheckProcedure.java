package net.mcreator.infested.procedures;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;

import net.mcreator.infested.init.InfestedModMobEffects;

public class ChitinArmorAmbushCheckProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("AmbushCooldown") != 0) {
			entity.getPersistentData().putDouble("AmbushCooldown", (entity.getPersistentData().getDouble("AmbushCooldown") - 1));
		}
		if (entity.isShiftKeyDown() && (entity instanceof LivingEntity _livEnt4 && _livEnt4.hasEffect(InfestedModMobEffects.AMBUSH.get())) == false && entity.getPersistentData().getDouble("AmbushCooldown") == 0) {
			if (entity instanceof LivingEntity _entity && !_entity.level().isClientSide())
				_entity.addEffect(new MobEffectInstance(InfestedModMobEffects.AMBUSH.get(), 300, 0, false, false));
			entity.getPersistentData().putDouble("AmbushCooldown", 600);
		}
	}
}
