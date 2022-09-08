package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(paulscode.sound.SoundSystem.class)
public class MixinSoundSystem{

	/**
	* Chooses a random pointless number for a sound that plays
	*/
	@Redirect(method = "quickPlay(ZLjava/lang/String;ZFFFIF)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0), remap = false)
	public int redirect_soundId_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.nextInt();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.nextInt();
			return rand.nextInt();
		}
	}

	/**
	* Chooses a random pointless number for a sound that plays
	*/
	@Redirect(method = "quickPlay(ZLjava/lang/String;ZFFFIF)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 1), remap = false)
	public int redirect_soundId_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.nextInt();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.nextInt();
			return rand.nextInt();
		}
	}

	/**
	* Chooses a random pointless number for a sound that plays
	*/
	@Redirect(method = "quickPlay(ZLjava/net/URL;Ljava/lang/String;ZFFFIF)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0), remap = false)
	public int redirect_soundId_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.nextInt();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.nextInt();
			return rand.nextInt();
		}
	}

	/**
	* Chooses a random pointless number for a sound that plays
	*/
	@Redirect(method = "quickPlay(ZLjava/net/URL;Ljava/lang/String;ZFFFIF)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 1), remap = false)
	public int redirect_soundId_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.nextInt();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.nextInt();
			return rand.nextInt();
		}
	}

	/**
	* Chooses a random pointless number for a sound that plays
	*/
	@Redirect(method = "quickStream(ZLjava/lang/String;ZFFFIF)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0), remap = false)
	public int redirect_soundId_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.nextInt();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.nextInt();
			return rand.nextInt();
		}
	}

	/**
	* Chooses a random pointless number for a sound that plays
	*/
	@Redirect(method = "quickStream(ZLjava/lang/String;ZFFFIF)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 1), remap = false)
	public int redirect_soundId_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.nextInt();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.nextInt();
			return rand.nextInt();
		}
	}

	/**
	* Chooses a random pointless number for a sound that plays
	*/
	@Redirect(method = "quickStream(ZLjava/net/URL;Ljava/lang/String;ZFFFIF)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0), remap = false)
	public int redirect_soundId_7(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.nextInt();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.nextInt();
			return rand.nextInt();
		}
	}

	/**
	* Chooses a random pointless number for a sound that plays
	*/
	@Redirect(method = "quickStream(ZLjava/net/URL;Ljava/lang/String;ZFFFIF)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 1), remap = false)
	public int redirect_soundId_8(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.nextInt();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.soundId.nextInt();
			return rand.nextInt();
		}
	}


}