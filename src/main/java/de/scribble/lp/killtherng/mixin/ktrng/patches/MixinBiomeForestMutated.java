package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.biome.BiomeForestMutated;

@Mixin(BiomeForestMutated.class)
public class MixinBiomeForestMutated {

	/**
	* Forest Generation
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_forestGenration_1(Random rand) {
//		return KillTheRNG.randomness.forestGenration.nextBoolean();
		KillTheRNG.randomness.forestGenration.nextBoolean();
		return rand.nextBoolean();
	}

}
