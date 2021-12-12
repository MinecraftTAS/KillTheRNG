package de.scribble.lp.killtherng;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.scribble.lp.killtherng.commands.CommandKillTheRNG;
import de.scribble.lp.killtherng.commands.CommandSeedingMode;
import de.scribble.lp.killtherng.networking.ChangeSeedPacket;
import de.scribble.lp.killtherng.networking.ChangeSeedPacketHandler;
import de.scribble.lp.killtherng.networking.NextSeedPacket;
import de.scribble.lp.killtherng.networking.NextSeedPacketHandler;
import de.scribble.lp.killtherng.networking.RequestGlobalSeedPacket;
import de.scribble.lp.killtherng.networking.RequestGlobalSeedPacketHandler;
import de.scribble.lp.killtherng.networking.SeedInfoPacket;
import de.scribble.lp.killtherng.networking.SeedInfoPacketHandler;
import de.scribble.lp.killtherng.networking.SeedingModePacket;
import de.scribble.lp.killtherng.networking.SeedingModePacketHandler;
import de.scribble.lp.killtherng.random2mixin.Csv2Mixin;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

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
    
    public static SeedingModes mode;
    
    public static final UltimateRandomness randomness = new UltimateRandomness();
    
    public static EntityPlayerMP trackedPlayer;
    
    public static SimpleNetworkWrapper NETWORK;

    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
//    	Csv2Mixin.main(null);
    	NETWORK = NetworkRegistry.INSTANCE.newSimpleChannel("killtherng");
    	mode=SeedingModes.PlayerInput;
    	int i = -1;
    	
    	NETWORK.registerMessage(ChangeSeedPacketHandler.class, ChangeSeedPacket.class, i++, Side.SERVER);
    	NETWORK.registerMessage(ChangeSeedPacketHandler.class, ChangeSeedPacket.class, i++, Side.CLIENT);
    	
    	NETWORK.registerMessage(SeedInfoPacketHandler.class, SeedInfoPacket.class, i++, Side.CLIENT);
    	
    	NETWORK.registerMessage(SeedingModePacketHandler.class, SeedingModePacket.class, i++, Side.CLIENT);
    	
    	NETWORK.registerMessage(NextSeedPacketHandler.class, NextSeedPacket.class, i++, Side.SERVER);
    	NETWORK.registerMessage(NextSeedPacketHandler.class, NextSeedPacket.class, i++, Side.CLIENT);
    	
    	NETWORK.registerMessage(RequestGlobalSeedPacketHandler.class, RequestGlobalSeedPacket.class, i++, Side.CLIENT);
    	NETWORK.registerMessage(RequestGlobalSeedPacketHandler.class, RequestGlobalSeedPacket.class, i++, Side.SERVER);
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
    }
    
}
