package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;

@Mixin(targets="net.minecraft.world.gen.structure.WoodlandMansionPieces$FirstFloor")
public class MixinWoodlandMansionPieces$FirstFloor {

	/**
	* null
	*/
	@Redirect(method = "get1x1(Ljava/util/Random;)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1956_1(Random rand, int i) {
		return KillTheRNG.randomness.random_1956.nextInt(i);
//		KillTheRNG.randomness.random_1956.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "get1x1Secret(Ljava/util/Random;)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1957_2(Random rand, int i) {
		return KillTheRNG.randomness.random_1957.nextInt(i);
//		KillTheRNG.randomness.random_1957.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "get1x2SideEntrance(Ljava/util/Random;Z)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1958_3(Random rand, int i) {
		return KillTheRNG.randomness.random_1958.nextInt(i);
//		KillTheRNG.randomness.random_1958.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "get1x2FrontEntrance(Ljava/util/Random;Z)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1959_4(Random rand, int i) {
		return KillTheRNG.randomness.random_1959.nextInt(i);
//		KillTheRNG.randomness.random_1959.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "get1x2Secret(Ljava/util/Random;)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1960_5(Random rand, int i) {
		return KillTheRNG.randomness.random_1960.nextInt(i);
//		KillTheRNG.randomness.random_1960.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "get2x2(Ljava/util/Random;)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1961_6(Random rand, int i) {
		return KillTheRNG.randomness.random_1961.nextInt(i);
//		KillTheRNG.randomness.random_1961.nextInt(i);
//		return rand.nextInt(i);
	}

}
