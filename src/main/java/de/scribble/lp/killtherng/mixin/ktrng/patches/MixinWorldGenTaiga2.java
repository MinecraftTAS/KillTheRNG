package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.feature.WorldGenTaiga2.class)
public class MixinWorldGenTaiga2{

	/**
	* Taiga Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_taigaGeneration_1(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.taigaGeneration.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.taigaGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_taigaGeneration_2(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.taigaGeneration.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.taigaGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_taigaGeneration_3(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.taigaGeneration.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.taigaGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_taigaGeneration_4(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.taigaGeneration.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.taigaGeneration.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Taiga Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_taigaGeneration_5(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.taigaGeneration.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.taigaGeneration.nextInt(i);
		return rand.nextInt(i);
	}


}