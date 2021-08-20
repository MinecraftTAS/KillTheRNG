package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityVillager;

@Mixin(EntityVillager.class)
public class MixinEntityVillager {

	/**
	* null
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_753_0(Random rand, int i) {
		return KillTheRNG.randomness.random_753.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_754_1(Random rand, int i) {
		return KillTheRNG.randomness.random_754.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "updateAITasks()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_755_2(Random rand, int i) {
		return KillTheRNG.randomness.random_755.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "useRecipe(Lnet/minecraft/village/MerchantRecipe;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_756_0(Random rand, int i) {
		return KillTheRNG.randomness.random_756.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "useRecipe(Lnet/minecraft/village/MerchantRecipe;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_757_1(Random rand, int i) {
		return KillTheRNG.randomness.random_757.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_758_0(Random rand) {
		return KillTheRNG.randomness.random_758.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_759_1(Random rand) {
		return KillTheRNG.randomness.random_759.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 2))
	public double redirect_random_760_2(Random rand) {
		return KillTheRNG.randomness.random_760.nextGaussian();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_761_3(Random rand) {
		return KillTheRNG.randomness.random_761.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_762_4(Random rand) {
		return KillTheRNG.randomness.random_762.nextFloat();
	}

	/**
	* null
	*/
	@Redirect(method = "spawnParticles(Lnet/minecraft/util/EnumParticleTypes;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_763_5(Random rand) {
		return KillTheRNG.randomness.random_763.nextFloat();
	}

}
