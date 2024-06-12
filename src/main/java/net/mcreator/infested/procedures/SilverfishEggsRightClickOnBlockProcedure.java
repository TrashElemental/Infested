package net.mcreator.infested.procedures;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.TamableAnimal;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

import net.mcreator.infested.init.InfestedModEntities;
import net.mcreator.infested.entity.TamedSilverfishLongEntity;

import java.util.Comparator;

public class SilverfishEggsRightClickOnBlockProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (world.getBlockState(BlockPos.containing(x, y + 1, z)).canOcclude() == false) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = InfestedModEntities.TAMED_SILVERFISH_LONG.get().spawn(_level, BlockPos.containing(x, y + 1, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (((Entity) world.getEntitiesOfClass(TamedSilverfishLongEntity.class, AABB.ofSize(new Vec3(x, (y + 1), z), 1, 1, 1), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, (y + 1), z)).findFirst().orElse(null)) instanceof TamableAnimal _toTame && entity instanceof Player _owner)
				_toTame.tame(_owner);
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = InfestedModEntities.TAMED_SILVERFISH_LONG.get().spawn(_level, BlockPos.containing(x, y + 2, z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setYRot(world.getRandom().nextFloat() * 360F);
				}
			}
			if (((Entity) world.getEntitiesOfClass(TamedSilverfishLongEntity.class, AABB.ofSize(new Vec3(x, (y + 2), z), 1, 1, 1), e -> true).stream().sorted(new Object() {
				Comparator<Entity> compareDistOf(double _x, double _y, double _z) {
					return Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_x, _y, _z));
				}
			}.compareDistOf(x, (y + 2), z)).findFirst().orElse(null)) instanceof TamableAnimal _toTame && entity instanceof Player _owner)
				_toTame.tame(_owner);
			itemstack.shrink(1);
		}
	}
}
