package net.mcreator.infested.procedures;

import net.minecraft.world.entity.Entity;

public class CommandConditionStayProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getPersistentData().getString("Command")).equals("Stay")) {
			return true;
		}
		return false;
	}
}
