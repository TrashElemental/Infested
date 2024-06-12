package net.mcreator.infested.entity.model;

import software.bernie.geckolib.model.GeoModel;

import net.minecraft.resources.ResourceLocation;

import net.mcreator.infested.entity.GrubEntity;

public class GrubModel extends GeoModel<GrubEntity> {
	@Override
	public ResourceLocation getAnimationResource(GrubEntity entity) {
		return new ResourceLocation("infested", "animations/grub.animation.json");
	}

	@Override
	public ResourceLocation getModelResource(GrubEntity entity) {
		return new ResourceLocation("infested", "geo/grub.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(GrubEntity entity) {
		return new ResourceLocation("infested", "textures/entities/" + entity.getTexture() + ".png");
	}

}
