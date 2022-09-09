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
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_624.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_624.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_624.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	private static double redirect_random_625_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_625.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_625.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_625.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	private static double redirect_random_626_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_626.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_626.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_626.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_random_627_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_627.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_627.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_627.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	private static float redirect_random_628_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_628.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_628.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_628.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	private static float redirect_random_629_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_629.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_629.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_629.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 3))
	private static double redirect_random_630_7(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_630.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_630.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_630.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 4))
	private static double redirect_random_631_8(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_631.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_631.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_631.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 5))
	private static double redirect_random_632_9(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_632.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_632.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_632.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	private static float redirect_random_633_10(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_633.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_633.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_633.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	private static float redirect_random_634_11(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_634.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_634.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_634.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "spawnBonemealParticles(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	private static float redirect_random_635_12(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_635.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_635.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_635.nextFloat();
			return rand.nextFloat();
		}
	}


}