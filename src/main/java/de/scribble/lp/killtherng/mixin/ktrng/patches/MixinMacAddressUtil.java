package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(io.netty.util.internal.MacAddressUtil.class)
public class MixinMacAddressUtil{

	/**
	* Connection Stuff
	*/
	@Redirect(method = "defaultMachineId()[B", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBytes([B)V", ordinal = 0), remap = false)
	private static void redirect_con_1(Random rand, byte[] bytes) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.con.isEnabled()) {
			de.scribble.lp.killtherng.KillTheRNG.randomness.con.nextBytes(bytes);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.con.nextBytes(bytes);
			rand.nextBytes(bytes);
		}
	}


}