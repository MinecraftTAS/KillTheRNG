package de.scribble.lp.killtherng;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.scribble.lp.killtherng.commands.CommandKillTheRNG;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;

@Mod(
        modid = KillTheRNG.MOD_ID,
        name = KillTheRNG.MOD_NAME,
        version = KillTheRNG.VERSION
)
public class KillTheRNG {

    public static final String MOD_ID = "killtherng";
    public static final String MOD_NAME = "KillTheRNG";
    public static final String VERSION = "Alpha";
    
    public static final Logger LOGGER = LogManager.getLogger("KillTheRNG");

    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    	MinecraftForge.EVENT_BUS.register(new KTRNGEventHandler());
    	UltimateRandomness.set(0, false);
    }
    @EventHandler
    public void postinit(FMLPostInitializationEvent event) {
    }
    @EventHandler
    public void onServerStart(FMLServerStartingEvent ev) {
    	ev.registerServerCommand(new CommandKillTheRNG());
    }
}
