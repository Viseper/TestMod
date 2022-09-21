package me.viseper.testmod.world.feature;

import me.viseper.testmod.TestMod;
import me.viseper.testmod.block.ModBlocks;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {

    public static final List<OreFeatureConfig.Target> OVERWORLD_FROZEN_STONE = List.of(OreFeatureConfig.createTarget(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, ModBlocks.FROZEN_STONE.getDefaultState()));

    public static final RegistryEntry<ConfiguredFeature<OreFeatureConfig, ?>> FROZEN_STONE = ConfiguredFeatures.register("frozen_stone", Feature.ORE,
            new OreFeatureConfig(OVERWORLD_FROZEN_STONE, 20));


    public static void registerConfiguredFeatures() {
        System.out.println("Registered features for " + TestMod.MOD_ID);
    }
}
