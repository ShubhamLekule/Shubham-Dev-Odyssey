package com.lambdaexpression.predicate.partOne;

import java.util.function.IntPredicate;

public class App {

	public static void main(String[] args) {
		IntPredicate isLessThan18=x->x>18;
		IntPredicate isMoreThan30=x->x<30;
		
		System.out.println(isLessThan18.test(10));
		System.out.println(isMoreThan30.test(10));
		System.out.println(isLessThan18.and(isMoreThan30).test(25));
		System.out.println(isLessThan18.or(isMoreThan30).test(55));

	}

}
