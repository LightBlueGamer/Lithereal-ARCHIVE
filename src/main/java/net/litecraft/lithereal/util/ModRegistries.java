package net.litecraft.lithereal.util;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.litecraft.lithereal.Lithereal;
import net.litecraft.lithereal.block.ModBlocks;
import net.litecraft.lithereal.item.ModItems;


public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
    }


    private static void registerFuels() {
        Lithereal.LOGGER.info("Registering Fuels for " + Lithereal.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.INFUSED_COAL, 3200);
        registry.add(ModBlocks.INFUSED_COAL_BLOCK, 32000);
    }
}