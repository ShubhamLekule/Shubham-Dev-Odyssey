package com.practice.udemy.staticinnerclassparttwo;

import com.practice.udemy.staticinnerclassparttwo.demo.Outer;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner.testingInnerMethod();
		System.out.println(Outer.Inner.x);
		Outer.testStaticOuterMethodToCallInnerMethod();
	}

}
