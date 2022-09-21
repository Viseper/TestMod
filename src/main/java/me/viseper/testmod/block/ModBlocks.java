package me.viseper.testmod.block;

import me.viseper.testmod.TestMod;
import me.viseper.testmod.block.custom.SpeedyBlock;
import me.viseper.testmod.item.ModItemGroups;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ToolItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {

    public static final Block FROZEN_STONE = registerBlock("frozen_stone",
            new Block(FabricBlockSettings.of(Material.STONE).strength(3f).requiresTool()), ModItemGroups.ICE_AGE);
    public static final Block SPEED_BLOCK = registerBlock("speed_block",
            new SpeedyBlock(FabricBlockSettings.of(Material.STONE).strength(1f).requiresTool()), ModItemGroups.ICE_AGE);


    

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(TestMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        System.out.println("Registering Mod Blocks for " + TestMod.MOD_ID);


    }


}
