package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraft.world.gen.structure.StructureEndCityPieces$1")
public class MixinStructureEndCityPieces$1{

	/**
	* Position, Rotation and Type of next End Piece
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotTypeEndCity_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.nextInt(i);
			return rand.nextInt(i);
		}
	}


}