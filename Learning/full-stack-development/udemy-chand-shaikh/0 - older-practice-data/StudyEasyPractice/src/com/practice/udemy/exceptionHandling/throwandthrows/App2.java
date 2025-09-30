package com.practice.udemy.exceptionHandling.throwandthrows;

import java.io.FileNotFoundException;

public class App2 {

	public static void main(String[] args) {
		try {
			someMethod();
		} catch (FileNotFoundException e) {
			System.out.println("Catch block from main() method");
			e.printStackTrace();
		}
	}
	//Java Explicitly throw some exception that we need to handle through throws keyword on method
	public static void someMethod() throws FileNotFoundException {
		System.out.println("Message from someMethod() method");
		// Child class cannot handled parent class, below will not work as we throwing FileNotFoundException which is
		// child class of Exception class
		//throw new Exception();
		
		// When we call exception we have to call constructor of class
		// throw use to declare exception
		throw new FileNotFoundException();
		// No statement after above statement get executed
	}
}
