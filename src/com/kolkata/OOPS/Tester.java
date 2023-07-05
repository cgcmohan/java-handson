package com.kolkata.OOPS;

import java.util.HashMap;
import java.util.Map;

public class Tester {

	public static void main(String[] args) {
		Map<String, String> pancardData = new HashMap<>();
		pancardData.put("repository", "NSDL");
		pancardData.put("typeOfCard", "Income Tax");
		ImmutableClass ic = new ImmutableClass("DELPP8765Y",pancardData);
		System.out.println(ic.getPanNumber());
		for(Map.Entry<String, String> entry : ic.getPanDetails().entrySet()) {
			System.out.println(entry.getKey() + " - "+entry.getValue());
		}
		
		SingletonImpl obj1 = SingletonImpl.getInstance();
		SingletonImpl obj2 = SingletonImpl.getInstance();
		System.out.println(obj1.hashCode() +" -- "+obj2.hashCode());
		obj2.setPanNumber("FGHUI9876Y");
		System.out.println(obj1.getPanNumber().equals(obj2.getPanNumber()));
	}
}
