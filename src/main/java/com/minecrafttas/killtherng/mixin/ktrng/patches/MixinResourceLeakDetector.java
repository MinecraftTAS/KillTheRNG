package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(io.netty.util.ResourceLeakDetector.class)
public class MixinResourceLeakDetector{

	/**
	* Sampling interval for leak
	*/
	@Redirect(method = "track0(Ljava/lang/Object;)Lio/netty/util/ResourceLeakDetector$DefaultResourceLeak;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	public int redirect_nettyLeakDetector_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.nettyLeakDetector.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.nettyLeakDetector.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.nettyLeakDetector.nextInt(i);
			return rand.nextInt(i);
		}
	}


}