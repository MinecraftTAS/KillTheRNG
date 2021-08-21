package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAISkeletonRiders;

@Mixin(EntityAISkeletonRiders.class)
public class MixinEntityAISkeletonRiders {

	/**
	* How much velocity should be added to the skeleton horse
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_aiSkeletonRidersAddVelocity_1(Random rand) {
		return KillTheRNG.randomness.aiSkeletonRidersAddVelocity.nextGaussian();
//		KillTheRNG.randomness.aiSkeletonRidersAddVelocity.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* How much velocity should be added to the skeleton horse
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_aiSkeletonRidersAddVelocity_2(Random rand) {
		return KillTheRNG.randomness.aiSkeletonRidersAddVelocity.nextGaussian();
//		KillTheRNG.randomness.aiSkeletonRidersAddVelocity.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* What enchantment should be added to the item in the main hand
	*/
	@Redirect(method = "createSkeleton(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/passive/AbstractHorse;)Lnet/minecraft/entity/monster/EntitySkeleton;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiSkeletonRidersAddEnchantmentToMainhand_3(Random rand, int i) {
		return KillTheRNG.randomness.aiSkeletonRidersAddEnchantmentToMainhand.nextInt(i);
//		KillTheRNG.randomness.aiSkeletonRidersAddEnchantmentToMainhand.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* What enchantment should be added to the item in the main hand
	*/
	@Redirect(method = "createSkeleton(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/passive/AbstractHorse;)Lnet/minecraft/entity/monster/EntitySkeleton;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_aiSkeletonRidersAddEnchantmentToMainhand_4(Random rand, int i) {
		return KillTheRNG.randomness.aiSkeletonRidersAddEnchantmentToMainhand.nextInt(i);
//		KillTheRNG.randomness.aiSkeletonRidersAddEnchantmentToMainhand.nextInt(i);
//		return rand.nextInt(i);
	}

}
