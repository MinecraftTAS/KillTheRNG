package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.feature.WorldGenSavannaTree;

@Mixin(WorldGenSavannaTree.class)
public class MixinWorldGenSavannaTree {

	/**
	* Height of acasia tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_genAcasiaTreeHeight_1(Random rand, int i) {
//		return KillTheRNG.randomness.genAcasiaTreeHeight.nextInt(i);
		KillTheRNG.randomness.genAcasiaTreeHeight.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Height of acasia tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_genAcasiaTreeHeight_2(Random rand, int i) {
//		return KillTheRNG.randomness.genAcasiaTreeHeight.nextInt(i);
		KillTheRNG.randomness.genAcasiaTreeHeight.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Acasia leaves generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_genAcasiaCrown_3(Random rand, int i) {
//		return KillTheRNG.randomness.genAcasiaCrown.nextInt(i);
		KillTheRNG.randomness.genAcasiaCrown.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Acasia leaves generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_genAcasiaCrown_4(Random rand, int i) {
//		return KillTheRNG.randomness.genAcasiaCrown.nextInt(i);
		KillTheRNG.randomness.genAcasiaCrown.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Acasia trunk generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_genAcasiaTrunk_5(Random rand, int i) {
//		return KillTheRNG.randomness.genAcasiaTrunk.nextInt(i);
		KillTheRNG.randomness.genAcasiaTrunk.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Acasia trunk generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_genAcasiaTrunk_6(Random rand, int i) {
//		return KillTheRNG.randomness.genAcasiaTrunk.nextInt(i);
		KillTheRNG.randomness.genAcasiaTrunk.nextInt(i);
		return rand.nextInt(i);
	}

}
