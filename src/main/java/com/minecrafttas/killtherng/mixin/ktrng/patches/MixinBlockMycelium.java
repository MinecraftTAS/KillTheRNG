package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockMycelium.class)
public class MixinBlockMycelium{

	/**
	* Position of next mycelium block
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_myceliumSpreadPos_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.myceliumSpreadPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.myceliumSpreadPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.myceliumSpreadPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of next mycelium block
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_myceliumSpreadPos_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.myceliumSpreadPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.myceliumSpreadPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.myceliumSpreadPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of next mycelium block
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_myceliumSpreadPos_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.myceliumSpreadPos.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.myceliumSpreadPos.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.myceliumSpreadPos.nextInt(i);
			return rand.nextInt(i);
		}
	}


}