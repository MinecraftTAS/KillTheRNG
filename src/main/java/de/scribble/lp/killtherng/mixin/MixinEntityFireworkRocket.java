package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.item.EntityFireworkRocket;

@Mixin(EntityFireworkRocket.class)
public class MixinEntityFireworkRocket {
	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_661(Random rand) {
		return KillTheRNG.randomness.random_661.nextGaussian();
	}

	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_662(Random rand) {
		return KillTheRNG.randomness.random_662.nextGaussian();
	}

	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_663(Random rand, int i) {
		return KillTheRNG.randomness.random_663.nextInt(i);
	}

	@Redirect(method = "<init>(Lnet/minecraft/world/World;DDDLnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_664(Random rand, int i) {
		return KillTheRNG.randomness.random_664.nextInt(i);
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 0))
	public double redirect_random_665(Random rand) {
		return KillTheRNG.randomness.random_665.nextGaussian();
	}

	@Redirect(method = "onUpdate()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextGaussian()D", ordinal = 1))
	public double redirect_random_666(Random rand) {
		return KillTheRNG.randomness.random_666.nextGaussian();
	}

}
