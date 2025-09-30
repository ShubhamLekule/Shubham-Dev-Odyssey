package com.lambdaexpression.partFour;

interface Add{
	public int add(int x, int y);
}

public class App {

	public static void main(String[] args) {
		Add add=(int x, int y)->x+y;
		System.out.println("Addition of two no. : "+add.add(10, 50));
		
		Add add1=(int x, int y)->{
			System.out.println("Inside add lambda expression");
			return x+y;
		};
		System.out.println("Addition of two no. : "+add1.add(10, 30));
	}

}
