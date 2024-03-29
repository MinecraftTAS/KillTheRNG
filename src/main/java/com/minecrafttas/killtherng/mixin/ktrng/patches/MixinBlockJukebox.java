package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockJukebox.class)
public class MixinBlockJukebox{

	/**
	* Position of the record when a jukebox releases it
	*/
	@Redirect(method = "dropRecord(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_jukeboxRecordDropPosition_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.jukeboxRecordDropPosition.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.jukeboxRecordDropPosition.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.jukeboxRecordDropPosition.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of the record when a jukebox releases it
	*/
	@Redirect(method = "dropRecord(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_jukeboxRecordDropPosition_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.jukeboxRecordDropPosition.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.jukeboxRecordDropPosition.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.jukeboxRecordDropPosition.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of the record when a jukebox releases it
	*/
	@Redirect(method = "dropRecord(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_jukeboxRecordDropPosition_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.jukeboxRecordDropPosition.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.jukeboxRecordDropPosition.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.jukeboxRecordDropPosition.nextFloat();
			return rand.nextFloat();
		}
	}


}