package net.litecraft.lithereal.entity;

import net.litecraft.lithereal.Lithereal;
import net.litecraft.lithereal.entity.custom.MoscerEntity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, Lithereal.MOD_ID);

    public static final RegistryObject<EntityType<MoscerEntity>> MOSCER =
            ENTITY_TYPES.register("moscer",
                    () -> EntityType.Builder.of(MoscerEntity::new, MobCategory.MONSTER)
                            .sized(0.2f, 0.2f)
                            .build(new ResourceLocation(Lithereal.MOD_ID, "moscer").toString()));


    public static void register(IEventBus eventBus) {
        ENTITY_TYPES.register(eventBus);
    }
}
