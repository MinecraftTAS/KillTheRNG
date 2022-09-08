package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.biome.BiomeForestMutated.class)
public class MixinBiomeForestMutated{

	/**
	* Forest Generation
	*/
	@Redirect(method = "getRandomTreeFeature(Ljava/util/Random;)Lnet/minecraft/world/gen/feature/WorldGenAbstractTree;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_forestGenration_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.forestGenration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.forestGenration.nextBoolean();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.forestGenration.nextBoolean();
			return rand.nextBoolean();
		}
	}


}