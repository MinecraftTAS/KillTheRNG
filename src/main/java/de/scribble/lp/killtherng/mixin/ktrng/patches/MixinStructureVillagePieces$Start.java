package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.StructureVillagePieces.Start.class)
public class MixinStructureVillagePieces$Start{

	/**
	* Position, Rotation and Type of next Village Piece
	*/
	@Redirect(method = "<init>(Lnet/minecraft/world/biome/BiomeProvider;ILjava/util/Random;IILjava/util/List;I)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotTypeVillage_1(Random rand, int i) {
		if (de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeVillage.isEnabled()) {
			return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeVillage.nextInt(i);
		} else {
			de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeVillage.nextInt(i);
			return rand.nextInt(i);
		}
	}


}