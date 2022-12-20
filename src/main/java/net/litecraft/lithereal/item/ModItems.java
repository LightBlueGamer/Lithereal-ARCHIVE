package net.litecraft.lithereal.item;

import net.litecraft.lithereal.Lithereal;
import net.litecraft.lithereal.entity.ModEntityTypes;
import net.litecraft.lithereal.item.custom.InfusedCoalItem;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Lithereal.MOD_ID);

    public static final RegistryObject<Item> LITHERITE_CRYSTAL = ITEMS.register("litherite_crystal",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.LITHEREAL_TAB)));
    public static final RegistryObject<Item> INFUSED_COAL = ITEMS.register("infused_coal",
            () -> new InfusedCoalItem(new Item.Properties().tab(ModCreativeModeTab.LITHEREAL_TAB)));

    public static final RegistryObject<Item> MOSCER_SPAWN_EGG = ITEMS.register("moscer_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.MOSCER, 0x22b341, 0x19732e,
                    new Item.Properties().tab(ModCreativeModeTab.LITHEREAL_TAB)));

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
            () -> new HoeItem(ModTiers.LITHERITE, -4, 0f,
                    new Item.Properties().tab(ModCreativeModeTab.LITHEREAL_TAB)));

    public static final RegistryObject<Item> LITHERITE_HELMET = ITEMS.register("litherite_helmet",
            () -> new ArmorItem(ModArmorMaterials.LITHERITE, EquipmentSlot.HEAD,
                    new Item.Properties().tab(ModCreativeModeTab.LITHEREAL_TAB)));
    public static final RegistryObject<Item> LITHERITE_CHESTPLATE = ITEMS.register("litherite_chestplate",
            () -> new ArmorItem(ModArmorMaterials.LITHERITE, EquipmentSlot.CHEST,
                    new Item.Properties().tab(ModCreativeModeTab.LITHEREAL_TAB)));
    public static final RegistryObject<Item> LITHERITE_LEGGINGS = ITEMS.register("litherite_leggings",
            () -> new ArmorItem(ModArmorMaterials.LITHERITE, EquipmentSlot.LEGS,
                    new Item.Properties().tab(ModCreativeModeTab.LITHEREAL_TAB)));
    public static final RegistryObject<Item> LITHERITE_BOOTS = ITEMS.register("litherite_boots",
            () -> new ArmorItem(ModArmorMaterials.LITHERITE, EquipmentSlot.FEET,
                    new Item.Properties().tab(ModCreativeModeTab.LITHEREAL_TAB)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
