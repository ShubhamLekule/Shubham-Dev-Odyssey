package com.practice.udemy.scope;

public class App {
	// static method cannot be written inside the method. 
	//static variable we write inside the class outside the method 
	static int i=500;
	public int j=20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		for(int i=0;i<=10;i++) {
			System.out.println(i); // Scope of i variable is within the for Loop
		}
		// below is the scope
		{
			// below variable i have scope within a block. once block ends variable i dies
			int i=5;
			System.out.println(i); 
			//there is static variable i and local variable i. priority always given to local variable
			
			//there is global variable with value 20 and local variable with value 10
			//If we want to access global j variable from the local scope use below
			int j=10;
			System.out.println(new App().j);
			
		}
		System.out.println(i);
	}

}
