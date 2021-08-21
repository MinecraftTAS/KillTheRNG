package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.projectile.EntityEgg;

@Mixin(EntityEgg.class)
public class MixinEntityEgg {

	/**
	* Motion of egg crack particles
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_eggCrackParticle_1(Random rand) {
		return KillTheRNG.randomness.eggCrackParticle.nextFloat();
//		KillTheRNG.randomness.eggCrackParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Motion of egg crack particles
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_eggCrackParticle_2(Random rand) {
		return KillTheRNG.randomness.eggCrackParticle.nextFloat();
//		KillTheRNG.randomness.eggCrackParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Motion of egg crack particles
	*/
	@Redirect(method = "handleStatusUpdate(B)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_eggCrackParticle_3(Random rand) {
		return KillTheRNG.randomness.eggCrackParticle.nextFloat();
//		KillTheRNG.randomness.eggCrackParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Chance of chick spawning from a thrown egg
	*/
	@Redirect(method = "onImpact(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_eggChickChance_4(Random rand, int i) {
		return KillTheRNG.randomness.eggChickChance.nextInt(i);
//		KillTheRNG.randomness.eggChickChance.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Chance of chick spawning from a thrown egg
	*/
	@Redirect(method = "onImpact(Lnet/minecraft/util/math/RayTraceResult;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_eggChickChance_5(Random rand, int i) {
		return KillTheRNG.randomness.eggChickChance.nextInt(i);
//		KillTheRNG.randomness.eggChickChance.nextInt(i);
//		return rand.nextInt(i);
	}

}
