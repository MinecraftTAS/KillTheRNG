package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockTNT.class)
public class MixinBlockTNT{

	/**
	* null
	*/
	@Redirect(method = "onBlockDestroyedByExplosion(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/Explosion;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_361_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_361.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_361.nextInt(i);
//		return rand.nextInt(i);
	}


}