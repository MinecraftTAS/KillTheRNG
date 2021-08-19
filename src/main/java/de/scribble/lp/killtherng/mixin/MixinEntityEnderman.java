package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntityEnderman;

@Mixin(EntityEnderman.class)
public class MixinEntityEnderman {
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_867(Random rand) {
		return KillTheRNG.randomness.random_867.nextDouble();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_868(Random rand) {
		return KillTheRNG.randomness.random_868.nextDouble();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_869(Random rand) {
		return KillTheRNG.randomness.random_869.nextDouble();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_870(Random rand) {
		return KillTheRNG.randomness.random_870.nextDouble();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_871(Random rand) {
		return KillTheRNG.randomness.random_871.nextDouble();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_872(Random rand) {
		return KillTheRNG.randomness.random_872.nextDouble();
	}

	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_873(Random rand) {
		return KillTheRNG.randomness.random_873.nextFloat();
	}

	@Redirect(method = "teleportRandomly()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_874(Random rand) {
		return KillTheRNG.randomness.random_874.nextDouble();
	}

	@Redirect(method = "teleportRandomly()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_875(Random rand, int i) {
		return KillTheRNG.randomness.random_875.nextInt(i);
	}

	@Redirect(method = "teleportRandomly()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_876(Random rand) {
		return KillTheRNG.randomness.random_876.nextDouble();
	}

	@Redirect(method = "teleportToEntity(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_877(Random rand) {
		return KillTheRNG.randomness.random_877.nextDouble();
	}

	@Redirect(method = "teleportToEntity(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_878(Random rand, int i) {
		return KillTheRNG.randomness.random_878.nextInt(i);
	}

	@Redirect(method = "teleportToEntity(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_879(Random rand) {
		return KillTheRNG.randomness.random_879.nextDouble();
	}

	@Redirect(method = "attackEntityFrom(Lnet/minecraft/util/DamageSource;F)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_880(Random rand, int i) {
		return KillTheRNG.randomness.random_880.nextInt(i);
	}

}
