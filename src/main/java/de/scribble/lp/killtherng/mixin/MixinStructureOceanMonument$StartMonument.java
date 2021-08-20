package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.StructureOceanMonument;

@Mixin(StructureOceanMonument.StartMonument.class)
public class MixinStructureOceanMonument$StartMonument {

	/**
	* null
	*/
	@Redirect(method = "create(Lnet/minecraft/world/World;Ljava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_random_1631_0(Random rand, long unused) {
	}

	/**
	* null
	*/
	@Redirect(method = "create(Lnet/minecraft/world/World;Ljava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 1))
	public long redirect_random_1632_1(Random rand) {
		return KillTheRNG.randomness.random_1632.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "create(Lnet/minecraft/world/World;Ljava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextLong()J", ordinal = 2))
	public long redirect_random_1633_2(Random rand) {
		return KillTheRNG.randomness.random_1633.nextLong();
	}

	/**
	* null
	*/
	@Redirect(method = "create(Lnet/minecraft/world/World;Ljava/util/Random;II)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 3))
	public void redirect_random_1634_3(Random rand, long unused) {
	}

}
