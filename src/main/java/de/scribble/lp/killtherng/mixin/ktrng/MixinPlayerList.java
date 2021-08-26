package de.scribble.lp.killtherng.mixin.ktrng;

import java.util.List;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.network.NetHandlerPlayServer;
import net.minecraft.network.NetworkManager;
import net.minecraft.server.management.PlayerList;

@Mixin(PlayerList.class)

public class MixinPlayerList {
	@Shadow
	private List<EntityPlayerMP> playerEntityList;
	
	@Inject(method="initializeConnectionToPlayer", at = @At("RETURN"))
	public void playerLogin(NetworkManager netManager, EntityPlayerMP playerIn, NetHandlerPlayServer nethandlerplayserver, CallbackInfo ci) {
		if(playerEntityList.size()==0) {
			KillTheRNG.trackedPlayer=playerIn;
		}
	}
	
	@Inject(method = "playerLoggedOut", at = @At("RETURN"))
	public void playerLogout(EntityPlayerMP playerIn, CallbackInfo ci) {
		if(playerEntityList.size()==1) {
			KillTheRNG.trackedPlayer=playerEntityList.get(0);
		}else if(playerEntityList.size()==0) {
			KillTheRNG.trackedPlayer=null;
		}
	}
}
