package de.scribble.lp.killtherng.mixin.ktrng;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.server.MinecraftServer;

@Mixin(MinecraftServer.class)
public class MixinMinecraftServer {
	
	@Inject(method = "runTick", at = @At("HEAD"))
	public void inject_runTick(CallbackInfo ci) {
		KillTheRNG.tickmodeServer.onTick();
	}
}
