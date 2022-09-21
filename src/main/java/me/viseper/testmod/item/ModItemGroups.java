package me.viseper.testmod.item;

import me.viseper.testmod.TestMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ICE_AGE = FabricItemGroupBuilder.build(new Identifier(TestMod.MOD_ID, "ice_age"), () -> new ItemStack(ModItems.ICE_INGOT));
}
