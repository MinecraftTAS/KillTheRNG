package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.util.math.MathHelper;

@Mixin(MathHelper.class)
public class MixinMathHelper {

	/**
	* null
	*/
	@Redirect(method = "getInt(Ljava/util/Random;II)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_338_0(Random rand, int i) {
		return KillTheRNG.randomness.random_338.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "nextFloat(Ljava/util/Random;FF)F", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_random_339_0(Random rand) {
		return KillTheRNG.randomness.random_339.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "nextDouble(Ljava/util/Random;DD)D", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	private static double redirect_random_340_0(Random rand) {
		return KillTheRNG.randomness.random_340.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "getRandomUUID(Ljava/util/Random;)Ljava/util/UUID;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	private static long redirect_random_341_0(Random rand) {
		return KillTheRNG.randomness.random_341.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "getRandomUUID(Ljava/util/Random;)Ljava/util/UUID;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	private static long redirect_random_342_1(Random rand) {
		return KillTheRNG.randomness.random_342.nextLong();
	}

}
