package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.block.Block.class)
public class MixinBlock{

	/**
	* If a drop should be dropped
	*/
	@Redirect(method = "dropBlockAsItemWithChance(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/block/state/IBlockState;FI)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_blockDropItemChance_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.blockDropItemChance.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.blockDropItemChance.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.blockDropItemChance.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the spawned item should spawn
	*/
	@Redirect(method = "spawnAsEntity(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	private static float redirect_blockDropPosition_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.blockDropPosition.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.blockDropPosition.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.blockDropPosition.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the spawned item should spawn
	*/
	@Redirect(method = "spawnAsEntity(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 1))
	private static float redirect_blockDropPosition_3(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.blockDropPosition.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.blockDropPosition.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.blockDropPosition.nextFloat();
			return rand.nextFloat();
		}
	}

	/**
	* Where the spawned item should spawn
	*/
	@Redirect(method = "spawnAsEntity(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/item/ItemStack;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 2))
	private static float redirect_blockDropPosition_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.blockDropPosition.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.blockDropPosition.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.blockDropPosition.nextFloat();
			return rand.nextFloat();
		}
	}


}