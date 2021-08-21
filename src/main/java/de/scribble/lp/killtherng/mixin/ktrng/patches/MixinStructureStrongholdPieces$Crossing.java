package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureStrongholdPieces;

@Mixin(StructureStrongholdPieces.Crossing.class)
public class MixinStructureStrongholdPieces$Crossing {

	/**
	* null
	*/
	@Redirect(method = "<init>(ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_random_1727_1(Random rand) {
		return KillTheRNG.randomness.random_1727.nextBoolean();
//		KillTheRNG.randomness.random_1727.nextBoolean();
//		return rand.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_random_1728_2(Random rand) {
		return KillTheRNG.randomness.random_1728.nextBoolean();
//		KillTheRNG.randomness.random_1728.nextBoolean();
//		return rand.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 2))
	public boolean redirect_random_1729_3(Random rand) {
		return KillTheRNG.randomness.random_1729.nextBoolean();
//		KillTheRNG.randomness.random_1729.nextBoolean();
//		return rand.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "<init>(ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1730_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1730.nextInt(i);
//		KillTheRNG.randomness.random_1730.nextInt(i);
//		return rand.nextInt(i);
	}

}
