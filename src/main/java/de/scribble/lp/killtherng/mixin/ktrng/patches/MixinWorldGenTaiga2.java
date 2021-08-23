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
	* Multiple things to do with taiga tree generation, but too lazy to figure this out...
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_genTaigaTree_1(Random rand, int i) {
//		return KillTheRNG.randomness.genTaigaTree.nextInt(i);
		KillTheRNG.randomness.genTaigaTree.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Multiple things to do with taiga tree generation, but too lazy to figure this out...
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_genTaigaTree_2(Random rand, int i) {
//		return KillTheRNG.randomness.genTaigaTree.nextInt(i);
		KillTheRNG.randomness.genTaigaTree.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Multiple things to do with taiga tree generation, but too lazy to figure this out...
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_genTaigaTree_3(Random rand, int i) {
//		return KillTheRNG.randomness.genTaigaTree.nextInt(i);
		KillTheRNG.randomness.genTaigaTree.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Multiple things to do with taiga tree generation, but too lazy to figure this out...
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_genTaigaTree_4(Random rand, int i) {
//		return KillTheRNG.randomness.genTaigaTree.nextInt(i);
		KillTheRNG.randomness.genTaigaTree.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Multiple things to do with taiga tree generation, but too lazy to figure this out...
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_genTaigaTree_5(Random rand, int i) {
//		return KillTheRNG.randomness.genTaigaTree.nextInt(i);
		KillTheRNG.randomness.genTaigaTree.nextInt(i);
		return rand.nextInt(i);
	}

}
