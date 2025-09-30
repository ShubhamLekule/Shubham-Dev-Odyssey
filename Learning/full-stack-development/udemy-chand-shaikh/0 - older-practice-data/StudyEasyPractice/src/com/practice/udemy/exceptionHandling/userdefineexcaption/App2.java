package com.practice.udemy.exceptionHandling.userdefineexcaption;

import java.io.FileNotFoundException;

public class App2 {

public static void main(String[] args) {		
		try {
			someMethod();
		}catch (FileNotFoundException e) {
			System.out.println(" FileNotFoundException catch block");
			e.printStackTrace();
		} catch (UserDefineException e) {
			System.out.println(" UserDefineException catch block");
			e.printStackTrace();
		} catch (Exception e) {
			System.out.println(" Exception catch block");
			e.printStackTrace();
		}
	}
	// Multiple throws in sequential manner possible, sequence is parent to child class descending order 
	// If we extending UserDefineException class using throwable class then UserDefineException throws is mandatory
	// on someMethod() method
	// if we using throwable class to extend, then user define exception became checked exception, if we using Exception class 
	// to extend then user define exception became unchecked exception
	public static void someMethod() throws Exception, FileNotFoundException, UserDefineException {
		System.out.println("Message from someMethod() method");
		int x=3;
		switch(x) {
		case 1: throw new Exception();
		case 2 : throw new FileNotFoundException();
		case 3: throw new UserDefineException();
		}	
	}
}
@SuppressWarnings("serial")
class UserDefineException extends Exception{
	public UserDefineException() {
		super("User Define Exception Message called");
	}
}
