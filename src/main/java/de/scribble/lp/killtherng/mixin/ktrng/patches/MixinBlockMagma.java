package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockMagma.class)
public class MixinBlockMagma{

	/**
	* Pitch of the sound when water flows over magma
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_magmaExtinguish_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.magmaExtinguish.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.magmaExtinguish.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.magmaExtinguish.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of the sound when water flows over magma
	*/
	@Redirect(method = "updateTick(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_magmaExtinguish_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.magmaExtinguish.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.magmaExtinguish.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.magmaExtinguish.nextFloat();
			return rand.nextFloat();
		}
	}


}