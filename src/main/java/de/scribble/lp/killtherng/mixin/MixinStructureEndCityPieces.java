package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureEndCityPieces;

@Mixin(StructureEndCityPieces.class)
public class MixinStructureEndCityPieces {

	/**
	* null
	*/
	@Redirect(method = "recursiveChildren(Lnet/minecraft/world/gen/structure/template/TemplateManager;Lnet/minecraft/world/gen/structure/StructureEndCityPieces$IGenerator;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	private static int redirect_random_1744_0(Random rand) {
		return KillTheRNG.randomness.random_1744.nextInt();
	}

}
