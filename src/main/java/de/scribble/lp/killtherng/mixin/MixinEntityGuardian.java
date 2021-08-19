package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntityGuardian;

@Mixin(EntityGuardian.class)
public class MixinEntityGuardian {
	@Redirect(method = "<init>(Lnet/minecraft/world/World;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_684(Random rand) {
		return KillTheRNG.randomness.random_684.nextFloat();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_685(Random rand) {
		return KillTheRNG.randomness.random_685.nextFloat();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_686(Random rand) {
		return KillTheRNG.randomness.random_686.nextDouble();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_687(Random rand) {
		return KillTheRNG.randomness.random_687.nextDouble();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_688(Random rand) {
		return KillTheRNG.randomness.random_688.nextDouble();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_689(Random rand) {
		return KillTheRNG.randomness.random_689.nextDouble();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_690(Random rand) {
		return KillTheRNG.randomness.random_690.nextDouble();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 6))
	public float redirect_random_691(Random rand) {
		return KillTheRNG.randomness.random_691.nextFloat();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 7))
	public float redirect_random_692(Random rand) {
		return KillTheRNG.randomness.random_692.nextFloat();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 8))
	public float redirect_random_693(Random rand) {
		return KillTheRNG.randomness.random_693.nextFloat();
	}

	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_694(Random rand, int i) {
		return KillTheRNG.randomness.random_694.nextInt(i);
	}

}
