package net.litecraft.lithereal.datagen.loot;

import net.litecraft.lithereal.block.ModBlocks;
import net.litecraft.lithereal.item.ModItems;
import net.minecraft.data.loot.BlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockLootTables extends BlockLoot {

    @Override
    protected void addTables() {

        this.add(ModBlocks.LITHERITE_ORE.get(),
                (block -> createOreDrop(ModBlocks.LITHERITE_ORE.get(), ModItems.LITHERITE_CRYSTAL.get())));

        this.add(ModBlocks.DEEPSLATE_LITHERITE_ORE.get(),
                (block -> createOreDrop(ModBlocks.DEEPSLATE_LITHERITE_ORE.get(), ModItems.LITHERITE_CRYSTAL.get())));

        this.add(ModBlocks.INFUSED_COAL_ORE.get(),
                (block -> createOreDrop(ModBlocks.INFUSED_COAL_ORE.get(), ModItems.INFUSED_COAL.get())));

        this.add(ModBlocks.INFUSED_DEEPSLATE_COAL_ORE.get(),
                (block -> createOreDrop(ModBlocks.INFUSED_DEEPSLATE_COAL_ORE.get(), ModItems.INFUSED_COAL.get())));

        this.dropSelf(ModBlocks.INFUSED_COAL_BLOCK.get());
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}