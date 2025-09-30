package com.lambdaexpression.partOne;

interface Lambda{
	public void demo();
}

public class App {

	public static void main(String[] args) {
		// Below is the way to use interface
		Lambda l=new Lambda() {
			
			@Override
			public void demo() {
				System.out.println("Interface impl");
				
			}
		};
		l.demo();
		
		//single line Lambda expression
		Lambda lambda=()->System.out.println("lambda Statement 1 ");
		lambda.demo();
		
		//multi line Lambda expression
		Lambda lambda2=()->{
			System.out.println("multi line lambda Statement 1");
			System.out.println("multi line lambda Statement 2");
		};
		lambda2.demo();
		
		Lambda lambda3=(()->System.out.println("lambda Statement 2 "));
		lambda3.demo();
	}

}
