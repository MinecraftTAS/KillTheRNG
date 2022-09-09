package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.MapGenVillage.Start.class)
public class MixinMapGenVillage$Start{

	/**
	* Position of the Village
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;Ljava/util/Random;III)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotVillage_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotVillage.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotVillage.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotVillage.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of the Village
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/World;Ljava/util/Random;III)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_posRotVillage_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotVillage.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotVillage.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotVillage.nextInt(i);
			return rand.nextInt(i);
		}
	}


}