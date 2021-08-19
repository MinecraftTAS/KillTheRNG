package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.projectile.EntityFireball;

@Mixin(EntityFireball.class)
public class MixinEntityFireball {
	@Redirect(method = "<init>(Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_723(Random rand) {
		return KillTheRNG.randomness.random_723.nextGaussian();
	}

	@Redirect(method = "<init>(Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_724(Random rand) {
		return KillTheRNG.randomness.random_724.nextGaussian();
	}

	@Redirect(method = "<init>(Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_725(Random rand) {
		return KillTheRNG.randomness.random_725.nextGaussian();
	}

}
