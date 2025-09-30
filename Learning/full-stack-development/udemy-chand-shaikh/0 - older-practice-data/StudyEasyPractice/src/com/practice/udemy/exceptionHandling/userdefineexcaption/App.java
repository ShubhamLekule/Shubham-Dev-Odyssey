package com.practice.udemy.exceptionHandling.userdefineexcaption;

import java.io.FileNotFoundException;

public class App {

	public static void main(String[] args) {
		
		try {
			someMethod();
		}catch (FileNotFoundException e) {
			System.out.println(" FileNotFoundException catch block");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(" Exception catch block");
			e.printStackTrace();
		}

	}
	// Multiple throws in sequential manner possible, sequence is parent to child class descending order 
	public static void someMethod() throws Exception, FileNotFoundException {
		System.out.println("Message from someMethod() method");
		int x=2;
		switch(x) {
		case 1: throw new Exception();
		case 2 : throw new FileNotFoundException();
		}
		
		
	}
}
