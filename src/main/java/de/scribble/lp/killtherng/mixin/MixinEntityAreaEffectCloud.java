package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.EntityAreaEffectCloud;

@Mixin(EntityAreaEffectCloud.class)
public class MixinEntityAreaEffectCloud {

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_random_676_0(Random rand) {
		return KillTheRNG.randomness.random_676.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_677_1(Random rand) {
		return KillTheRNG.randomness.random_677.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_678_2(Random rand) {
		return KillTheRNG.randomness.random_678.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 3))
	public boolean redirect_random_679_3(Random rand) {
		return KillTheRNG.randomness.random_679.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_680_4(Random rand) {
		return KillTheRNG.randomness.random_680.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_681_5(Random rand) {
		return KillTheRNG.randomness.random_681.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 6))
	public double redirect_random_682_6(Random rand) {
		return KillTheRNG.randomness.random_682.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 7))
	public double redirect_random_683_7(Random rand) {
		return KillTheRNG.randomness.random_683.nextDouble();
	}

}
