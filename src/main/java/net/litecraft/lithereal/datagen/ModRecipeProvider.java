package net.litecraft.lithereal.datagen;

import net.litecraft.lithereal.block.ModBlocks;
import net.litecraft.lithereal.item.ModItems;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.data.recipes.SimpleCookingRecipeBuilder;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.SimpleCookingSerializer;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(DataGenerator pGenerator) {
        super(pGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> pFinishedRecipeConsumer) {
        ShapedRecipeBuilder.shaped(ModItems.LITHERITE_AXE.get())
                .define('L', ModItems.LITHERITE_CRYSTAL.get())
                .define('S', Tags.Items.RODS_WOODEN)
                .pattern("LL")
                .pattern("LS")
                .pattern(" S")
                .unlockedBy("has_litherite_crystal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LITHERITE_CRYSTAL.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.LITHERITE_PICKAXE.get())
                .define('L', ModItems.LITHERITE_CRYSTAL.get())
                .define('S', Tags.Items.RODS_WOODEN)
                .pattern("LLL")
                .pattern(" S ")
                .pattern(" S ")
                .unlockedBy("has_litherite_crystal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LITHERITE_CRYSTAL.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.LITHERITE_SHOVEL.get())
                .define('L', ModItems.LITHERITE_CRYSTAL.get())
                .define('S', Tags.Items.RODS_WOODEN)
                .pattern("L")
                .pattern("S")
                .pattern("S")
                .unlockedBy("has_litherite_crystal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LITHERITE_CRYSTAL.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.LITHERITE_HOE.get())
                .define('L', ModItems.LITHERITE_CRYSTAL.get())
                .define('S', Tags.Items.RODS_WOODEN)
                .pattern("LL")
                .pattern(" S")
                .pattern(" S")
                .unlockedBy("has_litherite_crystal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LITHERITE_CRYSTAL.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.LITHERITE_SWORD.get())
                .define('L', ModItems.LITHERITE_CRYSTAL.get())
                .define('S', Tags.Items.RODS_WOODEN)
                .pattern("L")
                .pattern("L")
                .pattern("S")
                .unlockedBy("has_litherite_crystal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LITHERITE_CRYSTAL.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModBlocks.INFUSED_COAL_BLOCK.get())
                .define('C', ModItems.INFUSED_COAL.get())
                .pattern("CCC")
                .pattern("CCC")
                .pattern("CCC")
                .unlockedBy("has_infused_coal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.INFUSED_COAL.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.LITHERITE_CHESTPLATE.get())
                .define('C', ModItems.LITHERITE_CRYSTAL.get())
                .pattern("C C")
                .pattern("CCC")
                .pattern("CCC")
                .unlockedBy("has_litherite_crystal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LITHERITE_CRYSTAL.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.LITHERITE_BOOTS.get())
                .define('C', ModItems.LITHERITE_CRYSTAL.get())
                .pattern("C C")
                .pattern("C C")
                .unlockedBy("has_litherite_crystal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LITHERITE_CRYSTAL.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.LITHERITE_HELMET.get())
                .define('C', ModItems.LITHERITE_CRYSTAL.get())
                .pattern("CCC")
                .pattern("C C")
                .unlockedBy("has_litherite_crystal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LITHERITE_CRYSTAL.get()).build()))
                .save(pFinishedRecipeConsumer);

        ShapedRecipeBuilder.shaped(ModItems.LITHERITE_LEGGINGS.get())
                .define('C', ModItems.LITHERITE_CRYSTAL.get())
                .pattern("CCC")
                .pattern("C C")
                .pattern("C C")
                .unlockedBy("has_litherite_crystal", inventoryTrigger(ItemPredicate.Builder.item()
                        .of(ModItems.LITHERITE_CRYSTAL.get()).build()))
                .save(pFinishedRecipeConsumer);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.DEEPSLATE_LITHERITE_ORE.get()),
                ModItems.LITHERITE_CRYSTAL.get(), 2f, 200);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.LITHERITE_ORE.get()),
                ModItems.LITHERITE_CRYSTAL.get(), 2f, 200);

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.DEEPSLATE_LITHERITE_ORE.get()),
                ModItems.LITHERITE_CRYSTAL.get(), 2f, 100);
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.LITHERITE_ORE.get()),
                ModItems.LITHERITE_CRYSTAL.get(), 2f, 100);

        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.INFUSED_DEEPSLATE_COAL_ORE.get()),
                ModItems.LITHERITE_CRYSTAL.get(), 0.1f, 200);
        SimpleCookingRecipeBuilder.smelting(Ingredient.of(ModBlocks.INFUSED_COAL_ORE.get()),
                ModItems.LITHERITE_CRYSTAL.get(), 0.1f, 200);

        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.INFUSED_DEEPSLATE_COAL_ORE.get()),
                ModItems.LITHERITE_CRYSTAL.get(), 0.1f, 100);
        SimpleCookingRecipeBuilder.blasting(Ingredient.of(ModBlocks.INFUSED_COAL_ORE.get()),
                ModItems.LITHERITE_CRYSTAL.get(), 0.1f, 100);
    }
}