package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.feature.WorldGenPumpkin.class)
public class MixinWorldGenPumpkin{

	/**
	* Position for Pumpkin 
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_pumpkinPositionGen_1(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.pumpkinPositionGen.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.pumpkinPositionGen.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position for Pumpkin 
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_pumpkinPositionGen_2(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.pumpkinPositionGen.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.pumpkinPositionGen.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position for Pumpkin 
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_pumpkinPositionGen_3(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.pumpkinPositionGen.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.pumpkinPositionGen.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position for Pumpkin 
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_pumpkinPositionGen_4(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.pumpkinPositionGen.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.pumpkinPositionGen.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position for Pumpkin 
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_pumpkinPositionGen_5(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.pumpkinPositionGen.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.pumpkinPositionGen.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position for Pumpkin 
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_pumpkinPositionGen_6(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.pumpkinPositionGen.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.pumpkinPositionGen.nextInt(i);
		return rand.nextInt(i);
	}


}