package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.item.EntityXPOrb;

@Mixin(EntityXPOrb.class)
public class MixinEntityXPOrb {
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_217(Random rand) {
		return KillTheRNG.randomness.random_217.nextFloat();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_218(Random rand) {
		return KillTheRNG.randomness.random_218.nextFloat();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_219(Random rand) {
		return KillTheRNG.randomness.random_219.nextFloat();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_220(Random rand) {
		return KillTheRNG.randomness.random_220.nextFloat();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_221(Random rand) {
		return KillTheRNG.randomness.random_221.nextFloat();
	}

}
