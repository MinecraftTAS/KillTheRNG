package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.biome.BiomeProvider;

@Mixin(BiomeProvider.class)
public class MixinBiomeProvider {
	@Redirect(method = "findBiomePosition(IIILjava/util/List;Ljava/util/Random;)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1362(Random rand, int i) {
		return KillTheRNG.randomness.random_1362.nextInt(i);
	}

}
