package com.minecrafttas.killtherng;

import com.minecrafttas.killtherng.commands.CommandKillTheRNG;
import com.minecrafttas.killtherng.commands.CommandSeedingMode;
import com.minecrafttas.killtherng.networking.ChangeSeedPacket;
import com.minecrafttas.killtherng.networking.InitialSeedPacket;
import com.minecrafttas.killtherng.networking.SeedInfoPacket;
import com.minecrafttas.killtherng.networking.SeedingModePacket;
import com.minecrafttas.killtherng.test.TestingKeybinds;

import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLServerStartingEvent;
import net.minecraftforge.fml.common.event.FMLServerStoppingEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class KillTheRNGContainer {
	 @EventHandler
	    public void preinit(FMLPreInitializationEvent event) {
//	    	Csv2Mixin2.main(null);
	    	KillTheRNG.NETWORK = NetworkRegistry.INSTANCE.newSimpleChannel("killtherng");
	    	int i = -1;
	    	
	    	KillTheRNG.NETWORK.registerMessage(ChangeSeedPacket.ChangeSeedPacketHandler.class, ChangeSeedPacket.class, i++, Side.SERVER);
	    	KillTheRNG.NETWORK.registerMessage(ChangeSeedPacket.ChangeSeedPacketHandler.class, ChangeSeedPacket.class, i++, Side.CLIENT);
	    	
	    	KillTheRNG.NETWORK.registerMessage(SeedInfoPacket.SeedInfoPacketHandler.class, SeedInfoPacket.class, i++, Side.CLIENT);
	    	
	    	KillTheRNG.NETWORK.registerMessage(SeedingModePacket.SeedingModePacketHandler.class, SeedingModePacket.class, i++, Side.CLIENT);
	    	
	    	KillTheRNG.NETWORK.registerMessage(InitialSeedPacket.InitialSeedPacketHandler.class, InitialSeedPacket.class, i++, Side.SERVER);
	    	
	    	MinecraftForge.EVENT_BUS.register(new TestingKeybinds());
	    }

	    @EventHandler
	    public void onServerStart(FMLServerStartingEvent ev) {
	    	ev.registerServerCommand(new CommandKillTheRNG());
	    	ev.registerServerCommand(new CommandSeedingMode());
	    	KillTheRNG.playerManager = new ServerPlayerManager();
	    	KillTheRNG.annotations.register(KillTheRNG.keys);
	    }
	    
	    @EventHandler
	    public void onServerClose(FMLServerStoppingEvent ev) {
	    	KillTheRNG.playerManager = null;
	    }
	    
	    @SideOnly(Side.CLIENT)
	    public static void onPlayerJoinedClientSide(EntityPlayerSP player) {
	    	KillTheRNG.NETWORK.sendToServer(new InitialSeedPacket(KillTheRNG.clientRandom.GlobalClient.getSeed()));
	    }
}
