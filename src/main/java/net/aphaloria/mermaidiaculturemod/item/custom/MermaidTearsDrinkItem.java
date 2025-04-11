package net.aphaloria.mermaidiaculturemod.item.custom;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.UseAnim;

public class MermaidTearsDrinkItem {
    public UseAnim getUseAnimation(ItemStack pStack) {
        return UseAnim.DRINK;
    }
}
