package com.practice.udemy.exceptionHandlingPartTwo;

public class App3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10,y = 0;
		try {
			System.out.println("Before Exception");// This will get executed
			
			// there will not be partial execution, if exception occur whole statement not get executed
			// In below example y=10*10 is complete statement so y=100 value assign then exception occur
			x=(y=10*10)/0;
			 
			System.out.println("After Exception");// This will not get executed
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println("Inside catch exception block");
			/*java.lang.Object
				java.lang.Throwable
					java.lang.Exception
						java.lang.RuntimeException*/
		}
		System.out.println("Value of y : "+y);
		System.out.println("Value of x : "+x);

	}

}
