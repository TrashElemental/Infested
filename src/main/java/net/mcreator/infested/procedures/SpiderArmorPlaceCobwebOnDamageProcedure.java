package net.mcreator.infested.procedures;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.event.entity.living.LivingAttackEvent;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

import net.mcreator.infested.init.InfestedModItems;
import net.mcreator.infested.init.InfestedModBlocks;

import javax.annotation.Nullable;

@Mod.EventBusSubscriber
public class SpiderArmorPlaceCobwebOnDamageProcedure {
	@SubscribeEvent
	public static void onEntityAttacked(LivingAttackEvent event) {
		if (event != null && event.getEntity() != null) {
			execute(event, event.getEntity().level(), event.getEntity());
		}
	}

	public static void execute(LevelAccessor world, Entity entity) {
		execute(null, world, entity);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.LEGS) : ItemStack.EMPTY).getItem() == InfestedModItems.SPIDER_ARMOR_LEGGINGS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.FEET) : ItemStack.EMPTY).getItem() == InfestedModItems.SPIDER_ARMOR_BOOTS.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.CHEST) : ItemStack.EMPTY).getItem() == InfestedModItems.SPIDER_ARMOR_CHESTPLATE.get()
				&& (entity instanceof LivingEntity _entGetArmor ? _entGetArmor.getItemBySlot(EquipmentSlot.HEAD) : ItemStack.EMPTY).getItem() == InfestedModItems.SPIDER_ARMOR_HELMET.get()) {
			if (InfestedModBlocks.COBWEB_TRAP.get().defaultBlockState().canSurvive(world, BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()))) {
				world.setBlock(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ()), InfestedModBlocks.COBWEB_TRAP.get().defaultBlockState(), 3);
			} else if (InfestedModBlocks.COBWEB_TRAP.get().defaultBlockState().canSurvive(world, BlockPos.containing(entity.getX(), entity.getY() - 1, entity.getZ()))) {
				world.setBlock(BlockPos.containing(entity.getX(), entity.getY() - 1, entity.getZ()), InfestedModBlocks.COBWEB_TRAP.get().defaultBlockState(), 3);
			}
		}
	}
}
