package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.renderer.tileentity.TileEntityEndPortalRenderer;

@Mixin(TileEntityEndPortalRenderer.class)
public class MixinTileEntityEndPortalRenderer {

	/**
	* null
	*/
	@Redirect(method = "render(Lnet/minecraft/tileentity/TileEntityEndPortal;DDDFIF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1468_1(Random rand, long seed) {
		KillTheRNG.randomness.random_1468.setSeed(seed, true);
		rand.setSeed(seed);
	}

	/**
	* null
	*/
	@Redirect(method = "render(Lnet/minecraft/tileentity/TileEntityEndPortal;DDDFIF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1469_2(Random rand) {
//		return KillTheRNG.randomness.random_1469.nextFloat();
		KillTheRNG.randomness.random_1469.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "render(Lnet/minecraft/tileentity/TileEntityEndPortal;DDDFIF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1470_3(Random rand) {
//		return KillTheRNG.randomness.random_1470.nextFloat();
		KillTheRNG.randomness.random_1470.nextFloat();
		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "render(Lnet/minecraft/tileentity/TileEntityEndPortal;DDDFIF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1471_4(Random rand) {
//		return KillTheRNG.randomness.random_1471.nextFloat();
		KillTheRNG.randomness.random_1471.nextFloat();
		return rand.nextFloat();
	}

}
