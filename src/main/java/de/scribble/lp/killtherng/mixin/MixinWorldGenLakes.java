package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.feature.WorldGenLakes;

@Mixin(WorldGenLakes.class)
public class MixinWorldGenLakes {

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1881_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1881.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_1882_1(Random rand) {
		return KillTheRNG.randomness.random_1882.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_1883_2(Random rand) {
		return KillTheRNG.randomness.random_1883.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_1884_3(Random rand) {
		return KillTheRNG.randomness.random_1884.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_1885_4(Random rand) {
		return KillTheRNG.randomness.random_1885.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_1886_5(Random rand) {
		return KillTheRNG.randomness.random_1886.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 6))
	public double redirect_random_1887_6(Random rand) {
		return KillTheRNG.randomness.random_1887.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_random_1888_7(Random rand, int i) {
		return KillTheRNG.randomness.random_1888.nextInt(i);
	}

}
