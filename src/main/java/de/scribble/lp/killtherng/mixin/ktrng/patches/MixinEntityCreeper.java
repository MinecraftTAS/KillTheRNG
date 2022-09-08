package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.entity.monster.EntityCreeper.class)
public class MixinEntityCreeper{

	/**
	* Which record is dropped after dying from a skeleton
	*/
	@Redirect(method = "onDeath(Lnet/minecraft/util/DamageSource;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_creeperDropRecord_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.creeperDropRecord.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.creeperDropRecord.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.creeperDropRecord.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Pitch of the flint and steel using sound thingy when igniting a creeper
	*/
	@Redirect(method = "processInteract(Lnet/minecraft/entity/player/EntityPlayer;Lnet/minecraft/util/EnumHand;)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextFloat()F", ordinal = 0))
	public float redirect_creeperSoundPitch_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.creeperSoundPitch.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.creeperSoundPitch.nextFloat();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.creeperSoundPitch.nextFloat();
			return rand.nextFloat();
		}
	}


}