package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.item.EntityEnderEye.class)
public class MixinEntityEnderEye{

	/**
	* If the ender eye shatters or drops
	*/
	@Redirect(method = "moveTowards(Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_enderEyeShatter_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.enderEyeShatter.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.enderEyeShatter.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Particle of ender eye
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_enderEyeParticle_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.enderEyeParticle.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.enderEyeParticle.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Particle of ender eye
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_enderEyeParticle_3(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.enderEyeParticle.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.enderEyeParticle.nextDouble();
//		return rand.nextDouble();
	}


}