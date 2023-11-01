package com.dividetwonumbers;

import java.util.Scanner;

// divides two numbers and prints their quotient
public class DivideTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int secondNumber = scanner.nextInt();

        if (secondNumber == 0) {
            System.out.println("Error: Division by zero.");
        } else {
            int quotient = firstNumber / secondNumber;
            System.out.println("The quotient is: " + quotient);
        }

        scanner.close();
    }
}