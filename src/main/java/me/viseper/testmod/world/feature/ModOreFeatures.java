package me.viseper.testmod.world.feature;

import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class ModOreFeatures {
    public static List<PlacementModifier> modifers(PlacementModifier countModifier, PlacementModifier heightModifier) {
        return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
    }

    public static List<PlacementModifier> modifiersWithCount(int count, PlacementModifier heightModifier) {
        return modifers(CountPlacementModifier.of(count), heightModifier);
    }

    public static List<PlacementModifier> modifiersWithRarity(int chance, PlacementModifier heightModifier) {
        return modifers(RarityFilterPlacementModifier.of(chance), heightModifier);
    }
}
