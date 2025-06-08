package net.aphaloria.mermaidiaculturemod.block;

import net.aphaloria.mermaidiaculturemod.MermaidiaCultureMod;
import net.aphaloria.mermaidiaculturemod.block.custom.MagicBlock;
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

    public static final RegistryObject<Block> MAGIC_BLOCK = registerBlock("magic_block",
            ()-> new MagicBlock(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> RED_PRISMARINE = registerBlock("red_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_DARK_PRISMARINE = registerBlock("red_dark_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_PRISMARINE_BRICKS = registerBlock("red_prismarine_bricks",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> RED_PRISMARINE_STAIRS = registerBlock("red_prismarine_stairs",
            ()-> new StairBlock(ModBlocks.RED_PRISMARINE.get().defaultBlockState(),
            BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> RED_PRISMARINE_SLAB = registerBlock("red_prismarine_slab",
            ()-> new SlabBlock(BlockBehaviour.Properties.of()
                            .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> ORANGE_PRISMARINE = registerBlock("orange_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ORANGE_DARK_PRISMARINE = registerBlock("orange_dark_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> ORANGE_PRISMARINE_BRICKS = registerBlock("orange_prismarine_bricks",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> YELLOW_PRISMARINE = registerBlock("yellow_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> YELLOW_DARK_PRISMARINE = registerBlock("yellow_dark_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> YELLOW_PRISMARINE_BRICKS = registerBlock("yellow_prismarine_bricks",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> GREEN_PRISMARINE = registerBlock("green_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> GREEN_DARK_PRISMARINE = registerBlock("green_dark_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> GREEN_PRISMARINE_BRICKS = registerBlock("green_prismarine_bricks",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> PURPLE_PRISMARINE = registerBlock("purple_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> PURPLE_DARK_PRISMARINE = registerBlock("purple_dark_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> PURPLE_PRISMARINE_BRICKS = registerBlock("purple_prismarine_bricks",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));

    public static final RegistryObject<Block> PINK_PRISMARINE = registerBlock("pink_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> PINK_DARK_PRISMARINE = registerBlock("pink_dark_prismarine",
            ()-> new Block(BlockBehaviour.Properties.of()
                    .strength(4f).requiresCorrectToolForDrops().sound(SoundType.STONE)));
    public static final RegistryObject<Block> PINK_PRISMARINE_BRICKS = registerBlock("pink_prismarine_bricks",
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
    public static final RegistryObject<Block> BRAIN_CORAL_PILLAR = registerBlock("brain_coral_pillar",
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
    public static final RegistryObject<Block> BUBBLE_CORAL_PILLAR = registerBlock("bubble_coral_pillar",
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
    public static final RegistryObject<Block> FIRE_CORAL_PILLAR = registerBlock("fire_coral_pillar",
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
    public static final RegistryObject<Block> HORN_CORAL_PILLAR = registerBlock("horn_coral_pillar",
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
    public static final RegistryObject<Block> TUBE_CORAL_PILLAR = registerBlock("tube_coral_pillar",
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
