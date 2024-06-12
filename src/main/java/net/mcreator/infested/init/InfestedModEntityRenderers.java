
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.infested.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.infested.client.renderer.TamedSpiderRenderer;
import net.mcreator.infested.client.renderer.TamedSilverfishRenderer;
import net.mcreator.infested.client.renderer.TamedSilverfishLongRenderer;
import net.mcreator.infested.client.renderer.OrchidMantisRenderer;
import net.mcreator.infested.client.renderer.MantisRenderer;
import net.mcreator.infested.client.renderer.GrubRenderer;
import net.mcreator.infested.client.renderer.BeetleRenderer;
import net.mcreator.infested.client.renderer.AttackSilverfishRenderer;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class InfestedModEntityRenderers {
	@SubscribeEvent
	public static void registerEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerEntityRenderer(InfestedModEntities.TAMED_SILVERFISH.get(), TamedSilverfishRenderer::new);
		event.registerEntityRenderer(InfestedModEntities.TAMED_SILVERFISH_LONG.get(), TamedSilverfishLongRenderer::new);
		event.registerEntityRenderer(InfestedModEntities.TAMED_SPIDER.get(), TamedSpiderRenderer::new);
		event.registerEntityRenderer(InfestedModEntities.ATTACK_SILVERFISH.get(), AttackSilverfishRenderer::new);
		event.registerEntityRenderer(InfestedModEntities.GRUB.get(), GrubRenderer::new);
		event.registerEntityRenderer(InfestedModEntities.BEETLE.get(), BeetleRenderer::new);
		event.registerEntityRenderer(InfestedModEntities.MANTIS.get(), MantisRenderer::new);
		event.registerEntityRenderer(InfestedModEntities.ORCHID_MANTIS.get(), OrchidMantisRenderer::new);
	}
}
