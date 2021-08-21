package de.scribble.lp.killtherng.mixin.ktrng.patches;

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
	public int redirect_random_1366_1(Random rand) {
		return KillTheRNG.randomness.random_1366.nextInt();
//		KillTheRNG.randomness.random_1366.nextInt();
//		return rand.nextInt();
	}

	/**
	* null
	*/
	@Redirect(method = "quickPlay(ZLjava/lang/String;ZFFFIF)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 1), remap=false)
	public int redirect_random_1367_2(Random rand) {
		return KillTheRNG.randomness.random_1367.nextInt();
//		KillTheRNG.randomness.random_1367.nextInt();
//		return rand.nextInt();
	}

	/**
	* null
	*/
	@Redirect(method = "quickPlay(ZLjava/net/URL;Ljava/lang/String;ZFFFIF)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0), remap=false)
	public int redirect_random_1368_3(Random rand) {
		return KillTheRNG.randomness.random_1368.nextInt();
//		KillTheRNG.randomness.random_1368.nextInt();
//		return rand.nextInt();
	}

	/**
	* null
	*/
	@Redirect(method = "quickPlay(ZLjava/net/URL;Ljava/lang/String;ZFFFIF)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 1), remap=false)
	public int redirect_random_1369_4(Random rand) {
		return KillTheRNG.randomness.random_1369.nextInt();
//		KillTheRNG.randomness.random_1369.nextInt();
//		return rand.nextInt();
	}

	/**
	* null
	*/
	@Redirect(method = "quickStream(ZLjava/lang/String;ZFFFIF)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0), remap=false)
	public int redirect_random_1370_5(Random rand) {
		return KillTheRNG.randomness.random_1370.nextInt();
//		KillTheRNG.randomness.random_1370.nextInt();
//		return rand.nextInt();
	}

	/**
	* null
	*/
	@Redirect(method = "quickStream(ZLjava/lang/String;ZFFFIF)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 1), remap=false)
	public int redirect_random_1371_6(Random rand) {
		return KillTheRNG.randomness.random_1371.nextInt();
//		KillTheRNG.randomness.random_1371.nextInt();
//		return rand.nextInt();
	}

	/**
	* null
	*/
	@Redirect(method = "quickStream(ZLjava/net/URL;Ljava/lang/String;ZFFFIF)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0), remap=false)
	public int redirect_random_1372_7(Random rand) {
		return KillTheRNG.randomness.random_1372.nextInt();
//		KillTheRNG.randomness.random_1372.nextInt();
//		return rand.nextInt();
	}

	/**
	* null
	*/
	@Redirect(method = "quickStream(ZLjava/net/URL;Ljava/lang/String;ZFFFIF)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 1), remap=false)
	public int redirect_random_1373_8(Random rand) {
		return KillTheRNG.randomness.random_1373.nextInt();
//		KillTheRNG.randomness.random_1373.nextInt();
//		return rand.nextInt();
	}

}
