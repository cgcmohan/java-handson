package com.kolkata.Main;

import com.kolkata.OOPS.SingletonImpl;

public class SingletonMain {

	public static void main(String[] args) {

		SingletonImpl obj1 = SingletonImpl.getInstance();
		SingletonImpl obj2 = SingletonImpl.getInstance();
		System.out.println(obj1.hashCode() +" -- "+obj2.hashCode());
		obj2.setPanNumber("FGHUI9876Y");
		System.out.println(obj1.getPanNumber().equals(obj2.getPanNumber()));
	}

}
