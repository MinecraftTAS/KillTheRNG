package de.scribble.lp.killtherng.mixin.ktrng.patches;
import java.util.Random;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Redirect;

@Mixin(net.minecraft.world.gen.structure.StructureNetherBridgePieces.Corridor4.class)
public class MixinStructureNetherBridgePieces$Corridor4{

	/**
	* Position, Rotation and Type of next Nether Bridge Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 0))
	public int redirect_posRotTypeNetherBridge_1(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeNetherBridge.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeNetherBridge.nextInt(i);
		return rand.nextInt(i);
	}

	/**
	* Position, Rotation and Type of next Nether Bridge Piece
	*/
	@Redirect(method = "buildComponent(Lnet/minecraft/world/gen/structure/StructureComponent;Ljava/util/List;Ljava/util/Random;)V", at = @At(value = "INVOKE", target = "Ljava/util/Random;nextInt(I)I", ordinal = 1))
	public int redirect_posRotTypeNetherBridge_2(Random rand, int i) {
//		return de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeNetherBridge.nextInt(i);
		de.scribble.lp.killtherng.KillTheRNG.randomness.posRotTypeNetherBridge.nextInt(i);
		return rand.nextInt(i);
	}


}