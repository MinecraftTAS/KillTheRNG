package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.item.EntityFireworkRocket;

@Mixin(EntityFireworkRocket.class)
public class MixinEntityFireworkRocket {

	/**
	* Motion of the firework rocket
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_fireworkMotion_1(Random rand) {
		return KillTheRNG.randomness.fireworkMotion.nextGaussian();
//		KillTheRNG.randomness.fireworkMotion.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Motion of the firework rocket
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_fireworkMotion_2(Random rand) {
		return KillTheRNG.randomness.fireworkMotion.nextGaussian();
//		KillTheRNG.randomness.fireworkMotion.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Lifetime of the firework rocket
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_fireworkLifetime_3(Random rand, int i) {
		return KillTheRNG.randomness.fireworkLifetime.nextInt(i);
//		KillTheRNG.randomness.fireworkLifetime.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Lifetime of the firework rocket
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_fireworkLifetime_4(Random rand, int i) {
		return KillTheRNG.randomness.fireworkLifetime.nextInt(i);
//		KillTheRNG.randomness.fireworkLifetime.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Position of fireworkSparks
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_fireworkParticle_5(Random rand) {
		return KillTheRNG.randomness.fireworkParticle.nextGaussian();
//		KillTheRNG.randomness.fireworkParticle.nextGaussian();
//		return rand.nextGaussian();
	}

	/**
	* Position of fireworkSparks
	*/
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_fireworkParticle_6(Random rand) {
		return KillTheRNG.randomness.fireworkParticle.nextGaussian();
//		KillTheRNG.randomness.fireworkParticle.nextGaussian();
//		return rand.nextGaussian();
	}

}
