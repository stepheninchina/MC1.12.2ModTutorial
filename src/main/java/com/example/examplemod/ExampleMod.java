package com.example.examplemod;

import com.example.examplemod.proxy.CommonProxy;
import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.apache.logging.log4j.Logger;

@Mod(modid = ModSettings.MODID, name = ModSettings.NAME, version = ModSettings.VERSION)
public class ExampleMod
{
    @Mod.Instance(ExampleMod.MODID)
    private static ExampleMod instance;

    @SidedProxy
            (clientSide = ModSettings.ClientProxy,
            serverSide = ModSettings.CommonProxy
        )
    private static CommonProxy proxy;

    private static Logger logger;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        logger = event.getModLog();
        logger.info("preInit");
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        // some example code
        logger.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
        proxy.init(event);
    }
}
