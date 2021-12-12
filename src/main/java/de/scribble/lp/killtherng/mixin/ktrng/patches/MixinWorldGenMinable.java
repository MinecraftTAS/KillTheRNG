package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.feature.WorldGenMinable;

@Mixin(WorldGenMinable.class)
public class MixinWorldGenMinable {

	/**
	* Minables Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_mineableGeneration_1(Random rand) {
//		return KillTheRNG.randomness.mineableGeneration.nextFloat();
		KillTheRNG.randomness.mineableGeneration.nextFloat();
		return rand.nextFloat();
	}

	/**
	* Minables Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_mineableGeneration_2(Random rand, int i) {
//		return KillTheRNG.randomness.mineableGeneration.nextInt(i);
		KillTheRNG.randomness.mineableGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Minables Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_mineableGeneration_3(Random rand, int i) {
//		return KillTheRNG.randomness.mineableGeneration.nextInt(i);
		KillTheRNG.randomness.mineableGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Minables Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_mineableGeneration_4(Random rand) {
//		return KillTheRNG.randomness.mineableGeneration.nextDouble();
		KillTheRNG.randomness.mineableGeneration.nextDouble();
		return rand.nextDouble();
	}

}
