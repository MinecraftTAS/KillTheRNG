package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraft.world.gen.structure.WoodlandMansionPieces$Placer")
public class MixinWoodlandMansionPieces$Placer{

	/**
	* Type and Direction of Woodland Mansion Pieces
	*/
	@Redirect(method = "createMansion(Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/util/Rotation;Ljava/util/List;Lnet/minecraft/world/gen/structure/WoodlandMansionPieces$Grid;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_woodlandMansionRng_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.woodlandMansionRng.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.woodlandMansionRng.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.woodlandMansionRng.nextInt(i);
			return rand.nextInt(i);
		}
	}


}