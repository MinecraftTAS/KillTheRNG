package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.MapGenEndCity;

@Mixin(MapGenEndCity.Start.class)
public class MixinMapGenEndCity$Start {

	/**
	* Position of the End City Beginning
	*/
	@Redirect(method = "create(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/ChunkGeneratorEnd;Ljava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posEndCity_1(Random rand, int i) {
//		return KillTheRNG.randomness.posEndCity.nextInt(i);
		KillTheRNG.randomness.posEndCity.nextInt(i);
		return rand.nextInt(i);
	}

}
