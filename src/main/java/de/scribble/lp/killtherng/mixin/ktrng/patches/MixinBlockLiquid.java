package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockLiquid;

@Mixin(BlockLiquid.class)
public class MixinBlockLiquid {

	/**
	* Pitch of the sound when combining water and lava
	*/
	@Redirect(method = "triggerMixEffects(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_liquidExtinguishSound_1(Random rand) {
		return KillTheRNG.randomness.liquidExtinguishSound.nextFloat();
//		KillTheRNG.randomness.liquidExtinguishSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of the sound when combining water and lava
	*/
	@Redirect(method = "triggerMixEffects(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_liquidExtinguishSound_2(Random rand) {
		return KillTheRNG.randomness.liquidExtinguishSound.nextFloat();
//		KillTheRNG.randomness.liquidExtinguishSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "triggerMixEffects(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_21_3() {
		return KillTheRNG.randomness.math_random_21.nextDouble();
//		KillTheRNG.randomness.math_random_21.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "triggerMixEffects(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_22_4() {
		return KillTheRNG.randomness.math_random_22.nextDouble();
//		KillTheRNG.randomness.math_random_22.nextDouble();
//		return Math.random();
	}

}
