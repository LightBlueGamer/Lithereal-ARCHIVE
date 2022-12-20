package net.litecraft.lithereal.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.litecraft.lithereal.Lithereal;
import net.litecraft.lithereal.entity.custom.MoscerEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.resources.ResourceLocation;
import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;


public class MoscerRenderer extends GeoEntityRenderer<MoscerEntity> {
    public MoscerRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new MoscerModel());
        this.shadowRadius = 0.3f;
    }

    @Override
    public ResourceLocation getTextureLocation(MoscerEntity instance) {
        return new ResourceLocation(Lithereal.MOD_ID, "textures/entity/moscer_texture.png");
    }

    @Override
    public RenderType getRenderType(MoscerEntity animatable, float partialTicks, PoseStack stack,
                                    @Nullable MultiBufferSource renderTypeBuffer,
                                    @Nullable VertexConsumer vertexBuilder, int packedLightIn,
                                    ResourceLocation textureLocation) {
        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}
