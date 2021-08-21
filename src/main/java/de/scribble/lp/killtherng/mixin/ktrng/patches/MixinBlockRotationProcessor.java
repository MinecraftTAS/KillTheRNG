package de.scribble.lp.killtherng.mixin.ktrng.patches;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.world.gen.structure.template.BlockRotationProcessor;

@Mixin(BlockRotationProcessor.class)
public class MixinBlockRotationProcessor {

	/**
	* null
	*/
	@Redirect(method = "processBlock(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/gen/structure/template/Template$BlockInfo;)Lnet/minecraft/world/gen/structure/template/Template$BlockInfo;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_random_1968_1(Random rand) {
		return KillTheRNG.randomness.random_1968.nextFloat();
//		KillTheRNG.randomness.random_1968.nextFloat();
//		return rand.nextFloat();
	}

}
