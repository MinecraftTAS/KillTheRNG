package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraftforge.fluids.Fluid;

@Mixin(Fluid.class)
public class MixinFluid {

	/**
	* null
	*/
	@Redirect(method = "vaporize(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraftforge/fluids/FluidStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0), remap=false)
	public float redirect_random_1266_1(Random rand) {
		return KillTheRNG.randomness.random_1266.nextFloat();
//		KillTheRNG.randomness.random_1266.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "vaporize(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraftforge/fluids/FluidStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1), remap=false)
	public float redirect_random_1267_2(Random rand) {
		return KillTheRNG.randomness.random_1267.nextFloat();
//		KillTheRNG.randomness.random_1267.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "vaporize(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraftforge/fluids/FluidStack;)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 0), remap=false)
	public double redirect_math_random_26_3() {
		return KillTheRNG.randomness.math_random_26.nextDouble();
//		KillTheRNG.randomness.math_random_26.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "vaporize(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraftforge/fluids/FluidStack;)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 1), remap=false)
	public double redirect_math_random_27_4() {
		return KillTheRNG.randomness.math_random_27.nextDouble();
//		KillTheRNG.randomness.math_random_27.nextDouble();
//		return Math.random();
	}

	/**
	* null
	*/
	@Redirect(method = "vaporize(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraftforge/fluids/FluidStack;)V", at = @At(value = "INVOKE", target = "Ljava/lang/Math;random()D", ordinal = 2), remap=false)
	public double redirect_math_random_28_5() {
		return KillTheRNG.randomness.math_random_28.nextDouble();
//		KillTheRNG.randomness.math_random_28.nextDouble();
//		return Math.random();
	}

}
