package com.kolkata.OOPS;
/**
 * To implement singleton class, follow the below two points : 
 *  (1) : Make a constructor private. 
 *  (2) : Write a static method that has the return type object of this singleton class. 
 * Here, the concept of Lazy initialization is used to write this static method.
 */
public class SingletonImpl {

	private static SingletonImpl singleton_instance = null;
	
	private String PAN_NUMBER;
	public String getPanNumber() {
		return this.PAN_NUMBER;
	}
	public void setPanNumber(String panNumber) {
		this.PAN_NUMBER = panNumber;
	}
	private SingletonImpl() {
		PAN_NUMBER = "DELPP8765T";
	}
	/**
	 * Only one object will be created in this case, and same will be shared to each reference
	 * @return
	 */
	public static synchronized SingletonImpl getInstance() {
		if(singleton_instance == null) {
			singleton_instance = new SingletonImpl();
		}
		return singleton_instance;
	}
	
	public static SingletonImpl SingletonImpl() {
		if(singleton_instance == null) {
			singleton_instance = new SingletonImpl();
		}
		return singleton_instance;
	}
}
