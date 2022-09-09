package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(io.netty.channel.DefaultChannelId.class)
public class MixinDefaultChannelId{

	/**
	* Connection Stuff
	*/
	@Redirect(method = "<init>()V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0), remap = false)
	public int redirect_con_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.con.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.con.nextInt();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.con.nextInt();
			return rand.nextInt();
		}
	}

	/**
	* Connection Stuff
	*/
	@Redirect(method = "defaultProcessId()I", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0), remap = false)
	private static int redirect_con_2(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.con.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.con.nextInt();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.con.nextInt();
			return rand.nextInt();
		}
	}


}