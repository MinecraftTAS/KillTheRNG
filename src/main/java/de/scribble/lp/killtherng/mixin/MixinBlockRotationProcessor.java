package de.scribble.lp.killtherng.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import de.scribble.lp.killtherng.UltimateRandomness;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.gen.structure.template.BlockRotationProcessor;
import net.minecraft.world.gen.structure.template.Template;

@Mixin(BlockRotationProcessor.class)
public class MixinBlockRotationProcessor {
	@Shadow
	private float chance;

	@Inject(method="processBlock", at=@At("HEAD"), cancellable= true)
	public void redoProcessBlock(World worldIn, BlockPos pos, Template.BlockInfo blockInfoIn, CallbackInfoReturnable<Template.BlockInfo> ci) {
		float out=UltimateRandomness.blockrotationprocessorProcessBlock.nextFloat();
		ci.setReturnValue(this.chance < 1.0F && out > this.chance ? null : blockInfoIn);
		
		ci.cancel();
	}
}
