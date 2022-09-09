package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleExplosionLarge.class)
public class MixinParticleExplosionLarge{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/client/renderer/texture/TextureManager;Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1452_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1452.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1452.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1452.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/client/renderer/texture/TextureManager;Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1453_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1453.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1453.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_1453.nextFloat();
			return rand.nextFloat();
		}
	}


}