package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockMycelium.class)
public class MixinBlockMycelium{

	/**
	* Position of mycelium particles
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_myceliumParticles_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.myceliumParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.myceliumParticles.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.myceliumParticles.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of mycelium particles
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_myceliumParticles_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.myceliumParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.myceliumParticles.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.myceliumParticles.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of mycelium particles
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_myceliumParticles_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.myceliumParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.myceliumParticles.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.myceliumParticles.nextFloat();
			return rand.nextFloat();
		}
	}


}