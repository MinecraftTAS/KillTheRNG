package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.StructureMineshaftPieces.Cross.class)
public class MixinStructureMineshaftPieces$Cross{

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_posRotTypeMineshaft_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeMineshaft.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeMineshaft.nextBoolean();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeMineshaft.nextBoolean();
			return rand.nextBoolean();
		}
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_posRotTypeMineshaft_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeMineshaft.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeMineshaft.nextBoolean();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeMineshaft.nextBoolean();
			return rand.nextBoolean();
		}
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 2))
	public boolean redirect_posRotTypeMineshaft_3(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeMineshaft.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeMineshaft.nextBoolean();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeMineshaft.nextBoolean();
			return rand.nextBoolean();
		}
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 3))
	public boolean redirect_posRotTypeMineshaft_4(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeMineshaft.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeMineshaft.nextBoolean();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeMineshaft.nextBoolean();
			return rand.nextBoolean();
		}
	}

	/**
	* Position, Rotation and Type of next Mineshaft Piece
	*/
	@Redirect(method = "findCrossing(Ljava/util/List;Ljava/util/Random;IIILnet/minecraft/util/EnumFacing;)Lnet/minecraft/world/gen/structure/StructureBoundingBox;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_posRotTypeMineshaft_5(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeMineshaft.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeMineshaft.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeMineshaft.nextInt(i);
			return rand.nextInt(i);
		}
	}


}