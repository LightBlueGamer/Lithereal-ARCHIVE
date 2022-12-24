package net.litecraft.lithereal;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.litecraft.lithereal.entity.ModEntities;
import net.litecraft.lithereal.entity.client.MoscerRenderer;

public class LitherealClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        EntityRendererRegistry.register(ModEntities.MOSCER, MoscerRenderer::new);
    }
}