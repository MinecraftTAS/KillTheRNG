package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockMycelium.class)
public class MixinBlockMycelium{

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_469_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_469.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_469.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_469.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_470_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_470.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_470.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_470.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* null
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_471_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_471.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_471.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.random_471.nextFloat();
			return rand.nextFloat();
		}
	}


}