package com.test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// class 'IOStreamsTestClass' showing input and output streams for file handling
public class IOStreamsTestClass {

	public static void main(String[] args) throws IOException {
		
		// creating 'FileReader' and 'BufferedReader' to read from a file
		FileReader fr = new FileReader("D:\\test\\testWorkspace\\TestProjectEvengingClasses\\input.txt");
		BufferedReader br = new BufferedReader(fr);
		
		// creating 'FileWriter' and 'BufferedWriter' to write to a file
		FileWriter fw = new FileWriter("D:\\test\\testWorkspace\\TestProjectEvengingClasses\\output.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		String a;
		
		// reading from input file, printing to console, and writing to output file
		while((a = br.readLine()) != null) {
			System.out.println(a);
			bw.write(a.concat("\n"));
		}// end WHILE
		
		// closing the streams
		br.close();
		bw.close();
    
	}// end method 'main'

}// end class 'IOStreamsTestClass'
