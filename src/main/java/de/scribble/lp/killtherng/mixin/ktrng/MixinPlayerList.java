package de.scribble.lp.killtherng.mixin.ktrng;

import java.util.List;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.mojang.realmsclient.gui.ChatFormatting;

import de.scribble.lp.killtherng.KillTheRNG;
import de.scribble.lp.killtherng.SeedingModes;
import de.scribble.lp.killtherng.networking.SeedingModePacket;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.network.NetworkManager;
import net.minecraft.server.management.PlayerList;
import net.minecraft.util.text.TextComponentString;

@Mixin(PlayerList.class)

public abstract class MixinPlayerList {
	@Shadow
	private List<EntityPlayerMP> playerEntityList;
	
	@Inject(method="initializeConnectionToPlayer", at = @At("RETURN"))
	public void playerLogin(NetworkManager netManager, EntityPlayerMP playerIn, NetHandlerPlayServer nethandlerplayserver, CallbackInfo ci) {
		System.out.println(playerEntityList.size());
		if(playerEntityList.size()==1) {
			KillTheRNG.trackedPlayer=playerIn;
		}
		if(KillTheRNG.mode==SeedingModes.PlayerInput&&KillTheRNG.trackedPlayer!=null) {
			playerIn.sendMessage(new TextComponentString(String.format("The current rng tracker is %s. If they move the, rng will change", ChatFormatting.BLUE+KillTheRNG.trackedPlayer.getName()+ChatFormatting.RESET)));
		}
		KillTheRNG.NETWORK.sendTo(new SeedingModePacket(KillTheRNG.mode), playerIn);
	}
	
	@Inject(method = "playerLoggedOut", at = @At("RETURN"))
	public void playerLogout(EntityPlayerMP playerIn, CallbackInfo ci) {
		System.out.println(playerEntityList.size()+"AAAAAAAAAAAAAAAAAAAAAA");
		if(playerEntityList.size()>1) {
			EntityPlayerMP player=KillTheRNG.trackedPlayer;
			if(player.getUniqueID().equals(playerIn.getUniqueID())) {
				KillTheRNG.trackedPlayer=playerEntityList.get(0);
				if(KillTheRNG.mode==SeedingModes.PlayerInput) {
					this.sendMessage(new TextComponentString(String.format("Current rng tracker is now %s. If they move, the rng will change", playerIn.getName())));
				}
			}
		}else if(playerEntityList.size()==1) {
			KillTheRNG.trackedPlayer=null;
		}
	}

	abstract void sendMessage(TextComponentString textComponentString);
}
