package com.minecrafttas.killtherng.mixin.ktrng;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.minecrafttas.killtherng.KillTheRNG;

import net.minecraft.client.Minecraft;
import net.minecraft.client.network.NetHandlerPlayClient;

@Mixin(NetHandlerPlayClient.class)
public class MixinNetHandlerPlayClient {
	@Shadow
	private Minecraft gameController;

	@Inject(method = "handleJoinGame", at = @At(value = "RETURN"))
	public void clientJoinServerEvent(CallbackInfo ci) {
		KillTheRNG.onPlayerJoinedClientSide(gameController.player);
	}

}