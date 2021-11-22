package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

@Mixin(targets="net.minecraft.world.biome.BiomeHills$EmeraldGenerator")
public class MixinBiomeHills$EmeraldGenerator {

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap=false)
	public int redirect_random_1235_1(Random rand, int i) {
//		return KillTheRNG.randomness.random_1235.nextInt(i);
		KillTheRNG.randomness.random_1235.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1), remap=false)
	public int redirect_random_1236_2(Random rand, int i) {
//		return KillTheRNG.randomness.random_1236.nextInt(i);
		KillTheRNG.randomness.random_1236.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2), remap=false)
	public int redirect_random_1237_3(Random rand, int i) {
//		return KillTheRNG.randomness.random_1237.nextInt(i);
		KillTheRNG.randomness.random_1237.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3), remap=false)
	public int redirect_random_1238_4(Random rand, int i) {
//		return KillTheRNG.randomness.random_1238.nextInt(i);
		KillTheRNG.randomness.random_1238.nextInt(i);
		return rand.nextInt(i);
	}

}
