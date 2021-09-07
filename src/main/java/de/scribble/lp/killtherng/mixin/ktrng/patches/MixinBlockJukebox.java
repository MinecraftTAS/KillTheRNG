package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockJukebox;

@Mixin(BlockJukebox.class)
public class MixinBlockJukebox {

	/**
	* Position of the record when a jukebox releases it
	*/
	@Redirect(method = "dropRecord(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_jukeboxRecordDrop_1(Random rand) {
		return KillTheRNG.randomness.jukeboxRecordDrop.nextFloat();
//		KillTheRNG.randomness.jukeboxRecordDrop.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of the record when a jukebox releases it
	*/
	@Redirect(method = "dropRecord(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_jukeboxRecordDrop_2(Random rand) {
		return KillTheRNG.randomness.jukeboxRecordDrop.nextFloat();
//		KillTheRNG.randomness.jukeboxRecordDrop.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of the record when a jukebox releases it
	*/
	@Redirect(method = "dropRecord(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_jukeboxRecordDrop_3(Random rand) {
		return KillTheRNG.randomness.jukeboxRecordDrop.nextFloat();
//		KillTheRNG.randomness.jukeboxRecordDrop.nextFloat();
//		return rand.nextFloat();
	}

}
