
package net.mcreator.infested.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SilverfishModel;

import net.mcreator.infested.entity.TamedSilverfishLongEntity;

public class TamedSilverfishLongRenderer extends MobRenderer<TamedSilverfishLongEntity, SilverfishModel<TamedSilverfishLongEntity>> {
	public TamedSilverfishLongRenderer(EntityRendererProvider.Context context) {
		super(context, new SilverfishModel(context.bakeLayer(ModelLayers.SILVERFISH)), 0.3f);
	}

	@Override
	public ResourceLocation getTextureLocation(TamedSilverfishLongEntity entity) {
		return new ResourceLocation("infested:textures/entities/silverfish.png");
	}
}
