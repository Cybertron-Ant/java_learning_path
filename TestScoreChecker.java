//package com.test;

import java.util.Scanner;

/* takes a score as input, and then determine the result based on the specified criteria. The final result is then printed */
public class TestScoreChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's marks: ");
        int marks = scanner.nextInt();

        String result;

        if (marks > 80 && marks < 101) {
            result = "Topper";
        } else if (marks > 60 && marks < 80) {
            result = "Good";
        } else if (marks > 40 && marks < 60) {
            result = "Average";
        } else if (marks < 40) {
            result = "ReTest";
        } else {
            result = "ReTest";
        }

        System.out.println("Test Result: " + result);

        scanner.close();
    }
}
