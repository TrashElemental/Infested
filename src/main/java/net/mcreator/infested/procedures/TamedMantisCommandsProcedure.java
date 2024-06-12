package net.mcreator.infested.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

import net.mcreator.infested.init.InfestedModItems;

public class TamedMantisCommandsProcedure {
	public static void execute(Entity entity, Entity sourceentity) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity instanceof TamableAnimal _tamIsTamedBy && sourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)
				&& ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InfestedModItems.RAW_GRUB.get()) == false) {
			if ((entity.getPersistentData().getString("Command")).equals("Stay")) {
				entity.getPersistentData().putString("Command", "Follow");
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Mantis will follow"), true);
			} else if ((entity.getPersistentData().getString("Command")).equals("Follow")) {
				entity.getPersistentData().putString("Command", "Wander");
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Mantis will wander"), true);
			} else {
				entity.getPersistentData().putString("Command", "Stay");
				if (sourceentity instanceof Player _player && !_player.level().isClientSide())
					_player.displayClientMessage(Component.literal("Mantis will stay"), true);
			}
		}
	}
}
