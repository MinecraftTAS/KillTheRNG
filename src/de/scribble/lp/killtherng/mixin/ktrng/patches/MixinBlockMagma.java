package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockMagma;

@Mixin(BlockMagma.class)
public class MixinBlockMagma {

	/**
	* Pitch of the sound when water flows over magma
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_magmaExtinguish_1(Random rand) {
		return KillTheRNG.randomness.magmaExtinguish.nextFloat();
//		KillTheRNG.randomness.magmaExtinguish.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of the sound when water flows over magma
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_magmaExtinguish_2(Random rand) {
		return KillTheRNG.randomness.magmaExtinguish.nextFloat();
//		KillTheRNG.randomness.magmaExtinguish.nextFloat();
//		return rand.nextFloat();
	}

}
