package de.scribble.lp.killtherng.mixin;

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
	public int redirect_random_1752_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1752.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 1))
	public boolean redirect_random_1753_1(Random rand) {
		return KillTheRNG.randomness.random_1753.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 2))
	public boolean redirect_random_1754_2(Random rand) {
		return KillTheRNG.randomness.random_1754.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1755_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1755.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1756_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1756.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/gen/structure/template/TemplateManager;ILnet/minecraft/world/gen/structure/StructureEndCityPieces$CityTemplate;Lnet/minecraft/util/math/BlockPos;Ljava/util/List;Ljava/util/Random;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1757_5(Random rand, int i) {
		return KillTheRNG.randomness.random_1757.nextInt(i);
	}

}
