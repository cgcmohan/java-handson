package com.kolkata.Main;

import java.util.HashMap;
import java.util.Map;

import com.kolkata.OOPS.ImmutableClass;

public class ImmutableMain {

	public static void main(String[] args) {
		Map<String, String> pancardData = new HashMap<>();
		pancardData.put("repository", "NSDL");
		pancardData.put("typeOfCard", "Income Tax");
		ImmutableClass ic = new ImmutableClass("DELPP8765Y",pancardData);
		System.out.println(ic.getPanNumber());
		for(Map.Entry<String, String> entry : ic.getPanDetails().entrySet()) {
			System.out.println(entry.getKey() + " - "+entry.getValue());
		}
	}

}
