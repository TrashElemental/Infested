
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.infested.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.mcreator.infested.client.model.Modelchitinarmor;
import net.mcreator.infested.client.model.Modelarmor;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = {Dist.CLIENT})
public class InfestedModModels {
	@SubscribeEvent
	public static void registerLayerDefinitions(EntityRenderersEvent.RegisterLayerDefinitions event) {
		event.registerLayerDefinition(Modelchitinarmor.LAYER_LOCATION, Modelchitinarmor::createBodyLayer);
		event.registerLayerDefinition(Modelarmor.LAYER_LOCATION, Modelarmor::createBodyLayer);
	}
}
