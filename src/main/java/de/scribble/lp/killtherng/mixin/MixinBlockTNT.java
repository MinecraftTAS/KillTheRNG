package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockTNT;

@Mixin(BlockTNT.class)
public class MixinBlockTNT {

	/**
	* null
	*/
	@Redirect(method = "onExplosionDestroy(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/Explosion;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_361_0(Random rand, int i) {
		return KillTheRNG.randomness.random_361.nextInt(i);
	}

}
