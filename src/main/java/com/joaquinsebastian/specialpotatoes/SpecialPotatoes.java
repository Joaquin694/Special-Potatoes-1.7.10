package com.joaquinsebastian.specialpotatoes;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;

@Mod(modid = SpecialPotatoes.MODID, version = Tags.VERSION, name = "specialpotatoes", acceptedMinecraftVersions = "[1.7.10]")
public class SpecialPotatoes {
    public static final String MODID = "specialpotatoes";
    public static final Logger LOG = LogManager.getLogger(MODID);

    @SidedProxy(clientSide = "com.joaquinsebastian.specialpotatoes.ClientProxy", serverSide = "com.joaquinsebastian.specialpotatoes.CommonProxy")
    public static CommonProxy proxy;

    @Mod.EventHandler
    // preInit "Run before anything else. Read your config, create blocks, items, etc, and register them with the
    // GameRegistry." (Remove if not needed)
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @Mod.EventHandler
    // load "Do your mod setup. Build whatever data structures you care about. Register recipes." (Remove if not needed)
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @Mod.EventHandler
    // postInit "Handle interaction with other mods, complete your setup based on this." (Remove if not needed)
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }

    @Mod.EventHandler
    // register server commands in this event handler (Remove if not needed)
    public void serverStarting(FMLServerStartingEvent event) {
        proxy.serverStarting(event);
    }

    public static CreativeTabs tabSpecialPotatoes = new CreativeTabs("specialpotatoes") {
        @Override
        @SideOnly(Side.CLIENT)
        public Item getTabIconItem() {
            return CommonProxy.ironPotato;
            /*
            return CommonProxy.minerPotato;
            return CommonProxy.bouncyPotato;
            return  CommonProxy.creeperPotato;
            return CommonProxy.kingPotato;
            return CommonProxy.oceanPotato;
             */

        }
    };



}
