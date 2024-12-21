package net.aphaloria.mermaidiaculturemod.block;

import net.aphaloria.mermaidiaculturemod.MermaidiaCultureMod;
import net.aphaloria.mermaidiaculturemod.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MermaidiaCultureMod.MOD_ID);



    public static final RegistryObject<Block> RUBY_PRISMARINE = registerBlock("ruby_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RUBY_DARK_PRISMARINE = registerBlock("ruby_dark_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RUBY_PRISMARINE_BRICKS = registerBlock("ruby_prismarine_bricks",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> AMBER_PRISMARINE = registerBlock("amber_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMBER_DARK_PRISMARINE = registerBlock("amber_dark_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMBER_PRISMARINE_BRICKS = registerBlock("amber_prismarine_bricks",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> CITRINE_PRISMARINE = registerBlock("citrine_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CITRINE_DARK_PRISMARINE = registerBlock("citrine_dark_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> CITRINE_PRISMARINE_BRICKS = registerBlock("citrine_prismarine_bricks",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> PERIDOT_PRISMARINE = registerBlock("peridot_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERIDOT_DARK_PRISMARINE = registerBlock("peridot_dark_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> PERIDOT_PRISMARINE_BRICKS = registerBlock("peridot_prismarine_bricks",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> AMETHYST_PRISMARINE = registerBlock("amethyst_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMETHYST_DARK_PRISMARINE = registerBlock("amethyst_dark_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> AMETHYST_PRISMARINE_BRICKS = registerBlock("amethyst_prismarine_bricks",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> ROSE_QUARTZ_PRISMARINE = registerBlock("rose_quartz_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ROSE_QUARTZ_DARK_PRISMARINE = registerBlock("rose_quartz_dark_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ROSE_QUARTZ_PRISMARINE_BRICKS = registerBlock("rose_quartz_prismarine_bricks",
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
