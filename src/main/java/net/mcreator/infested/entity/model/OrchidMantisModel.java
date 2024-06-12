package net.mcreator.infested.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.infested.entity.OrchidMantisEntity;

public class OrchidMantisModel extends GeoModel<OrchidMantisEntity> {
	@Override
	public ResourceLocation getAnimationResource(OrchidMantisEntity entity) {
		return new ResourceLocation("infested", "animations/orchidmantis.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(OrchidMantisEntity entity) {
		return new ResourceLocation("infested", "geo/orchidmantis.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(OrchidMantisEntity entity) {
		return new ResourceLocation("infested", "textures/entities/" + entity.getTexture() + ".png");
	}

}
