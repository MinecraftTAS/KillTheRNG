package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.tileentity.TileEntityEnderChest;

@Mixin(TileEntityEnderChest.class)
public class MixinTileEntityEnderChest {

	/**
	* null
	*/
	@Redirect(method = "update()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_508_1(Random rand) {
		return KillTheRNG.randomness.random_508.nextFloat();
//		KillTheRNG.randomness.random_508.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "update()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_509_2(Random rand) {
		return KillTheRNG.randomness.random_509.nextFloat();
//		KillTheRNG.randomness.random_509.nextFloat();
//		return rand.nextFloat();
	}

}
