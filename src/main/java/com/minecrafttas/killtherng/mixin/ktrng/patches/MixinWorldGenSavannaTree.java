package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.feature.WorldGenSavannaTree.class)
public class MixinWorldGenSavannaTree{

	/**
	* Height of acasia tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_genAcasiaTreeHeight_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genAcasiaTreeHeight.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genAcasiaTreeHeight.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genAcasiaTreeHeight.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Height of acasia tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_genAcasiaTreeHeight_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genAcasiaTreeHeight.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genAcasiaTreeHeight.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genAcasiaTreeHeight.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Acasia leaves generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_genAcasiaCrown_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genAcasiaCrown.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genAcasiaCrown.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genAcasiaCrown.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Acasia leaves generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_genAcasiaCrown_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genAcasiaCrown.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genAcasiaCrown.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genAcasiaCrown.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Acasia trunk generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_genAcasiaTrunk_5(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genAcasiaTrunk.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genAcasiaTrunk.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genAcasiaTrunk.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Acasia trunk generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_genAcasiaTrunk_6(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genAcasiaTrunk.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genAcasiaTrunk.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genAcasiaTrunk.nextInt(i);
			return rand.nextInt(i);
		}
	}


}