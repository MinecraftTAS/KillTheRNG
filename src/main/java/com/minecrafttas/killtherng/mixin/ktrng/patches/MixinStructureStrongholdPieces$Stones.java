package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraft.world.gen.structure.StructureStrongholdPieces$Stones")
public class MixinStructureStrongholdPieces$Stones{

	/**
	* Position, Rotation and Type of next Stronghold Piece
	*/
	@Redirect(method = "selectBlocks(Ljava/util/Random;IIIZ)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_posRotTypeStronghold_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeStronghold.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeStronghold.nextFloat();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeStronghold.nextFloat();
			return rand.nextFloat();
		}
	}


}