package net.litecraft.lithereal.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.litecraft.lithereal.block.ModBlocks;
import net.litecraft.lithereal.item.ModItems;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.tag.ItemTags;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModBlocks.LITHERITE_ORE), ModItems.LITHERITE_CRYSTAL,
                2f, 200, "litherite");
        offerBlasting(exporter, List.of(ModBlocks.LITHERITE_ORE), ModItems.LITHERITE_CRYSTAL,
                2f, 100, "litherite");

        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_LITHERITE_ORE), ModItems.LITHERITE_CRYSTAL,
                2f, 200, "litherite");
        offerBlasting(exporter, List.of(ModBlocks.DEEPSLATE_LITHERITE_ORE), ModItems.LITHERITE_CRYSTAL,
                2f, 100, "litherite");

        offerSmelting(exporter, List.of(ModBlocks.INFUSED_COAL_ORE), ModItems.LITHERITE_CRYSTAL,
                2f, 200, "litherite");
        offerBlasting(exporter, List.of(ModBlocks.INFUSED_COAL_ORE), ModItems.LITHERITE_CRYSTAL,
                2f, 100, "litherite");

        offerSmelting(exporter, List.of(ModBlocks.INFUSED_DEEPSLATE_COAL_ORE), ModItems.LITHERITE_CRYSTAL,
                2f, 200, "litherite");
        offerBlasting(exporter, List.of(ModBlocks.INFUSED_DEEPSLATE_COAL_ORE), ModItems.LITHERITE_CRYSTAL,
                2f, 100, "litherite");

        offerReversibleCompactingRecipes(exporter, ModItems.INFUSED_COAL, ModBlocks.INFUSED_COAL_BLOCK);

        ShapedRecipeJsonBuilder.create(ModItems.LITHERITE_PICKAXE)
                .pattern("###")
                .pattern(" I ")
                .pattern(" I ")
                .input('I', Items.STICK)
                .input('#', ModItems.LITHERITE_CRYSTAL)
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(RecipeProvider.hasItem(ModItems.LITHERITE_CRYSTAL),
                        RecipeProvider.conditionsFromItem(ModItems.LITHERITE_CRYSTAL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.LITHERITE_PICKAXE)));

        ShapedRecipeJsonBuilder.create(ModItems.LITHERITE_AXE)
                .pattern("##")
                .pattern("#I")
                .pattern(" I")
                .input('I', Items.STICK)
                .input('#', ModItems.LITHERITE_CRYSTAL)
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(RecipeProvider.hasItem(ModItems.LITHERITE_CRYSTAL),
                        RecipeProvider.conditionsFromItem(ModItems.LITHERITE_CRYSTAL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.LITHERITE_AXE)));

        ShapedRecipeJsonBuilder.create(ModItems.LITHERITE_SHOVEL)
                .pattern("#")
                .pattern("I")
                .pattern("I")
                .input('I', Items.STICK)
                .input('#', ModItems.LITHERITE_CRYSTAL)
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(RecipeProvider.hasItem(ModItems.LITHERITE_CRYSTAL),
                        RecipeProvider.conditionsFromItem(ModItems.LITHERITE_CRYSTAL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.LITHERITE_SHOVEL)));

        ShapedRecipeJsonBuilder.create(ModItems.LITHERITE_SWORD)
                .pattern("#")
                .pattern("#")
                .pattern("I")
                .input('I', Items.STICK)
                .input('#', ModItems.LITHERITE_CRYSTAL)
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(RecipeProvider.hasItem(ModItems.LITHERITE_CRYSTAL),
                        RecipeProvider.conditionsFromItem(ModItems.LITHERITE_CRYSTAL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.LITHERITE_SWORD)));

        ShapedRecipeJsonBuilder.create(ModItems.LITHERITE_HOE)
                .pattern("##")
                .pattern(" I")
                .pattern(" I")
                .input('I', Items.STICK)
                .input('#', ModItems.LITHERITE_CRYSTAL)
                .criterion(RecipeProvider.hasItem(Items.STICK),
                        RecipeProvider.conditionsFromItem(Items.STICK))
                .criterion(RecipeProvider.hasItem(ModItems.LITHERITE_CRYSTAL),
                        RecipeProvider.conditionsFromItem(ModItems.LITHERITE_CRYSTAL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.LITHERITE_HOE)));

        ShapedRecipeJsonBuilder.create(ModItems.LITHERITE_CHESTPLATE)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.LITHERITE_CRYSTAL)
                .criterion(RecipeProvider.hasItem(ModItems.LITHERITE_CRYSTAL),
                        RecipeProvider.conditionsFromItem(ModItems.LITHERITE_CRYSTAL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.LITHERITE_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(ModItems.LITHERITE_HELMET)
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.LITHERITE_CRYSTAL)
                .criterion(RecipeProvider.hasItem(ModItems.LITHERITE_CRYSTAL),
                        RecipeProvider.conditionsFromItem(ModItems.LITHERITE_CRYSTAL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.LITHERITE_HELMET)));

        ShapedRecipeJsonBuilder.create(ModItems.LITHERITE_LEGGINGS)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.LITHERITE_CRYSTAL)
                .criterion(RecipeProvider.hasItem(ModItems.LITHERITE_CRYSTAL),
                        RecipeProvider.conditionsFromItem(ModItems.LITHERITE_CRYSTAL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.LITHERITE_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(ModItems.LITHERITE_BOOTS)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.LITHERITE_CRYSTAL)
                .criterion(RecipeProvider.hasItem(ModItems.LITHERITE_CRYSTAL),
                        RecipeProvider.conditionsFromItem(ModItems.LITHERITE_CRYSTAL))
                .offerTo(exporter, new Identifier(RecipeProvider.getRecipeName(ModItems.LITHERITE_BOOTS)));
    }
}