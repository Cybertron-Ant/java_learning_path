package com.test;


// class 'Circle' extending the 'abstract' class 'Shape'
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }// end constructor 'Circle'

    // implementing the 'abstract' method
    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }// end method 'calculateArea'
  
}// end class 'Circle'
