package net.litecraft.lithereal.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.litecraft.lithereal.Lithereal;
import net.litecraft.lithereal.entity.custom.MoscerEntity;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModEntities {
    public static final EntityType<MoscerEntity> MOSCER = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(Lithereal.MOD_ID, "moscer"),
            FabricEntityTypeBuilder.create(SpawnGroup.MONSTER, MoscerEntity::new)
                    .dimensions(EntityDimensions.fixed(0.4f, 1.5f)).build());

}