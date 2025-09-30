package com.lambdaexpression.predicate.partTwo;

import java.util.function.IntPredicate;

public class App {

	public static void main(String[] args) {
		IntPredicate moreThan18=x->x>18;
		IntPredicate lessThan30=x->x<30;
		
		new App().checkAge(22, moreThan18, lessThan30);

	}
	
	public void checkAge(int x,IntPredicate moreThan18,IntPredicate lessThan30) {
		if(moreThan18.and(lessThan30).test(x))
			System.out.println("Valid Age");
		else
			System.out.println("Invalid age");
	}

}
