package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.item.ItemDye;

@Mixin(ItemDye.class)
public class MixinItemDye {

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	private static double redirect_random_624_0(Random rand) {
		return KillTheRNG.randomness.random_624.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	private static double redirect_random_625_1(Random rand) {
		return KillTheRNG.randomness.random_625.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	private static double redirect_random_626_2(Random rand) {
		return KillTheRNG.randomness.random_626.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	private static float redirect_random_627_3(Random rand) {
		return KillTheRNG.randomness.random_627.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	private static float redirect_random_628_4(Random rand) {
		return KillTheRNG.randomness.random_628.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	private static float redirect_random_629_5(Random rand) {
		return KillTheRNG.randomness.random_629.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 6))
	private static double redirect_random_630_6(Random rand) {
		return KillTheRNG.randomness.random_630.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 7))
	private static double redirect_random_631_7(Random rand) {
		return KillTheRNG.randomness.random_631.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 8))
	private static double redirect_random_632_8(Random rand) {
		return KillTheRNG.randomness.random_632.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 9))
	private static float redirect_random_633_9(Random rand) {
		return KillTheRNG.randomness.random_633.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 10))
	private static float redirect_random_634_10(Random rand) {
		return KillTheRNG.randomness.random_634.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 11))
	private static float redirect_random_635_11(Random rand) {
		return KillTheRNG.randomness.random_635.nextFloat();
	}

}
