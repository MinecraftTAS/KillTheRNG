package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.feature.WorldGenShrub;

@Mixin(WorldGenShrub.class)
public class MixinWorldGenShrub {

	/**
	* Shrub Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_shrubGeneration_1(Random rand, int i) {
//		return KillTheRNG.randomness.shrubGeneration.nextInt(i);
		KillTheRNG.randomness.shrubGeneration.nextInt(i);
		return rand.nextInt(i);
	}

}
