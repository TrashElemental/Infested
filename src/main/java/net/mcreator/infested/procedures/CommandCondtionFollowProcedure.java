package net.mcreator.infested.procedures;

import net.minecraft.world.entity.Entity;

public class CommandCondtionFollowProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getPersistentData().getString("Command")).equals("Follow")) {
			return true;
		}
		return false;
	}
}
