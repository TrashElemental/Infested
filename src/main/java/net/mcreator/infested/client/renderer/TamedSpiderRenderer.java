
package net.mcreator.infested.client.renderer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.SpiderModel;

import net.mcreator.infested.procedures.TamedSpiderDisplayConditionProcedure;
import net.mcreator.infested.procedures.DisplayYellowProcedure;
import net.mcreator.infested.procedures.DisplayWhiteProcedure;
import net.mcreator.infested.procedures.DisplayRedProcedure;
import net.mcreator.infested.procedures.DisplayPurpleProcedure;
import net.mcreator.infested.procedures.DisplayPinkProcedure;
import net.mcreator.infested.procedures.DisplayOrangeProcedure;
import net.mcreator.infested.procedures.DisplayMagentaProcedure;
import net.mcreator.infested.procedures.DisplayLimeProcedure;
import net.mcreator.infested.procedures.DisplayLightGreyProcedure;
import net.mcreator.infested.procedures.DisplayLightBlueProcedure;
import net.mcreator.infested.procedures.DisplayGreyProcedure;
import net.mcreator.infested.procedures.DisplayCyanProcedure;
import net.mcreator.infested.procedures.DisplayBrownProcedure;
import net.mcreator.infested.procedures.DisplayBlueProcedure;
import net.mcreator.infested.procedures.DisplayBlackProcedure;
import net.mcreator.infested.entity.TamedSpiderEntity;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class TamedSpiderRenderer extends MobRenderer<TamedSpiderEntity, SpiderModel<TamedSpiderEntity>> {
	public TamedSpiderRenderer(EntityRendererProvider.Context context) {
		super(context, new SpiderModel(context.bakeLayer(ModelLayers.SPIDER)), 0.3f);
		this.addLayer(new RenderLayer<TamedSpiderEntity, SpiderModel<TamedSpiderEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("infested:textures/entities/spidereyedefault.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, TamedSpiderEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (TamedSpiderDisplayConditionProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<TamedSpiderEntity, SpiderModel<TamedSpiderEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("infested:textures/entities/spidereyeblack.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, TamedSpiderEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (DisplayBlackProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<TamedSpiderEntity, SpiderModel<TamedSpiderEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("infested:textures/entities/spidereyeblue.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, TamedSpiderEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (DisplayBlueProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<TamedSpiderEntity, SpiderModel<TamedSpiderEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("infested:textures/entities/spidereyebrown.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, TamedSpiderEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (DisplayBrownProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<TamedSpiderEntity, SpiderModel<TamedSpiderEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("infested:textures/entities/spidereyecyan.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, TamedSpiderEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (DisplayCyanProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<TamedSpiderEntity, SpiderModel<TamedSpiderEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("infested:textures/entities/spidereyegrey.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, TamedSpiderEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (DisplayGreyProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<TamedSpiderEntity, SpiderModel<TamedSpiderEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("infested:textures/entities/spidereyelightblue.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, TamedSpiderEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (DisplayLightBlueProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<TamedSpiderEntity, SpiderModel<TamedSpiderEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("infested:textures/entities/spidereyelightgrey.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, TamedSpiderEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (DisplayLightGreyProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<TamedSpiderEntity, SpiderModel<TamedSpiderEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("infested:textures/entities/spidereyelime.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, TamedSpiderEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (DisplayLimeProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<TamedSpiderEntity, SpiderModel<TamedSpiderEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("infested:textures/entities/spidereyemagenta.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, TamedSpiderEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (DisplayMagentaProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<TamedSpiderEntity, SpiderModel<TamedSpiderEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("infested:textures/entities/spidereyeorange.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, TamedSpiderEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (DisplayOrangeProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<TamedSpiderEntity, SpiderModel<TamedSpiderEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("infested:textures/entities/spidereyepink.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, TamedSpiderEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (DisplayPinkProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<TamedSpiderEntity, SpiderModel<TamedSpiderEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("infested:textures/entities/spidereyepurple.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, TamedSpiderEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (DisplayPurpleProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<TamedSpiderEntity, SpiderModel<TamedSpiderEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("infested:textures/entities/spidereyered.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, TamedSpiderEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (DisplayRedProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<TamedSpiderEntity, SpiderModel<TamedSpiderEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("infested:textures/entities/spidereyewhite.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, TamedSpiderEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (DisplayWhiteProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
		this.addLayer(new RenderLayer<TamedSpiderEntity, SpiderModel<TamedSpiderEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = new ResourceLocation("infested:textures/entities/spidereyeyellow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, TamedSpiderEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (DisplayYellowProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0), 1, 1, 1, 1);
				}
			}
		});
	}

	@Override
	protected void scale(TamedSpiderEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.5f, 0.5f, 0.5f);
	}

	@Override
	public ResourceLocation getTextureLocation(TamedSpiderEntity entity) {
		return new ResourceLocation("infested:textures/entities/cave_spider.png");
	}
}
