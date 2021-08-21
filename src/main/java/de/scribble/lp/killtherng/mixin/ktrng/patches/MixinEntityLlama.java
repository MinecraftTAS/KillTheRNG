package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityLlama;

@Mixin(EntityLlama.class)
public class MixinEntityLlama {

	/**
	* Set's the strength of the llama
	*/
	@Redirect(method = "setRandomStrength()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_llamaRandomStrength_1(Random rand) {
		return KillTheRNG.randomness.llamaRandomStrength.nextFloat();
//		KillTheRNG.randomness.llamaRandomStrength.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Set's the strength of the llama
	*/
	@Redirect(method = "setRandomStrength()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_llamaRandomStrength_2(Random rand, int i) {
		return KillTheRNG.randomness.llamaRandomStrength.nextInt(i);
//		KillTheRNG.randomness.llamaRandomStrength.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Position of the villager happy particles when feeding a young llama
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_llamaChildGrowingUpParticle_3(Random rand) {
		return KillTheRNG.randomness.llamaChildGrowingUpParticle.nextFloat();
//		KillTheRNG.randomness.llamaChildGrowingUpParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of the villager happy particles when feeding a young llama
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_llamaChildGrowingUpParticle_4(Random rand) {
		return KillTheRNG.randomness.llamaChildGrowingUpParticle.nextFloat();
//		KillTheRNG.randomness.llamaChildGrowingUpParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of the villager happy particles when feeding a young llama
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_llamaChildGrowingUpParticle_5(Random rand) {
		return KillTheRNG.randomness.llamaChildGrowingUpParticle.nextFloat();
//		KillTheRNG.randomness.llamaChildGrowingUpParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of the villager happy particles when feeding a young llama
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_llamaChildGrowingUpParticle_6(Random rand) {
		return KillTheRNG.randomness.llamaChildGrowingUpParticle.nextFloat();
//		KillTheRNG.randomness.llamaChildGrowingUpParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Position of the villager happy particles when feeding a young llama
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_llamaChildGrowingUpParticle_7(Random rand) {
		return KillTheRNG.randomness.llamaChildGrowingUpParticle.nextFloat();
//		KillTheRNG.randomness.llamaChildGrowingUpParticle.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Chooses the initial variant of the llama
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_llamaVariantInitial_8(Random rand, int i) {
		return KillTheRNG.randomness.llamaVariantInitial.nextInt(i);
//		KillTheRNG.randomness.llamaVariantInitial.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* Pitch of equipping sounds from a llama
	*/
	@Redirect(method = "playChestEquipSound()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_llamaChestEquipSound_9(Random rand) {
		return KillTheRNG.randomness.llamaChestEquipSound.nextFloat();
//		KillTheRNG.randomness.llamaChestEquipSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of equipping sounds from a llama
	*/
	@Redirect(method = "playChestEquipSound()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_llamaChestEquipSound_10(Random rand) {
		return KillTheRNG.randomness.llamaChestEquipSound.nextFloat();
//		KillTheRNG.randomness.llamaChestEquipSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* How much stronger the child will be
	*/
	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntityLlama;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_llamaChildStrengthBoost_11(Random rand, int i) {
		return KillTheRNG.randomness.llamaChildStrengthBoost.nextInt(i);
//		KillTheRNG.randomness.llamaChildStrengthBoost.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* How much stronger the child will be
	*/
	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntityLlama;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_llamaChildStrengthBoost_12(Random rand) {
		return KillTheRNG.randomness.llamaChildStrengthBoost.nextFloat();
//		KillTheRNG.randomness.llamaChildStrengthBoost.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* How much stronger the child will be
	*/
	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntityLlama;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_llamaChildStrengthBoost_13(Random rand) {
		return KillTheRNG.randomness.llamaChildStrengthBoost.nextBoolean();
//		KillTheRNG.randomness.llamaChildStrengthBoost.nextBoolean();
//		return rand.nextBoolean();
	}

	/**
	* Pitch of llama spitting
	*/
	@Redirect(method = "spit(Lnet/minecraft/entity/EntityLivingBase;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_llamaSpitSound_14(Random rand) {
		return KillTheRNG.randomness.llamaSpitSound.nextFloat();
//		KillTheRNG.randomness.llamaSpitSound.nextFloat();
//		return rand.nextFloat();
	}

	/**
	* Pitch of llama spitting
	*/
	@Redirect(method = "spit(Lnet/minecraft/entity/EntityLivingBase;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_llamaSpitSound_15(Random rand) {
		return KillTheRNG.randomness.llamaSpitSound.nextFloat();
//		KillTheRNG.randomness.llamaSpitSound.nextFloat();
//		return rand.nextFloat();
	}

}
