package net.mcreator.infested.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.infested.entity.MantisEntity;

public class MantisModel extends GeoModel<MantisEntity> {
	@Override
	public ResourceLocation getAnimationResource(MantisEntity entity) {
		return new ResourceLocation("infested", "animations/mantis.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(MantisEntity entity) {
		return new ResourceLocation("infested", "geo/mantis.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(MantisEntity entity) {
		return new ResourceLocation("infested", "textures/entities/" + entity.getTexture() + ".png");
	}

}
