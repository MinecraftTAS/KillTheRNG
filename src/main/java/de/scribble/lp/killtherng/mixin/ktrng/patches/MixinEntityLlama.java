package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.passive.EntityLlama.class)
public class MixinEntityLlama{

	/**
	* How much stronger the child will be
	*/
	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntityLlama;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_llamaChildStrengthBoost_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildStrengthBoost.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildStrengthBoost.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildStrengthBoost.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* How much stronger the child will be
	*/
	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntityLlama;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_llamaChildStrengthBoost_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildStrengthBoost.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildStrengthBoost.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildStrengthBoost.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* How much stronger the child will be
	*/
	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntityLlama;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_llamaChildStrengthBoost_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildStrengthBoost.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildStrengthBoost.nextBoolean();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildStrengthBoost.nextBoolean();
			return rand.nextBoolean();
		}
	}

	/**
	* Position of the villager happy particles when feeding a young llama
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_llamaChildGrowingUpParticle_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildGrowingUpParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildGrowingUpParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildGrowingUpParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of the villager happy particles when feeding a young llama
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_llamaChildGrowingUpParticle_5(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildGrowingUpParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildGrowingUpParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildGrowingUpParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of the villager happy particles when feeding a young llama
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_llamaChildGrowingUpParticle_6(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildGrowingUpParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildGrowingUpParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildGrowingUpParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of the villager happy particles when feeding a young llama
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_llamaChildGrowingUpParticle_7(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildGrowingUpParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildGrowingUpParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildGrowingUpParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Position of the villager happy particles when feeding a young llama
	*/
	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_llamaChildGrowingUpParticle_8(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildGrowingUpParticle.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildGrowingUpParticle.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChildGrowingUpParticle.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Chooses the initial variant of the llama
	*/
	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_llamaVariantInitial_9(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.llamaVariantInitial.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.llamaVariantInitial.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.llamaVariantInitial.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Pitch of equipping sounds from a llama
	*/
	@Redirect(method = "playChestEquipSound()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_llamaChestEquipSound_10(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChestEquipSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChestEquipSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChestEquipSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of equipping sounds from a llama
	*/
	@Redirect(method = "playChestEquipSound()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_llamaChestEquipSound_11(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChestEquipSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChestEquipSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.llamaChestEquipSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Set's the strength of the llama
	*/
	@Redirect(method = "setRandomStrength()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_llamaRandomStrength_12(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.llamaRandomStrength.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.llamaRandomStrength.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.llamaRandomStrength.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Set's the strength of the llama
	*/
	@Redirect(method = "setRandomStrength()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_llamaRandomStrength_13(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.llamaRandomStrength.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.llamaRandomStrength.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.llamaRandomStrength.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Pitch of llama spitting
	*/
	@Redirect(method = "spit(Lnet/minecraft/entity/EntityLivingBase;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_llamaSpitSound_14(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.llamaSpitSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.llamaSpitSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.llamaSpitSound.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Pitch of llama spitting
	*/
	@Redirect(method = "spit(Lnet/minecraft/entity/EntityLivingBase;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_llamaSpitSound_15(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.llamaSpitSound.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.llamaSpitSound.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.llamaSpitSound.nextFloat();
			return rand.nextFloat();
		}
	}


}