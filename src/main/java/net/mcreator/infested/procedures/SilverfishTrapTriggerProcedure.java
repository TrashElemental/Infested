package net.mcreator.infested.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.infested.init.InfestedModEntities;

public class SilverfishTrapTriggerProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		world.destroyBlock(BlockPos.containing(x, y, z), false);
		for (int index0 = 0; index0 < Mth.nextInt(RandomSource.create(), 5, 8); index0++) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = InfestedModEntities.ATTACK_SILVERFISH.get().spawn(_level, BlockPos.containing(x, y, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
		}
	}
}
