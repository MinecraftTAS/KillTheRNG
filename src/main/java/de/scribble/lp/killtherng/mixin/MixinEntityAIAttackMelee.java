package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.ai.EntityAIAttackMelee;

@Mixin(EntityAIAttackMelee.class)
public class MixinEntityAIAttackMelee {
	@Redirect(method = "shouldExecute()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_709(Random rand, int i) {
		return KillTheRNG.randomness.random_709.nextInt(i);
	}

	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_710(Random rand) {
		return KillTheRNG.randomness.random_710.nextFloat();
	}

	@Redirect(method = "updateTask()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_711(Random rand, int i) {
		return KillTheRNG.randomness.random_711.nextInt(i);
	}

}
