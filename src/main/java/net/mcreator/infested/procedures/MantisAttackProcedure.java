package net.mcreator.infested.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingChangeTargetEvent;

import net.minecraft.world.entity.Entity;

import net.mcreator.infested.entity.OrchidMantisEntity;
import net.mcreator.infested.entity.MantisEntity;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class MantisAttackProcedure {
	@SubscribeEvent
	public static void onEntitySetsAttackTarget(LivingChangeTargetEvent event) {
		execute(event, event.getEntity());
	}

	public static void execute(Entity sourceentity) {
		execute(null, sourceentity);
	}

	private static void execute(@Nullable Event event, Entity sourceentity) {
		if (sourceentity == null)
			return;
		if (sourceentity instanceof MantisEntity || sourceentity instanceof OrchidMantisEntity) {
			MantisAmbushCheckProcedure.execute(sourceentity);
		}
	}
}
