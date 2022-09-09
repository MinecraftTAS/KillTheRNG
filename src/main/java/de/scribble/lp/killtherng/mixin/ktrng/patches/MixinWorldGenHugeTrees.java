package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.feature.WorldGenHugeTrees.class)
public class MixinWorldGenHugeTrees{

	/**
	* Height of a huge tree
	*/
	@Redirect(method = "getHeight(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_genHugeTreeHeight_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.genHugeTreeHeight.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.genHugeTreeHeight.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.genHugeTreeHeight.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Extra height of a huge tree
	*/
	@Redirect(method = "getHeight(Ljava/util/Random;)I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_genHugeTreeExtraHeight_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.genHugeTreeExtraHeight.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.genHugeTreeExtraHeight.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.genHugeTreeExtraHeight.nextInt(i);
			return rand.nextInt(i);
		}
	}


}