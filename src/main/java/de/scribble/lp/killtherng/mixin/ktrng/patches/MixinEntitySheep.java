package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.passive.EntitySheep.class)
public class MixinEntitySheep{

	/**
	* null
	*/
	@Redirect(method = "getDyeColorMixFromParents(Lnet/minecraft/entity/passive/EntityAnimal;Lnet/minecraft/entity/passive/EntityAnimal;)Lnet/minecraft/item/EnumDyeColor;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_random_950_1(Random rand) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_950.nextBoolean();
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_950.nextBoolean();
//		return rand.nextBoolean();
	}

	/**
	* null
	*/
	@Redirect(method = "getRandomSheepColor(Ljava/util/Random;)Lnet/minecraft/item/EnumDyeColor;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_947_2(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_947.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_947.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "getRandomSheepColor(Ljava/util/Random;)Lnet/minecraft/item/EnumDyeColor;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_random_948_3(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_948.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_948.nextInt(i);
//		return rand.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "onSheared(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;I)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0), remap = false)
	public int redirect_random_949_4(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.random_949.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.random_949.nextInt(i);
//		return rand.nextInt(i);
	}


}