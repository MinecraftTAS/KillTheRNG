package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.feature.WorldGenCanopyTree.class)
public class MixinWorldGenCanopyTree{

	/**
	* Height of dark oak tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_genDarkOakTreeHeight_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genDarkOakTreeHeight.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genDarkOakTreeHeight.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genDarkOakTreeHeight.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Height of dark oak tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_genDarkOakTreeHeight_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genDarkOakTreeHeight.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genDarkOakTreeHeight.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genDarkOakTreeHeight.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Trunk of dark oak tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_genDarkOakTreeTrunk_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genDarkOakTreeTrunk.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genDarkOakTreeTrunk.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genDarkOakTreeTrunk.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Trunk of dark oak tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_genDarkOakTreeTrunk_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genDarkOakTreeTrunk.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genDarkOakTreeTrunk.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genDarkOakTreeTrunk.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Some extra leaves?
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_genDarkOakTreeExtraLeaves_5(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genDarkOakTreeExtraLeaves.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genDarkOakTreeExtraLeaves.nextBoolean();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genDarkOakTreeExtraLeaves.nextBoolean();
			return rand.nextBoolean();
		}
	}

	/**
	* Some extra trunks?
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_genDarkOakTreeExtraTrunk_6(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genDarkOakTreeExtraTrunk.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genDarkOakTreeExtraTrunk.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genDarkOakTreeExtraTrunk.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Some extra trunks?
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_genDarkOakTreeExtraTrunk_7(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.genDarkOakTreeExtraTrunk.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.genDarkOakTreeExtraTrunk.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.genDarkOakTreeExtraTrunk.nextInt(i);
			return rand.nextInt(i);
		}
	}


}