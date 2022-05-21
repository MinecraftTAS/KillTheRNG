package de.scribble.lp.killtherng.mixin.ktrng;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import de.scribble.lp.killtherng.KillTheRNG;
import de.scribble.lp.killtherng.NextSeedHandler;
import net.minecraft.client.Minecraft;

@Mixin(Minecraft.class)
public class MixinMinecraft {
	
	private final NextSeedHandler nextSeedHandler=new NextSeedHandler();
	
	@Inject(method = "runTickKeyboard", at = @At(value = "INVOKE", target = "Lorg/lwjgl/input/Keyboard;getEventKey()I", remap = false, ordinal = 0))
	public void changeSeedKeyboard(CallbackInfo ci) {
		if(!KillTheRNG.isLibrary) {
			nextSeedHandler.increaseNextSeedCounter();
		}
	}
	
	
	@Inject(method = "runTick", at = @At(value = "RETURN"))
	public void inject_runTick(CallbackInfo ci) {
		if(!KillTheRNG.isLibrary) {
			nextSeedHandler.sendAndReset();
		}
		KillTheRNG.tickmodeClient.tick();
	}
	
	@Inject(method = "runTickMouse", at = @At(value = "INVOKE", target = "Lorg/lwjgl/input/Mouse;getEventButton()I", remap = false, ordinal = 0))
	public void changeSeedMouse(CallbackInfo ci) {
		if(!KillTheRNG.isLibrary) {
			nextSeedHandler.increaseNextSeedCounter();
		}
	}
	
}
