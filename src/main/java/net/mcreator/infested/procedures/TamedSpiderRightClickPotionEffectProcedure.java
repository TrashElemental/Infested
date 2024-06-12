package net.mcreator.infested.procedures;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;

public class TamedSpiderRightClickPotionEffectProcedure {
	public static void execute(Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SPIDER_EYE) {
			entity.getPersistentData().putString("PotionEffect", "Poison");
			itemstack.shrink(1);
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Spider will inflict Poison"), true);
		} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.FERMENTED_SPIDER_EYE) {
			entity.getPersistentData().putString("PotionEffect", "Weakness");
			itemstack.shrink(1);
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Spider will inflict Weakness"), true);
		} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.GLISTERING_MELON_SLICE) {
			entity.getPersistentData().putString("PotionEffect", "Damage");
			itemstack.shrink(1);
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Spider will inflict Instant Damage"), true);
		} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SUGAR) {
			entity.getPersistentData().putString("PotionEffect", "Slowness");
			itemstack.shrink(1);
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Spider will inflict Slowness"), true);
		} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == Items.SHULKER_SHELL) {
			entity.getPersistentData().putString("PotionEffect", "Levitation");
			itemstack.shrink(1);
			if (sourceentity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Spider will inflict Levitation"), true);
		}
	}
}
