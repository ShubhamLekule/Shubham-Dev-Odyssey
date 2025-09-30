package com.practice.udemy.exceptionHandlingPartTwo;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x;
		try {
			System.out.println("Before Exception");// This will get executed
			x=10/0;
			System.out.println("After Exception");// This will not get executed
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Inside catch exception block");
			/*java.lang.Object
				java.lang.Throwable
					java.lang.Exception
						java.lang.RuntimeException*/
		}

	}

}
