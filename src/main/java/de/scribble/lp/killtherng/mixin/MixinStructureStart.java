package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureStart;

@Mixin(StructureStart.class)
public class MixinStructureStart {

	/**
	* null
	*/
	@Redirect(method = "markAvailableHeight(Lnet/minecraft/world/World;Ljava/util/Random;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1626_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1626.nextInt(i);
	}

	/**
	* null
	*/
	@Redirect(method = "setRandomHeight(Lnet/minecraft/world/World;Ljava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1627_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1627.nextInt(i);
	}

}
