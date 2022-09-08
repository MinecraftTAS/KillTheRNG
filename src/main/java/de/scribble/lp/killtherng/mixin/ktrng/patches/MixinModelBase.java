package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.client.model.ModelBase.class)
public class MixinModelBase{

	/**
	* Returns a random model box from a list
	*/
	@Redirect(method = "getRandomModelBox(Ljava/util/Random;)Lnet/minecraft/client/model/ModelRenderer;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_modelBox_1(Random rand, int i) {
		return de.scribble.lp.killtherng.KillTheRNG.randomness.modelBox.nextInt(i);
//		de.scribble.lp.killtherng.KillTheRNG.randomness.modelBox.nextInt(i);
//		return rand.nextInt(i);
	}


}