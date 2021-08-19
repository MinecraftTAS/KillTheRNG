package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntityIronGolem;

@Mixin(EntityIronGolem.class)
public class MixinEntityIronGolem {
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_428(Random rand, int i) {
		return KillTheRNG.randomness.random_428.nextInt(i);
	}

	@Redirect(method = "collideWithEntity(Lnet/minecraft/entity/Entity;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_429(Random rand, int i) {
		return KillTheRNG.randomness.random_429.nextInt(i);
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_430(Random rand, int i) {
		return KillTheRNG.randomness.random_430.nextInt(i);
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_431(Random rand) {
		return KillTheRNG.randomness.random_431.nextFloat();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_432(Random rand) {
		return KillTheRNG.randomness.random_432.nextFloat();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_433(Random rand) {
		return KillTheRNG.randomness.random_433.nextFloat();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_434(Random rand) {
		return KillTheRNG.randomness.random_434.nextFloat();
	}

	@Redirect(method = "attackEntityAsMob(Lnet/minecraft/entity/Entity;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_435(Random rand, int i) {
		return KillTheRNG.randomness.random_435.nextInt(i);
	}

}
