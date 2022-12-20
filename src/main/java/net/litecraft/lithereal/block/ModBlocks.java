package net.litecraft.lithereal.block;

import net.litecraft.lithereal.Lithereal;
import net.litecraft.lithereal.block.custom.InfusedCoalBlockItem;
import net.litecraft.lithereal.item.ModCreativeModeTab;
import net.litecraft.lithereal.item.ModItems;
import net.minecraft.util.valueproviders.UniformInt;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.DropExperienceBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, Lithereal.MOD_ID);

    public static final RegistryObject<Block> LITHERITE_ORE = registerBlock("litherite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(6f).requiresCorrectToolForDrops(), UniformInt.of(6, 10)), ModCreativeModeTab.LITHEREAL_TAB);

    public static final RegistryObject<Block> DEEPSLATE_LITHERITE_ORE = registerBlock("deepslate_litherite_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.of(Material.STONE)
                    .strength(7.5f).requiresCorrectToolForDrops(), UniformInt.of(6, 10)), ModCreativeModeTab.LITHEREAL_TAB);

    public static final RegistryObject<Block> INFUSED_COAL_ORE = registerBlock("infused_coal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.COAL_ORE), UniformInt.of(0, 2)), ModCreativeModeTab.LITHEREAL_TAB);

    public static final RegistryObject<Block> INFUSED_DEEPSLATE_COAL_ORE = registerBlock("infused_deepslate_coal_ore",
            () -> new DropExperienceBlock(BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_COAL_ORE), UniformInt.of(0, 2)), ModCreativeModeTab.LITHEREAL_TAB);

    public static final RegistryObject<Block> INFUSED_COAL_BLOCK = registerInfusedCoalBlock("infused_coal_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_BLOCK)), ModCreativeModeTab.LITHEREAL_TAB);

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    private static <T extends Block> RegistryObject<T> registerInfusedCoalBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerInfusedCoalBlockItem(name, toReturn, tab);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerInfusedCoalBlockItem(String name, RegistryObject<T> block,
                                                                            CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new InfusedCoalBlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
