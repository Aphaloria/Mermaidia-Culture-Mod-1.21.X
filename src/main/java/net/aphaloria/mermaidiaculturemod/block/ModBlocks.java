package net.aphaloria.mermaidiaculturemod.block;

import net.aphaloria.mermaidiaculturemod.MermaidiaCultureMod;
import net.aphaloria.mermaidiaculturemod.item.ModItems;
import net.minecraft.client.resources.model.Material;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.CoralFanBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.awt.*;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MermaidiaCultureMod.MOD_ID);



    public static final RegistryObject<Block> KUNZITE_PRISMARINE = registerBlock("kunzite_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> KUNZITE_DARK_PRISMARINE = registerBlock("kunzite_dark_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> KUNZITE_PRISMARINE_BRICKS = registerBlock("kunzite_prismarine_bricks",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> BRAIN_CORAL_BRICKS = registerBlock("brain_coral_bricks",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.CORAL_BLOCK)));
    public static final RegistryObject<Block> MOSSY_BRAIN_CORAL = registerBlock("mossy_brain_coral",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.CORAL_BLOCK)));
    public static final RegistryObject<Block> MOSSY_BRAIN_CORAL_BRICKS = registerBlock("mossy_brain_coral_bricks",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.CORAL_BLOCK)));

    public static final RegistryObject<Block> BUBBLE_CORAL_BRICKS = registerBlock("bubble_coral_bricks",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.CORAL_BLOCK)));
    public static final RegistryObject<Block> MOSSY_BUBBLE_CORAL = registerBlock("mossy_bubble_coral",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.CORAL_BLOCK)));
    public static final RegistryObject<Block> MOSSY_BUBBLE_CORAL_BRICKS = registerBlock("mossy_bubble_coral_bricks",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.CORAL_BLOCK)));

    public static final RegistryObject<Block> FIRE_CORAL_BRICKS = registerBlock("fire_coral_bricks",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.CORAL_BLOCK)));
    public static final RegistryObject<Block> MOSSY_FIRE_CORAL = registerBlock("mossy_fire_coral",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.CORAL_BLOCK)));
    public static final RegistryObject<Block> MOSSY_FIRE_CORAL_BRICKS = registerBlock("mossy_fire_coral_bricks",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.CORAL_BLOCK)));

    public static final RegistryObject<Block> HORN_CORAL_BRICKS = registerBlock("horn_coral_bricks",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.CORAL_BLOCK)));
    public static final RegistryObject<Block> MOSSY_HORN_CORAL = registerBlock("mossy_horn_coral",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.CORAL_BLOCK)));
    public static final RegistryObject<Block> MOSSY_HORN_CORAL_BRICKS = registerBlock("mossy_horn_coral_bricks",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.CORAL_BLOCK)));

    public static final RegistryObject<Block> TUBE_CORAL_BRICKS = registerBlock("tube_coral_bricks",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.CORAL_BLOCK)));
    public static final RegistryObject<Block> MOSSY_TUBE_CORAL = registerBlock("mossy_tube_coral",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.CORAL_BLOCK)));
    public static final RegistryObject<Block> MOSSY_TUBE_CORAL_BRICKS = registerBlock("mossy_tube_coral_bricks",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.CORAL_BLOCK)));






    // Registering the block



    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name,toReturn);
        return toReturn;
    }

    private static <T extends Block> void registerBlockItem(String name, RegistryObject<T> block) {
        ModItems.ITEMS.register(name,()-> new BlockItem(block.get(),new Item.Properties()));
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
