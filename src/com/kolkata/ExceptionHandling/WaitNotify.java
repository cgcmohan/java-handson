package com.kolkata.ExceptionHandling;

public class WaitNotify {
	private int bullet = 40;
	synchronized public void fire(int bullets) {

		for(int i=1;i<=bullets;i++) {
			if(bullet==0) {
				System.out.println(i-1+ " bullets fired! \nBullets remaining : "+bullet);
				
				System.out.println("Refilling the bullet!! involing wait() method");
				try {
					wait();
				} catch(InterruptedException e) {
					e.printStackTrace();
				}
			}
			
			bullet--;
		}
		System.out.println(
	            "The firing process is complete");
		
	}
	
	synchronized public void reload() {
		System.out.println(
	            "Reloading the magazine and resuming "
	            + "the thread using notify()");
		bullet+= 40;
		notify();
	}
}
