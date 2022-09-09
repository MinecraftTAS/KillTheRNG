package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.StructureStart.class)
public class MixinStructureStart{

	/**
	* Height of the structure
	*/
	@Redirect(method = "markAvailableHeight(Lnet/minecraft/world/World;Ljava/util/Random;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_heightStructureRng_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.heightStructureRng.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.heightStructureRng.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.heightStructureRng.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Height of the structure
	*/
	@Redirect(method = "setRandomHeight(Lnet/minecraft/world/World;Ljava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_heightStructureRng_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.heightStructureRng.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.heightStructureRng.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.heightStructureRng.nextInt(i);
			return rand.nextInt(i);
		}
	}


}