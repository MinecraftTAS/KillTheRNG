package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.util.math.MathHelper.class)
public class MixinMathHelper{

	/**
	* null
	*/
	@Redirect(method = "getInt(Ljava/util/Random;II)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_338_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_338.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_338.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_338.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Creates a new UUID for entities
	*/
	@Redirect(method = "getRandomUUID(Ljava/util/Random;)Ljava/util/UUID;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	private static long redirect_randomUUID_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.randomUUID.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.randomUUID.nextLong();
		} else {
				de.scribble.lp.killtherng.KillTheRNG.randomness.randomUUID.nextLong();
				return rand.nextLong();
		}
	}

	/**
	* Creates a new UUID for entities
	*/
	@Redirect(method = "getRandomUUID(Ljava/util/Random;)Ljava/util/UUID;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	private static long redirect_randomUUID_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.randomUUID.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.randomUUID.nextLong();
		} else {
				de.scribble.lp.killtherng.KillTheRNG.randomness.randomUUID.nextLong();
				return rand.nextLong();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "nextDouble(Ljava/util/Random;DD)D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	private static double redirect_random_340_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_340.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_340.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_340.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "nextFloat(Ljava/util/Random;FF)F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_random_339_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.random_339.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.random_339.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.random_339.nextFloat();
			return rand.nextFloat();
		}
	}


}