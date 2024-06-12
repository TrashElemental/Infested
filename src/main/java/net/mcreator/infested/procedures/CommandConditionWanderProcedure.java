package net.mcreator.infested.procedures;

import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.Entity;

public class CommandConditionWanderProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getPersistentData().getString("Command")).equals("Wander") || (entity instanceof TamableAnimal _tamEnt ? _tamEnt.isTame() : false) == false) {
			return true;
		}
		return false;
	}
}
