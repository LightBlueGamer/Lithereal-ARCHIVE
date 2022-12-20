package net.litecraft.lithereal.event;

import net.litecraft.lithereal.Lithereal;
import net.litecraft.lithereal.entity.ModEntityTypes;
import net.litecraft.lithereal.entity.custom.MoscerEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

public class ModEvents {
    @Mod.EventBusSubscriber(modid = Lithereal.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
    public static class ModEventBusEvents {
        @SubscribeEvent
        public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
            event.put(ModEntityTypes.MOSCER.get(), MoscerEntity.setAttributes());
        }
    }
}