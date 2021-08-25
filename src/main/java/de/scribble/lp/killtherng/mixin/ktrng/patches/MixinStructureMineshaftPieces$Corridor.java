package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureMineshaftPieces;

@Mixin(StructureMineshaftPieces.Corridor.class)
public class MixinStructureMineshaftPieces$Corridor {

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "<init>(ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/world/gen/structure/MapGenMineshaft$Type;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotTypeMineshaft_1(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "<init>(ILjava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Lnet/minecraft/util/EnumFacing;Lnet/minecraft/world/gen/structure/MapGenMineshaft$Type;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_posRotTypeMineshaft_2(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "findCorridorSize(Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;)Lnet/minecraft/world/gen/structure/StructureBoundingBox;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_posRotTypeMineshaft_3(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotTypeMineshaft_4(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_posRotTypeMineshaft_5(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_posRotTypeMineshaft_6(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_posRotTypeMineshaft_7(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_posRotTypeMineshaft_8(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_posRotTypeMineshaft_9(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_posRotTypeMineshaft_10(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_posRotTypeMineshaft_11(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 8))
	public int redirect_posRotTypeMineshaft_12(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 9))
	public int redirect_posRotTypeMineshaft_13(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 10))
	public int redirect_posRotTypeMineshaft_14(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 11))
	public int redirect_posRotTypeMineshaft_15(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 12))
	public int redirect_posRotTypeMineshaft_16(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 13))
	public int redirect_posRotTypeMineshaft_17(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 14))
	public int redirect_posRotTypeMineshaft_18(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "generateChest(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Ljava/util/Random;IIILnet/minecraft/util/ResourceLocation;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_posRotTypeMineshaft_19(Random rand) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextBoolean();
		KillTheRNG.randomness.posRotTypeMineshaft.nextBoolean();
		return rand.nextBoolean();
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "generateChest(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;Ljava/util/Random;IIILnet/minecraft/util/ResourceLocation;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_posRotTypeMineshaft_20(Random rand) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextLong();
		KillTheRNG.randomness.posRotTypeMineshaft.nextLong();
		return rand.nextLong();
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotTypeMineshaft_21(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_posRotTypeMineshaft_22(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_posRotTypeMineshaft_23(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "placeSupport(Lnet/minecraft/world/World;Lnet/minecraft/world/gen/structure/StructureBoundingBox;IIIIILjava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotTypeMineshaft_24(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

}
