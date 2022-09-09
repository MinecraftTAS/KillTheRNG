package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockLeaves.class)
public class MixinBlockLeaves{

	/**
	* If a drip particle should spawn
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_leafDripParticleActivate_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.leafDripParticleActivate.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.leafDripParticleActivate.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.leafDripParticleActivate.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of drip particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_leafDripParticle_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.leafDripParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.leafDripParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.leafDripParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of drip particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_leafDripParticle_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.leafDripParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.leafDripParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.leafDripParticle.nextFloat();
			return rand.nextFloat();
		}
	}


}