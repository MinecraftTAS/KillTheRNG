package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.audio.SoundEventAccessor.class)
public class MixinSoundEventAccessor{

	/**
	* null
	*/
	@Redirect(method = "cloneEntry()Lnet/minecraft/client/audio/Sound;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1365_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1365.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1365.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1365.nextInt(i);
			return rand.nextInt(i);
		}
	}


}