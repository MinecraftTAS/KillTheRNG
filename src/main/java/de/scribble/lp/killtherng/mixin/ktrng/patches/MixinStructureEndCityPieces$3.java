package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

@Mixin(targets="net.minecraft.world.gen.structure.StructureEndCityPieces$3")
public class MixinStructureEndCityPieces$3 {

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1752_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1752.nextInt(i);
//		KillTheRNG.randomness.random_1752.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_random_1753_2(Random rand) {
		return KillTheRNG.randomness.random_1753.nextBoolean();
//		KillTheRNG.randomness.random_1753.nextBoolean();
//		return rand.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_random_1754_3(Random rand) {
		return KillTheRNG.randomness.random_1754.nextBoolean();
//		KillTheRNG.randomness.random_1754.nextBoolean();
//		return rand.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1755_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1755.nextInt(i);
//		KillTheRNG.randomness.random_1755.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1756_5(Random rand, int i) {
		return KillTheRNG.randomness.random_1756.nextInt(i);
//		KillTheRNG.randomness.random_1756.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1757_6(Random rand, int i) {
		return KillTheRNG.randomness.random_1757.nextInt(i);
//		KillTheRNG.randomness.random_1757.nextInt(i);
//		return rand.nextInt(i);
	}

}
