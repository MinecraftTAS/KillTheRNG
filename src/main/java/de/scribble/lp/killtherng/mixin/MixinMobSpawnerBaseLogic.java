package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.tileentity.MobSpawnerBaseLogic;

@Mixin(MobSpawnerBaseLogic.class)
public class MixinMobSpawnerBaseLogic {
	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_820(Random rand) {
		return KillTheRNG.randomness.random_820.nextFloat();
	}

	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_821(Random rand) {
		return KillTheRNG.randomness.random_821.nextFloat();
	}

	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_822(Random rand) {
		return KillTheRNG.randomness.random_822.nextFloat();
	}

	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_823(Random rand) {
		return KillTheRNG.randomness.random_823.nextDouble();
	}

	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_824(Random rand) {
		return KillTheRNG.randomness.random_824.nextDouble();
	}

	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_825(Random rand, int i) {
		return KillTheRNG.randomness.random_825.nextInt(i);
	}

	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 6))
	public double redirect_random_826(Random rand) {
		return KillTheRNG.randomness.random_826.nextDouble();
	}

	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 7))
	public double redirect_random_827(Random rand) {
		return KillTheRNG.randomness.random_827.nextDouble();
	}

	@Redirect(method = "updateSpawner()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 8))
	public float redirect_random_828(Random rand) {
		return KillTheRNG.randomness.random_828.nextFloat();
	}

	@Redirect(method = "resetTimer()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_829(Random rand, int i) {
		return KillTheRNG.randomness.random_829.nextInt(i);
	}

}
