package net.mcreator.infested.procedures;

import net.minecraft.world.entity.Entity;

public class DisplayBlueProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getPersistentData().getString("EyeColor")).equals("Blue")) {
			return true;
		}
		return false;
	}
}