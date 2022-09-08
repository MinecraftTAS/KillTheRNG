package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.item.ItemDye.class)
public class MixinItemDye{

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	private static double redirect_random_624_1(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_624.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_624.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	private static double redirect_random_625_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_625.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_625.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	private static double redirect_random_626_3(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_626.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_626.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_random_627_4(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_627.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_627.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	private static float redirect_random_628_5(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_628.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_628.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	private static float redirect_random_629_6(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_629.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_629.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 3))
	private static double redirect_random_630_7(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_630.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_630.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 4))
	private static double redirect_random_631_8(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_631.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_631.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 5))
	private static double redirect_random_632_9(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_632.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_632.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	private static float redirect_random_633_10(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_633.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_633.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	private static float redirect_random_634_11(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_634.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_634.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	private static float redirect_random_635_12(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_635.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_635.nextFloat();
//		return rand.nextFloat();
	}


}