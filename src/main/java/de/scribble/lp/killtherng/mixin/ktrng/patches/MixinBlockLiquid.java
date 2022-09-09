package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockLiquid.class)
public class MixinBlockLiquid{

	/**
	* Pitch of the sound when combining water and lava
	*/
	@Redirect(method = "triggerMixEffects(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_liquidExtinguishSound_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.liquidExtinguishSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.liquidExtinguishSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.liquidExtinguishSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of the sound when combining water and lava
	*/
	@Redirect(method = "triggerMixEffects(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_liquidExtinguishSound_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.liquidExtinguishSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.liquidExtinguishSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.liquidExtinguishSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Postion of lava particle
	*/
	@Redirect(method = "triggerMixEffects(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_lavaParticlePos_3() {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.lavaParticlePos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.lavaParticlePos.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.lavaParticlePos.nextDouble();
			return Math.random();
		}
	}

	/**
	* Postion of lava particle
	*/
	@Redirect(method = "triggerMixEffects(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_lavaParticlePos_4() {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.lavaParticlePos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.lavaParticlePos.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.lavaParticlePos.nextDouble();
			return Math.random();
		}
	}


}