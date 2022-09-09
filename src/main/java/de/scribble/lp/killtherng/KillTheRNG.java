package de.scribble.lp.killtherng;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import de.scribble.lp.killtherng.commands.CommandKillTheRNG;
import de.scribble.lp.killtherng.commands.CommandSeedingMode;
import de.scribble.lp.killtherng.custom.KTRNGEventHandler;
import de.scribble.lp.killtherng.networking.ChangeSeedPacket;
import de.scribble.lp.killtherng.networking.NextSeedPacket;
import de.scribble.lp.killtherng.networking.RequestGlobalSeedPacket;
import de.scribble.lp.killtherng.networking.SeedInfoPacket;
import de.scribble.lp.killtherng.networking.SeedingModePacket;
import de.scribble.lp.killtherng.networking.UpdateClientSeedPacket;
import de.scribble.lp.killtherng.random2mixin.csv2mixin.Csv2Mixin2;
import de.scribble.lp.killtherng.test.TestingKeybinds;
import de.scribble.lp.killtherng.tickmode.TickModeServer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

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
    
    /**
     * Change this to true if you are using KTRNG with another mod
     */
    public static boolean isLibrary=false;
    
    public static SeedingModes mode=SeedingModes.Tick;
    
    public static final UltimateRandomness randomness = new UltimateRandomness();
    
    public static final UltimateRandomnessClient clientRandom = new UltimateRandomnessClient();
    public static final UltimateRandomnessCommon commonRandom = new UltimateRandomnessCommon();
    
    public static EntityPlayerMP trackedPlayer;
    
    public static SimpleNetworkWrapper NETWORK;
    
    public static KTRNGEventHandler eventHandler = new KTRNGEventHandler();

    public static final TickModeServer tickmodeServer = new TickModeServer();
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event) {
    	Csv2Mixin2.main(null);
    	NETWORK = NetworkRegistry.INSTANCE.newSimpleChannel("killtherng");
    	int i = -1;
    	
    	NETWORK.registerMessage(ChangeSeedPacket.ChangeSeedPacketHandler.class, ChangeSeedPacket.class, i++, Side.SERVER);
    	NETWORK.registerMessage(ChangeSeedPacket.ChangeSeedPacketHandler.class, ChangeSeedPacket.class, i++, Side.CLIENT);
    	
    	NETWORK.registerMessage(SeedInfoPacket.SeedInfoPacketHandler.class, SeedInfoPacket.class, i++, Side.CLIENT);
    	
    	NETWORK.registerMessage(SeedingModePacket.SeedingModePacketHandler.class, SeedingModePacket.class, i++, Side.CLIENT);
    	
    	NETWORK.registerMessage(NextSeedPacket.NextSeedPacketHandler.class, NextSeedPacket.class, i++, Side.SERVER);
    	NETWORK.registerMessage(NextSeedPacket.NextSeedPacketHandler.class, NextSeedPacket.class, i++, Side.CLIENT);
    	
    	NETWORK.registerMessage(RequestGlobalSeedPacket.RequestGlobalSeedPacketHandler.class, RequestGlobalSeedPacket.class, i++, Side.CLIENT);
    	NETWORK.registerMessage(RequestGlobalSeedPacket.RequestGlobalSeedPacketHandler.class, RequestGlobalSeedPacket.class, i++, Side.SERVER);
    	
    	NETWORK.registerMessage(UpdateClientSeedPacket.UpdateClientSeedPacketHandler.class, UpdateClientSeedPacket.class, i++, Side.CLIENT);
    	
    	MinecraftForge.EVENT_BUS.register(new TestingKeybinds());
    }

    @EventHandler
    public void onServerStart(FMLServerStartingEvent ev) {
    	ev.registerServerCommand(new CommandKillTheRNG());
    	ev.registerServerCommand(new CommandSeedingMode());
    }
    
}
