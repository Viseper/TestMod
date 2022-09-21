package me.viseper.testmod.world.dimension;

import me.viseper.testmod.TestMod;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;

public class ModDimensions {
    public static final RegistryKey<World> ICEDIM_DIMENSION_KEY = RegistryKey.of(Registry.WORLD_KEY,
            new Identifier(TestMod.MOD_ID, "icedim"));
    public static final RegistryKey<DimensionType> ICEDIM_TYPE_KEY = RegistryKey.of(Registry.DIMENSION_TYPE_KEY, ICEDIM_DIMENSION_KEY.getValue());


    public static void register() {

        System.out.println("Meep");
    }
}
