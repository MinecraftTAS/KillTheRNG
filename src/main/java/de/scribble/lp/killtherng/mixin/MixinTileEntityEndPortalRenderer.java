package de.scribble.lp.killtherng.mixin;

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
	public void redirect_random_1468_0(Random rand, long unused) {
	}

	/**
	* null
	*/
	@Redirect(method = "render(Lnet/minecraft/tileentity/TileEntityEndPortal;DDDFIF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1469_1(Random rand) {
		return KillTheRNG.randomness.random_1469.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "render(Lnet/minecraft/tileentity/TileEntityEndPortal;DDDFIF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_1470_2(Random rand) {
		return KillTheRNG.randomness.random_1470.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "render(Lnet/minecraft/tileentity/TileEntityEndPortal;DDDFIF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1471_3(Random rand) {
		return KillTheRNG.randomness.random_1471.nextFloat();
	}

}