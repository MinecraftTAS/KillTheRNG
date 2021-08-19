package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntityBlaze;

@Mixin(EntityBlaze.class)
public class MixinEntityBlaze {
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_891(Random rand, int i) {
		return KillTheRNG.randomness.random_891.nextInt(i);
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_892(Random rand) {
		return KillTheRNG.randomness.random_892.nextFloat();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_893(Random rand) {
		return KillTheRNG.randomness.random_893.nextFloat();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_894(Random rand) {
		return KillTheRNG.randomness.random_894.nextDouble();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_895(Random rand) {
		return KillTheRNG.randomness.random_895.nextDouble();
	}

	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_896(Random rand) {
		return KillTheRNG.randomness.random_896.nextDouble();
	}

	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_897(Random rand) {
		return KillTheRNG.randomness.random_897.nextGaussian();
	}

}
