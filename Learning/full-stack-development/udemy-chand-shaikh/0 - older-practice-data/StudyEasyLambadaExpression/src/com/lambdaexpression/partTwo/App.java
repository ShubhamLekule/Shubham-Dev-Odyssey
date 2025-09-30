package com.lambdaexpression.partTwo;

public class App {

	public static void main(String[] args) {
		
		new Thread(()->{
			System.out.println("Line 1");
			System.out.println("Line 2");
		}).start();

	}

}
