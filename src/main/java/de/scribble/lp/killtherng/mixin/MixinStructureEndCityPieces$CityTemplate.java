package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureEndCityPieces;

@Mixin(StructureEndCityPieces.CityTemplate.class)
public class MixinStructureEndCityPieces$CityTemplate {

	/**
	* null
	*/
	@Redirect(method = "handleDataMarker(Ljava/lang/String;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_random_1760_0(Random rand) {
		return KillTheRNG.randomness.random_1760.nextLong();
	}

}
