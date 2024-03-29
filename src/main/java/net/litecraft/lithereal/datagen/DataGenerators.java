package net.litecraft.lithereal.datagen;

import net.litecraft.lithereal.Lithereal;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Lithereal.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        generator.addProvider(true, new ModRecipeProvider(generator));
        generator.addProvider(true, new ModLootTableProvider(generator));
        generator.addProvider(true, new ModBlocksStateProvider(generator, existingFileHelper));
        generator.addProvider(true, new ModItemModelProvider(generator, existingFileHelper));
        generator.addProvider(true, new ModBlockTagProvider(generator, existingFileHelper));
        generator.addProvider(true, new ModLanguageProvider(generator));
    }
}