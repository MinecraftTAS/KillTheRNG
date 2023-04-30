package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.StructureOceanMonumentPieces.SimpleRoom.class)
public class MixinStructureOceanMonumentPieces$SimpleRoom{

	/**
	* Position, Rotation and Type of next Ocean Monument Piece
	*/
	@Redirect(method = "<init>(Lnet/minecraft/util/EnumFacing;Lnet/minecraft/world/gen/structure/StructureOceanMonumentPieces$RoomDefinition;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotTypeOceanMonument_1(Random rand, int i) {
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
	@Redirect(method = "addComponentParts(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/world/gen/structure/StructureBoundingBox;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_posRotTypeOceanMonument_2(Random rand) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeOceanMonument.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeOceanMonument.nextBoolean();
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeOceanMonument.nextBoolean();
			return rand.nextBoolean();
		}
	}


}