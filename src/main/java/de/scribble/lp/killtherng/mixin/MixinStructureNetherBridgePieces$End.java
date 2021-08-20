package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureNetherBridgePieces;

@Mixin(StructureNetherBridgePieces.End.class)
public class MixinStructureNetherBridgePieces$End {

	/**
	* null
	*/
	@Redirect(method = "<init>(ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	public int redirect_random_1716_0(Random rand) {
		return KillTheRNG.randomness.random_1716.nextInt();
	}

	/**
	* null
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1717_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1717.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1718_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1718.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1719_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1719.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1720_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1720.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1721_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1721.nextInt(i);
	}

}
