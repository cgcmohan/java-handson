package com.kolkata.Main;

import com.kolkata.ExceptionHandling.MultithreadingImpl;

public class MultithreadingMain {

	public static void main(String[] args) {
		MultithreadingImpl exHaImpl = new MultithreadingImpl();
		Thread thread1 = new Thread(exHaImpl);
		Thread thread2 = new Thread(exHaImpl);
		Thread thread3 = new Thread(exHaImpl);
		thread1.start();
		thread2.start();
		try {
			System.out.println(thread2.currentThread().getName());
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		thread3.start();
		/**
		 * Can we run a thread twice?
		 *  -> No. After starting a thread, it can never be started again. If you does so, an IllegalThreadStateException is thrown. 
		 *  -> In such case, thread will run once but for second time, it will throw exception.
		 * 
		 * Can we call run() method directly instead of calling start() ? 
		 *  -> Each thread starts in a separate call stack.
		 *  -> Invoking the run() method from the main thread, the run() method goes onto the current call stack rather than 
		 *     at the beginning of a new call stack.
		 *  -> no context-switching because here thread1 and thread2 will be treated as normal object not thread object.
		 *  
		 */ 
//		thread1.run();
//		thread1.run();
	}

}
