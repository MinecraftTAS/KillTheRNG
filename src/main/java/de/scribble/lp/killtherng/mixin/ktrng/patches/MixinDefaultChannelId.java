package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import io.netty.channel.DefaultChannelId;

@Mixin(DefaultChannelId.class)
public class MixinDefaultChannelId {

	/**
	* null
	*/
	@Redirect(method = "defaultProcessId()I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0), remap=false)
	private static int redirect_random_1910_1(Random rand) {
		return KillTheRNG.randomness.random_1910.nextInt();
//		KillTheRNG.randomness.random_1910.nextInt();
//		return rand.nextInt();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0), remap=false)
	public int redirect_random_1911_2(Random rand) {
		return KillTheRNG.randomness.random_1911.nextInt();
//		KillTheRNG.randomness.random_1911.nextInt();
//		return rand.nextInt();
	}

}
