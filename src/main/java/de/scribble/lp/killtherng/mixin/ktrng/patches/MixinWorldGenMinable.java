package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.feature.WorldGenMinable.class)
public class MixinWorldGenMinable{

	/**
	* Minables Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_mineableGeneration_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.mineableGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.mineableGeneration.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.mineableGeneration.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Minables Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_mineableGeneration_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.mineableGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.mineableGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.mineableGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Minables Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_mineableGeneration_3(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.mineableGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.mineableGeneration.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.mineableGeneration.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Minables Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_mineableGeneration_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.mineableGeneration.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.mineableGeneration.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.mineableGeneration.nextDouble();
			return rand.nextDouble();
		}
	}


}