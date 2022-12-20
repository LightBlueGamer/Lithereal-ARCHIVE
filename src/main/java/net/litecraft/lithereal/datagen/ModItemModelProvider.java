package net.litecraft.lithereal.datagen;

import net.litecraft.lithereal.Lithereal;
import net.litecraft.lithereal.block.ModBlocks;
import net.litecraft.lithereal.item.ModItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Lithereal.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.LITHERITE_CRYSTAL.get());
        simpleItem(ModItems.INFUSED_COAL.get());

        simpleItem(ModItems.LITHERITE_BOOTS.get());
        simpleItem(ModItems.LITHERITE_LEGGINGS.get());
        simpleItem(ModItems.LITHERITE_CHESTPLATE.get());
        simpleItem(ModItems.LITHERITE_HELMET.get());

        handheldItem(ModItems.LITHERITE_AXE.get());
        handheldItem(ModItems.LITHERITE_PICKAXE.get());
        handheldItem(ModItems.LITHERITE_SHOVEL.get());
        handheldItem(ModItems.LITHERITE_SWORD.get());
        handheldItem(ModItems.LITHERITE_HOE.get());
    }

    private ItemModelBuilder simpleItem(Item item) {
        return withExistingParent(item.toString(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(Lithereal.MOD_ID,"item/" + item.toString()));
    }

    private ItemModelBuilder handheldItem(Item item) {
        return withExistingParent(item.toString(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(Lithereal.MOD_ID,"item/" + item.toString()));
    }
}
