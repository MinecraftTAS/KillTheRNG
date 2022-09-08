package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.StructureEndCityPieces.class)
public class MixinStructureEndCityPieces{

	/**
	* Position, Rotation and Type of next End Piece
	*/
	@Redirect(method = "recursiveChildren(Lnet/minecraft/world/gen/structure/template/TemplateManager;Lnet/minecraft/world/gen/structure/StructureEndCityPieces$IGenerator;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	private static int redirect_posRotTypeEndCity_1(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeEndCity.nextInt();
		de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeEndCity.nextInt();
		return rand.nextInt();
	}


}