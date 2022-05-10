package de.scribble.lp.killtherng.test;

import de.scribble.lp.killtherng.KillTheRNG;
import de.scribble.lp.killtherng.NextSeedHandler;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;

public class TestingKeybinds {
	
	private final NextSeedHandler nextSeedHandler=new NextSeedHandler();
	
	@SubscribeEvent
	public void onKey(KeyInputEvent ev) {
		if(KillTheRNG.testingKey.isPressed()) {
		}
	}
}
