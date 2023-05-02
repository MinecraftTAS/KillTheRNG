package com.minecrafttas.killtherng.mixin.ktrng;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import com.minecrafttas.killtherng.KillTheRNG;

import net.minecraft.server.MinecraftServer;

@Mixin(MinecraftServer.class)
public class MixinMinecraftServer {
	
	@Inject(method = "tick", at = @At("HEAD"))
	public void inject_tick(CallbackInfo ci) {
		KillTheRNG.tickmodeServer.onTick();
	}
}
