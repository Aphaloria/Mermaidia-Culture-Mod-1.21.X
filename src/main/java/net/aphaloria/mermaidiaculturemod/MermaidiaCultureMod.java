package net.aphaloria.mermaidiaculturemod;

import com.mojang.logging.LogUtils;
import net.aphaloria.mermaidiaculturemod.block.ModBlocks;
import net.aphaloria.mermaidiaculturemod.item.ModCreativeModeTabs;
import net.aphaloria.mermaidiaculturemod.item.ModItems;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(MermaidiaCultureMod.MOD_ID)
public class MermaidiaCultureMod {
    // Define mod id in a common place for everything to reference
    public static final String MOD_ID = "mermaidiaculturemod";
    // Directly reference a slf4j logger
    public static final Logger LOGGER = LogUtils.getLogger();

    public MermaidiaCultureMod(FMLJavaModLoadingContext context)
    {
        IEventBus modEventBus = context.getModEventBus();
        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        ModCreativeModeTabs.register(modEventBus);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
        // Register our mod's ForgeConfigSpec so that Forge can create and load the config file for us
        context.registerConfig(ModConfig.Type.COMMON, Config.SPEC);
    }

    private void commonSetup(final FMLCommonSetupEvent event) {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event) {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
            event.accept(ModItems.OCEAN_PEARL_ANIMATED);
            event.accept(ModItems.ABYSSAL_PEARL_ANIMATED);
            event.accept(ModItems.DEEP_SEA_PEARL_ANIMATED);
            event.accept(ModItems.PEARL_CLAM);
        }
        if (event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS) {
            event.accept(ModBlocks.RED_PRISMARINE);
            event.accept(ModBlocks.RED_PRISMARINE_BRICKS);
            event.accept(ModBlocks.RED_DARK_PRISMARINE);

            event.accept(ModBlocks.ORANGE_PRISMARINE);
            event.accept(ModBlocks.ORANGE_PRISMARINE_BRICKS);
            event.accept(ModBlocks.ORANGE_DARK_PRISMARINE);

            event.accept(ModBlocks.YELLOW_PRISMARINE);
            event.accept(ModBlocks.YELLOW_PRISMARINE_BRICKS);
            event.accept(ModBlocks.YELLOW_DARK_PRISMARINE);

            event.accept(ModBlocks.GREEN_PRISMARINE);
            event.accept(ModBlocks.GREEN_PRISMARINE_BRICKS);
            event.accept(ModBlocks.GREEN_DARK_PRISMARINE);

            event.accept(ModBlocks.PURPLE_PRISMARINE);
            event.accept(ModBlocks.PURPLE_PRISMARINE_BRICKS);
            event.accept(ModBlocks.PURPLE_DARK_PRISMARINE);

            event.accept(ModBlocks.PINK_PRISMARINE);
            event.accept(ModBlocks.PINK_DARK_PRISMARINE);
            event.accept(ModBlocks.PINK_PRISMARINE_BRICKS);

            event.accept(ModBlocks.BRAIN_CORAL_BRICKS);
            event.accept(ModBlocks.MOSSY_BRAIN_CORAL);
            event.accept(ModBlocks.MOSSY_BRAIN_CORAL_BRICKS);
            event.accept(ModBlocks.BRAIN_CORAL_PILLAR);

            event.accept(ModBlocks.BUBBLE_CORAL_BRICKS);
            event.accept(ModBlocks.MOSSY_BUBBLE_CORAL);
            event.accept(ModBlocks.MOSSY_BUBBLE_CORAL_BRICKS);
            event.accept(ModBlocks.BUBBLE_CORAL_PILLAR);

            event.accept(ModBlocks.FIRE_CORAL_BRICKS);
            event.accept(ModBlocks.MOSSY_FIRE_CORAL);
            event.accept(ModBlocks.MOSSY_FIRE_CORAL_BRICKS);
            event.accept(ModBlocks.FIRE_CORAL_PILLAR);

            event.accept(ModBlocks.HORN_CORAL_BRICKS);
            event.accept(ModBlocks.MOSSY_HORN_CORAL);
            event.accept(ModBlocks.MOSSY_HORN_CORAL_BRICKS);
            event.accept(ModBlocks.HORN_CORAL_PILLAR);

            event.accept(ModBlocks.TUBE_CORAL_BRICKS);
            event.accept(ModBlocks.MOSSY_TUBE_CORAL);
            event.accept(ModBlocks.MOSSY_TUBE_CORAL_BRICKS);
            event.accept(ModBlocks.TUBE_CORAL_PILLAR);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event){

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event) {

        }
    }
}