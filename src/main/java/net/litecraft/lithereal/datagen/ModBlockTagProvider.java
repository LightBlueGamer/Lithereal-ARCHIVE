package net.litecraft.lithereal.datagen;

import net.litecraft.lithereal.Lithereal;
import net.litecraft.lithereal.block.ModBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraft.data.tags.BlockTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

public class ModBlockTagProvider extends BlockTagsProvider {

    public ModBlockTagProvider(DataGenerator gen, @Nullable ExistingFileHelper existingFileHelper) {
        super(gen, Lithereal.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags() {
        diamondPickTag(ModBlocks.LITHERITE_ORE.get());
        diamondPickTag(ModBlocks.DEEPSLATE_LITHERITE_ORE.get());
    }

    private void diamondPickTag(Block block) {
        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(block);
        this.tag(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(block);
    }
}
