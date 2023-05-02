package com.minecrafttas.killtherng;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.minecrafttas.killtherng.custom.EventAnnotations;
import com.minecrafttas.killtherng.custom.KTRNGEventHandler;
import com.minecrafttas.killtherng.test.TestingKeybinds;

import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;

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
    
    public static SeedingModes mode=SeedingModes.TickChange;
    
    public static final UltimateRandomnessClient clientRandom = new UltimateRandomnessClient();
    public static final UltimateRandomnessCommon commonRandom = new UltimateRandomnessCommon();
    
    public static SimpleNetworkWrapper NETWORK;
    
    public static ServerPlayerManager playerManager;
    
    public static KTRNGEventHandler eventHandler = new KTRNGEventHandler();

    public static final TickModeServer tickmodeServer = new TickModeServer();
    
    public static EventAnnotations annotations = new EventAnnotations();
    
    public static TestingKeybinds keys = new TestingKeybinds();
    
	public static void onPlayerLeaveServerSide(EntityPlayerMP playerIn) {
//		if(playerManager!=null)
//			playerManager.free(playerIn);
	}
	
}
