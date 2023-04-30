package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.StructureOceanMonumentPieces.MonumentBuilding.class)
public class MixinStructureOceanMonumentPieces$MonumentBuilding{

	/**
	* Position, Rotation and Type of next Ocean Monument Piece
	*/
	@Redirect(method = "<init>(Ljava/util/Random;IILnet/minecraft/util/EnumFacing;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	public int redirect_posRotTypeOceanMonument_1(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeOceanMonument.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeOceanMonument.nextInt();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeOceanMonument.nextInt();
			return rand.nextInt();
		}
	}

	/**
	* Position, Rotation and Type of next Ocean Monument Piece
	*/
	@Redirect(method = "generateRoomGraph(Ljava/util/Random;)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotTypeOceanMonument_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeOceanMonument.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeOceanMonument.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeOceanMonument.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position, Rotation and Type of next Ocean Monument Piece
	*/
	@Redirect(method = "generateRoomGraph(Ljava/util/Random;)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_posRotTypeOceanMonument_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeOceanMonument.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeOceanMonument.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeOceanMonument.nextInt(i);
			return rand.nextInt(i);
		}
	}


}