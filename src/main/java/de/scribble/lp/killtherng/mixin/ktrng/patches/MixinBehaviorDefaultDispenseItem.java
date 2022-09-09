package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.dispenser.BehaviorDefaultDispenseItem.class)
public class MixinBehaviorDefaultDispenseItem{

	/**
	* null
	*/
	@Redirect(method = "doDispense(Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;ILnet/minecraft/util/EnumFacing;Lnet/minecraft/dispenser/IPosition;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	private static double redirect_random_334_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_334.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_334.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_334.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "doDispense(Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;ILnet/minecraft/util/EnumFacing;Lnet/minecraft/dispenser/IPosition;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	private static double redirect_random_335_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_335.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_335.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_335.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "doDispense(Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;ILnet/minecraft/util/EnumFacing;Lnet/minecraft/dispenser/IPosition;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	private static double redirect_random_336_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_336.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_336.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_336.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "doDispense(Lnet/minecraft/world/World;Lnet/minecraft/item/ItemStack;ILnet/minecraft/util/EnumFacing;Lnet/minecraft/dispenser/IPosition;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	private static double redirect_random_337_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_337.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_337.nextGaussian();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.random_337.nextGaussian();
			return rand.nextGaussian();
		}
	}


}