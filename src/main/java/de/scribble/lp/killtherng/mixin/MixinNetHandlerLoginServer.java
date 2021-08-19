package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.server.network.NetHandlerLoginServer;

@Mixin(NetHandlerLoginServer.class)
public class MixinNetHandlerLoginServer {
	@Redirect(method = "<init>(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/network/NetworkManager;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBytes([B)V", ordinal = 0))
	public void redirect_random_1918(Random rand, byte[] bytes) {
		KillTheRNG.randomness.random_1918.nextBytes(bytes);
	}

}
