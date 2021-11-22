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
	* Igloo scatteryness
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_scatterynessIgloo_1(Random rand, int i) {
//		return KillTheRNG.randomness.scatterynessIgloo.nextInt(i);
		KillTheRNG.randomness.scatterynessIgloo.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Igloo scatteryness
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_scatterynessIgloo_2(Random rand) {
//		return KillTheRNG.randomness.scatterynessIgloo.nextDouble();
		KillTheRNG.randomness.scatterynessIgloo.nextDouble();
		return rand.nextDouble();
	}

	/**
	* Igloo scatteryness
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_scatterynessIgloo_3(Random rand, int i) {
//		return KillTheRNG.randomness.scatterynessIgloo.nextInt(i);
		KillTheRNG.randomness.scatterynessIgloo.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Igloo scatteryness
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_scatterynessIgloo_4(Random rand) {
//		return KillTheRNG.randomness.scatterynessIgloo.nextLong();
		KillTheRNG.randomness.scatterynessIgloo.nextLong();
		return rand.nextLong();
	}

}
