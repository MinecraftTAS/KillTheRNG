package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.renderer.entity.RenderLightningBolt;

@Mixin(RenderLightningBolt.class)
public class MixinRenderLightningBolt {
	@Redirect(method = "doRender(Lnet/minecraft/entity/effect/EntityLightningBolt;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1402(Random rand, int i) {
		return KillTheRNG.randomness.random_1402.nextInt(i);
	}

	@Redirect(method = "doRender(Lnet/minecraft/entity/effect/EntityLightningBolt;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_random_1403(Random rand, int i) {
		return KillTheRNG.randomness.random_1403.nextInt(i);
	}

	@Redirect(method = "doRender(Lnet/minecraft/entity/effect/EntityLightningBolt;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 2))
	public int redirect_random_1404(Random rand, int i) {
		return KillTheRNG.randomness.random_1404.nextInt(i);
	}

	@Redirect(method = "doRender(Lnet/minecraft/entity/effect/EntityLightningBolt;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 3))
	public int redirect_random_1405(Random rand, int i) {
		return KillTheRNG.randomness.random_1405.nextInt(i);
	}

	@Redirect(method = "doRender(Lnet/minecraft/entity/effect/EntityLightningBolt;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 4))
	public int redirect_random_1406(Random rand, int i) {
		return KillTheRNG.randomness.random_1406.nextInt(i);
	}

	@Redirect(method = "doRender(Lnet/minecraft/entity/effect/EntityLightningBolt;DDDFF)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 5))
	public int redirect_random_1407(Random rand, int i) {
		return KillTheRNG.randomness.random_1407.nextInt(i);
	}

}
