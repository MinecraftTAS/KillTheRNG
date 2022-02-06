package de.scribble.lp.killtherng.mixin.ktrng;

import java.util.ArrayList;
import java.util.List;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.mojang.realmsclient.gui.ChatFormatting;

import de.scribble.lp.killtherng.KillTheRNG;
import de.scribble.lp.killtherng.SeedingModes;
import de.scribble.lp.killtherng.networking.RequestGlobalSeedPacket;
import de.scribble.lp.killtherng.networking.SeedingModePacket;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.network.NetworkManager;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.management.PlayerList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentString;

@Mixin(PlayerList.class)

public abstract class MixinPlayerList {
	@Shadow
	private List<EntityPlayerMP> playerEntityList;
	
	@Shadow
	private MinecraftServer mcServer;
	
	@Inject(method="initializeConnectionToPlayer", at = @At("RETURN"), remap = false)
	public void playerLogin(NetworkManager netManager, EntityPlayerMP playerIn, NetHandlerPlayServer nethandlerplayserver, CallbackInfo ci) {
		KillTheRNG.LOGGER.info("Joining game");
		if(playerEntityList.size()==1) {
			KillTheRNG.LOGGER.info("Setting tracked player to {}", playerIn.getName());
			KillTheRNG.trackedPlayer=playerIn;
			KillTheRNG.NETWORK.sendTo(new RequestGlobalSeedPacket(), playerIn);
		}
		if(KillTheRNG.mode==SeedingModes.PlayerInput&&KillTheRNG.trackedPlayer!=null) {
			if(mcServer.isDedicatedServer()) {
				playerIn.sendMessage(new TextComponentString(String.format("The current rng tracker is %s. If they move, the rng will change", ChatFormatting.BLUE+KillTheRNG.trackedPlayer.getName()+ChatFormatting.RESET)));
			}
		}
		KillTheRNG.LOGGER.info("Sending the current seeding mode {} to {}", KillTheRNG.mode.toString(), playerIn.getName());
		KillTheRNG.NETWORK.sendTo(new SeedingModePacket(KillTheRNG.mode), playerIn);
	}
	
	@Inject(method = "playerLoggedOut", at = @At("HEAD"))
	public void playerLogout(EntityPlayerMP playerIn, CallbackInfo ci) {
		if (playerEntityList.size() > 1) {
			EntityPlayerMP player = KillTheRNG.trackedPlayer;
			if (player.getUniqueID().equals(playerIn.getUniqueID())) {
				List<EntityPlayerMP> players = new ArrayList<>(playerEntityList);
				players.remove(playerIn);
				KillTheRNG.trackedPlayer = players.get(0);
				if (KillTheRNG.mode == SeedingModes.PlayerInput) {
					if (mcServer.isDedicatedServer()) {
						this.sendMessage(new TextComponentString(String.format("Current rng tracker is now %s. If they move, the rng will change", ChatFormatting.BLUE+KillTheRNG.trackedPlayer.getName()+ChatFormatting.RESET)));
					}
				}
			}
		}else if(playerEntityList.size()==1) {
			KillTheRNG.trackedPlayer=null;
		}
	}
	@Shadow
	public abstract void sendMessage(ITextComponent textComponentString);
}
