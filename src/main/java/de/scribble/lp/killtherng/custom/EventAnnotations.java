package de.scribble.lp.killtherng.custom;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;

public class EventAnnotations {
	
	@Target(ElementType.METHOD)
	@Retention(RetentionPolicy.RUNTIME)
	public @interface CaptureRandomness {
		String name();
	}
	
	private ArrayList<Object> registry = new ArrayList<>();
	
	public void register(Object object) {
		registry.add(object);
	}
	
	public void unregister(Object object) {
		registry.remove(object);
	}
	
	public void fireRandomnessEvents(String randomName, long seed, String value) {
		for(Object obj : registry) {
			for (Method method : obj.getClass().getDeclaredMethods()) {
				if(method.isAnnotationPresent(CaptureRandomness.class)) {
					
					CaptureRandomness annotation = method.getAnnotation(CaptureRandomness.class);
					
					if(randomName.equals(annotation.name())) {
					
						Type[] params = method.getGenericParameterTypes();
						
						if(params.length!=2) {
							throw new IllegalArgumentException("Method "+ method.getName() +" does not have a long and a String as parameters");
						}
						
						if (params[1].equals(String.class) && params[0].equals(long.class)) {
							try {
								method.invoke(obj, seed, value);
							} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
								e.printStackTrace();
							}
						} else {
							throw new IllegalArgumentException("Method "+ method.getName() +" does not have a long and a String as parameters");
						}
					}
				}
			}
		}
	}
}
