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

}
