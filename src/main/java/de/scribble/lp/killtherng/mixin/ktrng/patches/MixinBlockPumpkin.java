package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockPumpkin;

@Mixin(BlockPumpkin.class)
public class MixinBlockPumpkin {

	/**
	* null
	*/
	@Redirect(method = "trySpawnGolem(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_421_1(Random rand) {
		return KillTheRNG.randomness.random_421.nextDouble();
//		KillTheRNG.randomness.random_421.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "trySpawnGolem(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_422_2(Random rand) {
		return KillTheRNG.randomness.random_422.nextDouble();
//		KillTheRNG.randomness.random_422.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "trySpawnGolem(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_423_3(Random rand) {
		return KillTheRNG.randomness.random_423.nextDouble();
//		KillTheRNG.randomness.random_423.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "trySpawnGolem(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_424_4(Random rand) {
		return KillTheRNG.randomness.random_424.nextDouble();
//		KillTheRNG.randomness.random_424.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "trySpawnGolem(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_425_5(Random rand) {
		return KillTheRNG.randomness.random_425.nextDouble();
//		KillTheRNG.randomness.random_425.nextDouble();
//		return rand.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "trySpawnGolem(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_426_6(Random rand) {
		return KillTheRNG.randomness.random_426.nextDouble();
//		KillTheRNG.randomness.random_426.nextDouble();
//		return rand.nextDouble();
	}

}
