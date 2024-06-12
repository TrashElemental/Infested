package net.mcreator.infested.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.infested.entity.BeetleEntity;

public class BeetleModel extends GeoModel<BeetleEntity> {
	@Override
	public ResourceLocation getAnimationResource(BeetleEntity entity) {
		return new ResourceLocation("infested", "animations/beetle.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(BeetleEntity entity) {
		return new ResourceLocation("infested", "geo/beetle.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(BeetleEntity entity) {
		return new ResourceLocation("infested", "textures/entities/" + entity.getTexture() + ".png");
	}

}
