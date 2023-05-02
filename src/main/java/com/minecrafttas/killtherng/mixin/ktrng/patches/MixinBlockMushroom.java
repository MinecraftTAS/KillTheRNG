package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockMushroom.class)
public class MixinBlockMushroom{

	/**
	* Chance of a mushroom spreading to surrounding blocks
	*/
	@Redirect(method = "canUseBonemeal(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_mushroomSpreadChance_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadChance.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadChance.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadChance.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of the next mushroom around the current one
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_mushroomSpreadPos_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of the next mushroom around the current one
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_mushroomSpreadPos_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of the next mushroom around the current one
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_mushroomSpreadPos_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of the next mushroom around the current one
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_mushroomSpreadPos_5(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of the next mushroom around the current one
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_mushroomSpreadPos_6(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of the next mushroom around the current one
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_mushroomSpreadPos_7(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of the next mushroom around the current one
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_mushroomSpreadPos_8(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of the next mushroom around the current one
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_mushroomSpreadPos_9(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of the next mushroom around the current one
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_mushroomSpreadPos_10(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.mushroomSpreadPos.nextInt(i);
			return rand.nextInt(i);
		}
	}


}