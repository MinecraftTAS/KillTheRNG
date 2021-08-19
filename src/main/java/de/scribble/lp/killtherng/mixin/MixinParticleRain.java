package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.particle.ParticleRain;

@Mixin(ParticleRain.class)
public class MixinParticleRain {
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1426(Random rand, int i) {
		return KillTheRNG.randomness.random_1426.nextInt(i);
	}

}
