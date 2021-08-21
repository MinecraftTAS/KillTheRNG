package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

@Mixin(targets="net.minecraft.world.gen.structure.StructureStrongholdPieces$Stones")
public class MixinStructureStrongholdPieces$Stones {

	/**
	* null
	*/
	@Redirect(method = "selectBlocks(Ljava/util/Random;IIIZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1732_1(Random rand) {
		return KillTheRNG.randomness.random_1732.nextFloat();
//		KillTheRNG.randomness.random_1732.nextFloat();
//		return rand.nextFloat();
	}

}
