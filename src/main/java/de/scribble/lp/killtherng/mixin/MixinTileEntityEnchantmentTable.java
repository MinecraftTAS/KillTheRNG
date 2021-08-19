package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.tileentity.TileEntityEnchantmentTable;

@Mixin(TileEntityEnchantmentTable.class)
public class MixinTileEntityEnchantmentTable {
	@Redirect(method = "update()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_479(Random rand, int i) {
		return KillTheRNG.randomness.random_479.nextInt(i);
	}

	@Redirect(method = "update()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_480(Random rand, int i) {
		return KillTheRNG.randomness.random_480.nextInt(i);
	}

	@Redirect(method = "update()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_481(Random rand, int i) {
		return KillTheRNG.randomness.random_481.nextInt(i);
	}

}
