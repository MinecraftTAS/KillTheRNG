package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.feature.WorldGenBirchTree.class)
public class MixinWorldGenBirchTree{

	/**
	* Height of a birch tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_genBirchTreeHeight_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genBirchTreeHeight.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genBirchTreeHeight.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genBirchTreeHeight.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Extra height of a birch tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_genBirchTreeExtraHeight_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genBirchTreeExtraHeight.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genBirchTreeExtraHeight.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genBirchTreeExtraHeight.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Part of crown generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_genBirchTreeCrown_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genBirchTreeCrown.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genBirchTreeCrown.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genBirchTreeCrown.nextInt(i);
			return rand.nextInt(i);
		}
	}


}