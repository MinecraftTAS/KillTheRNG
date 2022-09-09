package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.BlockPumpkin.class)
public class MixinBlockPumpkin{

	/**
	* Position of snow particles when spawning a snowman
	*/
	@Redirect(method = "trySpawnGolem(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_snowmanSpawnParticles_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.snowmanSpawnParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.snowmanSpawnParticles.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.snowmanSpawnParticles.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of snow particles when spawning a snowman
	*/
	@Redirect(method = "trySpawnGolem(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 1))
	public double redirect_snowmanSpawnParticles_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.snowmanSpawnParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.snowmanSpawnParticles.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.snowmanSpawnParticles.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of snow particles when spawning a snowman
	*/
	@Redirect(method = "trySpawnGolem(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_snowmanSpawnParticles_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.snowmanSpawnParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.snowmanSpawnParticles.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.snowmanSpawnParticles.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of snowball particles when spawning an iron golem
	*/
	@Redirect(method = "trySpawnGolem(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 3))
	public double redirect_ironGolemSpawnParticles_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.ironGolemSpawnParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.ironGolemSpawnParticles.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.ironGolemSpawnParticles.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of snowball particles when spawning an iron golem
	*/
	@Redirect(method = "trySpawnGolem(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 4))
	public double redirect_ironGolemSpawnParticles_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.ironGolemSpawnParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.ironGolemSpawnParticles.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.ironGolemSpawnParticles.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of snowball particles when spawning an iron golem
	*/
	@Redirect(method = "trySpawnGolem(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 5))
	public double redirect_ironGolemSpawnParticles_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.ironGolemSpawnParticles.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.ironGolemSpawnParticles.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.ironGolemSpawnParticles.nextDouble();
			return rand.nextDouble();
		}
	}


}