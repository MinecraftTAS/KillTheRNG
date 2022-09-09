package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(targets="net.minecraft.world.gen.structure.StructureEndCityPieces$2")
public class MixinStructureEndCityPieces$2{

	/**
	* Position, Rotation and Type of next End Piece
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotTypeEndCity_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position, Rotation and Type of next End Piece
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_posRotTypeEndCity_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position, Rotation and Type of next End Piece
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_posRotTypeEndCity_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position, Rotation and Type of next End Piece
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_posRotTypeEndCity_4(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position, Rotation and Type of next End Piece
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_posRotTypeEndCity_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.nextBoolean();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.nextBoolean();
			return rand.nextBoolean();
		}
	}

	/**
	* Position, Rotation and Type of next End Piece
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_posRotTypeEndCity_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.nextBoolean();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotTypeEndCity.nextBoolean();
			return rand.nextBoolean();
		}
	}


}