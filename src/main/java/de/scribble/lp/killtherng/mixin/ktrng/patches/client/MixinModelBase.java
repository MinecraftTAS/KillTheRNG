package de.scribble.lp.killtherng.mixin.ktrng.patches.client;
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
		if (de.scribble.lp.killtherng.KillTheRNG.clientRandom.modelBox.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.clientRandom.modelBox.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.clientRandom.modelBox.nextInt(i);
			return rand.nextInt(i);
		}
	}


}