package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.feature.WorldGenSand;

@Mixin(WorldGenSand.class)
public class MixinWorldGenSand {

	/**
	* Sand Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_sandGeneration_1(Random rand, int i) {
//		return KillTheRNG.randomness.sandGeneration.nextInt(i);
		KillTheRNG.randomness.sandGeneration.nextInt(i);
		return rand.nextInt(i);
	}

}
