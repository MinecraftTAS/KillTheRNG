package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockFrostedIce;

@Mixin(BlockFrostedIce.class)
public class MixinBlockFrostedIce {

	/**
	* Chance for frosted ice to melt
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_frostedIceMeltChance_1(Random rand, int i) {
		return KillTheRNG.randomness.frostedIceMeltChance.nextInt(i);
//		KillTheRNG.randomness.frostedIceMeltChance.nextInt(i);
//		return rand.nextInt(i);
	}

}
