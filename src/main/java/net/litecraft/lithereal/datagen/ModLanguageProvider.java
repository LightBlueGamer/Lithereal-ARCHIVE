package net.litecraft.lithereal.datagen;

import net.litecraft.lithereal.Lithereal;
import net.litecraft.lithereal.block.ModBlocks;
import net.litecraft.lithereal.entity.ModEntityTypes;
import net.litecraft.lithereal.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class ModLanguageProvider extends LanguageProvider {
    public ModLanguageProvider(DataGenerator gen) {
        super(gen, Lithereal.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.addBlock(ModBlocks.DEEPSLATE_LITHERITE_ORE, "Deepslate Litherite Ore");
        this.addBlock(ModBlocks.LITHERITE_ORE, "Litherite Ore");
        this.addBlock(ModBlocks.INFUSED_COAL_ORE, "Infused Coal Ore");
        this.addBlock(ModBlocks.INFUSED_DEEPSLATE_COAL_ORE, "Infused Deepslate Coal Ore");
        this.addBlock(ModBlocks.INFUSED_COAL_BLOCK, "Infused Coal Block");

        this.addItem(ModItems.INFUSED_COAL, "Infused Coal");
        this.addItem(ModItems.LITHERITE_BOOTS, "Litherite Boots");
        this.addItem(ModItems.LITHERITE_LEGGINGS, "Litherite Leggings");
        this.addItem(ModItems.LITHERITE_CHESTPLATE, "Litherite Chestplate");
        this.addItem(ModItems.LITHERITE_HELMET, "Litherite Helmet");
        this.addItem(ModItems.LITHERITE_HOE, "Litherite Hoe");
        this.addItem(ModItems.LITHERITE_AXE, "Litherite Axe");
        this.addItem(ModItems.LITHERITE_CRYSTAL, "Litherite Crystal");
        this.addItem(ModItems.LITHERITE_PICKAXE, "Litherite Pickaxe");
        this.addItem(ModItems.LITHERITE_SWORD, "Litherite Sword");
        this.addItem(ModItems.LITHERITE_SHOVEL, "Litherite Shovel");
        this.addItem(ModItems.MOSCER_SPAWN_EGG, "Moscer Spawn Egg");

        this.add(ModEntityTypes.MOSCER.get(), "Moscer");

        this.add("itemGroup.lithereal_tab", "Lithereal");
    }
}
