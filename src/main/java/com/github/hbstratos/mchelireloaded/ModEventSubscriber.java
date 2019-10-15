package com.github.hbstratos.mchelireloaded;

import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.IForgeRegistryEntry;

import static net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus.MOD;

@Mod.EventBusSubscriber(modid = McHeliReloaded.MODID, bus = MOD)
public final class ModEventSubscriber {

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final String name){

        return setup(entry, new ResourceLocation(McHeliReloaded.MODID, name));

    }

    public static <T extends IForgeRegistryEntry<T>> T setup(final T entry, final ResourceLocation registryName){
        entry.setRegistryName(registryName);
        return entry;
    }

}
