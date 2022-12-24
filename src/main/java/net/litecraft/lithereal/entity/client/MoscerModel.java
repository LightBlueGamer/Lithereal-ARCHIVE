package net.litecraft.lithereal.entity.client;

import net.litecraft.lithereal.Lithereal;
import net.litecraft.lithereal.entity.custom.MoscerEntity;
import net.minecraft.util.Identifier;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class MoscerModel extends AnimatedGeoModel<MoscerEntity> {
    @Override
    public Identifier getModelResource(MoscerEntity object) {
        return new Identifier(Lithereal.MOD_ID, "geo/moscer.geo.json");
    }

    @Override
    public Identifier getTextureResource(MoscerEntity object) {
        return new Identifier(Lithereal.MOD_ID, "textures/entity/moscer_texture.png");
    }

    @Override
    public Identifier getAnimationResource(MoscerEntity animatable) {
        return new Identifier(Lithereal.MOD_ID, "animations/moscer.animation.json");
    }
}