package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.village.VillageSiege;

@Mixin(VillageSiege.class)
public class MixinVillageSiege {

	/**
	* null
	*/
	@Redirect(method = "tick()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1509_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1509.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "trySetupSiege()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1510_0(Random rand) {
		return KillTheRNG.randomness.random_1510.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnZombie()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1511_0(Random rand) {
		return KillTheRNG.randomness.random_1511.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "findRandomSpawnPos(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1512_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1512.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findRandomSpawnPos(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1513_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1513.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findRandomSpawnPos(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1514_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1514.nextInt(i);
	}

}