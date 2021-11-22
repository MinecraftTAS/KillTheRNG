package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.feature.WorldGenTaiga2;

@Mixin(WorldGenTaiga2.class)
public class MixinWorldGenTaiga2 {

	/**
	* Height of a taiga tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_genTaigaTreeHeight_1(Random rand, int i) {
//		return KillTheRNG.randomness.genTaigaTreeHeight.nextInt(i);
		KillTheRNG.randomness.genTaigaTreeHeight.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* The height of the crown of a taiga tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_genTaigaTreeCheckCrownHeight_2(Random rand, int i) {
//		return KillTheRNG.randomness.genTaigaTreeCheckCrownHeight.nextInt(i);
		KillTheRNG.randomness.genTaigaTreeCheckCrownHeight.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Width of the crown of a taiga tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_genTaigaTreeCheckCrownWidth_3(Random rand, int i) {
//		return KillTheRNG.randomness.genTaigaTreeCheckCrownWidth.nextInt(i);
		KillTheRNG.randomness.genTaigaTreeCheckCrownWidth.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Width of the crown of a taiga tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_genTaigaTreeCrownWidth_4(Random rand, int i) {
//		return KillTheRNG.randomness.genTaigaTreeCrownWidth.nextInt(i);
		KillTheRNG.randomness.genTaigaTreeCrownWidth.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Part of the trunk generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_genTaigaTreeTrunk_5(Random rand, int i) {
//		return KillTheRNG.randomness.genTaigaTreeTrunk.nextInt(i);
		KillTheRNG.randomness.genTaigaTreeTrunk.nextInt(i);
		return rand.nextInt(i);
	}

}
