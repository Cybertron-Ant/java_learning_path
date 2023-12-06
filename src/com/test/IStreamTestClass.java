package com.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

// class 'IStreamTestClass' showing input stream usage for file reading
public class IStreamTestClass {

	public static void main(String[] args) throws IOException {
		
		// creating 'FileReader' and 'BufferedReader' objects to read a file
		FileReader fr = new FileReader("D:\\test\\testWorkspace\\TestProjectEvengingClasses\\input.txt");
		BufferedReader br = new BufferedReader(fr);
		
		String a;
		
		// reading and printing file contents line by line
		while((a = br.readLine()) != null) {
			System.out.println(a);
		}// end WHILE
    
	}// end method 'main'

}// end class 'IStreamTestClass'
