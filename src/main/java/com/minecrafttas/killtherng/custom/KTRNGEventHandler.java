package com.minecrafttas.killtherng.custom;

import java.util.ArrayList;
import java.util.List;

public class KTRNGEventHandler {
	
	private List<KTRNGEvent> eventList=new ArrayList<>();
	
	public interface KTRNGEvent {
		public void trigger();
	}
	
	public void register(KTRNGEvent event) {
		eventList.add(event);
	}
	
	public void triggerEvents() {
		eventList.forEach(ev -> ev.trigger());
	}
}
