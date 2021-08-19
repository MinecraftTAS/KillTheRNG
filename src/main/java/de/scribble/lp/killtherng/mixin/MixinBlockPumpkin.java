package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.block.BlockPumpkin;

@Mixin(BlockPumpkin.class)
public class MixinBlockPumpkin {
	@Redirect(method = "trySpawnGolem(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_421(Random rand) {
		return KillTheRNG.randomness.random_421.nextDouble();
	}

	@Redirect(method = "trySpawnGolem(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_random_422(Random rand) {
		return KillTheRNG.randomness.random_422.nextDouble();
	}

	@Redirect(method = "trySpawnGolem(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_423(Random rand) {
		return KillTheRNG.randomness.random_423.nextDouble();
	}

	@Redirect(method = "trySpawnGolem(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_random_424(Random rand) {
		return KillTheRNG.randomness.random_424.nextDouble();
	}

	@Redirect(method = "trySpawnGolem(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_random_425(Random rand) {
		return KillTheRNG.randomness.random_425.nextDouble();
	}

	@Redirect(method = "trySpawnGolem(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_random_426(Random rand) {
		return KillTheRNG.randomness.random_426.nextDouble();
	}

}
