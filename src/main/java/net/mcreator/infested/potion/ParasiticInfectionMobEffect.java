
package net.mcreator.infested.potion;

import net.minecraft.world.entity.ai.attributes.AttributeMap;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.effect.MobEffectCategory;
import net.minecraft.world.effect.MobEffect;

import net.mcreator.infested.procedures.ParasiticInfectionEffectExpiresProcedure;

public class ParasiticInfectionMobEffect extends MobEffect {
	public ParasiticInfectionMobEffect() {
		super(MobEffectCategory.HARMFUL, -13434109);
	}

	@Override
	public void removeAttributeModifiers(LivingEntity entity, AttributeMap attributeMap, int amplifier) {
		super.removeAttributeModifiers(entity, attributeMap, amplifier);
		ParasiticInfectionEffectExpiresProcedure.execute(entity.level(), entity);
	}

	@Override
	public boolean isDurationEffectTick(int duration, int amplifier) {
		return true;
	}
}
