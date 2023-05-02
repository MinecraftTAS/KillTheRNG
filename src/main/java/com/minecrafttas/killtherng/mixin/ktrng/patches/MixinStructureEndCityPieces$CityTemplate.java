package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.StructureEndCityPieces.CityTemplate.class)
public class MixinStructureEndCityPieces$CityTemplate{

	/**
	* Position, Rotation and Type of next End Piece
	*/
	@Redirect(method = "handleDataMarker(Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_posRotTypeEndCity_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.nextLong();
		} else {
				com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.nextLong();
				return rand.nextLong();
		}
	}


}