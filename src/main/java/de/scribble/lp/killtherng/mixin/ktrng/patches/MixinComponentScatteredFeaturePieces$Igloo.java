package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.ComponentScatteredFeaturePieces.Igloo.class)
public class MixinComponentScatteredFeaturePieces$Igloo{

	/**
	* Igloo scatteryness
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_scatterynessIgloo_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.scatterynessIgloo.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.scatterynessIgloo.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.scatterynessIgloo.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Igloo scatteryness
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_scatterynessIgloo_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.scatterynessIgloo.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.scatterynessIgloo.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.scatterynessIgloo.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Igloo scatteryness
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_scatterynessIgloo_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.scatterynessIgloo.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.scatterynessIgloo.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.scatterynessIgloo.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Igloo scatteryness
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_scatterynessIgloo_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.scatterynessIgloo.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.scatterynessIgloo.nextLong();
		} else {
				de.scribble.lp.killtherng.KillTheRNG.commonRandom.scatterynessIgloo.nextLong();
				return rand.nextLong();
		}
	}


}