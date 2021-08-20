package de.scribble.lp.killtherng.mixin;

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
	public int redirect_random_1962_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1962.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "get1x1Secret(Ljava/util/Random;)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1963_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1963.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "get1x2SideEntrance(Ljava/util/Random;Z)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1964_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1964.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "get1x2FrontEntrance(Ljava/util/Random;Z)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1965_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1965.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "get1x2Secret(Ljava/util/Random;)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1966_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1966.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "get2x2(Ljava/util/Random;)Ljava/lang/String;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1967_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1967.nextInt(i);
	}

}
