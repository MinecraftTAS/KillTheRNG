package de.scribble.lp.killtherng.mixin;

import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraft.client.model.ModelBase;

@Mixin(ModelBase.class)
public class MixinModelBase {

	/**
	* null
	*/
	@Redirect(method = "getRandomModelBox(Ljava/util/Random;)Lnet/minecraft/client/model/ModelRenderer;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_random_1375_0(Random rand, int i) {
		return KillTheRNG.randomness.random_1375.nextInt(i);
	}

}
