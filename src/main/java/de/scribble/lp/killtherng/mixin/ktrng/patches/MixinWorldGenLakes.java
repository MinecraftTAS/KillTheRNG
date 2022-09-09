package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.feature.WorldGenLakes.class)
public class MixinWorldGenLakes{

	/**
	* Lake Plane for Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_lakePlaneGen_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Lake Plane for Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_lakePlaneGen_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Lake Plane for Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_lakePlaneGen_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Lake Plane for Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_lakePlaneGen_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Lake Plane for Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_lakePlaneGen_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Lake Plane for Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_lakePlaneGen_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Lake Plane for Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_lakePlaneGen_7(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Lake Plane for Generation
	*/
	@Redirect(method = "generate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_lakePlaneGen_8(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.lakePlaneGen.nextInt(i);
			return rand.nextInt(i);
		}
	}


}