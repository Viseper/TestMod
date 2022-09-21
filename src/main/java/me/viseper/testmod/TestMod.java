package me.viseper.testmod;

import me.viseper.testmod.block.ModBlocks;
import me.viseper.testmod.item.ModItems;
import me.viseper.testmod.util.ModRegistries;
import me.viseper.testmod.world.dimension.ModDimensions;
import me.viseper.testmod.world.feature.ModConfiguredFeatures;
import me.viseper.testmod.world.gen.ModWorldGen;
import net.fabricmc.api.ModInitializer;

public class TestMod implements ModInitializer {

    public static final String MOD_ID = "testmod";
    //public static final Logger LOGGER = LogManager.getLogManager().getLogger("testmod");

    @Override
    public void onInitialize() {
        ModConfiguredFeatures.registerConfiguredFeatures();

        ModItems.registerModItems();
        ModBlocks.registerModBlocks();
        ModRegistries.registerModStuff();

        ModWorldGen.generateModWorldGen();

        ModDimensions.register();

    }
}
