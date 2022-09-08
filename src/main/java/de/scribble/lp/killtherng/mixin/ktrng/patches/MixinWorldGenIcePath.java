package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.feature.WorldGenIcePath.class)
public class MixinWorldGenIcePath{

	/**
	* Ice Spike Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_iceSpikeGeneration_1(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.iceSpikeGeneration.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.iceSpikeGeneration.nextInt(i);
		return rand.nextInt(i);
	}


}