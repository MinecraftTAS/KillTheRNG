package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.ai.EntityAISkeletonRiders.class)
public class MixinEntityAISkeletonRiders{

	/**
	* What enchantment should be added to the item in the main hand
	*/
	@Redirect(method = "createSkeleton(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/passive/AbstractHorse;)Lnet/minecraft/entity/monster/EntitySkeleton;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiSkeletonRidersAddEnchantmentToMainhand_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.aiSkeletonRidersAddEnchantmentToMainhand.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.aiSkeletonRidersAddEnchantmentToMainhand.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* What enchantment should be added to the item in the main hand
	*/
	@Redirect(method = "createSkeleton(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/passive/AbstractHorse;)Lnet/minecraft/entity/monster/EntitySkeleton;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_aiSkeletonRidersAddEnchantmentToMainhand_2(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.aiSkeletonRidersAddEnchantmentToMainhand.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.aiSkeletonRidersAddEnchantmentToMainhand.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* How much velocity should be added to the skeleton horse
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_aiSkeletonRidersAddVelocity_3(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.aiSkeletonRidersAddVelocity.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.aiSkeletonRidersAddVelocity.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* How much velocity should be added to the skeleton horse
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_aiSkeletonRidersAddVelocity_4(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.aiSkeletonRidersAddVelocity.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.aiSkeletonRidersAddVelocity.nextGaussian();
//		return rand.nextGaussian();
	}


}