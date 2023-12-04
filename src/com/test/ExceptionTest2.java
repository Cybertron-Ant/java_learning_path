package com.test;

/* class 'ExceptionTest2' shows  handling various exceptions that might occur during a simple division operation */
public class ExceptionTest {

	public static void main(String[] args) {
		
		// attempting division operation within a try block to handle potential exceptions
		try {
      
			Integer a = 20;
			Integer b = 10;
			Integer c = a / b; // performing division
			System.out.println(c); // printing the result
      
		} catch (NullPointerException ne) { // handling a specific nullpointerexception
			System.out.println("some inputs seem empty, please fill them.");
      
		} catch (ArithmeticException ae) { // handling a specific arithmeticexception (division by zero)
			System.out.println("some inputs seem to be 0, please input a valid number.");
      
		} catch (Exception e) { // handling any other general exceptions
			System.out.println("there is a problem processing the action, please check your inputs.");
      
		} finally { // executed regardless of whether an exception is caught or not
			System.out.println("thank you!!");
		}// end 'finally'

	}// end method 'main'

}// end class 'ExceptionTest2'
