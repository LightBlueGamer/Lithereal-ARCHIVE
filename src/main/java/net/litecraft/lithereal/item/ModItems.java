package net.litecraft.lithereal.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.litecraft.lithereal.Lithereal;
import net.litecraft.lithereal.entity.ModEntities;
import net.litecraft.lithereal.item.custom.ModAxeItem;
import net.litecraft.lithereal.item.custom.ModHoeItem;
import net.litecraft.lithereal.item.custom.ModPickaxeItem;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {
    public static final Item LITHERITE_CRYSTAL = registerItem("litherite_crystal",
            new Item(new FabricItemSettings().group(ModItemGroup.LITHEREAL)));

    public static final Item INFUSED_COAL = registerItem("infused_coal",
            new Item(new FabricItemSettings().group(ModItemGroup.LITHEREAL)));

    public static final Item LITHERITE_SWORD = registerItem("litherite_sword",
            new SwordItem(ModToolMaterials.LITHERITE, 5, -2.2f,
                    new FabricItemSettings().group(ModItemGroup.LITHEREAL)));
    public static final Item LITHERITE_AXE = registerItem("litherite_axe",
            new ModAxeItem(ModToolMaterials.LITHERITE, 6, -3f,
                    new FabricItemSettings().group(ModItemGroup.LITHEREAL)));
    public static final Item LITHERITE_HOE = registerItem("litherite_hoe",
            new ModHoeItem(ModToolMaterials.LITHERITE, -4, 0f,
                    new FabricItemSettings().group(ModItemGroup.LITHEREAL)));
    public static final Item LITHERITE_SHOVEL = registerItem("litherite_shovel",
            new ShovelItem(ModToolMaterials.LITHERITE, 2, -2.5f,
                    new FabricItemSettings().group(ModItemGroup.LITHEREAL)));
    public static final Item LITHERITE_PICKAXE = registerItem("litherite_pickaxe",
            new ModPickaxeItem(ModToolMaterials.LITHERITE, 1, -2.5f,
                    new FabricItemSettings().group(ModItemGroup.LITHEREAL)));

    public static final Item LITHERITE_HELMET = registerItem("litherite_helmet",
            new ArmorItem(ModArmorMaterials.LITHERITE, EquipmentSlot.HEAD,
                    new FabricItemSettings().group(ModItemGroup.LITHEREAL)));
    public static final Item LITHERITE_CHESTPLATE = registerItem("litherite_chestplate",
            new ArmorItem(ModArmorMaterials.LITHERITE, EquipmentSlot.CHEST,
                    new FabricItemSettings().group(ModItemGroup.LITHEREAL)));
    public static final Item LITHERITE_LEGGINGS = registerItem("litherite_leggings",
            new ArmorItem(ModArmorMaterials.LITHERITE, EquipmentSlot.LEGS,
                    new FabricItemSettings().group(ModItemGroup.LITHEREAL)));
    public static final Item LITHERITE_BOOTS = registerItem("litherite_boots",
            new ArmorItem(ModArmorMaterials.LITHERITE, EquipmentSlot.FEET,
                    new FabricItemSettings().group(ModItemGroup.LITHEREAL)));

    public static final Item MOSCER_SPAWN_EGG = registerItem("moscer_spawn_egg",
            new SpawnEggItem(ModEntities.MOSCER, 0x22b341, 0x19732e,
                    new FabricItemSettings().group(ModItemGroup.LITHEREAL)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Lithereal.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Lithereal.LOGGER.debug("Registering Mod Items for " + Lithereal.MOD_ID);
    }
}