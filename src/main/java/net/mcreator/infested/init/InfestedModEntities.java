
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.infested.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;

import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;

import net.mcreator.infested.entity.TamedSpiderEntity;
import net.mcreator.infested.entity.TamedSilverfishLongEntity;
import net.mcreator.infested.entity.TamedSilverfishEntity;
import net.mcreator.infested.entity.OrchidMantisEntity;
import net.mcreator.infested.entity.MantisEntity;
import net.mcreator.infested.entity.GrubEntity;
import net.mcreator.infested.entity.BeetleEntity;
import net.mcreator.infested.entity.AttackSilverfishEntity;
import net.mcreator.infested.InfestedMod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class InfestedModEntities {
	public static final DeferredRegister<EntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, InfestedMod.MODID);
	public static final RegistryObject<EntityType<TamedSilverfishEntity>> TAMED_SILVERFISH = register("tamed_silverfish",
			EntityType.Builder.<TamedSilverfishEntity>of(TamedSilverfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TamedSilverfishEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<TamedSilverfishLongEntity>> TAMED_SILVERFISH_LONG = register("tamed_silverfish_long",
			EntityType.Builder.<TamedSilverfishLongEntity>of(TamedSilverfishLongEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TamedSilverfishLongEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<TamedSpiderEntity>> TAMED_SPIDER = register("tamed_spider",
			EntityType.Builder.<TamedSpiderEntity>of(TamedSpiderEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(TamedSpiderEntity::new)

					.sized(1.4f, 0.6f));
	public static final RegistryObject<EntityType<AttackSilverfishEntity>> ATTACK_SILVERFISH = register("attack_silverfish",
			EntityType.Builder.<AttackSilverfishEntity>of(AttackSilverfishEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(AttackSilverfishEntity::new)

					.sized(0.4f, 0.3f));
	public static final RegistryObject<EntityType<GrubEntity>> GRUB = register("grub",
			EntityType.Builder.<GrubEntity>of(GrubEntity::new, MobCategory.MONSTER).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(GrubEntity::new)

					.sized(0.6f, 0.5f));
	public static final RegistryObject<EntityType<BeetleEntity>> BEETLE = register("beetle",
			EntityType.Builder.<BeetleEntity>of(BeetleEntity::new, MobCategory.AMBIENT).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(BeetleEntity::new)

					.sized(0.6f, 1f));
	public static final RegistryObject<EntityType<MantisEntity>> MANTIS = register("mantis",
			EntityType.Builder.<MantisEntity>of(MantisEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(MantisEntity::new)

					.sized(0.6f, 1.8f));
	public static final RegistryObject<EntityType<OrchidMantisEntity>> ORCHID_MANTIS = register("orchid_mantis",
			EntityType.Builder.<OrchidMantisEntity>of(OrchidMantisEntity::new, MobCategory.CREATURE).setShouldReceiveVelocityUpdates(true).setTrackingRange(64).setUpdateInterval(3).setCustomClientFactory(OrchidMantisEntity::new)

					.sized(0.6f, 1.8f));

	private static <T extends Entity> RegistryObject<EntityType<T>> register(String registryname, EntityType.Builder<T> entityTypeBuilder) {
		return REGISTRY.register(registryname, () -> (EntityType<T>) entityTypeBuilder.build(registryname));
	}

	@SubscribeEvent
	public static void init(FMLCommonSetupEvent event) {
		event.enqueueWork(() -> {
			TamedSilverfishEntity.init();
			TamedSilverfishLongEntity.init();
			TamedSpiderEntity.init();
			AttackSilverfishEntity.init();
			GrubEntity.init();
			BeetleEntity.init();
			MantisEntity.init();
			OrchidMantisEntity.init();
		});
	}

	@SubscribeEvent
	public static void registerAttributes(EntityAttributeCreationEvent event) {
		event.put(TAMED_SILVERFISH.get(), TamedSilverfishEntity.createAttributes().build());
		event.put(TAMED_SILVERFISH_LONG.get(), TamedSilverfishLongEntity.createAttributes().build());
		event.put(TAMED_SPIDER.get(), TamedSpiderEntity.createAttributes().build());
		event.put(ATTACK_SILVERFISH.get(), AttackSilverfishEntity.createAttributes().build());
		event.put(GRUB.get(), GrubEntity.createAttributes().build());
		event.put(BEETLE.get(), BeetleEntity.createAttributes().build());
		event.put(MANTIS.get(), MantisEntity.createAttributes().build());
		event.put(ORCHID_MANTIS.get(), OrchidMantisEntity.createAttributes().build());
	}
}
