package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.item.ItemDye;

@Mixin(ItemDye.class)
public class MixinItemDye {
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	private static double redirect_random_624(Random rand) {
		return KillTheRNG.randomness.random_624.nextGaussian();
	}

	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	private static double redirect_random_625(Random rand) {
		return KillTheRNG.randomness.random_625.nextGaussian();
	}

	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	private static double redirect_random_626(Random rand) {
		return KillTheRNG.randomness.random_626.nextGaussian();
	}

	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	private static float redirect_random_627(Random rand) {
		return KillTheRNG.randomness.random_627.nextFloat();
	}

	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	private static float redirect_random_628(Random rand) {
		return KillTheRNG.randomness.random_628.nextFloat();
	}

	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	private static float redirect_random_629(Random rand) {
		return KillTheRNG.randomness.random_629.nextFloat();
	}

	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 6))
	private static double redirect_random_630(Random rand) {
		return KillTheRNG.randomness.random_630.nextGaussian();
	}

	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 7))
	private static double redirect_random_631(Random rand) {
		return KillTheRNG.randomness.random_631.nextGaussian();
	}

	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 8))
	private static double redirect_random_632(Random rand) {
		return KillTheRNG.randomness.random_632.nextGaussian();
	}

	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 9))
	private static float redirect_random_633(Random rand) {
		return KillTheRNG.randomness.random_633.nextFloat();
	}

	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 10))
	private static float redirect_random_634(Random rand) {
		return KillTheRNG.randomness.random_634.nextFloat();
	}

	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 11))
	private static float redirect_random_635(Random rand) {
		return KillTheRNG.randomness.random_635.nextFloat();
	}

}
