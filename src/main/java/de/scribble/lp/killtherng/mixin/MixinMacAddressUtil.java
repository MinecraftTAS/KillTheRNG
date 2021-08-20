package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import io.netty.util.internal.MacAddressUtil;

@Mixin(MacAddressUtil.class)
public class MixinMacAddressUtil {

	/**
	* null
	*/
	@Redirect(method = "defaultMachineId()[B", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBytes([B)V", ordinal = 0))
	private static void redirect_random_1912_0(Random rand, byte[] bytes) {
		KillTheRNG.randomness.random_1912.nextBytes(bytes);
	}

}
