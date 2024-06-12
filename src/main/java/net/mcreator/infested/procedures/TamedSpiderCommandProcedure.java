package net.mcreator.infested.procedures;

import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class TamedSpiderCommandProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity.getPersistentData().getString("Command")).equals("Stay")) {
			entity.getPersistentData().putString("Command", "Follow");
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Spider will follow"), true);
		} else if ((entity.getPersistentData().getString("Command")).equals("Follow")) {
			entity.getPersistentData().putString("Command", "Wander");
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Spider will wander"), true);
		} else {
			entity.getPersistentData().putString("Command", "Stay");
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Spider will stay"), true);
		}
	}
}
