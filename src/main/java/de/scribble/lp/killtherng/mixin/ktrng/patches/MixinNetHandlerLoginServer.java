package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.server.network.NetHandlerLoginServer.class)
public class MixinNetHandlerLoginServer{

	/**
	* Token for verifying incoming packets
	*/
	@Redirect(method = "<init>(Lnet/minecraft/server/MinecraftServer;Lnet/minecraft/network/NetworkManager;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBytes([B)V", ordinal = 0))
	public void redirect_serverToken_1(Random rand, byte[] bytes) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.serverToken.isEnabled()) {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.serverToken.nextBytes(bytes);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.serverToken.nextBytes(bytes);
			rand.nextBytes(bytes);
		}
	}


}