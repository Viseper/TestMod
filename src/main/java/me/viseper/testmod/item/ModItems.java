package me.viseper.testmod.item;

import me.viseper.testmod.TestMod;
import me.viseper.testmod.item.custom.*;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    public static final Item ICE_INGOT = registerItems("ice_ingot",
            new Item(new FabricItemSettings().group(ModItemGroups.ICE_AGE)));

    public static final Item TRANSMUTATION_ROD = registerItems("transmutation_rod",
            new TransmutationRod(new FabricItemSettings().group(ItemGroup.TOOLS).maxDamage(20)));
    public static final Item FROZEN_APPLE = registerItems("frozen_apple",
            new Item(new FabricItemSettings().group(ModItemGroups.ICE_AGE).food(ModFoodComponents.FROZEN_APPLE)));
    public static final Item ICE_SHARD = registerItems("ice_shard",
            new Item(new FabricItemSettings().group(ModItemGroups.ICE_AGE)));
    public static final Item ICE_SWORD = registerItems("ice_sword",
            new ModFreezingSwordItem(ModToolMaterials.ICE, 4, -2f, new FabricItemSettings().group(ModItemGroups.ICE_AGE)));
    public static final Item ICE_PICKAXE = registerItems("ice_pickaxe",
            new ModPickaxeItem(ModToolMaterials.ICE, 1, -3.2f, new FabricItemSettings().group(ModItemGroups.ICE_AGE)));
    public static final Item ICE_HOE = registerItems("ice_hoe",
            new ModHoeItem(ModToolMaterials.ICE, 0, -2f, new FabricItemSettings().group(ModItemGroups.ICE_AGE)));
    public static final Item ICE_AXE = registerItems("ice_axe",
            new ModWeakeningAxeItem(ModToolMaterials.ICE, 6, -3.05f, new FabricItemSettings().group(ModItemGroups.ICE_AGE)));
    public static final Item ICE_SHOVEL = registerItems("ice_shovel",
            new ShovelItem(ModToolMaterials.ICE, 1, 0f, new FabricItemSettings().group(ModItemGroups.ICE_AGE)));

    public static final Item FROST_HELMET = registerItems("frost_helmet",
            new ModArmorItem(ModArmorMaterials.FROST, EquipmentSlot.HEAD, new FabricItemSettings().group(ModItemGroups.ICE_AGE)));
    public static final Item FROST_CHESTPLATE = registerItems("frost_chestplate",
            new ArmorItem(ModArmorMaterials.FROST, EquipmentSlot.CHEST, new FabricItemSettings().group(ModItemGroups.ICE_AGE)));
    public static final Item FROST_LEGGINGS = registerItems("frost_leggins",
            new ArmorItem(ModArmorMaterials.FROST, EquipmentSlot.LEGS, new FabricItemSettings().group(ModItemGroups.ICE_AGE)));
    public static final Item FROST_BOOTS = registerItems("frost_boots",
            new ArmorItem(ModArmorMaterials.FROST, EquipmentSlot.FEET, new FabricItemSettings().group(ModItemGroups.ICE_AGE)));

    public static Item registerItems(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(TestMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        //TestMod.LOGGER.info("registering items for" + TestMod.MOD_ID);

    }
}
