package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntityLlama;

@Mixin(EntityLlama.class)
public class MixinEntityLlama {
	@Redirect(method = "setRandomStrength()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_995(Random rand) {
		return KillTheRNG.randomness.random_995.nextFloat();
	}

	@Redirect(method = "setRandomStrength()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_996(Random rand, int i) {
		return KillTheRNG.randomness.random_996.nextInt(i);
	}

	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_997(Random rand) {
		return KillTheRNG.randomness.random_997.nextFloat();
	}

	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_998(Random rand) {
		return KillTheRNG.randomness.random_998.nextFloat();
	}

	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_999(Random rand) {
		return KillTheRNG.randomness.random_999.nextFloat();
	}

	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_1000(Random rand) {
		return KillTheRNG.randomness.random_1000.nextFloat();
	}

	@Redirect(method = "handleEating(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/item/ItemStack;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_1001(Random rand) {
		return KillTheRNG.randomness.random_1001.nextFloat();
	}

	@Redirect(method = "onInitialSpawn(Lnet/minecraft/world/DifficultyInstance;Lnet/minecraft/entity/IEntityLivingData;)Lnet/minecraft/entity/IEntityLivingData;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1002(Random rand, int i) {
		return KillTheRNG.randomness.random_1002.nextInt(i);
	}

	@Redirect(method = "playChestEquipSound()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1003(Random rand) {
		return KillTheRNG.randomness.random_1003.nextFloat();
	}

	@Redirect(method = "playChestEquipSound()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1004(Random rand) {
		return KillTheRNG.randomness.random_1004.nextFloat();
	}

	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntityLlama;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1005(Random rand, int i) {
		return KillTheRNG.randomness.random_1005.nextInt(i);
	}

	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntityLlama;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1006(Random rand) {
		return KillTheRNG.randomness.random_1006.nextFloat();
	}

	@Redirect(method = "createChild(Lnet/minecraft/entity/EntityAgeable;)Lnet/minecraft/entity/passive/EntityLlama;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 2))
	public boolean redirect_random_1007(Random rand) {
		return KillTheRNG.randomness.random_1007.nextBoolean();
	}

	@Redirect(method = "spit(Lnet/minecraft/entity/EntityLivingBase;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1008(Random rand) {
		return KillTheRNG.randomness.random_1008.nextFloat();
	}

	@Redirect(method = "spit(Lnet/minecraft/entity/EntityLivingBase;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_1009(Random rand) {
		return KillTheRNG.randomness.random_1009.nextFloat();
	}

}
