package com.minecrafttas.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.StructureVillagePieces.Path.class)
public class MixinStructureVillagePieces$Path{

	/**
	* Position, Rotation and Type of next Village Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotTypeVillage_1(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position, Rotation and Type of next Village Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_posRotTypeVillage_2(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position, Rotation and Type of next Village Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_posRotTypeVillage_3(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position, Rotation and Type of next Village Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_posRotTypeVillage_4(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position, Rotation and Type of next Village Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_posRotTypeVillage_5(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position, Rotation and Type of next Village Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_posRotTypeVillage_6(Random rand, int i) {
		if (com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.isEnabled()) {
			return com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.nextInt(i);
		} else {
			com.minecrafttas.killtherng.KillTheRNG.commonRandom.posRotTypeVillage.nextInt(i);
			return rand.nextInt(i);
		}
	}


}