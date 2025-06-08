package net.aphaloria.mermaidiaculturemod.item;

import net.aphaloria.mermaidiaculturemod.MermaidiaCultureMod;
import net.aphaloria.mermaidiaculturemod.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
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
                        output.accept(ModItems.PEARL_CLAM.get());
                        output.accept(ModItems.BANANAS.get());


                    }).build());


    public static final RegistryObject<CreativeModeTab> MERMAIDIA_BLOCKS_TAB = CREATIVE_MODE_TABS.register("mermaidia_blocks_tab",
            () -> CreativeModeTab.builder().icon(()->new ItemStack(ModBlocks.PINK_PRISMARINE.get()))
                    .withTabsBefore(MERMAIDIA_ITEMS_TAB.getId())
                    .title(Component.translatable("creativetab.mermaidiaculturemod.mermaidia_blocks"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModBlocks.RED_PRISMARINE.get());
                        output.accept(ModBlocks.RED_PRISMARINE_BRICKS.get());
                        output.accept(ModBlocks.RED_DARK_PRISMARINE.get());

                        output.accept(ModBlocks.RED_PRISMARINE_STAIRS.get());
                        output.accept(ModBlocks.RED_PRISMARINE_SLAB.get());

                        output.accept(ModBlocks.MAGIC_BLOCK.get());



                        output.accept(ModBlocks.ORANGE_PRISMARINE.get());
                        output.accept(ModBlocks.ORANGE_PRISMARINE_BRICKS.get());
                        output.accept(ModBlocks.ORANGE_DARK_PRISMARINE.get());

                        output.accept(ModBlocks.YELLOW_PRISMARINE.get());
                        output.accept(ModBlocks.YELLOW_PRISMARINE_BRICKS.get());
                        output.accept(ModBlocks.YELLOW_DARK_PRISMARINE.get());

                        output.accept(ModBlocks.GREEN_PRISMARINE.get());
                        output.accept(ModBlocks.GREEN_PRISMARINE_BRICKS.get());
                        output.accept(ModBlocks.GREEN_DARK_PRISMARINE.get());

                        output.accept(ModBlocks.PURPLE_PRISMARINE.get());
                        output.accept(ModBlocks.PURPLE_PRISMARINE_BRICKS.get());
                        output.accept(ModBlocks.PURPLE_DARK_PRISMARINE.get());

                        output.accept(ModBlocks.PINK_PRISMARINE.get());
                        output.accept(ModBlocks.PINK_PRISMARINE_BRICKS.get());
                        output.accept(ModBlocks.PINK_DARK_PRISMARINE.get());

                        output.accept(ModBlocks.BRAIN_CORAL_BRICKS.get());
                        output.accept(ModBlocks.MOSSY_BRAIN_CORAL.get());
                        output.accept(ModBlocks.MOSSY_BRAIN_CORAL_BRICKS.get());
                        output.accept(ModBlocks.BRAIN_CORAL_PILLAR.get());

                        output.accept(ModBlocks.BUBBLE_CORAL_BRICKS.get());
                        output.accept(ModBlocks.MOSSY_BUBBLE_CORAL.get());
                        output.accept(ModBlocks.MOSSY_BUBBLE_CORAL_BRICKS.get());

                        output.accept(ModBlocks.FIRE_CORAL_BRICKS.get());
                        output.accept(ModBlocks.MOSSY_FIRE_CORAL.get());
                        output.accept(ModBlocks.MOSSY_FIRE_CORAL_BRICKS.get());

                        output.accept(ModBlocks.HORN_CORAL_BRICKS.get());
                        output.accept(ModBlocks.MOSSY_HORN_CORAL.get());
                        output.accept(ModBlocks.MOSSY_HORN_CORAL_BRICKS.get());

                        output.accept(ModBlocks.TUBE_CORAL_BRICKS.get());
                        output.accept(ModBlocks.MOSSY_TUBE_CORAL.get());
                        output.accept(ModBlocks.MOSSY_TUBE_CORAL_BRICKS.get());

                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}


