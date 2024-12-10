package net.aphaloria.mermaidiaculturemod.item;

import net.aphaloria.mermaidiaculturemod.MermaidiaCultureMod;
import net.aphaloria.mermaidiaculturemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.entity.Display;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MermaidiaCultureMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MERMAIDIA_ITEMS_TAB = CREATIVE_MODE_TABS.register("mermaidia_items_tab",
            () -> CreativeModeTab.builder().icon(()->new ItemStack(ModItems.OCEAN_PEARL_ANIMATED.get()))
                    .title(Component.translatable("creativetab.mermaidiaculturemod.mermaidia_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.ABYSSAL_PEARL_ANIMATED.get());
                        output.accept(ModItems.DEEP_SEA_PEARL_ANIMATED.get());
                        output.accept(ModItems.OCEAN_PEARL_ANIMATED.get());
                        output.accept(ModItems.ABYSSAL_MERMAID_NECKLACE.get());
                        output.accept(ModItems.DEEP_SEA_MERMAID_NECKLACE.get());
                        output.accept(ModItems.OCEAN_MERMAID_NECKLACE.get());




                    }).build());


    public static final RegistryObject<CreativeModeTab> MERMAIDIA_BLOCKS_TAB = CREATIVE_MODE_TABS.register("mermaidia_blocks_tab",
            () -> CreativeModeTab.builder().icon(()->new ItemStack(ModBlocks.PINK_PRISMARINE_BRICKS.get()))
                    .withTabsBefore(MERMAIDIA_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.mermaidiaculturemod.mermaidia_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.PINK_PRISMARINE.get());
                        output.accept(ModBlocks.PINK_PRISMARINE_BRICKS.get());
                        output.accept(ModBlocks.PINK_DARK_PRISMARINE.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}


