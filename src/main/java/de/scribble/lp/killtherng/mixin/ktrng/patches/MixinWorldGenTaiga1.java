package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.feature.WorldGenTaiga1;

@Mixin(WorldGenTaiga1.class)
public class MixinWorldGenTaiga1 {

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1239_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1239.nextInt(i);
//		KillTheRNG.randomness.random_1239.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1240_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1240.nextInt(i);
//		KillTheRNG.randomness.random_1240.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1241_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1241.nextInt(i);
//		KillTheRNG.randomness.random_1241.nextInt(i);
//		return rand.nextInt(i);
	}

}
