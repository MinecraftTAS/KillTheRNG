package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.World.class)
public class MixinWorld{

	/**
	* Linear Congruential Generator seed, for random block updates. Called when joining a World
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/storage/ISaveHandler;Lnet/minecraft/world/storage/WorldInfo;Lnet/minecraft/world/WorldProvider;Lnet/minecraft/profiler/Profiler;Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	public int redirect_blockupdateLCG_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.blockupdateLCG.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.blockupdateLCG.nextInt();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.blockupdateLCG.nextInt();
			return rand.nextInt();
		}
	}

	/**
	* General setSeed method of the world random
	*/
	@Redirect(method = "setRandomSeed(III)Ljava/util/Random;", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_worldSetRandomSeed_2(Random rand, long seed) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.worldSetRandomSeed.isEnabled()) {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.worldSetRandomSeed.setSeed(seed, true);		} else {
			rand.setSeed(seed);
		}
	}

	/**
	* Length of the weather phase, when thundering
	*/
	@Redirect(method = "updateWeatherBody()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	public int redirect_thunderTime_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.thunderTime.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.thunderTime.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.thunderTime.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Length of the weather phase, after thundering or raining
	*/
	@Redirect(method = "updateWeatherBody()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1), remap = false)
	public int redirect_clearWeatherTimeAfterThunder_4(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.clearWeatherTimeAfterThunder.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.clearWeatherTimeAfterThunder.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.clearWeatherTimeAfterThunder.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Length of the weather phase, when raining
	*/
	@Redirect(method = "updateWeatherBody()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2), remap = false)
	public int redirect_rainTime_5(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.rainTime.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.rainTime.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.rainTime.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Length of the weather phase, after thundering or raining
	*/
	@Redirect(method = "updateWeatherBody()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3), remap = false)
	public int redirect_clearWeatherTimeAfterRain_6(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.clearWeatherTimeAfterRain.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.clearWeatherTimeAfterRain.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.clearWeatherTimeAfterRain.nextInt(i);
			return rand.nextInt(i);
		}
	}


}