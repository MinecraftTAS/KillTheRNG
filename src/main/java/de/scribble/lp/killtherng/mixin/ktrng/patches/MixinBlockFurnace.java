package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockFurnace;

@Mixin(BlockFurnace.class)
public class MixinBlockFurnace {

	/**
	* Offset of the position of the furnace particles in the Y axis
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_furnaceParticlePos_1(Random rand) {
		return KillTheRNG.randomness.furnaceParticlePos.nextDouble();
//		KillTheRNG.randomness.furnaceParticlePos.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Position of some furnace particles
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_furnaceParticlePos_2(Random rand) {
		return KillTheRNG.randomness.furnaceParticlePos.nextDouble();
//		KillTheRNG.randomness.furnaceParticlePos.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* Chance for the furnace to crackle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_furnaceSound_3(Random rand) {
		return KillTheRNG.randomness.furnaceSound.nextDouble();
//		KillTheRNG.randomness.furnaceSound.nextDouble();
//		return rand.nextDouble();
	}

}
