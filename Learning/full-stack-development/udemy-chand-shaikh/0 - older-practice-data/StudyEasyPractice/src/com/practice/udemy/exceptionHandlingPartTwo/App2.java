package com.practice.udemy.exceptionHandlingPartTwo;

public class App2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		try {
			System.out.println("Before Exception");// This will get executed
			// there will not be partial execution, if exception occur below whole statement not get executed
			System.out.println("Exception statement"+x/0);
			 
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
