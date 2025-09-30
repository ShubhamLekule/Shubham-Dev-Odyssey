package com.practice.udemy.exceptionHandlingPartFour;

public class App2 {

	public static void main(String[] args) {
		int x=10,y = 0;
		try {
			System.out.println("Before Exception");
			x=(y=10*10)/0;
			System.out.println("After Exception");
			// when we use finally block catch block gets optional
			//even if error not occur finally get executed
		}catch(Exception e) {
			System.out.println("Exception : " +e);
		}
		finally {
			System.out.println("This will printed every time");
		}
		// in exception handling sequence is mattered
		// try -> catch -> finally
		// catch block after finally block will not work
		/*
		 * catch(Exception e) { System.out.println("Exception : " +e); }
		 */
		System.out.println("Value of y : "+y);
		System.out.println("Value of x : "+x);


	}

}
