package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces;

@Mixin(ComponentScatteredFeaturePieces.Igloo.class)
public class MixinComponentScatteredFeaturePieces$Igloo {

	/**
	* null
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1733_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1733.nextInt(i);
//		KillTheRNG.randomness.random_1733.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_1734_2(Random rand) {
		return KillTheRNG.randomness.random_1734.nextDouble();
//		KillTheRNG.randomness.random_1734.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1735_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1735.nextInt(i);
//		KillTheRNG.randomness.random_1735.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_random_1736_4(Random rand) {
		return KillTheRNG.randomness.random_1736.nextLong();
//		KillTheRNG.randomness.random_1736.nextLong();
//		return rand.nextLong();
	}

}
