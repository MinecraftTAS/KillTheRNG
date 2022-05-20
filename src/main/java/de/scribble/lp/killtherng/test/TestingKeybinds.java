package de.scribble.lp.killtherng.test;

import de.scribble.lp.killtherng.KillTheRNG;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;

public class TestingKeybinds{
	
	@SubscribeEvent
	public void onKey(KeyInputEvent ev) {
		if(KillTheRNG.testingKey.isPressed()) {
//			CustomRandom test=new CustomRandom("Test");
//			CustomRandom test2=new CustomRandom("Test2");
//			test.advance();
//			System.out.println(test.getSeed());
//			System.out.println(test2.getSeed());
//			System.out.println(test.steps(test2));
		}
	}
	
}
