package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.StructureVillagePieces.Field1.class)
public class MixinStructureVillagePieces$Field1{

	/**
	* Position, Rotation and Type of next Village Piece
	*/
	@Redirect(method = "getRandomCropType(Ljava/util/Random;)Lnet/minecraft/block/Block;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotTypeVillage_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.nextInt(i);
			return rand.nextInt(i);
		}
	}


}