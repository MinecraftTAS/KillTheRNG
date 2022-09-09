package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.renderer.EntityRenderer.class)
public class MixinEntityRenderer{

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1345_1(Random rand, long seed) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1345.isEnabled()) {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1345.setSeed(seed, true);		} else {
			rand.setSeed(seed);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1346_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1346.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1346.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1346.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1347_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1347.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1347.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1347.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1348_4(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1348.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1348.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1348.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1349_5(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1349.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1349.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1349.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_1350_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1350.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1350.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1350.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_1351_7(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1351.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1351.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1351.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1352_8(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1352.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1352.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1352.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "addRainParticles()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1353_9(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1353.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1353.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1353.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "displayItemActivation(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1360_10(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1360.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1360.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1360.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "displayItemActivation(Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1361_11(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1361.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1361.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1361.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1354_12(Random rand, long seed) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1354.isEnabled()) {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1354.setSeed(seed, true);		} else {
			rand.setSeed(seed);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_1355_13(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1355.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1355.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1355.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_1356_14(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1356.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1356.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1356.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_1357_15(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1357.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1357.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1357.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_1358_16(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1358.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1358.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1358.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "renderRainSnow(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_1359_17(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1359.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1359.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_1359.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTorchFlicker()V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0))
	public double redirect_math_random_30_18() {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_30.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_30.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_30.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTorchFlicker()V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1))
	public double redirect_math_random_31_19() {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_31.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_31.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_31.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTorchFlicker()V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 2))
	public double redirect_math_random_32_20() {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_32.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_32.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_32.nextDouble();
			return Math.random();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTorchFlicker()V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 3))
	public double redirect_math_random_33_21() {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_33.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_33.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.math_random_33.nextDouble();
			return Math.random();
		}
	}


}