package com.kolkata.ExceptionHandling;

public class MultithreadingImpl implements Runnable{
	int className = MultithreadingImpl.super.hashCode();
	@Override
	public void run() {
		/**
		 * Program will throws the exception IllegalArguementException when the time for sleeping is negative.
		 */
		for(int i=0;i<5;i++) {
			//System.out.println(this.className+ " : "+System.currentTimeMillis());
			try {
				/**
				 * The method sleep() is being used to halt the working of a thread for a given amount of time. 
				 * The time up to which the thread remains in the sleeping state is known as the sleeping time of 
				 * the thread. After the sleeping time is over, the thread starts its execution from where it has left.
				 */
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
		//System.out.println( Thread.currentThread().getName()+"Ohh Sorry, I was sleeping!! : "+System.currentTimeMillis());
	}
	
	/**
	 * The join() method in Java is provided by the java.lang.Thread class that permits one thread to wait 
	 * until the other thread to finish its execution. Suppose th be the object the class Thread whose thread 
	 * is doing its execution currently, then the th.join(); statement ensures that th is finished before the 
	 * program does the execution of the next statement. When there are more than one thread invoking the 
	 * join() method, then it leads to overloading on the join() method that permits the developer or 
	 * programmer to mention the waiting period. However, similar to the sleep() method in Java, the join() 
	 * method is also dependent on the operating system for the timing, so we should not assume that the 
	 * join() method waits equal to the time we mention in the parameters. 
	 * 
	 * 
	 * join(): When the join() method is invoked, the current thread stops its execution and the thread goes 
	 * into the wait state. The current thread remains in the wait state until the thread on which the join() 
	 * method is invoked has achieved its dead state. If interruption of the thread occurs, then it throws 
	 * the InterruptedException.
	 * 
	 */

}
