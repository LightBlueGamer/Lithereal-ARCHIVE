package net.litecraft.lithereal.entity.client;

import net.litecraft.lithereal.Lithereal;
import net.litecraft.lithereal.entity.custom.MoscerEntity;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class MoscerRenderer extends GeoEntityRenderer<MoscerEntity> {
    public MoscerRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new MoscerModel());
        this.shadowRadius = 0.4f;
    }

    @Override
    public Identifier getTextureResource(MoscerEntity instance) {
        return new Identifier(Lithereal.MOD_ID, "textures/entity/moscer_texture.png");
    }

    @Override
    public RenderLayer getRenderType(MoscerEntity animatable, float partialTicks, MatrixStack stack,
                                     VertexConsumerProvider renderTypeBuffer, VertexConsumer vertexBuilder,
                                     int packedLightIn, Identifier textureLocation) {
        stack.scale(0.8f, 0.8f, 0.8f);

        return super.getRenderType(animatable, partialTicks, stack, renderTypeBuffer, vertexBuilder, packedLightIn, textureLocation);
    }
}