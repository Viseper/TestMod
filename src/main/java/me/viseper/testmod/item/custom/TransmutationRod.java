package me.viseper.testmod.item.custom;

import net.minecraft.block.Block;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.text.Text;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.server.network.ServerPlayerInteractionManager;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class TransmutationRod extends Item {
    public TransmutationRod(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
            BlockPos positionClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            Item offHand = player.getOffHandStack().getItem();
            Block block = Block.getBlockFromItem(offHand);
            if(block != null) {
             context.getWorld().setBlockState(positionClicked, block.getDefaultState());
            }

        context.getStack().damage(1, context.getPlayer(), (playerEntity) -> playerEntity.sendToolBreakStatus(playerEntity.getActiveHand()));
        return super.useOnBlock(context);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable World world, List<Text> tooltip, TooltipContext context) {
        if(Screen.hasShiftDown()) {
            tooltip.add(Text.literal("item.testmod.transmutation_rod.tooltip.shift"));
        }else {
            tooltip.add(Text.literal("item.testmod.transmutation_rod.tooltip"));
        }
    }
}
