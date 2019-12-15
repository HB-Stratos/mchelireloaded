//custom Creative Tabs
package com.github.hbstratos.mchelireloaded.init;

import com.github.hbstratos.mchelireloaded.McHeliReloaded;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import java.util.function.Supplier;

public class ModItemGroups {



    public static class ModItemGroup extends ItemGroup{

        private final Supplier<ItemStack> iconSupplier;

        public ModItemGroup (final String name, final Supplier<ItemStack> iconSupplier) {

            super(name);
            this.iconSupplier = iconSupplier;
        }

        @Override
        public ItemStack createIcon() {
            return iconSupplier.get();
        }
    }

    public static final ItemGroup MOD_ITEM_GROUP = new ModItemGroup(McHeliReloaded.MODID, () -> new ItemStack(ModItems.TEST_ITEM));

}
