package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

@Mixin(targets="net.minecraft.world.gen.structure.StructureEndCityPieces$3")
public class MixinStructureEndCityPieces$3 {

	/**
	* Position, Rotation and Type of next End Piece
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotTypeEndCity_1(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeEndCity.nextInt(i);
		KillTheRNG.randomness.posRotTypeEndCity.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next End Piece
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_posRotTypeEndCity_2(Random rand) {
//		return KillTheRNG.randomness.posRotTypeEndCity.nextBoolean();
		KillTheRNG.randomness.posRotTypeEndCity.nextBoolean();
		return rand.nextBoolean();
	}

	/**
	* Position, Rotation and Type of next End Piece
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_posRotTypeEndCity_3(Random rand) {
//		return KillTheRNG.randomness.posRotTypeEndCity.nextBoolean();
		KillTheRNG.randomness.posRotTypeEndCity.nextBoolean();
		return rand.nextBoolean();
	}

	/**
	* Position, Rotation and Type of next End Piece
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_posRotTypeEndCity_4(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeEndCity.nextInt(i);
		KillTheRNG.randomness.posRotTypeEndCity.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next End Piece
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_posRotTypeEndCity_5(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeEndCity.nextInt(i);
		KillTheRNG.randomness.posRotTypeEndCity.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next End Piece
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_posRotTypeEndCity_6(Random rand, int i) {
//		return KillTheRNG.randomness.posRotTypeEndCity.nextInt(i);
		KillTheRNG.randomness.posRotTypeEndCity.nextInt(i);
		return rand.nextInt(i);
	}

}
