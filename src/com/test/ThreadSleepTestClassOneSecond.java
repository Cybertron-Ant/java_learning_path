package com.test;

// class 'ThreadSleepTestClassOneSecond' showing the usage of Thread.sleep() for 1 second timed delays
public class ThreadSleepTestClassOneSecond {

	public static void main(String[] args) throws InterruptedException {
		
		// creating a new thread
		Thread thread = new Thread();
		
		// printing numbers sequentially with 1-second intervals
		System.out.println("1");
		thread.sleep(1000);
		
		System.out.println("2");
		thread.sleep(1000);
		
		System.out.println("3");
		thread.sleep(1000);
		
		System.out.println("4");
		thread.sleep(1000);
		
		System.out.println("5");
		thread.sleep(1000);
		
		System.out.println("6");
		thread.sleep(1000);
		
		System.out.println("7");
		thread.sleep(1000);
		
		System.out.println("8");
		thread.sleep(1000);
		
		System.out.println("9");
		thread.sleep(1000);
		
		System.out.println("10");
    
	}// end class 'main'

}// end class 'ThreadSleepTestClassOneSecond'
