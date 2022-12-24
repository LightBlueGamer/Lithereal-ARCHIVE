package net.litecraft.lithereal.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.SimpleFabricLootTableProvider;
import net.litecraft.lithereal.Lithereal;
import net.litecraft.lithereal.block.ModBlocks;
import net.litecraft.lithereal.item.ModItems;
import net.minecraft.data.server.BlockLootTableGenerator;
import net.minecraft.loot.LootTable;
import net.minecraft.loot.context.LootContextTypes;
import net.minecraft.util.Identifier;

import java.util.function.BiConsumer;

public class ModLootTableGenerator extends SimpleFabricLootTableProvider {
    public ModLootTableGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator, LootContextTypes.BLOCK);
    }

    @Override
    public void accept(BiConsumer<Identifier, LootTable.Builder> identifierBuilderBiConsumer) {
        identifierBuilderBiConsumer.accept(new Identifier(Lithereal.MOD_ID, "blocks/infused_coal_block"),
                BlockLootTableGenerator.drops(ModBlocks.INFUSED_COAL_BLOCK));

        identifierBuilderBiConsumer.accept(new Identifier(Lithereal.MOD_ID, "blocks/litherite_ore"),
                BlockLootTableGenerator.drops(ModItems.LITHERITE_CRYSTAL));

        identifierBuilderBiConsumer.accept(new Identifier(Lithereal.MOD_ID, "blocks/deepslate_litherite_ore"),
                BlockLootTableGenerator.drops(ModItems.LITHERITE_CRYSTAL));
    }
}