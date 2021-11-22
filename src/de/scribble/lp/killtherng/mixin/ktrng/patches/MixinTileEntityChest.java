package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.tileentity.TileEntityChest;

@Mixin(TileEntityChest.class)
public class MixinTileEntityChest {

	/**
	* null
	*/
	@Redirect(method = "update()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_395_1(Random rand) {
		return KillTheRNG.randomness.random_395.nextFloat();
//		KillTheRNG.randomness.random_395.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "update()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_396_2(Random rand) {
		return KillTheRNG.randomness.random_396.nextFloat();
//		KillTheRNG.randomness.random_396.nextFloat();
//		return rand.nextFloat();
	}

}
