package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.WoodlandMansion;

@Mixin(WoodlandMansion.Start.class)
public class MixinWoodlandMansion$Start {

	/**
	* null
	*/
	@Redirect(method = "create(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/ChunkGeneratorOverworld;Ljava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1635_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1635.nextInt(i);
//		KillTheRNG.randomness.random_1635.nextInt(i);
//		return rand.nextInt(i);
	}

}
