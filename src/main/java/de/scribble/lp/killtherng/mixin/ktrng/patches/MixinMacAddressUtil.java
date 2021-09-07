package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import io.netty.util.internal.MacAddressUtil;

@Mixin(MacAddressUtil.class)
public class MixinMacAddressUtil {

	/**
	* Connection Stuff
	*/
	@Redirect(method = "defaultMachineId()[B", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBytes([B)V", ordinal = 0), remap=false)
	private static void redirect_con_1(Random rand, byte[] bytes) {
//		KillTheRNG.randomness.con.nextBytes(bytes);
		KillTheRNG.randomness.con.nextBytes(bytes);
		rand.nextBytes(bytes);
	}

}
