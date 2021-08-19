package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import io.netty.util.ResourceLeakDetector;

@Mixin(ResourceLeakDetector.class)
public class MixinResourceLeakDetector {
	@Redirect(method = "track0(Ljava/lang/Object;)Lio/netty/util/ResourceLeakDetector$DefaultResourceLeak;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1269(Random rand, int i) {
		return KillTheRNG.randomness.random_1269.nextInt(i);
	}

}
