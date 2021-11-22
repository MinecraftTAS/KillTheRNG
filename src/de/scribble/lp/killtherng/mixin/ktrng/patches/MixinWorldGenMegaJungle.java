package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.feature.WorldGenMegaJungle;

@Mixin(WorldGenMegaJungle.class)
public class MixinWorldGenMegaJungle {

	/**
	* Height of jungle tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_genMegaJungleHeight_1(Random rand, int i) {
//		return KillTheRNG.randomness.genMegaJungleHeight.nextInt(i);
		KillTheRNG.randomness.genMegaJungleHeight.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Crown of jungle tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_genMegaJungleCrown_2(Random rand) {
//		return KillTheRNG.randomness.genMegaJungleCrown.nextFloat();
		KillTheRNG.randomness.genMegaJungleCrown.nextFloat();
		return rand.nextFloat();
	}

	/**
	* Height of jungle tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_genMegaJungleHeight_3(Random rand, int i) {
//		return KillTheRNG.randomness.genMegaJungleHeight.nextInt(i);
		KillTheRNG.randomness.genMegaJungleHeight.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Crown of jungle tree
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_genMegaJungleCrown_4(Random rand, int i) {
//		return KillTheRNG.randomness.genMegaJungleCrown.nextInt(i);
		KillTheRNG.randomness.genMegaJungleCrown.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* If a vine should be placed
	*/
	@Redirect(method = "placeVine(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/properties/PropertyBool;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_genMegaJungleVine_5(Random rand, int i) {
//		return KillTheRNG.randomness.genMegaJungleVine.nextInt(i);
		KillTheRNG.randomness.genMegaJungleVine.nextInt(i);
		return rand.nextInt(i);
	}

}
