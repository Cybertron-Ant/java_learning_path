package com.test;


/* instanciate of 'concrete' class 'Circle' that extend the 'abstract' class 'Shape' and call its methods */
public class Main {
    public static void main(String[] args) {
      
        // creating an instance of the 'Circle' class
        Circle circle = new Circle(5.0);
        
        // calling the method 'calculateArea' defined in the 'abstract' class
        double area = circle.calculateArea();
        System.out.println("Area of the circle: " + area);
      
    }// end method 'main'
  
}// end class 'Main'
