package com.test;

// class 'ThreadSleepTestClass' showing delayed execution using Thread.sleep()
public class ThreadSleepTestClass {

	public static void main(String[] args) throws InterruptedException {
		
		// creating a new thread
		Thread thread = new Thread();
		
		System.out.println("1");
		// introducing a 1-second delay
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
    
	}// end method 'main'

}// end class 'ThreadSleepTestClass'
