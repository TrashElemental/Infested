package net.mcreator.infested.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

import net.mcreator.infested.InfestedMod;

public class TamedSpiderSetFollowOnSpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		InfestedMod.queueServerWork(20, () -> {
			if (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) {
				entity.getPersistentData().putString("Command", "Follow");
				entity.getPersistentData().putString("EyeColor", "Green");
			}
		});
	}
}
