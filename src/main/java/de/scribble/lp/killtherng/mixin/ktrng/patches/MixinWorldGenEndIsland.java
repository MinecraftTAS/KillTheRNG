package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.feature.WorldGenEndIsland.class)
public class MixinWorldGenEndIsland{

	/**
	* End Island Pos
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_endIslandPos_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.endIslandPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.endIslandPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.endIslandPos.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* End Island Pos
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_endIslandPos_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.endIslandPos.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.endIslandPos.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.endIslandPos.nextInt(i);
			return rand.nextInt(i);
		}
	}


}