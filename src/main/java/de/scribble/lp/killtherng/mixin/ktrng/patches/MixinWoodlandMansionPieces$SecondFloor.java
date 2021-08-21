package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

@Mixin(targets="net.minecraft.world.gen.structure.WoodlandMansionPieces$SecondFloor")
public class MixinWoodlandMansionPieces$SecondFloor {

	/**
	* null
	*/
	@Redirect(method = "get1x1(Ljava/util/Random;)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1962_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1962.nextInt(i);
//		KillTheRNG.randomness.random_1962.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "get1x1Secret(Ljava/util/Random;)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1963_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1963.nextInt(i);
//		KillTheRNG.randomness.random_1963.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "get1x2SideEntrance(Ljava/util/Random;Z)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1964_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1964.nextInt(i);
//		KillTheRNG.randomness.random_1964.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "get1x2FrontEntrance(Ljava/util/Random;Z)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1965_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1965.nextInt(i);
//		KillTheRNG.randomness.random_1965.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "get1x2Secret(Ljava/util/Random;)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1966_5(Random rand, int i) {
		return KillTheRNG.randomness.random_1966.nextInt(i);
//		KillTheRNG.randomness.random_1966.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "get2x2(Ljava/util/Random;)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1967_6(Random rand, int i) {
		return KillTheRNG.randomness.random_1967.nextInt(i);
//		KillTheRNG.randomness.random_1967.nextInt(i);
//		return rand.nextInt(i);
	}

}
