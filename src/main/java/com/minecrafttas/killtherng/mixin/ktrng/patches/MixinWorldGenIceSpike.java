package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.feature.WorldGenIceSpike.class)
public class MixinWorldGenIceSpike{

	/**
	* Ice Spike Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_iceSpikeGeneration_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Ice Spike Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_iceSpikeGeneration_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Ice Spike Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_iceSpikeGeneration_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Ice Spike Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_iceSpikeGeneration_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Ice Spike Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_iceSpikeGeneration_5(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Ice Spike Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_iceSpikeGeneration_6(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Ice Spike Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_iceSpikeGeneration_7(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Ice Spike Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_iceSpikeGeneration_8(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Ice Spike Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_iceSpikeGeneration_9(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.iceSpikeGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}


}