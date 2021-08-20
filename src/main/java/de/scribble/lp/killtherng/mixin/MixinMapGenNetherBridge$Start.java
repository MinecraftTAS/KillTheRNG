package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.MapGenNetherBridge;

@Mixin(MapGenNetherBridge.Start.class)
public class MixinMapGenNetherBridge$Start {

	/**
	* null
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;Ljava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1668_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1668.nextInt(i);
	}

}