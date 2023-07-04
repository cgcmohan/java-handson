package com.kolkata.ControlStatement;

import java.util.Scanner;

public class ControlStatementImpl {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int age = 0;
		try {
			age = sc.nextInt();
			sc.nextLine();
			if (age <= 0) {
				/**
				 * throw keyword is used to forcefully throw the exception while throws keyword
				 * is used to declare the exception with method body
				 * 
				 * Whatever String is passed in throw will be printed as exception message in catch block
				 * if printstacktrace will be use. If catch block uses different message, it will be override
				 * and will get printed in the console
				 */
				
				throw new Exception("Age is not valid! Please re-enter your age");
			}
		} catch (Exception e) {

			e.printStackTrace();
//			age = sc.nextInt();
//			sc.nextLine();
		}
		if (age > 0 && age < 18) {
			System.out.println("You are not allowed to vote as your age is : " + age);
		} else if (age > 60) {
			System.out.println("You are eligible for vodting. We are arranging home voting system for you");

		} else if (age >= 18) {
			System.out.println("Please cast your vote!!");
		}

		/**
		 * If else decision making statement will be used when we have to check for group of data (let say 
		 * age>18 or age between 18 to 60), and switch case is fesible where we have to match data based on
		 * some particular value
		 */
		//System.out.println("Enter "+sc.nextLine());
		String codedVehicleBodyType = sc.nextLine();
		
		String vehicleBodyType = null;
		switch(codedVehicleBodyType) {
		case "M" :
			vehicleBodyType = "Metal";
			break;
		case "P":
			vehicleBodyType = "Plastic";
			break;
		case "G" :
			vehicleBodyType = "Glass";
			break;
		default : 
			vehicleBodyType = "Fibre";
			break;
		}
		System.out.println("codedVehicleBodyType is " +codedVehicleBodyType + " and it's corresponding vehicleBodyType is : "+vehicleBodyType);
		
		
		/**
		 * For loop is used when we know the exact no of iteration to perform in advance
		 */
		for(int i=0;i<age;i++) {
			System.out.println("Your age after re-verifying it from for loop is : "+ age);
			i+=30;
		}
		
		/**
		 * While is used when we don't know the exact no of iteration to perform, but we know when to stop
		 * the iteration
		 * And do while is used when we need to run the code at-least once to test for the condition
		 */
		while(age >= 18 && age <=60 ) {
			System.out.println("Cast your vote inside while loop!!");
			age += 30;
		}
		
		do {
			System.out.println("I come to do while as I was roaming around. Please check whether I can cast my vote or not ! " +age);
			age += 20;
		} while (age > 18 && age <=60);
		
		/**
		 * Continue will skip the rest of code written below continue and execute it onward
		 * break will terminate the current flow of execution from current loop
		 */
		System.out.println("End of Code !!");
	}
}
