package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.World;

@Mixin(World.class)
public class MixinWorld {
	@Redirect(method = "<init>(Lnet/minecraft/world/storage/ISaveHandler;Lnet/minecraft/world/storage/WorldInfo;Lnet/minecraft/world/WorldProvider;Lnet/minecraft/profiler/Profiler;Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	public int redirect_random_1(Random rand) {
		return KillTheRNG.randomness.random_1.nextInt();
	}

	@Redirect(method = "updateWeatherBody()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_2(Random rand, int i) {
		return KillTheRNG.randomness.random_2.nextInt(i);
	}

	@Redirect(method = "updateWeatherBody()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_3(Random rand, int i) {
		return KillTheRNG.randomness.random_3.nextInt(i);
	}

	@Redirect(method = "updateWeatherBody()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_4(Random rand, int i) {
		return KillTheRNG.randomness.random_4.nextInt(i);
	}

	@Redirect(method = "updateWeatherBody()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_5(Random rand, int i) {
		return KillTheRNG.randomness.random_5.nextInt(i);
	}

	@Redirect(method = "setRandomSeed(III)Ljava/util/Random;", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_6(Random rand, long unused) {
	}

}
