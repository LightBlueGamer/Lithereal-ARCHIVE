package net.litecraft.lithereal.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.litecraft.lithereal.item.ModItems;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.*;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;

public class ModLootTableModifiers {
    private static final Identifier COAL_ORE_ID
            = new Identifier("minecraft", "blocks/coal_ore");

    private static final Identifier DEEPSLATE_COAL_ORE_ID
            = new Identifier("minecraft", "blocks/deepslate_coal_ore");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(COAL_ORE_ID.equals(id) || DEEPSLATE_COAL_ORE_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.08f)) // Drops 35% of the time
                        .with(ItemEntry.builder(ModItems.INFUSED_COAL))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());
                tableBuilder.pool(poolBuilder.build());
            }
        });
    }
}