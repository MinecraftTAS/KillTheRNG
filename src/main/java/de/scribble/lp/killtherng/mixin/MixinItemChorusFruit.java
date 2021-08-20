package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.item.ItemChorusFruit;

@Mixin(ItemChorusFruit.class)
public class MixinItemChorusFruit {

	/**
	* null
	*/
	@Redirect(method = "onItemUseFinish(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/item/ItemStack;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_random_671_0(Random rand) {
		return KillTheRNG.randomness.random_671.nextDouble();
	}

	/**
	* null
	*/
	@Redirect(method = "onItemUseFinish(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/item/ItemStack;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_672_1(Random rand, int i) {
		return KillTheRNG.randomness.random_672.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "onItemUseFinish(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/World;Lnet/minecraft/entity/EntityLivingBase;)Lnet/minecraft/item/ItemStack;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 2))
	public double redirect_random_673_2(Random rand) {
		return KillTheRNG.randomness.random_673.nextDouble();
	}

}
