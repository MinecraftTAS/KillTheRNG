package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import io.netty.util.ResourceLeakDetector;

@Mixin(ResourceLeakDetector.class)
public class MixinResourceLeakDetector {

	/**
	* Sampling interval for leak
	*/
	@Redirect(method = "track0(Ljava/lang/Object;)Lio/netty/util/ResourceLeakDetector$DefaultResourceLeak;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap=false)
	public int redirect_nettyLeakDetector_1(Random rand, int i) {
//		return KillTheRNG.randomness.nettyLeakDetector.nextInt(i);
		KillTheRNG.randomness.nettyLeakDetector.nextInt(i);
		return rand.nextInt(i);
	}

}
