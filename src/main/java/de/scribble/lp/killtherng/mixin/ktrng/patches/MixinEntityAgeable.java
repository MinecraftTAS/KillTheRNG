package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.EntityAgeable.class)
public class MixinEntityAgeable{

	/**
	* Particles when a child grows up
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_ageableGrowUpParticle_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.ageableGrowUpParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.ageableGrowUpParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.ageableGrowUpParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particles when a child grows up
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_ageableGrowUpParticle_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.ageableGrowUpParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.ageableGrowUpParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.ageableGrowUpParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Particles when a child grows up
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_ageableGrowUpParticle_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.ageableGrowUpParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.ageableGrowUpParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.ageableGrowUpParticle.nextFloat();
			return rand.nextFloat();
		}
	}


}