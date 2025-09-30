package com.practice.udemy.staticinnerclasspartone;

import com.practice.udemy.staticinnerclasspartone.demo.Outer;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Outer.Inner.testingInnerMethod();
		System.out.println(Outer.Inner.x);
	}

}
