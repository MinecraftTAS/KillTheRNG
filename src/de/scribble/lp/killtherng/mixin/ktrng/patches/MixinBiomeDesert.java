package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.biome.BiomeDesert;

@Mixin(BiomeDesert.class)
public class MixinBiomeDesert {

	/**
	* If a well generates
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_biomeDesertGenWell_1(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDesertGenWell.nextInt(i);
		KillTheRNG.randomness.biomeDesertGenWell.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position of the well
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_biomeDesertGenWellPos_2(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDesertGenWellPos.nextInt(i);
		KillTheRNG.randomness.biomeDesertGenWellPos.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position of the well
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_biomeDesertGenWellPos_3(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDesertGenWellPos.nextInt(i);
		KillTheRNG.randomness.biomeDesertGenWellPos.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* If a fossil generates
	*/
	@Redirect(method = "decorate(Lnet/minecraft/world/World;Ljava/util/Random;Lnet/minecraft/util/math/BlockPos;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_biomeDesertGenFossils_4(Random rand, int i) {
//		return KillTheRNG.randomness.biomeDesertGenFossils.nextInt(i);
		KillTheRNG.randomness.biomeDesertGenFossils.nextInt(i);
		return rand.nextInt(i);
	}

}
