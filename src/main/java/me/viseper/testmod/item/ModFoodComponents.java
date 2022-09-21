package me.viseper.testmod.item;

import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
import net.minecraft.item.FoodComponents;
import net.minecraft.screen.ScreenHandler;

public class ModFoodComponents{

    public static final FoodComponent FROZEN_APPLE = new FoodComponent.Builder().hunger(4).saturationModifier(1.2F).
            statusEffect(new StatusEffectInstance(StatusEffects.STRENGTH, 100, 0), 0.2f).
            statusEffect(new StatusEffectInstance(StatusEffects.WEAKNESS, 100, 0), 0.2f).
            statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 80, 1), 0.05f).
            statusEffect(new StatusEffectInstance(StatusEffects.BLINDNESS, 100, 0), 0.2f).
            statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 400, 2), 1.0F).
            statusEffect(new StatusEffectInstance(StatusEffects.SPEED, 6000, 4), 1.0F).
            statusEffect(new StatusEffectInstance(StatusEffects.JUMP_BOOST, 6000, 2), 1.0F).
            statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400, 4), 1.0F).alwaysEdible().build();


}
