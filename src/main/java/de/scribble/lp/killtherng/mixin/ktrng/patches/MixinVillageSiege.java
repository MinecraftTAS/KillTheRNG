package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.village.VillageSiege.class)
public class MixinVillageSiege{

	/**
	* null
	*/
	@Redirect(method = "findRandomSpawnPos(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1512_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1512.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1512.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findRandomSpawnPos(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1513_2(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1513.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1513.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "findRandomSpawnPos(Lnet/minecraft/util/math/BlockPos;)Lnet/minecraft/util/math/Vec3d;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1514_3(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1514.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1514.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "spawnZombie()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1511_4(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1511.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1511.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "tick()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1509_5(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1509.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1509.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "trySetupSiege()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1510_6(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_1510.nextFloat();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_1510.nextFloat();
//		return rand.nextFloat();
	}


}