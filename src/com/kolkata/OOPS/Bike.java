package com.kolkata.OOPS;

public class Bike {

	private String bikeMake;
	private String bikeModel;
	private String bikeRegistrationNo;
	private String engineCapacity;
	
	/**
	 * Default constructor
	 */
	public Bike() {
		super();
		System.out.println("Inside Bike() : ");
	}
	/**
	 * Parametrized constructor
	 * @param bikeMake
	 * @param bikeModel
	 * @param bikeRegistrationNo
	 * @param engineCapacity
	 */
	public Bike(String bikeMake, String bikeModel, String bikeRegistrationNo , String engineCapacity) {
		/**
		 * super() and this() call must be the first statement in a constructor
		 */
		this();
		this.bikeMake = bikeMake;
		this.bikeModel = bikeModel;
		this.bikeRegistrationNo = bikeRegistrationNo;
		this.engineCapacity = engineCapacity;
		
	}
}
