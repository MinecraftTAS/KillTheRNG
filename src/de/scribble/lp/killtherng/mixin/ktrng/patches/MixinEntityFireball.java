package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.projectile.EntityFireball;

@Mixin(EntityFireball.class)
public class MixinEntityFireball {

	/**
	* Accelleration of the fireball
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_fireballRandomAccelleration_1(Random rand) {
		return KillTheRNG.randomness.fireballRandomAccelleration.nextGaussian();
//		KillTheRNG.randomness.fireballRandomAccelleration.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Accelleration of the fireball
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_fireballRandomAccelleration_2(Random rand) {
		return KillTheRNG.randomness.fireballRandomAccelleration.nextGaussian();
//		KillTheRNG.randomness.fireballRandomAccelleration.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Accelleration of the fireball
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_fireballRandomAccelleration_3(Random rand) {
		return KillTheRNG.randomness.fireballRandomAccelleration.nextGaussian();
//		KillTheRNG.randomness.fireballRandomAccelleration.nextGaussian();
//		return rand.nextGaussian();
	}

}
