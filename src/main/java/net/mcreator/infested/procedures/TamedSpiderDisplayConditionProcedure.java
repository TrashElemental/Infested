package net.mcreator.infested.procedures;

import net.minecraft.world.entity.Entity;

public class TamedSpiderDisplayConditionProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		if ((entity.getPersistentData().getString("EyeColor")).equals("Black") == false && (entity.getPersistentData().getString("EyeColor")).equals("Grey") == false && (entity.getPersistentData().getString("EyeColor")).equals("LightGrey") == false
				&& (entity.getPersistentData().getString("EyeColor")).equals("White") == false && (entity.getPersistentData().getString("EyeColor")).equals("Brown") == false
				&& (entity.getPersistentData().getString("EyeColor")).equals("Lime") == false && (entity.getPersistentData().getString("EyeColor")).equals("Yellow") == false && (entity.getPersistentData().getString("EyeColor")).equals("Red") == false
				&& (entity.getPersistentData().getString("EyeColor")).equals("Orange") == false && (entity.getPersistentData().getString("EyeColor")).equals("Pink") == false
				&& (entity.getPersistentData().getString("EyeColor")).equals("Magenta") == false && (entity.getPersistentData().getString("EyeColor")).equals("Purple") == false
				&& (entity.getPersistentData().getString("EyeColor")).equals("Blue") == false && (entity.getPersistentData().getString("EyeColor")).equals("LightBlue") == false
				&& (entity.getPersistentData().getString("EyeColor")).equals("Cyan") == false || (entity.getPersistentData().getString("EyeColor")).equals("Green")) {
			return true;
		}
		return false;
	}
}
