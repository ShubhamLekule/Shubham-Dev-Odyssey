package com.practice.udemy.exceptionHandlingPartTwo;

public class App4 {

	public static void main(String[] args) {
		int x=10,y = 0;
		try {
			System.out.println("Before Exception");
			x=(y=10*10)/0;
			 
			System.out.println("After Exception");// This will not get executed
			//Multiple catch block is possible
			//Sequence is import when defining multiple catch blocks 
			//first child class of exception then mother class
			//Even though there are multiple catch block java will execute only one most accurate cath block 
		}catch(ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Inside catch Arithmetic Exception block");
		}
		catch(Exception e) {
			e.printStackTrace();
			System.out.println("Inside catch exception block");
		}
		System.out.println("Value of y : "+y);
		System.out.println("Value of x : "+x);

	}

}
