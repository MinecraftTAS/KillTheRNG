package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockBeetroot;

@Mixin(BlockBeetroot.class)
public class MixinBlockBeetroot {

	/**
	* Chance per tick of dropping beetroot if block below isn't sustainable for beetroot
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_checkAndDropBeetroot_1(Random rand, int i) {
		return KillTheRNG.randomness.checkAndDropBeetroot.nextInt(i);
//		KillTheRNG.randomness.checkAndDropBeetroot.nextInt(i);
//		return rand.nextInt(i);
	}

}
