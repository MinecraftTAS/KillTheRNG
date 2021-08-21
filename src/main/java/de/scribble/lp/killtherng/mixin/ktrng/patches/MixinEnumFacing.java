package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.util.EnumFacing;

@Mixin(EnumFacing.class)
public class MixinEnumFacing {

	/**
	* null
	*/
	@Redirect(method = "random(Ljava/util/Random;)Lnet/minecraft/util/EnumFacing;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_320_1(Random rand, int i) {
		return KillTheRNG.randomness.random_320.nextInt(i);
//		KillTheRNG.randomness.random_320.nextInt(i);
//		return rand.nextInt(i);
	}

}
