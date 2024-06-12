package net.mcreator.infested.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.core.BlockPos;

import net.mcreator.infested.InfestedMod;

public class CobwebTrapBlockAddedProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		InfestedMod.queueServerWork(200, () -> {
			world.destroyBlock(BlockPos.containing(x, y, z), false);
		});
	}
}
