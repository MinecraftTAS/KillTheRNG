package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.StructureMineshaftPieces.Room.class)
public class MixinStructureMineshaftPieces$Room{

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "<init>(ILjava/util/Random;IILnet/minecraft/world/gen/structure/MapGenMineshaft$Type;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotTypeMineshaft_1(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "<init>(ILjava/util/Random;IILnet/minecraft/world/gen/structure/MapGenMineshaft$Type;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_posRotTypeMineshaft_2(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "<init>(ILjava/util/Random;IILnet/minecraft/world/gen/structure/MapGenMineshaft$Type;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_posRotTypeMineshaft_3(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotTypeMineshaft_4(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_posRotTypeMineshaft_5(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_posRotTypeMineshaft_6(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_posRotTypeMineshaft_7(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_posRotTypeMineshaft_8(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_posRotTypeMineshaft_9(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 6))
	public int redirect_posRotTypeMineshaft_10(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 7))
	public int redirect_posRotTypeMineshaft_11(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeMineshaft.nextInt(i);
		return rand.nextInt(i);
	}


}