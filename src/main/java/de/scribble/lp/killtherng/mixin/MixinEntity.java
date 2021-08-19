package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.Entity;

@Mixin(Entity.class)
public class MixinEntity {
	@Redirect(method = "move(Lnet/minecraft/entity/MoverType;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_26(Random rand) {
		return KillTheRNG.randomness.random_26.nextFloat();
	}

	@Redirect(method = "move(Lnet/minecraft/entity/MoverType;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_27(Random rand) {
		return KillTheRNG.randomness.random_27.nextFloat();
	}

	@Redirect(method = "move(Lnet/minecraft/entity/MoverType;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_28(Random rand) {
		return KillTheRNG.randomness.random_28.nextFloat();
	}

	@Redirect(method = "move(Lnet/minecraft/entity/MoverType;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_29(Random rand) {
		return KillTheRNG.randomness.random_29.nextFloat();
	}

	@Redirect(method = "doWaterSplashEffect()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_30(Random rand) {
		return KillTheRNG.randomness.random_30.nextFloat();
	}

	@Redirect(method = "doWaterSplashEffect()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_31(Random rand) {
		return KillTheRNG.randomness.random_31.nextFloat();
	}

	@Redirect(method = "doWaterSplashEffect()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_32(Random rand) {
		return KillTheRNG.randomness.random_32.nextFloat();
	}

	@Redirect(method = "doWaterSplashEffect()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_33(Random rand) {
		return KillTheRNG.randomness.random_33.nextFloat();
	}

	@Redirect(method = "doWaterSplashEffect()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_34(Random rand) {
		return KillTheRNG.randomness.random_34.nextFloat();
	}

	@Redirect(method = "doWaterSplashEffect()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_35(Random rand) {
		return KillTheRNG.randomness.random_35.nextFloat();
	}

	@Redirect(method = "doWaterSplashEffect()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_36(Random rand) {
		return KillTheRNG.randomness.random_36.nextFloat();
	}

	@Redirect(method = "createRunningParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_37(Random rand) {
		return KillTheRNG.randomness.random_37.nextFloat();
	}

	@Redirect(method = "createRunningParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_38(Random rand) {
		return KillTheRNG.randomness.random_38.nextFloat();
	}

	@Redirect(method = "pushOutOfBlocks(DDD)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_39(Random rand) {
		return KillTheRNG.randomness.random_39.nextFloat();
	}

	@Redirect(method = "canTrample(Lnet/minecraft/world/World;Lnet/minecraft/block/Block;Lnet/minecraft/util/math/BlockPos;F)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_40(Random rand) {
		return KillTheRNG.randomness.random_40.nextFloat();
	}

}
