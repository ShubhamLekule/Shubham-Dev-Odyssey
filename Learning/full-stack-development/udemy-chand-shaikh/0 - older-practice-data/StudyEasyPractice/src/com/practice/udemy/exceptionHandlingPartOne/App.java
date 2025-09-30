package com.practice.udemy.exceptionHandlingPartOne;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		App app=new App();
		app.case1(10,0);
		app.case2(10,0);

	}
	// Manual Exception Handling
	public void case1(int x,int y) {
		if(y!=0)
		System.out.println(x/y);
		else
			System.out.println("y value is zero, not allowed!!!!");
	}
	// Exception Handling with try catch block
	public void case2(int x,int y) {
		try {
			System.out.println(x/y);
		}catch(Exception e) {
			System.out.println("case2 : y value is zero, not allowed!!!!");
		}
		
	}
}
