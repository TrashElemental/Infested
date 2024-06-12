
package net.mcreator.infested.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.infested.procedures.AmbushEffectStartedappliedProcedure;

public class AmbushMobEffect extends MobEffect {
	public AmbushMobEffect() {
		super(MobEffectCategory.BENEFICIAL, -10774487);
	}

	@Override
	public void addAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		AmbushEffectStartedappliedProcedure.execute(entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
