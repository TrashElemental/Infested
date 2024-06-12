package net.mcreator.infested.procedures;

import net.minecraft.world.entity.Entity;

public class DisplayOrangeProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getPersistentData().getString("EyeColor")).equals("Orange")) {
			return true;
		}
		return false;
	}
}
