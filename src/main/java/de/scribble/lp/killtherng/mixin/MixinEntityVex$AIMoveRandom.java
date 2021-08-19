package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

@Mixin(targets="net.minecraft.entity.monster.EntityVex$AIMoveRandom")
public class MixinEntityVex$AIMoveRandom {
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_805(Random rand, int i) {
		return KillTheRNG.randomness.random_805.nextInt(i);
	}

	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_806(Random rand, int i) {
		return KillTheRNG.randomness.random_806.nextInt(i);
	}

	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_807(Random rand, int i) {
		return KillTheRNG.randomness.random_807.nextInt(i);
	}

	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_808(Random rand, int i) {
		return KillTheRNG.randomness.random_808.nextInt(i);
	}

}
