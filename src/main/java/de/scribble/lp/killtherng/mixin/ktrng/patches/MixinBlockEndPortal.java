package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockEndPortal.class)
public class MixinBlockEndPortal{

	/**
	* Get the X of the end portal particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_endPortalParticlePosX_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.endPortalParticlePosX.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.endPortalParticlePosX.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.endPortalParticlePosX.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Get the X of the end portal particle
	*/
	@Redirect(method = "randomDisplayTick(Lnet/minecraft/block/state/IBlockState;Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_endPortalParticlePosZ_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.endPortalParticlePosZ.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.endPortalParticlePosZ.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.endPortalParticlePosZ.nextFloat();
			return rand.nextFloat();
		}
	}


}