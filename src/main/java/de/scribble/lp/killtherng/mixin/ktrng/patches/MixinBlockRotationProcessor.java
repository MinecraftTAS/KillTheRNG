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
	* Rotation of block when being generated
	*/
	@Redirect(method = "processBlock(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Lnet/minecraft/world/gen/structure/template/Template$BlockInfo;)Lnet/minecraft/world/gen/structure/template/Template$BlockInfo;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_blockRotationProcess_1(Random rand) {
//		return KillTheRNG.randomness.blockRotationProcess.nextFloat();
		KillTheRNG.randomness.blockRotationProcess.nextFloat();
		return rand.nextFloat();
	}

}
