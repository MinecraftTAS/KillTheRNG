package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.boss.EntityDragon;

@Mixin(EntityDragon.class)
public class MixinEntityDragon {

	/**
	* When the dragon destroys blocks, explosion particles will spawn
	*/
	@Redirect(method = "destroyBlocksInAABB(Lnet/minecraft/util/math/AxisAlignedBB;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_addDragonExplosionParticles_1(Random rand) {
		return KillTheRNG.randomness.addDragonExplosionParticles.nextFloat();
//		KillTheRNG.randomness.addDragonExplosionParticles.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* When the dragon destroys blocks, explosion particles will spawn
	*/
	@Redirect(method = "destroyBlocksInAABB(Lnet/minecraft/util/math/AxisAlignedBB;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_addDragonExplosionParticles_2(Random rand) {
		return KillTheRNG.randomness.addDragonExplosionParticles.nextFloat();
//		KillTheRNG.randomness.addDragonExplosionParticles.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* When the dragon destroys blocks, explosion particles will spawn
	*/
	@Redirect(method = "destroyBlocksInAABB(Lnet/minecraft/util/math/AxisAlignedBB;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_addDragonExplosionParticles_3(Random rand) {
		return KillTheRNG.randomness.addDragonExplosionParticles.nextFloat();
//		KillTheRNG.randomness.addDragonExplosionParticles.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Huge explosion particles when dragon dies
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_spawnDragonDeathHugeExplosionParticle_4(Random rand) {
		return KillTheRNG.randomness.spawnDragonDeathHugeExplosionParticle.nextFloat();
//		KillTheRNG.randomness.spawnDragonDeathHugeExplosionParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Huge explosion particles when dragon dies
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_spawnDragonDeathHugeExplosionParticle_5(Random rand) {
		return KillTheRNG.randomness.spawnDragonDeathHugeExplosionParticle.nextFloat();
//		KillTheRNG.randomness.spawnDragonDeathHugeExplosionParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Huge explosion particles when dragon dies
	*/
	@Redirect(method = "onDeathUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_spawnDragonDeathHugeExplosionParticle_6(Random rand) {
		return KillTheRNG.randomness.spawnDragonDeathHugeExplosionParticle.nextFloat();
//		KillTheRNG.randomness.spawnDragonDeathHugeExplosionParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of large explosion particles
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_spawnDragonDeathExplosionParticle_7(Random rand) {
		return KillTheRNG.randomness.spawnDragonDeathExplosionParticle.nextFloat();
//		KillTheRNG.randomness.spawnDragonDeathExplosionParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of large explosion particles
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_spawnDragonDeathExplosionParticle_8(Random rand) {
		return KillTheRNG.randomness.spawnDragonDeathExplosionParticle.nextFloat();
//		KillTheRNG.randomness.spawnDragonDeathExplosionParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of large explosion particles
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_spawnDragonDeathExplosionParticle_9(Random rand, int i) {
		return KillTheRNG.randomness.spawnDragonDeathExplosionParticle.nextInt(i);
//		KillTheRNG.randomness.spawnDragonDeathExplosionParticle.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Position of large explosion particles
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_spawnDragonDeathExplosionParticle_10(Random rand) {
		return KillTheRNG.randomness.spawnDragonDeathExplosionParticle.nextFloat();
//		KillTheRNG.randomness.spawnDragonDeathExplosionParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of large explosion particles
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_spawnDragonDeathExplosionParticle_11(Random rand) {
		return KillTheRNG.randomness.spawnDragonDeathExplosionParticle.nextFloat();
//		KillTheRNG.randomness.spawnDragonDeathExplosionParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of large explosion particles
	*/
	@Redirect(method = "onLivingUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_spawnDragonDeathExplosionParticle_12(Random rand) {
		return KillTheRNG.randomness.spawnDragonDeathExplosionParticle.nextFloat();
//		KillTheRNG.randomness.spawnDragonDeathExplosionParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Chance to change the healing crystal
	*/
	@Redirect(method = "updateDragonEnderCrystal()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_changeDragonHealingEnderCrystal_13(Random rand, int i) {
		return KillTheRNG.randomness.changeDragonHealingEnderCrystal.nextInt(i);
//		KillTheRNG.randomness.changeDragonHealingEnderCrystal.nextInt(i);
//		return rand.nextInt(i);
	}

}
