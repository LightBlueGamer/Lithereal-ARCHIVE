package net.litecraft.lithereal.datagen;

import net.litecraft.lithereal.Lithereal;
import net.litecraft.lithereal.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModBlocksStateProvider extends BlockStateProvider {
    public ModBlocksStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Lithereal.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        cubeBlock(ModBlocks.LITHERITE_ORE.get());
        cubeBlock(ModBlocks.DEEPSLATE_LITHERITE_ORE.get());
    }

    public void cubeBlock(Block block) {
        simpleBlock(block);
        simpleBlockItem(block, cubeAll(block));
    }
}