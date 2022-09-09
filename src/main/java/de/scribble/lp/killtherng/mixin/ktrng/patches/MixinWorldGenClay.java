package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.feature.WorldGenClay.class)
public class MixinWorldGenClay{

	/**
	* Clay Generation (looking at you diamonds)
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_clayGeneration_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.clayGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.clayGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.clayGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}


}