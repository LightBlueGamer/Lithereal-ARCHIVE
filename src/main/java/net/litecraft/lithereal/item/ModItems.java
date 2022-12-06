package net.litecraft.lithereal.item;

import net.litecraft.lithereal.Lithereal;
import net.minecraft.world.item.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Lithereal.MOD_ID);

    public static final RegistryObject<Item> LITHERITE_CRYSTAL = ITEMS.register("litherite_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LITHEREAL_TAB)));

    public static final RegistryObject<Item> LITHERITE_SWORD = ITEMS.register("litherite_sword",
            () -> new SwordItem(ModTiers.LITHERITE, 5, -2.2f,
                    new Item.Properties().tab(ModCreativeModeTab.LITHEREAL_TAB)));
    public static final RegistryObject<Item> LITHERITE_PICKAXE = ITEMS.register("litherite_pickaxe",
            () -> new PickaxeItem(ModTiers.LITHERITE, 1, -2.5f,
                    new Item.Properties().tab(ModCreativeModeTab.LITHEREAL_TAB)));
    public static final RegistryObject<Item> LITHERITE_SHOVEL = ITEMS.register("litherite_shovel",
            () -> new ShovelItem(ModTiers.LITHERITE, 2, -2.5f,
                    new Item.Properties().tab(ModCreativeModeTab.LITHEREAL_TAB)));
    public static final RegistryObject<Item> LITHERITE_AXE = ITEMS.register("litherite_axe",
            () -> new AxeItem(ModTiers.LITHERITE, 6, -3.0f,
                    new Item.Properties().tab(ModCreativeModeTab.LITHEREAL_TAB)));
    public static final RegistryObject<Item> LITHERITE_HOE = ITEMS.register("litherite_hoe",
            () -> {
                return new HoeItem(ModTiers.LITHERITE, -4, 0f,
                        new Item.Properties().tab(ModCreativeModeTab.LITHEREAL_TAB));
            });

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
