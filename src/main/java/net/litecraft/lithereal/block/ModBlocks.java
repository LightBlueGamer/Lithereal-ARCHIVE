package net.litecraft.lithereal.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.litecraft.lithereal.Lithereal;
import net.litecraft.lithereal.item.ModItemGroup;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.OreBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block LITHERITE_ORE = registerBlock("litherite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(6f).requiresTool(),
                    UniformIntProvider.create(6, 10)), ModItemGroup.LITHEREAL);

    public static final Block DEEPSLATE_LITHERITE_ORE = registerBlock("deepslate_litherite_ore",
            new OreBlock(FabricBlockSettings.of(Material.STONE).strength(7.5f).requiresTool(),
                    UniformIntProvider.create(6, 10)), ModItemGroup.LITHEREAL);

    public static final Block INFUSED_COAL_ORE = registerBlock("infused_coal_ore",
            new OreBlock(FabricBlockSettings.copy(Blocks.COAL_ORE),
                    UniformIntProvider.create(6, 10)), ModItemGroup.LITHEREAL);

    public static final Block INFUSED_DEEPSLATE_COAL_ORE = registerBlock("infused_deepslate_coal_ore",
            new OreBlock(FabricBlockSettings.copy(Blocks.DEEPSLATE_COAL_ORE),
                    UniformIntProvider.create(6, 10)), ModItemGroup.LITHEREAL);

    public static final Block INFUSED_COAL_BLOCK = registerBlock("infused_coal_block",
            new Block(FabricBlockSettings.copy(Blocks.COAL_BLOCK)), ModItemGroup.LITHEREAL);



    private static Block registerBlock(String name, Block block, ItemGroup tab) {
        registerBlockItem(name, block, tab);
        return Registry.register(Registry.BLOCK, new Identifier(Lithereal.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup tab) {
        return Registry.register(Registry.ITEM, new Identifier(Lithereal.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(tab)));
    }

    public static void registerModBlocks() {
        Lithereal.LOGGER.debug("Registering ModBlocks for " + Lithereal.MOD_ID);
    }
}