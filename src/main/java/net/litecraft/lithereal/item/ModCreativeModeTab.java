package net.litecraft.lithereal.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab LITHEREAL_TAB = new CreativeModeTab("lithereal_tab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.LITHERITE_CRYSTAL.get());
        }
    };
}