package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAISkeletonRiders;

@Mixin(EntityAISkeletonRiders.class)
public class MixinEntityAISkeletonRiders {

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_784_0(Random rand) {
		return KillTheRNG.randomness.random_784.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_785_1(Random rand) {
		return KillTheRNG.randomness.random_785.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "createSkeleton(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/passive/AbstractHorse;)Lnet/minecraft/entity/monster/EntitySkeleton;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_786_0(Random rand, int i) {
		return KillTheRNG.randomness.random_786.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "createSkeleton(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/passive/AbstractHorse;)Lnet/minecraft/entity/monster/EntitySkeleton;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_787_1(Random rand, int i) {
		return KillTheRNG.randomness.random_787.nextInt(i);
	}

}
