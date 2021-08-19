package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.boss.EntityWither;

@Mixin(EntityWither.class)
public class MixinEntityWither {
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_515(Random rand) {
		return KillTheRNG.randomness.random_515.nextGaussian();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_516(Random rand) {
		return KillTheRNG.randomness.random_516.nextGaussian();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_517(Random rand) {
		return KillTheRNG.randomness.random_517.nextGaussian();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_518(Random rand, int i) {
		return KillTheRNG.randomness.random_518.nextInt(i);
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 4))
	public double redirect_random_519(Random rand) {
		return KillTheRNG.randomness.random_519.nextGaussian();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 5))
	public double redirect_random_520(Random rand) {
		return KillTheRNG.randomness.random_520.nextGaussian();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 6))
	public double redirect_random_521(Random rand) {
		return KillTheRNG.randomness.random_521.nextGaussian();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 7))
	public double redirect_random_522(Random rand) {
		return KillTheRNG.randomness.random_522.nextGaussian();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 8))
	public float redirect_random_523(Random rand) {
		return KillTheRNG.randomness.random_523.nextFloat();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 9))
	public double redirect_random_524(Random rand) {
		return KillTheRNG.randomness.random_524.nextGaussian();
	}

	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_525(Random rand, int i) {
		return KillTheRNG.randomness.random_525.nextInt(i);
	}

	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_526(Random rand, int i) {
		return KillTheRNG.randomness.random_526.nextInt(i);
	}

	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_527(Random rand, int i) {
		return KillTheRNG.randomness.random_527.nextInt(i);
	}

	@Redirect(method = "launchWitherSkullToEntity(ILnet/minecraft/entity/EntityLivingBase;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_528(Random rand) {
		return KillTheRNG.randomness.random_528.nextFloat();
	}

}
