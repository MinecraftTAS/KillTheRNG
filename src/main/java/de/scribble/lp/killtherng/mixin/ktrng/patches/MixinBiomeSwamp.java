package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.biome.BiomeSwamp;

@Mixin(BiomeSwamp.class)
public class MixinBiomeSwamp {

	/**
	* Swamp Generation
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_swampGeneration_1(Random rand, int i) {
//		return KillTheRNG.randomness.swampGeneration.nextInt(i);
		KillTheRNG.randomness.swampGeneration.nextInt(i);
		return rand.nextInt(i);
	}

}
