package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.StructureNetherBridgePieces.End.class)
public class MixinStructureNetherBridgePieces$End{

	/**
	* Position, Rotation and Type of next Nether Bridge Piece
	*/
	@Redirect(method = "<init>(ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	public int redirect_posRotTypeNetherBridge_1(Random rand) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeNetherBridge.nextInt();
		de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeNetherBridge.nextInt();
		return rand.nextInt();
	}

	/**
	* Position, Rotation and Type of next Nether Bridge Piece
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotTypeNetherBridge_2(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeNetherBridge.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeNetherBridge.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Nether Bridge Piece
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_posRotTypeNetherBridge_3(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeNetherBridge.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeNetherBridge.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Nether Bridge Piece
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_posRotTypeNetherBridge_4(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeNetherBridge.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeNetherBridge.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Nether Bridge Piece
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_posRotTypeNetherBridge_5(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeNetherBridge.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeNetherBridge.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Nether Bridge Piece
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_posRotTypeNetherBridge_6(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeNetherBridge.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeNetherBridge.nextInt(i);
		return rand.nextInt(i);
	}


}