package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleManager.class)
public class MixinParticleManager{

	/**
	* null
	*/
	@Redirect(method = "addBlockHitEffects(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_1414_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_1414.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1414.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_1414.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "addBlockHitEffects(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_1415_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_1415.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1415.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_1415.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "addBlockHitEffects(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_1416_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_1416.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1416.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_1416.nextDouble();
			return rand.nextDouble();
		}
	}


}