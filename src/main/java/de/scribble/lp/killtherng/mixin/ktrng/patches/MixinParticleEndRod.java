package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.particle.ParticleEndRod.class)
public class MixinParticleEndRod{

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDDDD)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1456_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1456.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1456.nextInt(i);
//		return rand.nextInt(i);
	}


}