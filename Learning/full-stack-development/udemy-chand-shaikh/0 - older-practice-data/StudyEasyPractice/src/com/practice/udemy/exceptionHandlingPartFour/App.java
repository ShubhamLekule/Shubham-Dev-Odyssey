package com.practice.udemy.exceptionHandlingPartFour;

public class App {

	public static void main(String[] args) {
		int x=10,y = 0;
		try {
			System.out.println("Before Exception");
			x=(y=10*10)/0;
			System.out.println("After Exception");
			// when we use finally block catch block gets optional
			//even if error not occur finally get executed
		}finally {
			System.out.println("This will printed every time");
		}
		System.out.println("Value of y : "+y);
		System.out.println("Value of x : "+x);

	

	}

}
