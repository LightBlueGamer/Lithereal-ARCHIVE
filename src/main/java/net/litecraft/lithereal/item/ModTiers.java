package net.litecraft.lithereal.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier LITHERITE = new ForgeTier(4, 2200, 10.0f,
            5f, 22, BlockTags.NEEDS_DIAMOND_TOOL,
            () -> Ingredient.of(ModItems.LITHERITE_CRYSTAL.get()));
}