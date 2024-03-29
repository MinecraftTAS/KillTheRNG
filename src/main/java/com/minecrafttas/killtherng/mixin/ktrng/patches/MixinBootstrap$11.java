package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraft.init.Bootstrap$11")
public class MixinBootstrap$11{

	/**
	* null
	*/
	@Redirect(method = "dispenseStack(Lnet/minecraft/dispenser/IBlockSource;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_1261_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_1261.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_1261.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_1261.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "dispenseStack(Lnet/minecraft/dispenser/IBlockSource;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_1262_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_1262.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_1262.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_1262.nextGaussian();
			return rand.nextGaussian();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "dispenseStack(Lnet/minecraft/dispenser/IBlockSource;Lnet/minecraft/item/ItemStack;)Lnet/minecraft/item/ItemStack;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_1263_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_1263.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_1263.nextGaussian();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_1263.nextGaussian();
			return rand.nextGaussian();
		}
	}


}