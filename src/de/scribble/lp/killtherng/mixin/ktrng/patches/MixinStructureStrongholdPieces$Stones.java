package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

@Mixin(targets="net.minecraft.world.gen.structure.StructureStrongholdPieces$Stones")
public class MixinStructureStrongholdPieces$Stones {

	/**
	* Position, Rotation and Type of next Stronghold Piece
	*/
	@Redirect(method = "selectBlocks(Ljava/util/Random;IIIZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_posRotTypeStronghold_1(Random rand) {
//		return KillTheRNG.randomness.posRotTypeStronghold.nextFloat();
		KillTheRNG.randomness.posRotTypeStronghold.nextFloat();
		return rand.nextFloat();
	}

}
