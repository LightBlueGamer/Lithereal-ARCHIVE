package net.litecraft.lithereal.datagen;

import com.eliotlash.mclib.math.functions.classic.Mod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.litecraft.lithereal.Lithereal;
import net.litecraft.lithereal.block.ModBlocks;
import net.litecraft.lithereal.item.ModItems;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.util.Identifier;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        cubeBlock(ModBlocks.INFUSED_COAL_BLOCK, blockStateModelGenerator);
        cubeBlock(ModBlocks.DEEPSLATE_LITHERITE_ORE, blockStateModelGenerator);
        cubeBlock(ModBlocks.LITHERITE_ORE, blockStateModelGenerator);
        cubeBlock(ModBlocks.INFUSED_COAL_ORE, blockStateModelGenerator);
        cubeBlock(ModBlocks.INFUSED_DEEPSLATE_COAL_ORE, blockStateModelGenerator);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.INFUSED_COAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.LITHERITE_CRYSTAL, Models.GENERATED);
        itemModelGenerator.register(ModItems.LITHERITE_HELMET, Models.GENERATED);
        itemModelGenerator.register(ModItems.LITHERITE_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ModItems.LITHERITE_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ModItems.LITHERITE_BOOTS, Models.GENERATED);

        itemModelGenerator.register(ModItems.LITHERITE_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LITHERITE_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LITHERITE_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LITHERITE_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.LITHERITE_HOE, Models.HANDHELD);
    }

    public void cubeBlock(Block block, BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(block);
        blockStateModelGenerator.registerParentedItemModel(block, new Identifier(Lithereal.MOD_ID, "block/"+block.asItem().toString()));
    }

}