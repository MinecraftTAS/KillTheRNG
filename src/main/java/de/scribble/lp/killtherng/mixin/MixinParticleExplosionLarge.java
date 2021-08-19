package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.particle.ParticleExplosionLarge;

@Mixin(ParticleExplosionLarge.class)
public class MixinParticleExplosionLarge {
	@Redirect(method = "<init>(Lnet/minecraft/client/renderer/texture/TextureManager;Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1452(Random rand, int i) {
		return KillTheRNG.randomness.random_1452.nextInt(i);
	}

	@Redirect(method = "<init>(Lnet/minecraft/client/renderer/texture/TextureManager;Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1453(Random rand) {
		return KillTheRNG.randomness.random_1453.nextFloat();
	}

}
