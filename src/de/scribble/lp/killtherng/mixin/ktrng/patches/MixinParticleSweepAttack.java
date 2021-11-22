package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.particle.ParticleSweepAttack;

@Mixin(ParticleSweepAttack.class)
public class MixinParticleSweepAttack {

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/client/renderer/texture/TextureManager;Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1457_1(Random rand) {
		return KillTheRNG.randomness.random_1457.nextFloat();
//		KillTheRNG.randomness.random_1457.nextFloat();
//		return rand.nextFloat();
	}

}
