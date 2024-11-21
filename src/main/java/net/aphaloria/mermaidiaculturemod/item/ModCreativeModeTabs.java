package net.aphaloria.mermaidiaculturemod.item;

import net.aphaloria.mermaidiaculturemod.MermaidiaCultureMod;
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
            () -> CreativeModeTab.builder().icon(()->new ItemStack(ModItems.PEARL.get()))
                    .title(Component.translatable("creativetab.mermaidiaculturemod.mermaidia_items"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(ModItems.PEARL.get());
                        output.accept(ModItems.MERMAID_NECKLACE.get());


                    }).build());




    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}


