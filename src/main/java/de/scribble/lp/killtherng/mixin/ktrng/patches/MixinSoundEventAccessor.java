package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.audio.SoundEventAccessor;

@Mixin(SoundEventAccessor.class)
public class MixinSoundEventAccessor {

	/**
	* null
	*/
	@Redirect(method = "cloneEntry()Lnet/minecraft/client/audio/Sound;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1365_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1365.nextInt(i);
//		KillTheRNG.randomness.random_1365.nextInt(i);
//		return rand.nextInt(i);
	}

}
