package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.MapGenNetherBridge;

@Mixin(MapGenNetherBridge.class)
public class MixinMapGenNetherBridge {
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1830(Random rand, long unused) {
	}

	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 1))
	public int redirect_random_1831(Random rand) {
		return KillTheRNG.randomness.random_1831.nextInt();
	}

	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1832(Random rand, int i) {
		return KillTheRNG.randomness.random_1832.nextInt(i);
	}

	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1833(Random rand, int i) {
		return KillTheRNG.randomness.random_1833.nextInt(i);
	}

	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1834(Random rand, int i) {
		return KillTheRNG.randomness.random_1834.nextInt(i);
	}

}
