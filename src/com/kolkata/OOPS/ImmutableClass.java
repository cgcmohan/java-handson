package com.kolkata.OOPS;

import java.util.HashMap;
import java.util.Map;

/**
 * only public, abstract & final are permitted for outer class, it can never be private
 * 
 * Child classed can't be created for a class declared as final
 */
final class ImmutableClass {

	/**
	 * Using private, we can't directly access the field
	 * Using final, we can't update/ change the value of it, once it's initilized
	 */
	private final String PAN_NUMBER;
	private final Map<String,String> panDetails;
	
	public ImmutableClass(String panNumber, Map<String, String> pancardData) {
		this.PAN_NUMBER = panNumber;
		/**
		 * this.panDetails = pancardData; // this is a showllow copy of object
		 * we have to make deep copy of object to achieve immutiabilty, so that data members can't be
		 * modified with object reference
		 */
		Map<String, String> tempMap = new HashMap<>();
		for(Map.Entry<String, String> panData : pancardData.entrySet()) {
			tempMap.put(panData.getKey(), panData.getValue());
		}
		this.panDetails = tempMap;
	}
	
	public String getPanNumber() {
		return this.PAN_NUMBER;
	}
	/**
	 * Deep Copy of objects should be performed in the getter methods to return a copy rather than 
	 * returning the actual object reference)
	 * @return
	 */
	public Map<String, String> getPanDetails() {
		Map<String, String> tempMap = new HashMap<>();
		for(Map.Entry<String, String> entry : panDetails.entrySet()) {
			tempMap.put(entry.getKey(), entry.getValue());
		}
		return tempMap;
	}
	
	
	/**
	 * Follow below steps to create custom immutable class in java. Although you can get reference from the above code to create immutable class.
	 * 
	 *  (1) : The class must be declared as final so that child classes can’t be created.
	 *  (2) : Data members in the class must be declared private so that direct access is not allowed.
	 *  (3) : Data members in the class must be declared as final so that we can’t change the value of it after object creation.
	 *  (4) : A parameterized constructor should initialize all the fields performing a deep copy so that data members can’t be modified with an object reference.
	 *  (5) : Deep Copy of objects should be performed in the getter methods to return a copy rather than returning the actual object reference)
	 *  (6) : NOTE ## There should be no setters or in simpler terms, there should be no option to change the value of the instance variable.
	 *  
	 */
}

