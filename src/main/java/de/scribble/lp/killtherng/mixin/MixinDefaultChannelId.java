package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import io.netty.channel.DefaultChannelId;

@Mixin(DefaultChannelId.class)
public class MixinDefaultChannelId {
	@Redirect(method = "defaultProcessId()I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	private static int redirect_random_1910(Random rand) {
		return KillTheRNG.randomness.random_1910.nextInt();
	}

	@Redirect(method = "<init>()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	public int redirect_random_1911(Random rand) {
		return KillTheRNG.randomness.random_1911.nextInt();
	}

}
