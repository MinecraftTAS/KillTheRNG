package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.projectile.EntityFireball.class)
public class MixinEntityFireball{

	/**
	* Accelleration of the fireball
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_fireballRandomAccelleration_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireballRandomAccelleration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireballRandomAccelleration.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireballRandomAccelleration.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Accelleration of the fireball
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_fireballRandomAccelleration_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireballRandomAccelleration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireballRandomAccelleration.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireballRandomAccelleration.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* Accelleration of the fireball
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_fireballRandomAccelleration_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireballRandomAccelleration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireballRandomAccelleration.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.fireballRandomAccelleration.nextGaussian();
			return rand.nextGaussian();
		}
	}


}