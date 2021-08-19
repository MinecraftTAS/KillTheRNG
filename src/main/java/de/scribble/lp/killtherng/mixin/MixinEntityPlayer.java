package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.player.EntityPlayer;

@Mixin(EntityPlayer.class)
public class MixinEntityPlayer {
	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_42(Random rand) {
		return KillTheRNG.randomness.random_42.nextFloat();
	}

	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	public float redirect_random_43(Random rand) {
		return KillTheRNG.randomness.random_43.nextFloat();
	}

	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	public float redirect_random_44(Random rand) {
		return KillTheRNG.randomness.random_44.nextFloat();
	}

	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 3))
	public float redirect_random_45(Random rand) {
		return KillTheRNG.randomness.random_45.nextFloat();
	}

	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 4))
	public float redirect_random_46(Random rand) {
		return KillTheRNG.randomness.random_46.nextFloat();
	}

	@Redirect(method = "dropItem(Lnet/minecraft/item/ItemStack;ZZ)Lnet/minecraft/entity/item/EntityItem;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 5))
	public float redirect_random_47(Random rand) {
		return KillTheRNG.randomness.random_47.nextFloat();
	}

	@Redirect(method = "readEntityFromNBT(Lnet/minecraft/nbt/NBTTagCompound;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	public int redirect_random_48(Random rand) {
		return KillTheRNG.randomness.random_48.nextInt();
	}

	@Redirect(method = "damageShield(F)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_49(Random rand) {
		return KillTheRNG.randomness.random_49.nextFloat();
	}

	@Redirect(method = "disableShield(Z)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_50(Random rand) {
		return KillTheRNG.randomness.random_50.nextFloat();
	}

	@Redirect(method = "onEnchant(Lnet/minecraft/item/ItemStack;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	public int redirect_random_51(Random rand) {
		return KillTheRNG.randomness.random_51.nextInt();
	}

}
