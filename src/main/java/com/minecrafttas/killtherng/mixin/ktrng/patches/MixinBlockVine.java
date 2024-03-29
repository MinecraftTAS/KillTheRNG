package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockVine.class)
public class MixinBlockVine{

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_462_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_462.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_462.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_462.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_random_463_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_463.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_463.nextBoolean();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_463.nextBoolean();
			return rand.nextBoolean();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_random_464_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_464.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_464.nextBoolean();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_464.nextBoolean();
			return rand.nextBoolean();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 2))
	public boolean redirect_random_465_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_465.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_465.nextBoolean();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.random_465.nextBoolean();
			return rand.nextBoolean();
		}
	}


}