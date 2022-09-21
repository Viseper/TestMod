package me.viseper.testmod.item.custom;

import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterial;

public class ModFreezingSwordItem extends SwordItem {
    public ModFreezingSwordItem(ToolMaterial toolMaterial, int attackDamage, float attackSpeed, Settings settings) {
        super(toolMaterial, attackDamage, attackSpeed, settings);
    }

    @Override
    public boolean postHit(ItemStack stack, LivingEntity target, LivingEntity attacker) {
        if(target instanceof PlayerEntity) {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 100, 2), attacker);
        }else {
            target.addStatusEffect(new StatusEffectInstance(StatusEffects.SLOWNESS, 200, 8), attacker);
        }

        return super.postHit(stack, target, attacker);
    }
}
