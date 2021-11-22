package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.feature.WorldGenDungeons;

@Mixin(WorldGenDungeons.class)
public class MixinWorldGenDungeons {

	/**
	* Position for Dungeons
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_dungeonPos_1(Random rand, int i) {
//		return KillTheRNG.randomness.dungeonPos.nextInt(i);
		KillTheRNG.randomness.dungeonPos.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position for Dungeons
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_dungeonPos_2(Random rand, int i) {
//		return KillTheRNG.randomness.dungeonPos.nextInt(i);
		KillTheRNG.randomness.dungeonPos.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position for Dungeons
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_dungeonPos_3(Random rand, int i) {
//		return KillTheRNG.randomness.dungeonPos.nextInt(i);
		KillTheRNG.randomness.dungeonPos.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position for Dungeons
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_dungeonPos_4(Random rand, int i) {
//		return KillTheRNG.randomness.dungeonPos.nextInt(i);
		KillTheRNG.randomness.dungeonPos.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position for Dungeons
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_dungeonPos_5(Random rand, int i) {
//		return KillTheRNG.randomness.dungeonPos.nextInt(i);
		KillTheRNG.randomness.dungeonPos.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position for Dungeons
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 0))
	public long redirect_dungeonPos_6(Random rand) {
//		return KillTheRNG.randomness.dungeonPos.nextLong();
		KillTheRNG.randomness.dungeonPos.nextLong();
		return rand.nextLong();
	}

}
