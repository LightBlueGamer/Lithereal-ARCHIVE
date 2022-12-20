package net.litecraft.lithereal.entity.client;

import net.litecraft.lithereal.Lithereal;
import net.litecraft.lithereal.entity.custom.MoscerEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MoscerModel extends AnimatedGeoModel<MoscerEntity> {
    @Override
    public ResourceLocation getModelResource(MoscerEntity object) {
        return new ResourceLocation(Lithereal.MOD_ID, "geo/moscer.geo.json");
    }

    @Override
    public ResourceLocation getTextureResource(MoscerEntity object) {
        return new ResourceLocation(Lithereal.MOD_ID, "textures/entity/moscer_texture.png");
    }

    @Override
    public ResourceLocation getAnimationResource(MoscerEntity animatable) {
        return new ResourceLocation(Lithereal.MOD_ID, "animations/moscer.animation.json");
    }
}
