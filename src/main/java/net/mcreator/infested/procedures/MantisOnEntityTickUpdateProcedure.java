package net.mcreator.infested.procedures;

import net.minecraft.world.entity.Entity;

public class MantisOnEntityTickUpdateProcedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if (entity.getPersistentData().getDouble("AmbushCooldown") != 0) {
			entity.getPersistentData().putDouble("AmbushCooldown", (entity.getPersistentData().getDouble("AmbushCooldown") - 1));
		}
	}
}
