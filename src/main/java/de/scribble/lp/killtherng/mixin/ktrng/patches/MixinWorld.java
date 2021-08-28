package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.World;

@Mixin(World.class)
public class MixinWorld {

	/**
	* Linear Congruential Generator seed, for random block updates. Called when joining a World
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/storage/ISaveHandler;Lnet/minecraft/world/storage/WorldInfo;Lnet/minecraft/world/WorldProvider;Lnet/minecraft/profiler/Profiler;Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	public int redirect_blockupdateLCG_1(Random rand) {
//		return KillTheRNG.randomness.blockupdateLCG.nextInt();
		KillTheRNG.randomness.blockupdateLCG.nextInt();
		return rand.nextInt();
	}

	/**
	* Length of the weather phase, when thundering
	*/
	@Redirect(method = "updateWeatherBody()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap=false)
	public int redirect_thunderTime_2(Random rand, int i) {
		return KillTheRNG.randomness.thunderTime.nextInt(i);
//		KillTheRNG.randomness.thunderTime.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Length of the weather phase, after thundering or raining
	*/
	@Redirect(method = "updateWeatherBody()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1), remap=false)
	public int redirect_clearWeatherTimeAfterThunder_3(Random rand, int i) {
		return KillTheRNG.randomness.clearWeatherTimeAfterThunder.nextInt(i);
//		KillTheRNG.randomness.clearWeatherTimeAfterThunder.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Length of the weather phase, when raining
	*/
	@Redirect(method = "updateWeatherBody()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2), remap=false)
	public int redirect_rainTime_4(Random rand, int i) {
		return KillTheRNG.randomness.rainTime.nextInt(i);
//		KillTheRNG.randomness.rainTime.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Length of the weather phase, after thundering or raining
	*/
	@Redirect(method = "updateWeatherBody()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3), remap=false)
	public int redirect_clearWeatherTimeAfterRain_5(Random rand, int i) {
		return KillTheRNG.randomness.clearWeatherTimeAfterRain.nextInt(i);
//		KillTheRNG.randomness.clearWeatherTimeAfterRain.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* General setSeed method of the world random
	*/
	@Redirect(method = "setRandomSeed(III)Ljava/util/Random;", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_worldSetRandomSeed_6(Random rand, long seed) {
		KillTheRNG.randomness.worldSetRandomSeed.setSeed(seed, true);
		rand.setSeed(seed);
	}

}
