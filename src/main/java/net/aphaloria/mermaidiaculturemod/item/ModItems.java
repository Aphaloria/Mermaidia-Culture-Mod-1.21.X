package net.aphaloria.mermaidiaculturemod.item;

import net.aphaloria.mermaidiaculturemod.MermaidiaCultureMod;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MermaidiaCultureMod.MOD_ID);

    public static final RegistryObject<Item> NECKLACE = ITEMS.register("necklace",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> PEARL = ITEMS.register("pearl",
            ()  -> new Item(new Item.Properties()));


    public static final RegistryObject<Item> MERMAID_NECKLACE = ITEMS.register("necklace",
            ()-> new ArmorItem(ModArmorMaterials.NECKLACE_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE,
                    new Item.Properties().durability(ArmorItem.Type.CHESTPLATE.getDurability(37))));


   public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
