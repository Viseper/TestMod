package me.viseper.testmod.util;

import me.viseper.testmod.TestMod;
import me.viseper.testmod.item.ModItems;
import net.fabricmc.fabric.api.registry.FuelRegistry;

public class ModRegistries {
    public static void registerModStuff() {
        registerFuels();
    }

    private static void registerFuels() {
        //TestMod.LOGGER.info("Registering Fuels for" + TestMod.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(ModItems.ICE_SHARD, 1000);
    }

}
