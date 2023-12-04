package com.test;

/* class 'ExceptionTest' showin exception handling by attempting an arithmetic operation (division) 
  within a 'try'-'catch' block and executing a 'finally' statement regardless of whether an exception occurs */
public class ExceptionTest {

    public static void main(String[] args) {
        
        // attempting arithmetic operation within a try-catch block to handle potential exceptions
        try {
            // initializing variables
            Integer a = null; // first variable initialized as null
            Integer b = 10;   // second variable initialized as 10
            
            // performing arithmetic operation: division of a by b
            Integer c = a / b; // this line might throw a NullPointerException
            
            // outputting the result of the arithmetic operation
            System.out.println(c);	
        } catch(Exception e) {
            // handling any exception that might occur during the arithmetic operation
            System.out.println("There is a problem processing the action, please check your inputs.");
        } finally {
            // executing code that needs to run whether or not an exception occurs
            System.out.println("Thank you!!");
        }// end 'finally'
      
    }// end method 'main'
  
}// end class 'ExceptionTest'
