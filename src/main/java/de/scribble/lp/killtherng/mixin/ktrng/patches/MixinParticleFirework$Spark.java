package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.particle.ParticleFirework;

@Mixin(ParticleFirework.Spark.class)
public class MixinParticleFirework$Spark {

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDDLnet/minecraft/client/particle/ParticleManager;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1454_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1454.nextInt(i);
//		KillTheRNG.randomness.random_1454.nextInt(i);
//		return rand.nextInt(i);
	}

}
