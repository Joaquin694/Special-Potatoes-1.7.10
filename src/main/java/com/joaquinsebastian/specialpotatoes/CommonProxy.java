package com.joaquinsebastian.specialpotatoes;

import com.joaquinsebastian.specialpotatoes.items.*;
import net.minecraft.item.Item;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.registry.GameRegistry;

public class CommonProxy {

    public static Item bouncyPotato;
    public static Item ironPotato;
    public static Item creeperPotato;
    public static Item oceanPotato;
    public static Item kingPotato;
    public static Item minerPotato;
    public static Item firePotato;

    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        Config.synchronizeConfiguration(event.getSuggestedConfigurationFile());

        minerPotato = new MinerPotato();
        bouncyPotato = new ItemBouncyPotato();
        ironPotato = new ItemIronPotato();
        creeperPotato = new ItemCreeperPotato();
        oceanPotato = new ItemOceanPotato();
        kingPotato = new ItemKingPotato();
        firePotato = new FirePotato();

        // Registrar
        GameRegistry.registerItem(bouncyPotato, "bouncy_potato");
        GameRegistry.registerItem(ironPotato, "iron_potato");
        GameRegistry.registerItem(creeperPotato, "creeper_potato");
        GameRegistry.registerItem(oceanPotato, "ocean_potato");
        GameRegistry.registerItem(kingPotato, "king_potato");
        GameRegistry.registerItem(minerPotato, "miner_potato");
        GameRegistry.registerItem(firePotato, "fire_potato");
    }

    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
        CraftingRegistry.registerRecipes();
    }

    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {}

    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {}
}
