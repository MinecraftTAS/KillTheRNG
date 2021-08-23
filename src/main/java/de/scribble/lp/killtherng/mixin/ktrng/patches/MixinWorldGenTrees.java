package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.feature.WorldGenTrees;

@Mixin(WorldGenTrees.class)
public class MixinWorldGenTrees {

	/**
	* Height for trees
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_genTreeHeight_1(Random rand, int i) {
//		return KillTheRNG.randomness.genTreeHeight.nextInt(i);
		KillTheRNG.randomness.genTreeHeight.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Chance of vine generating on tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_genTreeVine_2(Random rand, int i) {
//		return KillTheRNG.randomness.genTreeVine.nextInt(i);
		KillTheRNG.randomness.genTreeVine.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* If a vine should spread
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_genTreeVineSpread_3(Random rand, int i) {
//		return KillTheRNG.randomness.genTreeVineSpread.nextInt(i);
		KillTheRNG.randomness.genTreeVineSpread.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* If a vine should spread
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_genTreeVineSpread_4(Random rand, int i) {
//		return KillTheRNG.randomness.genTreeVineSpread.nextInt(i);
		KillTheRNG.randomness.genTreeVineSpread.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* If a vine should spread
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_genTreeVineSpread_5(Random rand, int i) {
//		return KillTheRNG.randomness.genTreeVineSpread.nextInt(i);
		KillTheRNG.randomness.genTreeVineSpread.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* If a vine should spread
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_genTreeVineSpread_6(Random rand, int i) {
//		return KillTheRNG.randomness.genTreeVineSpread.nextInt(i);
		KillTheRNG.randomness.genTreeVineSpread.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* The length of a vine generating on a tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_genTreeVineLength_7(Random rand, int i) {
//		return KillTheRNG.randomness.genTreeVineLength.nextInt(i);
		KillTheRNG.randomness.genTreeVineLength.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* The length of a vine generating on a tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_genTreeVineLength_8(Random rand, int i) {
//		return KillTheRNG.randomness.genTreeVineLength.nextInt(i);
		KillTheRNG.randomness.genTreeVineLength.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* The length of a vine generating on a tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_genTreeVineLength_9(Random rand, int i) {
//		return KillTheRNG.randomness.genTreeVineLength.nextInt(i);
		KillTheRNG.randomness.genTreeVineLength.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* The length of a vine generating on a tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_genTreeVineLength_10(Random rand, int i) {
//		return KillTheRNG.randomness.genTreeVineLength.nextInt(i);
		KillTheRNG.randomness.genTreeVineLength.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* If a cocoa should be added to a tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_genTreeCocoaChance_11(Random rand, int i) {
//		return KillTheRNG.randomness.genTreeCocoaChance.nextInt(i);
		KillTheRNG.randomness.genTreeCocoaChance.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* How many cocoas should be added
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_genTreeCocoaAmount_12(Random rand, int i) {
//		return KillTheRNG.randomness.genTreeCocoaAmount.nextInt(i);
		KillTheRNG.randomness.genTreeCocoaAmount.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* The grow state of a generated cocoa bean
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_genTreeCocoaAge_13(Random rand, int i) {
//		return KillTheRNG.randomness.genTreeCocoaAge.nextInt(i);
		KillTheRNG.randomness.genTreeCocoaAge.nextInt(i);
		return rand.nextInt(i);
	}

}
