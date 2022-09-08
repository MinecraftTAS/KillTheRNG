package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.ai.EntityAIMate.class)
public class MixinEntityAIMate{

	/**
	* When done mating, where the particles spawn
	*/
	@Redirect(method = "spawnBaby()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_aiMateParticle_1(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.aiMateParticle.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.aiMateParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* When done mating, where the particles spawn
	*/
	@Redirect(method = "spawnBaby()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_aiMateParticle_2(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.aiMateParticle.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.aiMateParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* When done mating, where the particles spawn
	*/
	@Redirect(method = "spawnBaby()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_aiMateParticle_3(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.aiMateParticle.nextGaussian();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.aiMateParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* When done mating, where the particles spawn
	*/
	@Redirect(method = "spawnBaby()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_aiMateParticle_4(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.aiMateParticle.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.aiMateParticle.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* When done mating, where the particles spawn
	*/
	@Redirect(method = "spawnBaby()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_aiMateParticle_5(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.aiMateParticle.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.aiMateParticle.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* When done mating, where the particles spawn
	*/
	@Redirect(method = "spawnBaby()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_aiMateParticle_6(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.aiMateParticle.nextDouble();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.aiMateParticle.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* When done mating, where the particles spawn
	*/
	@Redirect(method = "spawnBaby()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_aiMateParticle_7(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.aiMateParticle.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.aiMateParticle.nextInt(i);
//		return rand.nextInt(i);
	}


}