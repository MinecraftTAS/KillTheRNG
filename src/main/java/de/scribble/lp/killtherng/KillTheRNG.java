package de.scribble.lp.killtherng;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.scribble.lp.killtherng.commands.CommandFindSeed;
import de.scribble.lp.killtherng.commands.CommandKillTheRNG;
import de.scribble.lp.killtherng.commands.CommandSeedingMode;
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
    public static final String VERSION = "${version}";
    public static final String MCVER = "${mcversion}";
    
    public static final Logger LOGGER = LogManager.getLogger("KillTheRNG");
    
    public static SeedingModes mode=SeedingModes.None;
    
    public static final UltimateRandomness randomness = new UltimateRandomness();

    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    }
    
    @EventHandler
    public void postinit(FMLPostInitializationEvent event) {
    }
    
    @EventHandler
    public void onServerStart(FMLServerStartingEvent ev) {
    	ev.registerServerCommand(new CommandKillTheRNG());
    	ev.registerServerCommand(new CommandSeedingMode());
    	ev.registerServerCommand(new CommandFindSeed());
    }
    
}
