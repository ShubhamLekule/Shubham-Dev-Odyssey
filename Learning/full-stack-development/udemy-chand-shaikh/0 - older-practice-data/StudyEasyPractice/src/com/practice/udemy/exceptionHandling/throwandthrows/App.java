package com.practice.udemy.exceptionHandling.throwandthrows;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class App {

	public static void main(String[] args) throws FileNotFoundException {
		//someMethod() throws FileNotFoundException which we can handled in two ways
		
		/* First is add try catch block
		 * try { someMethod(); } catch (FileNotFoundException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */
		// Second is again add throws to main method
		someMethod();

	}
	
	//Java Explicitly throw some exception that we need to handle through throws 
	
	public static void someMethod() throws FileNotFoundException {
		System.out.println("Message from someMethod() method");
		// here FileReader constructor throws FileNotFoundException which we need to handled on someMethod() method
		FileReader fr=new FileReader("file.txt");
	}
}
