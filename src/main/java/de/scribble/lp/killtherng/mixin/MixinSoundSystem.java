package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import paulscode.sound.SoundSystem;

@Mixin(SoundSystem.class)
public class MixinSoundSystem {

	/**
	* null
	*/
	@Redirect(method = "quickPlay(ZLjava/lang/String;ZFFFIF)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0), remap=false)
	public int redirect_random_1366_0(Random rand) {
		return KillTheRNG.randomness.random_1366.nextInt();
	}

	/**
	* null
	*/
	@Redirect(method = "quickPlay(ZLjava/lang/String;ZFFFIF)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 1), remap=false)
	public int redirect_random_1367_1(Random rand) {
		return KillTheRNG.randomness.random_1367.nextInt();
	}

	/**
	* null
	*/
	@Redirect(method = "quickPlay(ZLjava/net/URL;Ljava/lang/String;ZFFFIF)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 2), remap=false)
	public int redirect_random_1368_2(Random rand) {
		return KillTheRNG.randomness.random_1368.nextInt();
	}

	/**
	* null
	*/
	@Redirect(method = "quickPlay(ZLjava/net/URL;Ljava/lang/String;ZFFFIF)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 3), remap=false)
	public int redirect_random_1369_3(Random rand) {
		return KillTheRNG.randomness.random_1369.nextInt();
	}

	/**
	* null
	*/
	@Redirect(method = "quickStream(ZLjava/lang/String;ZFFFIF)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0), remap=false)
	public int redirect_random_1370_0(Random rand) {
		return KillTheRNG.randomness.random_1370.nextInt();
	}

	/**
	* null
	*/
	@Redirect(method = "quickStream(ZLjava/lang/String;ZFFFIF)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 1), remap=false)
	public int redirect_random_1371_1(Random rand) {
		return KillTheRNG.randomness.random_1371.nextInt();
	}

	/**
	* null
	*/
	@Redirect(method = "quickStream(ZLjava/net/URL;Ljava/lang/String;ZFFFIF)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 2), remap=false)
	public int redirect_random_1372_2(Random rand) {
		return KillTheRNG.randomness.random_1372.nextInt();
	}

	/**
	* null
	*/
	@Redirect(method = "quickStream(ZLjava/net/URL;Ljava/lang/String;ZFFFIF)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 3), remap=false)
	public int redirect_random_1373_3(Random rand) {
		return KillTheRNG.randomness.random_1373.nextInt();
	}

}
