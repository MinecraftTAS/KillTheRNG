package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.monster.EntitySlime;

@Mixin(EntitySlime.class)
public class MixinEntitySlime {
	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_836(Random rand) {
		return KillTheRNG.randomness.random_836.nextFloat();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_837(Random rand) {
		return KillTheRNG.randomness.random_837.nextFloat();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_838(Random rand) {
		return KillTheRNG.randomness.random_838.nextFloat();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_839(Random rand) {
		return KillTheRNG.randomness.random_839.nextFloat();
	}

	@Redirect(method = "getJumpDelay()I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_840(Random rand, int i) {
		return KillTheRNG.randomness.random_840.nextInt(i);
	}

	@Redirect(method = "notifyDataManagerChange(Lnet/minecraft/network/datasync/DataParameter;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_841(Random rand, int i) {
		return KillTheRNG.randomness.random_841.nextInt(i);
	}

	@Redirect(method = "setDead()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_842(Random rand, int i) {
		return KillTheRNG.randomness.random_842.nextInt(i);
	}

	@Redirect(method = "setDead()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_843(Random rand) {
		return KillTheRNG.randomness.random_843.nextFloat();
	}

	@Redirect(method = "dealDamage(Lnet/minecraft/entity/EntityLivingBase;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_844(Random rand) {
		return KillTheRNG.randomness.random_844.nextFloat();
	}

	@Redirect(method = "dealDamage(Lnet/minecraft/entity/EntityLivingBase;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_845(Random rand) {
		return KillTheRNG.randomness.random_845.nextFloat();
	}

	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_846(Random rand) {
		return KillTheRNG.randomness.random_846.nextFloat();
	}

	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_847(Random rand) {
		return KillTheRNG.randomness.random_847.nextFloat();
	}

	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_848(Random rand, int i) {
		return KillTheRNG.randomness.random_848.nextInt(i);
	}

	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_849(Random rand, int i) {
		return KillTheRNG.randomness.random_849.nextInt(i);
	}

	@Redirect(method = "getCanSpawnHere()Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_850(Random rand, int i) {
		return KillTheRNG.randomness.random_850.nextInt(i);
	}

	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_851(Random rand, int i) {
		return KillTheRNG.randomness.random_851.nextInt(i);
	}

	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_852(Random rand) {
		return KillTheRNG.randomness.random_852.nextFloat();
	}

}
