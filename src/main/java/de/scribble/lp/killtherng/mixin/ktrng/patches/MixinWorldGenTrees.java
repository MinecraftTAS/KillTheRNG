package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.feature.WorldGenTrees.class)
public class MixinWorldGenTrees{

	/**
	* Height for trees
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_genTreeHeight_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeHeight.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeHeight.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeHeight.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Chance of vine generating on tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_genTreeVine_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVine.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVine.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVine.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* If a vine should spread
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_genTreeVineSpread_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineSpread.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineSpread.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineSpread.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* If a vine should spread
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_genTreeVineSpread_4(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineSpread.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineSpread.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineSpread.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* If a vine should spread
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_genTreeVineSpread_5(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineSpread.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineSpread.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineSpread.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* If a vine should spread
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_genTreeVineSpread_6(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineSpread.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineSpread.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineSpread.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The length of a vine generating on a tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_genTreeVineLength_7(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineLength.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineLength.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineLength.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The length of a vine generating on a tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_genTreeVineLength_8(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineLength.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineLength.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineLength.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The length of a vine generating on a tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_genTreeVineLength_9(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineLength.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineLength.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineLength.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The length of a vine generating on a tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_genTreeVineLength_10(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineLength.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineLength.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeVineLength.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* If a cocoa should be added to a tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_genTreeCocoaChance_11(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeCocoaChance.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeCocoaChance.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeCocoaChance.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* How many cocoas should be added
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_genTreeCocoaAmount_12(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeCocoaAmount.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeCocoaAmount.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeCocoaAmount.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* The grow state of a generated cocoa bean
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_genTreeCocoaAge_13(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeCocoaAge.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeCocoaAge.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.genTreeCocoaAge.nextInt(i);
			return rand.nextInt(i);
		}
	}


}