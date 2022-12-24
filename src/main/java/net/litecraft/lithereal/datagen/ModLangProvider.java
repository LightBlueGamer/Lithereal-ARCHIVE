package net.litecraft.lithereal.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.litecraft.lithereal.block.ModBlocks;
import net.litecraft.lithereal.entity.ModEntities;
import net.litecraft.lithereal.item.ModItemGroup;
import net.litecraft.lithereal.item.ModItems;

public class ModLangProvider extends FabricLanguageProvider {
    protected ModLangProvider(FabricDataGenerator dataGenerator) {
        super(dataGenerator, "en_us");
    }

    @Override
    public void generateTranslations(TranslationBuilder translationBuilder) {
        translationBuilder.add(ModItems.INFUSED_COAL, "Infused Coal");
        translationBuilder.add(ModItems.LITHERITE_AXE, "Litherite Axe");
        translationBuilder.add(ModItems.LITHERITE_PICKAXE, "Litherite Pickaxe");
        translationBuilder.add(ModItems.LITHERITE_SHOVEL, "Litherite Shovel");
        translationBuilder.add(ModItems.LITHERITE_SWORD, "Litherite Sword");
        translationBuilder.add(ModItems.LITHERITE_HOE, "Litherite Hoe");
        translationBuilder.add(ModItems.LITHERITE_HELMET, "Litherite Helmet");
        translationBuilder.add(ModItems.LITHERITE_CHESTPLATE, "Litherite Chestplate");
        translationBuilder.add(ModItems.LITHERITE_LEGGINGS, "Litherite Leggings");
        translationBuilder.add(ModItems.LITHERITE_BOOTS, "Litherite Boots");
        translationBuilder.add(ModItems.LITHERITE_CRYSTAL, "Litherite Crystal");
        translationBuilder.add(ModItems.MOSCER_SPAWN_EGG, "Moscer Spawn Egg");

        translationBuilder.add(ModBlocks.INFUSED_COAL_BLOCK, "Infused Coal Block");
        translationBuilder.add(ModBlocks.INFUSED_COAL_ORE, "Infused Coal Ore");
        translationBuilder.add(ModBlocks.INFUSED_DEEPSLATE_COAL_ORE, "Infused Deepslate Coal Ore");
        translationBuilder.add(ModBlocks.DEEPSLATE_LITHERITE_ORE, "Deepslate Litherite Ore");
        translationBuilder.add(ModBlocks.LITHERITE_ORE, "Litherite Ore");

        translationBuilder.add(ModItemGroup.LITHEREAL, "Lithereal");

        translationBuilder.add(ModEntities.MOSCER, "Moscer");

    }
}
