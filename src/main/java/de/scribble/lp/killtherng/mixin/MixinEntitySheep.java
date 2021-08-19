package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.entity.passive.EntitySheep;

@Mixin(EntitySheep.class)
public class MixinEntitySheep {
	@Redirect(method = "getRandomSheepColor(Ljava/util/Random;)Lnet/minecraft/item/EnumDyeColor;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	private static int redirect_random_947(Random rand, int i) {
		return KillTheRNG.randomness.random_947.nextInt(i);
	}

	@Redirect(method = "getRandomSheepColor(Ljava/util/Random;)Lnet/minecraft/item/EnumDyeColor;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	private static int redirect_random_948(Random rand, int i) {
		return KillTheRNG.randomness.random_948.nextInt(i);
	}

	@Redirect(method = "onSheared(Lnet/minecraft/item/ItemStack;Lnet/minecraft/world/IBlockAccess;Lnet/minecraft/util/math/BlockPos;I)Ljava/util/List;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_949(Random rand, int i) {
		return KillTheRNG.randomness.random_949.nextInt(i);
	}

	@Redirect(method = "getDyeColorMixFromParents(Lnet/minecraft/entity/passive/EntityAnimal;Lnet/minecraft/entity/passive/EntityAnimal;)Lnet/minecraft/item/EnumDyeColor;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextBoolean()Z", ordinal = 0))
	public boolean redirect_random_950(Random rand) {
		return KillTheRNG.randomness.random_950.nextBoolean();
	}

}
