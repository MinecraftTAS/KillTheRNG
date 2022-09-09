package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.MapGenMineshaft.class)
public class MixinMapGenMineshaft{

	/**
	* Position of the Mineshaft
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextDouble()D", ordinal = 0))
	public double redirect_posRotMineshaft_1(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotMineshaft.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotMineshaft.nextDouble();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotMineshaft.nextDouble();
			return rand.nextDouble();
		}
	}

	/**
	* Position of the Mineshaft
	*/
	@Redirect(method = "canSpawnStructureAtCoords(II)Z", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotMineshaft_2(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotMineshaft.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotMineshaft.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotMineshaft.nextInt(i);
			return rand.nextInt(i);
		}
	}

	/**
	* Position of the Mineshaft
	*/
	@Redirect(method = "getNearestStructurePos(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Z)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;setSeed(J)V", ordinal = 0))
	public void redirect_posRotMineshaft_3(Random rand, long seed) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotMineshaft.isEnabled()) {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotMineshaft.setSeed(seed, true);		} else {
			rand.setSeed(seed);
		}
	}

	/**
	* Position of the Mineshaft
	*/
	@Redirect(method = "getNearestStructurePos(Lnet/minecraft/world/World;Lnet/minecraft/util/math/BlockPos;Z)Lnet/minecraft/util/math/BlockPos;", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt()I", ordinal = 0))
	public int redirect_posRotMineshaft_4(Random rand) {
		if (de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotMineshaft.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotMineshaft.nextInt();
		} else {
			de.scribble.lp.killtherng.KillTheRNG.commonRandom.posRotMineshaft.nextInt();
			return rand.nextInt();
		}
	}


}