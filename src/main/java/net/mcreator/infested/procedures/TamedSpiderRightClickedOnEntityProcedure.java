package net.mcreator.infested.procedures;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.ItemTags;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.infested.init.InfestedModItems;

public class TamedSpiderRightClickedOnEntityProcedure {
	public static void execute(Entity entity, Entity sourceentity, ItemStack itemstack) {
		if (entity == null || sourceentity == null)
			return;
		if ((entity instanceof TamableAnimal _tamIsTamedBy && sourceentity instanceof LivingEntity _livEnt ? _tamIsTamedBy.isOwnedBy(_livEnt) : false)
				&& ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == InfestedModItems.RAW_GRUB.get()) == false) {
			if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("minecraft:dyes")))) {
				TamedSpiderRightClickDyesProcedure.execute(entity, sourceentity);
			} else if ((sourceentity instanceof LivingEntity _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).is(ItemTags.create(new ResourceLocation("infested:spidercanaccept")))) {
				TamedSpiderRightClickPotionEffectProcedure.execute(entity, sourceentity, itemstack);
			} else {
				TamedSpiderCommandProcedure.execute(entity, sourceentity);
			}
		}
	}
}
