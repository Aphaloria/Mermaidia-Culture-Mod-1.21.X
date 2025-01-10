package net.aphaloria.mermaidiaculturemod.item;

import net.aphaloria.mermaidiaculturemod.MermaidiaCultureMod;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.rmi.registry.Registry;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MermaidiaCultureMod.MOD_ID);

    public static final RegistryObject<Item> OCEAN_PEARL_ANIMATED = ITEMS.register("ocean_pearl_animated",
            ()  -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> DEEP_SEA_PEARL_ANIMATED = ITEMS.register("deep_sea_pearl_animated",
            ()  -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> ABYSSAL_PEARL_ANIMATED = ITEMS.register("abyssal_pearl_animated",
            ()  -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> PEARL_CLAM = ITEMS.register("pearl_clam",
            ()  -> new Item(new Item.Properties()));




    public static final RegistryObject<Item> ABYSSAL_MERMAID_NECKLACE = ITEMS.register("abyssal_mermaid_necklace",
            ()-> new ArmorItem(ModArmorMaterials.ABYSSAL_MERMAID_NECKLACE, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(7))));

    public static final RegistryObject<Item> DEEP_SEA_MERMAID_NECKLACE = ITEMS.register("deep_sea_mermaid_necklace",
            ()-> new ArmorItem(ModArmorMaterials.DEEP_SEA_MERMAID_NECKLACE, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(7))));

    public static final RegistryObject<Item> OCEAN_MERMAID_NECKLACE = ITEMS.register("ocean_mermaid_necklace",
            ()-> new ArmorItem(ModArmorMaterials.OCEAN_MERMAID_NECKLACE, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(7))));




    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
